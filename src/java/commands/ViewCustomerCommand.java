package commands;

import javax.servlet.http.HttpServletRequest;
import model.Customer;
import servlets.Factory;

public class ViewCustomerCommand extends TargetCommand {

    public ViewCustomerCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = Factory.getInstance().findCustomer(id);
        request.setAttribute("customer", customer);
        return super.execute(request);
    }
}