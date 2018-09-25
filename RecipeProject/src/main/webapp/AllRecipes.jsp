<%@page import="java.util.List, com.mycompany.recipeproject.RecipeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>All recipes</h1>
    </body>
    <h1>Person list</h1>
    <% List<RecipeDTO> recipes = (List) request.getAttribute("recipes"); %>
    <div>
        <ul> 
            <% for (RecipeDTO recipe : recipes) {
                    out.println("<li>" + recipe.getName() + "</li>");
                }%>
        </ul>
    </div>
</html>
