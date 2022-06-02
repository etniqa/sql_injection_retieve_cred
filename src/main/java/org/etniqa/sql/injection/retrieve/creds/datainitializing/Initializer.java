package org.etniqa.sql.injection.retrieve.creds.datainitializing;

import lombok.AllArgsConstructor;
import org.etniqa.sql.injection.retrieve.creds.model.Product;
import org.etniqa.sql.injection.retrieve.creds.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class Initializer implements ApplicationRunner {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private ProductDAO productDAO;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("INSERTING DATA");
        productDAO.save(new Product(null, "product1", "123.4"));
        productDAO.save(new Product(null, "product 2", "85"));
        productDAO.save(new Product(null, "superproduct", "865"));
        userDAO.save(new User(null, "admin", "password"));
    }
}
