package com.mycompany.recipeproject;

public class ImageDTO {
    
    int id;
    String url;

    public ImageDTO(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
    
    
}
