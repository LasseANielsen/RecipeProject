package com.mycompany.recipeproject;

public class Controller {

    UserDAO DAO = new UserDAO();
    
    public ImageDTO getImage(int id) {
        return null; //new ImageDTO();
    }

    public RecipeDTO getRecipe(int id) {
        return null; //new RecipeDTO();
    }

    public UserDTO getUser(int id) {
        UserDTO DTO = DAO.getUserById(id);
        return DTO;
    }
}
