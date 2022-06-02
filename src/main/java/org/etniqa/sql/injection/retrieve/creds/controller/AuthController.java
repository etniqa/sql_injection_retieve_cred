package org.etniqa.sql.injection.retrieve.creds.controller;

import org.etniqa.sql.injection.retrieve.creds.dto.AuthReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
public class AuthController {
    @GetMapping("/auth")
    boolean auth(@RequestBody AuthReq authReq) {
        System.out.println(authReq);
        boolean success = false;
        String query = "select * from users where login='" + authReq.getLogin() + "' and password = '" + authReq.getPassword() + "'";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                // Login Successful if match is found
                success = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {}
        }
        return success;
    }
}
