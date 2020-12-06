package pers.guchh.Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("servlet01 username:" + username);
        //域变量，在一个请求内存在I
        request.setAttribute("adress","北京");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/servlet02");
        dispatcher.forward(request,response);
    }
}
