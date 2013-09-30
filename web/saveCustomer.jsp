<%-- 
    Document   : edit
    Created on : 26-09-2013, 10:13:14
    Author     : andersfriis91
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="footer.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <title>New Customer</title>

    </head>
    <body>
        <div class="pageHeader">Create customer</div>
        <br/>
        <div id="centerText">Fill in personal details <br/>
        Customer ID will be automaticly generated</div>
        <form action="FrontController" method="POST">
            <table style="margin: auto;"> <!--Brug evt margin-left -->
                <tr>
                    <th colspan="2">Personalia</th>
                </tr>
                <tr>
                    <td>First name: </td>
                    <td><input type="text" name="firstName" value="${customer.firstName}"</td>
                </tr>
                <tr>
                    <td>Last name: </td>
                    <td><input type="text" name="lastName" value="${customer.lastName}"</td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email" value="${customer.email}"</td>
                </tr>
                <tr>
                    <!--<td colspan="2" style="margin: 0; text-align: center;">-->
                    <td style="text-align:center;"><button class="" type="submit" name="command" value="back">Cancel</button></td>
                    <td style="text-align:center;"><button class="" type="submit" name="command" value="save">Save</button></td>
                    <!--</td>-->
                </tr>
            </table>
        </form>
    </body>
</html>
