package controller;

import model.Customer;
import service.CustomerService;
import service.ICustomer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private ICustomer customer = new CustomerService();

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateFormCusstomer(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
                case "view":
                viewCustomer(request, response);
                break;
            default:
                showListCustomer(request, response);
        }

    }

    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) {
       int id = Integer.parseInt(request.getParameter("id"));
       Customer customer1 = customer.findById(id);
       RequestDispatcher dispatcher ;
       if (customer1 == null){
           dispatcher = request.getRequestDispatcher("view/customer/erroe-404-jsp.jsp");
       }else {
           request.setAttribute("customer", customer1);
           dispatcher = request.getRequestDispatcher("view/customer/view.jsp");
       }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer1 = customer.findById(id);
        RequestDispatcher dispatcher;
        if (customer1 == null) {
            dispatcher = request.getRequestDispatcher("view/customer/erroe-404-jsp.jsp");
        } else {
            request.setAttribute("customer", customer1);
            dispatcher = request.getRequestDispatcher("view/customer/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer2 = customer.findById(id);
        RequestDispatcher dispatcher;
        if (customer2 == null) {
            dispatcher = request.getRequestDispatcher("view/customer/erroe-404-jsp.jsp");
        } else {
            request.setAttribute("customer", customer2);
            dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");

        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customer.findAll();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                creatNewCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer1 = customer.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("view/customer/erroe-404-jsp.jsp");
        } else {
            this.customer.remove(id);
            request.setAttribute("message", "Delete successful");
            dispatcher = request.getRequestDispatcher("view/customer/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer1 = customer.findById(id);
        RequestDispatcher dispatcher;
        if (customer1 == null) {
            dispatcher = request.getRequestDispatcher("view/customer/erroe-404-jsp.jsp");
        } else {
            customer1.setName(name);
            customer1.setEmail(email);
            customer1.setAddress(address);

            request.setAttribute("customer1", customer1);
            request.setAttribute("message", "Update Successful");
            dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        }

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void creatNewCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = (int) (Math.random() * 100000);

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("address", address);
        request.setAttribute("id", id);
        Customer newCustomer = new Customer(id, name, address, email);
        customer.save(newCustomer);
        request.setAttribute("message", "create successful");
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFormCusstomer(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
