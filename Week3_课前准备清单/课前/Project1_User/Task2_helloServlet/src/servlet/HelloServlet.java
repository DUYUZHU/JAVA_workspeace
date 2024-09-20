package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void destroy() {
        System.out.println("Enter HelloServlet#destroy()");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Enter HelloServlet#init()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Enter HelloServlet#doGet");
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter HelloServlet#doPost");
    }
}
