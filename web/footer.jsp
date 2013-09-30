<link rel="stylesheet" href="footer.css" type="text/css" /> 
<footer>
    <div id="footer">
        <ul id="footer_menu">
            <li class="homeButton"><a href="FrontController"></a></li>
            <li>
                <a href="#">Customers</a>
                <div class="one_column_layout">
                    <a class="headerLinks" href="FrontController?command=listCustomers">Customer list</a>
                    <a class="headerLinks" href="FrontController?command=newCustomer">Add new customer</a>
                </div>
            </li>
            <li>
                <a href="#">Accounts</a>
                <div class="one_column_layout">
                    <a class="headerLinks" href="FrontController?command=listAccounts">Account list</a>
                    <a class="headerLinks" href="FrontController?command=newAccount">Add new account</a>
                </div>
            </li>

            <li class="right">
                <a href="FrontController?command=logout">Log out</a>
            </li>
        </ul>
    </div>
</footer>
</body>
</html>