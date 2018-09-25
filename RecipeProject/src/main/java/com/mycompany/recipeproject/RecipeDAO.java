package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RecipeDAO {

    public RecipeDTO getRecipeById(int id) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT * "
                    + "FROM `Recipe` "
                    + "WHERE `id` = '" + id + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int recipe_id = Integer.parseInt(res.getString("Id"));
                String recipe_name = res.getString("Name");
                String recipe_description = res.getString("Description");
                String recipe_toDo = res.getString("To_do");
                int recipe_Cookingtime = Integer.parseInt(res.getString("Cookingtime"));
                int recipe_User_Id = Integer.parseInt(res.getString("User_Id"));
                return new RecipeDTO(recipe_id, recipe_Cookingtime, recipe_User_Id, recipe_name, recipe_description, recipe_toDo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return null;
    }

    public int countRecipes() {
        int count = 0;
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT COUNT(*) AS `count` "
                    + "FROM `Recipe`;";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                count = Integer.parseInt(res.getString("count"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return count;
    }
}
