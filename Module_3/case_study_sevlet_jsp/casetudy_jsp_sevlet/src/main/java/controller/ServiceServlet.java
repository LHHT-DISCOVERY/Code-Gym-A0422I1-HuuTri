package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServiceServlet", value = "/ServiceServlet")
public class ServiceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action = request.getParameter("action");
       if(action == null){
           action = " ";
       }
       switch (action){
           default:
               showService(request,response);
       }
    }

    private void showService(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/service.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
