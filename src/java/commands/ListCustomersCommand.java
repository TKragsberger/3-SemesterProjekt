package commands;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import model.Customer;
import servlets.Factory;

public class ListCustomersCommand extends TargetCommand {

    public ListCustomersCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        Collection<Customer> customers = Factory.getInstance().getCustomers();
        request.setAttribute("customers", customers);
        System.out.println(customers);
        return super.execute(request);
    }
}