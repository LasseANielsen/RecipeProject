package com.mycompany.recipeproject;

import java.util.ArrayList;

public class Controller {

    UserDAO userDAO = new UserDAO();
    RecipeDAO recipeDAO = new RecipeDAO();

    public ImageDTO getImage(int id) {
        return null; //new ImageDTO();
    }

    public RecipeDTO getRecipe(int id) {
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

    public UserDTO getUser(int id) {
        UserDTO DTO = userDAO.getUserById(id);
        return DTO;
    }
}
