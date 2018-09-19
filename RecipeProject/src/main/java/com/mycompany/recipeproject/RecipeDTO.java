package com.mycompany.recipeproject;

public class RecipeDTO {
    
    int id, image_id, rating;
    String name, ingredients, instructions;

    public RecipeDTO(int id, int image_id, int rating, String name, String ingredients, String instructions) {
        this.id = id;
        this.image_id = image_id;
        this.rating = rating;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public int getImage_id() {
        return image_id;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
    
    
}
