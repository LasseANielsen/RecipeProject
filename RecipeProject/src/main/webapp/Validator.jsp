<%@page import="com.mycompany.recipeproject.Controller"%>
<%@page import="com.mycompany.recipeproject.RegisterValidation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            RegisterValidation rv = new RegisterValidation();
            if (rv.validateUsername(username)) {
                if (rv.validatePassword(password)) {
                    new Controller().createUser(username, password);
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                } else {
                    response.sendRedirect("Register.jsp?error=true");
                }
            } else {
                response.sendRedirect("Register.jsp?error=true");
            }
        %>
        <h1>Validating</h1>
    </body>
</html>
