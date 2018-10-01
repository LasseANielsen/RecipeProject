package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {

    public UserDTO getUserById(int id) {
        try {
            Connection c = new DBConnector().getConnection();
            String query
                    = "SELECT * "
                    + "FROM `User` "
                    + "WHERE `id` = ?;";
            PreparedStatement stmt = c.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int user_id = Integer.parseInt(res.getString("id"));
                String user_username = res.getString("username");
                String user_password = res.getString("password");
                return new UserDTO(user_id, user_username, user_password);
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

    public void createUser(String username, String password) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "INSERT INTO `User`(`username`,`password`) VALUES"
                    + "('" + username + "','" + password + "')";

            ResultSet res = stmt.executeQuery(query);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }
}
