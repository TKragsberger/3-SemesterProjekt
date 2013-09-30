package commands;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import model.Customer;
import servlets.Factory;

/**
 * @author andersfriis91
 */
public class SaveCommand extends TargetCommand {

    public SaveCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
//
        Factory.getInstance().saveCustomer(new Customer(firstName, lastName, email));
        Collection<Customer> customers = Factory.getInstance().getCustomers();
        request.setAttribute("customers", customers);
        return super.execute(request);
    }
}
