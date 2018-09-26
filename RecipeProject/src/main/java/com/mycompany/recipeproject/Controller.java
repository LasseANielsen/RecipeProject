package com.mycompany.recipeproject;

import java.util.ArrayList;

public class Controller {

    UserDAO userDAO = new UserDAO();
    RecipeDAO recipeDAO = new RecipeDAO();

    public RecipeDTO getRecipeById(int id) {
        RecipeDTO DTO = recipeDAO.getRecipeById(id);
        return DTO;
    }

    public ArrayList<RecipeDTO> getAllRecipes() {
        ArrayList<RecipeDTO> list = new ArrayList();
        for (int i = 0; i < recipeDAO.countRecipes(); i++) {
            RecipeDTO DTO = recipeDAO.getRecipeById(i + 1);
            list.add(DTO);
        }
        return list;
    }

    public UserDTO getUserById(int id) {
        UserDTO DTO = userDAO.getUserById(id);
        return DTO;
    }
    
    public UserDTO getUserByUsername(String username) {
        UserDTO DTO = userDAO.getUserByUsername(username);
        return DTO;
    }
    public void createUser(String username, String password) {
        userDAO.createUser(username, password);
    }
}
