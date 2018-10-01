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
        <h1>Register</h1>
    </body>
        <%
            if ("true".equals(request.getParameter("error"))) {
                out.println("<div id=\"error\"> <p> Invalid Data! Try agian </p> </div>");
            }
        %>
    <div>
        <form action="Validator.jsp">
            <p>Username</p><input type="text" name="username">
            <p>Password</p><input type="text" name="password">
            <br><br><input type="submit" value="Create user">
        </form>
    </div>
</html>
