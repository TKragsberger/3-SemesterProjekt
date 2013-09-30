package servlets;

import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Command;

@WebServlet(name = "FrontController", urlPatterns =
{
    "/FrontController"
})
public class FrontController extends HttpServlet
{
    private static final long TIME_OUT = 5000;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        Long userTimeOut = (Long) session.getAttribute("lastTime");
        
        
        boolean validTime = isTimeValid(userTimeOut);
        
        String commandString = request.getParameter("command");
        if(commandString != null)
        {
            session.setAttribute("lastCommand", commandString);
        }

        String path = "/login.jsp";

        //login in?
        if (username != null && validTime || "loginCommand".equals(commandString))
        {
            session.setAttribute("lastTime", new Date().getTime());
            Command command = Factory.getInstance().getCommand(commandString);
            path = command.execute(request);
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);



    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

    private boolean isTimeValid(Long userTimeOut)
    {
        if(userTimeOut == null)
        {
            return false;
        }
        long currenTime = new Date().getTime();
        
        if(currenTime - userTimeOut < TIME_OUT)
        {
            return true;
        }else
        {
            return false;
        }
        
    }
}
