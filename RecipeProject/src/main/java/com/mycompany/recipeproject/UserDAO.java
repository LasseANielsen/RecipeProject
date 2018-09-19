package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
    
        public void getUserById(int id) {
        try {
            Connection c = new testDatabase.DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT * "
                    + "FROM `User`; "
                    + "WHERE `id` = " + id;
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String user_id = res.getString("id");
                String user_name = res.getString("name");
                String user_password = res.getString("password");
                String user_recipe_id = res.getString("recipe_id");
                System.out.println(user_id + ": " + user_name);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }
}
