package commands;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import model.Account;
import model.Transaction;
import servlets.Factory;

/**
 *
 * @author andersfriis91
 */
public class ListTransactionsCommand extends TargetCommand {

    public ListTransactionsCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Collection<Transaction> transactions = Factory.getInstance().getTransactions(id);
        request.setAttribute("transactions", transactions);
        System.out.println(transactions);
        return super.execute(request);
        
    }
}
