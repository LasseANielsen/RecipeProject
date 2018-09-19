package com.mycompany.recipeproject;

public class Controller {

    UserDAO userDAO = new UserDAO();
    RecipeDAO recipeDAO = new RecipeDAO();
    
    public ImageDTO getImage(int id) {
        return null; //new ImageDTO();
    }

    public RecipeDTO getRecipe(int id) {
        RecipeDTO DTO = recipeDAO.getUserById(id);
        return DTO;
    }

    public UserDTO getUser(int id) {
        UserDTO DTO = userDAO.getUserById(id);
        return DTO;
    }
}
