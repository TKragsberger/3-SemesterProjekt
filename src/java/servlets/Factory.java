package servlets;

import commands.ChangeAccountCommand;
import commands.ChangeCustomerCommand;
import commands.ListAccountsCommand;
import commands.ListCustomersCommand;
import commands.ListTransactionsCommand;
import commands.LoginCommand;
import commands.LogoutCommand;
import commands.SaveCommand;
import commands.TargetCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Account;
import model.Command;
import model.Customer;
import model.Transaction;

public class Factory
{

    private static Factory instance = new Factory();
    private Map<String, Command> commands = new HashMap();
    private List<Customer> customers = new ArrayList();
    private Map<String, String> users = new HashMap<>();

    private Factory()
    {
        commands.put("main", new TargetCommand("/main.jsp"));
        commands.put("back", new TargetCommand("/main.jsp"));
        commands.put("listCustomers", new ListCustomersCommand("/listCustomers.jsp"));
        commands.put("listAccounts", new ListAccountsCommand("/listAccounts.jsp"));
        commands.put("viewTransactions", new ListTransactionsCommand("/listTransactions.jsp"));
        commands.put("viewCustomer", new ChangeCustomerCommand("/viewCustomer.jsp"));
        commands.put("viewAccount", new ChangeAccountCommand("/viewAccount.jsp"));
        commands.put("edit", new TargetCommand("/edit.jsp"));
        commands.put("save", new SaveCommand("/listCustomers.jsp"));
        commands.put("loginCommand", new LoginCommand("/main.jsp"));
        commands.put("logoutCommand", new LogoutCommand("/login.jsp"));

        Customer customer1 = new Customer("Peter", "Pedal", "peter@pedal.dk");
        Customer customer2 = new Customer("Mona", "Lisa", "mona@lisa.dk");
        Account account1 = new Account("Basic Account", 0);
        Account account2 = new Account("Savings Account", 0);
        customer1.addAccount(account1);
        customer2.addAccount(account2);
        account1.createTransaction(15000, "Salary");
        account2.createTransaction(8500, "Salary");
        account1.createTransaction(-499, "Speeding ticket");
        account2.createTransaction(-89.99, "Groceries");
        customers.add(customer1);
        customers.add(customer2);
        
        users.put("Thomas", "secret");
    }

    public static Factory getInstance()
    {
        return instance;
    }

    public Command getCommand(String commandString)
    {
        if (commandString == null)
        {
            commandString = "main";
        }

        return commands.get(commandString);
    }

    public List<Account> getAccounts()
    {
        List<Account> list = new ArrayList<>();
        for (Customer c : customers)
        {
            for (Account a : c.getAccounts())
            {
                list.add(a);
            }
        }
        return list;
    }

    public Collection<Customer> getCustomers()
    {
        return customers;
    }

    public Account findAccount(int id)
    {
        for (Account a : getAccounts())
        {
            if (a.getAccountId() == id)
            {
                return a;
            }
        }
        return null;
    }

    public Collection<Transaction> getTransactions(int id)
    {
        for (Account a : getAccounts())
        {
            if (a.getAccountId() == id)
            {
                return a.getTransactions();
            }
        }
        return null;
    }

    public void saveCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public Customer findCustomer(int id)
    {
        for (Customer c : customers)
        {
            if(c.getCustomerId() == id)
            {
                return c;
            }
        }
        return null;
    }

    public boolean checkLogin(String username, String password)
    {
        String passwd = users.get(username);
        if(passwd != null && passwd.equals(password))
        {
            return true;
        }
        return false;
    }
    
    
}
