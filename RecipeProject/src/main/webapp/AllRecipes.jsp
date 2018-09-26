<%@page import="com.mycompany.recipeproject.RecipeSorter"%>
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
        <% RecipeSorter rs = new RecipeSorter(); %>
        <p>Sort: <button onclick="<% rs.SortByName(recipes); %>" type="button">Name</button> - <button onclick="<% rs.SortById(recipes); %>"type="button">Id</button></p>
        <hr>
        <div id="recipes">
            <ul> 
                <%
                    int i = 1;
                    for (RecipeDTO recipe : recipes) {
                        out.println("<li> <a href=\"FrontController?origin=recipe&recipe_id=" + i++ + "\">" + recipe.getName() + "</a> </li>");
                    }
                %>
            </ul>
            <ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Dropdown</a>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </li>
</ul>
        </div>
    </body>
</html>
