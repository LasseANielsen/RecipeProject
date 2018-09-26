package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {

    public UserDTO getUserById(int id) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT * "
                    + "FROM `User` "
                    + "WHERE `id` = '" + id + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int user_id = Integer.parseInt(res.getString("id"));
                String user_name = res.getString("name");
                String user_password = res.getString("password");
                return new UserDTO(user_id, user_name, user_password);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return null;
    }
    
        public UserDTO getUserByUsername(String username) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT * "
                    + "FROM `User` "
                    + "WHERE `username` = '" + username + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int user_id = Integer.parseInt(res.getString("id"));
                String user_name = res.getString("name");
                String user_password = res.getString("password");
                return new UserDTO(user_id, user_name, user_password);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return null;
    }
}
