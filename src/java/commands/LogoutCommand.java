package commands;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Thomas Kragsberger
 */
public class LogoutCommand extends TargetCommand
{

    public LogoutCommand(String target)
    {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request)
    {
        request.getSession().removeAttribute("username");
        return super.execute(request);
    }
    
    
}
