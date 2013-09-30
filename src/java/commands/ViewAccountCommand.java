/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import javax.servlet.http.HttpServletRequest;
import model.Account;
import servlets.Factory;

/**
 *
 * @author andersfriis91
 */
public class ViewAccountCommand extends TargetCommand {

    public ViewAccountCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Account account = Factory.getInstance().findAccount(id);
        request.setAttribute("account", account);
        return super.execute(request);
    }
    
    
}
