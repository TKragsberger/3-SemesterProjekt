<%-- 
    Document   : viewTransactions
    Created on : 26-09-2013, 11:19:17
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
        <h1>Account History</h1>
        
        <div>
        <table border="2" cellpadding="2" cellspacing="1">
            <th>Date</th>
            <th>Description</th>
            <th>Amount</th>
            <th>Balance</th>
            <c:forEach var="transaction" items="${transactions}">
            <tr>
                <td>${transaction.timestamp}</td>
                <td>${transaction.info}</td>
                <td>${transaction.amount}</td>
                <td>${transaction.balance}</td>
            </tr>
            </c:forEach>
        </table>
        </div>
    </body>
</html>
