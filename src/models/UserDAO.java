/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
 import java.sql.Connection;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Admin
 */

   

public class UserDAO {

    public void registerUser(String fullname, String email, String username, String password, String role) {

        try {
            Connection conn = DBConnection.connect();

            String sql = "INSERT INTO users (fullname, email, username, password, role) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, fullname);
            pst.setString(2, email);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, role);

            pst.executeUpdate();

            System.out.println("User saved successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

