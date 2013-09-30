<%-- 
    Document   : edit
    Created on : 26-09-2013, 10:13:14
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
        <h1 id="header">Create customer</h1>
        <hr/>

        <form action="FrontController" method="POST">
            <div class="table"> 
                <div class="entry">
                    <b>ID: </b>
                    ${customer.cutomerId} <br> mike stinker
                </div>
                <div class="entry">
                    <b>Fornavn: </b>
                    <input type="text" name="firstName" value="${customer.firstName}">
                </div>
                <div class="entry">
                    <b>Efternavn: </b>
                    <input type="text" name="lastName" value="${customer.lastName}">
                </div>
                <div class="entry">
                    <b>Email: </b>
                    <input type="text" name="email" value="${customer.email}">
                </div>
                <button class="entry" type="submit" name="command" value="back">Cancel</button>
                <button class="entry" type="submit" name="command" value="save">Save</button>
            </div>
        </form>
    </body>
</html>
