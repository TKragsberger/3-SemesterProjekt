<%-- 
    Document   : saveAccount
    Created on : 27-09-2013, 10:04:46
    Author     : andersfriis91
--%>

<%@include file="header.jsp" %>

<form action="FrontController" method="POST">
            <table>
                <tr>
                    <th colspan="2">Account details</th>
                </tr>
                <tr>
                    <td>Customer ID:</td>
                    <td><input type="text" name="id" value="${empty customer ? 0 : customer.customerId}" /></td>
                </tr>
                <tr>
                    <td>Account type:</td>
                    <td><input type="text" name="accountType" value="${account.accountType}" /></td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td><input type="text" name="id" value="${account.balance}" /></td>
                </tr>
                <tr>
                    <td style="text-align:center;"><button type="submit" name="command" value="back">Cancel</button></td>
                    <td style="text-align:center;"><button type="submit" name="command" value="saveAccount   ">Save</button></td>
                </tr>
            </table>
        </form>

<%@include file="footer.jsp" %>