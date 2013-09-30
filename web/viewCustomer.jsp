<%-- 
    Document   : view
    Created on : 26-09-2013, 10:08:32
    Author     : andersfriis91
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View person details</h1> <hr/>
        <ul>
            <li>ID: ${customer.customerId}</li>
            <li>First name: ${customer.firstName}</li>
            <li>Last name: ${customer.lastName}</li>
            <li>Email: ${customer.email}</li>
        </ul>
            <form action="FrontController">
                <button type="submit" name="command" value="listCustomers">Back</button>
            </form>
    </body>
</html>
