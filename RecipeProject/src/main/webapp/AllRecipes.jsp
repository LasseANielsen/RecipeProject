<%@page import="java.util.List, com.mycompany.recipeproject.RecipeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 align="center">All recipes</h1>
        <hr>
        <% List<RecipeDTO> recipes = (List) request.getAttribute("recipes"); %>
        <div id="recipes">
            <ul> 
                <% for (RecipeDTO recipe : recipes) {
                        out.println("<li>" + recipe.getName() + "</li>");
                    }%>
            </ul>
        </div>
    </body>
</html>
