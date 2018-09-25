package com.mycompany.recipeproject;

public class RecipeDTO {

    int id, cookingtime, userId;
    String name, description, toDo;

    public RecipeDTO(int id, int cookingtime, int userId, String name, String description, String toDo) {
        this.id = id;
        this.cookingtime = cookingtime;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.toDo = toDo;
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

}
