package com.mycompany.recipeproject;

public class RecipeDTO {

    int id, cookingtime, userId;
    String name, description, toDo, image;

    public RecipeDTO(int id, int cookingtime, int userId, String name, String description, String toDo, String image) {
        this.id = id;
        this.cookingtime = cookingtime;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.toDo = toDo;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public int getCookingtime() {
        return cookingtime;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getToDo() {
        return toDo;
    }

    public String getImage() {
        return image;
    }

    

}
