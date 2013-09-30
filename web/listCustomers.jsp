<%-- 
    Document   : list
    Created on : 26-09-2013, 09:33:33
    Author     : andersfriis91
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kunder</h1>
        <div>
            <c:forEach var="customer" items="${customers}">
                <li><a href="FrontController?command=viewCustomer&id=${customer.customerId}">
                        ${customer.firstName} ${customer.lastName}</a>
                </li>
                </c:forEach>
            <form>
                <button type="submit" name="command" value="back">Back to main page</button>
            </form>
        </div>
    </body>
</html>
