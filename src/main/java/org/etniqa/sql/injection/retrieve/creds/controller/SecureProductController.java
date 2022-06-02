package org.etniqa.sql.injection.retrieve.creds.controller;

import org.etniqa.sql.injection.retrieve.creds.dto.SearchProduct;
import org.etniqa.sql.injection.retrieve.creds.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SecureProductController {
    //    select * from products where name like '%produc %' union select id, login, password from users;--%';
//    http://localhost:8080/product?searchName=prod
//    http://localhost:8080/product?searchName=produc%' union select id, login, password from users;--
//    produc%'+union+select+id,+login,+password+from+users;--
    @GetMapping("/secure/product")
    List<Product> findProduct(@RequestBody SearchProduct product) {
        System.out.println(product);
        ArrayList<Product> products = new ArrayList<>();
        String query = "select * from products where name like ?;";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + product.getSearchName() + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {}
        }
        return products;
    }
}