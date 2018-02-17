package pe.edu.pe.javawebuserlist.controllers;

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
        service.setConnection(getConnection);

        if (action.equalsIgnoreCase("index")){
            List<User> users = service.findAllUsers();
            request.setAttribute("users", users);
            url = "listUser.jsp";
            }
            if (action.equalsIgnoreCase())
    }

}
