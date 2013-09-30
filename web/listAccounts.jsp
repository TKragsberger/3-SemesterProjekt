<%-- 
    Document   : listAccounts
    Created on : 26-09-2013, 10:48:52
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
        <h1>Konti</h1>
        <c:forEach var="account" items="${accounts}">
            <ul>
                <li>Owner: ${account.owner} <br>
                    Type: <a href="FrontController?command=viewAccount&id=${account.accountId}">
                        ${account.accountType}</a></li>
            </ul>
        </c:forEach>
        <a href="FrontController?command=main">Back to Main Page</a>
    </body>
</html>
