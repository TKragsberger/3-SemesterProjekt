<%-- 
    Document   : main
    Created on : 26-09-2013, 09:33:29
    Author     : andersfriis91
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <link rel="stylesheet" href="footer.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <title>JSP Page</title>
    </head>
    <body>
        <p><a href="FrontController?command=logoutCommand">Logout</a></p>
        <h1 id="header">BANK</h1>
        <hr/>
        <div id="centerText">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque non nulla quis lorem eleifend venenatis. 
            In dolor mi, egestas id nisi id, hendrerit congue lacus. Praesent in orci elementum, vehicula magna et,
            rutrum orci. Aliquam ipsum elit, ultricies in commodo in, euismod id arcu. Quisque nisi augue, 
            aliquam ut adipiscing eget, iaculis ut enim. Donec nunc dolor, sollicitudin vitae leo eget,
            pulvinar dictum tortor. Pellentesque lacinia gravida dictum. In sagittis luctus libero, nec rhoncus lorem.
            Nulla elementum tempor pretium. In nunc nisi, facilisis ut aliquet nec, euismod a libero.
        </div>
            <br/>
            <br/>
        
    <center><img src="http://media.salon.com/2012/07/money_rect.jpg" width="450px" /> </center>   
        
        <footer>
        <div id="footer">
                <ul id="footer_menu">
                    <li class="homeButton"><a href="#"> </a></li>
                    
                        <li>
                            <a href="#">Customers</a>
                            <div class="one_column_layout">
                                <a class="headerLinks" href="FrontController?command=listCustomers">Customer List</a>
                                <a class="headerLinks" href="FrontController?command=edit">Add new Customer</a>
                            </div>
                        </li>
                        <li>
                            <a href="#">Accounts</a>
                            <div class="one_column_layout">
                                <a class="headerLinks" href="FrontController?command=listAccounts">Account List</a>
                            </div>
                        </li>
                </ul>
        </div>
        </footer>
    </body>
</html>
