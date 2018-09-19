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
                System.out.println(user_id);
                String user_name = res.getString("name");
                System.out.println(user_name);
                String user_password = res.getString("password");
                System.out.println(user_password);
                int user_recipe_id = Integer.parseInt(res.getString("recipe_id"));
                System.out.println(user_recipe_id);
                return new UserDTO(user_id, user_recipe_id, user_name, user_password);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return null;
    }
}
