package pe.edu.pe.javawebuserlist.controllers;

import org.omg.CORBA.PRIVATE_MEMBER;
import pe.edu.pe.javawebuserlist.models.PtService;
import pe.edu.pe.javawebuserlist.models.User;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UsersServlets",urlPatterns = "/users")
public class UsersServlets extends HttpServlet {

    private Connection connection;
    PtService service;
    String url;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("Post",  request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("Get", request, response);
    }

    private void processRequest(String method, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String action = request.getParameter("action");
        String Url = "index.jsp";
        PtService service = new PtService();
        service.setConnection(getConnection());

        // action = index
        if (action.equalsIgnoreCase("index"))
        {
            List<User> users = service.findAllUsers();
            request.setAttribute("users",users);
            url="listUsers.jsp";
        }

        // action = create
        if(action.equalsIgnoreCase("create")) {
            String firstName = request.getParameter("first_name");
            User user = service.createUser(firstName);
            request.setAttribute("users", service.findAllUsers());
            url = "listUsers.jsp";
        }

        // action = edit
        if(action.equalsIgnoreCase("edit")) {
            String id = request.getParameter("id");
            request.setAttribute("usser", service.findUserById(id));
            url = "editUsers.jsp";
        }

        /*/ action = update
        if(action.equalsIgnoreCase("update")) {
            String id = request.getParameter("id");
            String firstName = request.getParameter("first_name");
            boolean result = service.updateUser(new User(id, firstName));
            request.setAttribute("users", service.findAllUsers());
            url = "listUsers.jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);*/
    }

    private Connection getConnection()
    {
        if (connection == null)
        {
            try
            {
                InitialContext ctx = new InitialContext();
                DataSource dataSource = (DataSource) ctx.lookup("jdbc/MySQLDataSource");
                connection = dataSource.getConnection();
            }catch (NamingException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
