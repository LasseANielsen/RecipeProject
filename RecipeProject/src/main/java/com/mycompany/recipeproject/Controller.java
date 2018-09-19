package com.mycompany.recipeproject;

public class Controller {

    DBConnector DBC = null;

    public Controller() {
        createConnector();
    }
    
    private void createConnector() {
        try {
            DBC = new DBConnector();
        } catch (Exception ex) {
            System.out.println("createConnector failed!");
        }
    }

//    public ImageDTO getImage(int id) {
//        return new ImageDTO();
//    }
//
//    public RecipeDTO getRecipe(int id) {
//        return new RecipeDTO();
//    }
//
//    public UserDTO getUser(int id) {
//        return new UserDTO();
//    }
}
