<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Register</h1>
    </body>
    <div>
        <form action="Validator.jsp">
            <p>Username</p><input type="text" name="username">
            <p>Password</p><input type="text" name="password">
            <br><br><input type="submit" value="Create user">
        </form>
    </div>
</html>
