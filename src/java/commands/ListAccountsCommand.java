/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import model.Account;
import servlets.Factory;

/**
 * @author andersfriis91
 */
public class ListAccountsCommand extends TargetCommand {

    public ListAccountsCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        Collection<Account> accounts = Factory.getInstance().getAccounts();
        request.setAttribute("accounts", accounts);
        System.out.println(accounts);
        return super.execute(request);
    }
}
