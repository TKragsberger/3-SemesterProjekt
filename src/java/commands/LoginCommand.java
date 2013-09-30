package commands;

import javax.servlet.http.HttpServletRequest;
import servlets.Factory;

/**
 *
 * @author Thomas Kragsberger
 */
public class LoginCommand extends TargetCommand
{

    public LoginCommand(String target)
    {
        super(target);
    }
    
    @Override
    public String execute(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(Factory.getInstance().checkLogin(username, password))
        {
            String lastCommand = (String)request.getSession().getAttribute("lastCommand");
            request.getSession().setAttribute("username", username);
            if(lastCommand != null && "loginCommand".equals(request))
            {
                return "/FrontController?command="+lastCommand;
            }
            return super.execute(request);
//            return super.execute(request);
        }else
        {
            request.setAttribute("error", "Error: wrong username or password");
        }
        
        
        return "/login.jsp";
    }
    
}
