<%-- 
    Document   : accountTransactions
    Created on : 26-09-2013, 10:54:16
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
        <h1>Account Details</h1>
        <div>
            Owner: ${account.owner} <br/>
            Account type: ${account.accountType} <br/>
            Balance: ${account.balance} <br/>
        </div>
            <a href="FrontController?command=viewTransactions&id=${account.accountId}">
            View account transactions</a>
            <a href="FrontController?command=listAccounts">Go back</a>
    </body>
</html>
