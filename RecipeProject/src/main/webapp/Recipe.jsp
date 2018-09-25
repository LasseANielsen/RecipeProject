<%@page import="com.mycompany.recipeproject.RecipeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% RecipeDTO recipe = (RecipeDTO) request.getAttribute("Recipe"); %>
        <h1>Recipe: <% recipe.getName(); %></h1>
        <div> 
            <div>
                <p>Author</p>
            </div> 
            <div>

                <p>Description</p>
                <br>
                <p> <% recipe.getDescription(); %> </p>

            </div>
            <div>
                <p>To do</p>
                <br>
                <p> <% recipe.getToDo();%> </p>
            </div>
        </div>
    </body>
</html>
