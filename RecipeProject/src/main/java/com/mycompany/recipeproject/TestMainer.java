package com.mycompany.recipeproject;

public class TestMainer {

    public static void main(String[] args) {
        Controller c = new Controller();
        UserDTO user = c.getUser(1);
        if (user != null) {
            System.out.println(user.toString());
        } else {
            System.out.println("Null T_T");
        }
    }
}
