
package com.mycompany.recipeproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RecipeDAO {
    
    public RecipeDTO getUserById(int id) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT * "
                    + "FROM `Recipe` "
                    + "WHERE `id` = '" + id + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int recipe_id = Integer.parseInt(res.getString("id"));
                String recipe_name = res.getString("name");
                String recipe_ingredients = res.getString("ingredients");
                String recipe_instructions = res.getString("instructions");
                int recipe_image_id = Integer.parseInt(res.getString("image_id"));
                int recipe_rating = Integer.parseInt(res.getString("rating"));
                return new RecipeDTO(id, recipe_image_id, recipe_rating, recipe_name, recipe_ingredients, recipe_instructions);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
        return null;
    }
}
