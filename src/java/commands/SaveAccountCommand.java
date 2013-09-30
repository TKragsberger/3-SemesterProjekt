/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import model.Account;
import model.Customer;
import servlets.Factory;

/**
 *
 * @author andersfriis91
 */
public class SaveAccountCommand extends TargetCommand {

    public SaveAccountCommand(String target, String title) {
        super(target, title);
    }

    @Override
    public String execute(HttpServletRequest request) {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        String accountType = request.getParameter("accountType");
        double balance = Double.parseDouble(request.getParameter("balance"));
        
        for(Customer c : Factory.getInstance().getCustomers())
            if(c.getCustomerId() == customerId) {
                c.addAccount(new Account(accountType, balance));
                System.out.println("Account added");
            }
        Collection<Account> accounts = Factory.getInstance().getAccounts();
        request.setAttribute("accounts", accounts);
        return super.execute(request);
    }
    
    
}
