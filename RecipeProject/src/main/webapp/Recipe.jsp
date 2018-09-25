<%@page import="com.mycompany.recipeproject.RecipeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% RecipeDTO recipe = (RecipeDTO) request.getAttribute("recipe"); %>
        <h1>Recipe: <% out.println(recipe.getName()); %></h1>
        <div> 
            <div>
                <p>Author</p>
            </div> 
            <div>
                <p>Description</p> <br>
                <p> <% out.println(recipe.getDescription()); %> </p>
            </div>
            <div>
                <p>To do</p> <br>
                <p> <% out.println(recipe.getToDo());%> </p>
            </div>
        </div>
    </body>
</html>
