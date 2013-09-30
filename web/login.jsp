<%-- 
    Document   : login
    Created on : 30-09-2013, 09:18:06
    Author     : Thomas Kragsberger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div style="color: red;">${error}</div>
        <form action="FrontController" method="get">
            <input type="hidden" name="command" value="loginCommand"/>
            <p>Username: <input type="text" name="username" value=""/></p>
            <p>Password: <input type="password" name="password" value=""/></p>
            <p><input type="submit" value="Login"/></p>
        </form>
    </body>
</html>
