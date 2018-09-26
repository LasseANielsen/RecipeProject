package com.mycompany.recipeproject;

public class RegisterValidation {
    
    Controller c = new Controller();

    public boolean validateUsername(String username) {
        int min = 4, max = 45;
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (username.contains(";")) {
            return false;
        }
        if (username.length() < min || username.length() > max) {
            return false;
        }
        UserDTO user = c.getUserByUsername(username);
        return user == null;
    }

    public boolean validatePassword(String password) {
        int min = 8, max = 45;
        if (password == null || password.isEmpty()) {
            return false;
        }
        if (password.contains(";")) {
            return false;
        }
        return !(password.length() < min || password.length() > max);
    }
}
