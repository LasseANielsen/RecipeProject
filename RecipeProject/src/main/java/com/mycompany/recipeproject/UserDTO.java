package com.mycompany.recipeproject;

public class UserDTO {
    
    int id, recipe_id;
    String name, password;

    public UserDTO(int id, int recipe_id, String name, String password) {
        this.id = id;
        this.recipe_id = recipe_id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
    
}
