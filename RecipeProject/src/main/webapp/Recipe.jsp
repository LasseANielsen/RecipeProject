<%@page import="com.mycompany.recipeproject.UserDTO"%>
<%@page import="com.mycompany.recipeproject.RecipeDTO"%>
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
        <% RecipeDTO recipe = (RecipeDTO) request.getAttribute("recipe"); %>
        <% UserDTO user = (UserDTO) request.getAttribute("user"); %>
        <h1>Recipe: <% out.println(recipe.getName()); %></h1>
        <div> 
            <div>
                <p>Author <% //out.println(user.getUsername()); %></p>
            </div> 
            <div>
                <img src="<% out.println(recipe.getImage()); %>" style="width:256px;height:256px;">
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
