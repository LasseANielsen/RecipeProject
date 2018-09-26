package com.mycompany.recipeproject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RecipeSorter {
    
    public List<RecipeDTO> SortByName(List<RecipeDTO> list) {
        Comparator<RecipeDTO> c = new Comparator<RecipeDTO>() {
            @Override
            public int compare(RecipeDTO r1, RecipeDTO r2) {
                return r1.getName().compareToIgnoreCase(r2.getName());
            }
        };
        Collections.sort(list, c);
        return list;
    }
    
        public List<RecipeDTO> SortById(List<RecipeDTO> list) {
        Comparator<RecipeDTO> c = new Comparator<RecipeDTO>() {
            @Override
            public int compare(RecipeDTO r1, RecipeDTO r2) {
                if (r1.getId() < r2.getId()) {
                    return r1.getId();
                } else {
                    return r2.getId();
                }
            }
        };
        Collections.sort(list, c);
        return list;
    }
}
