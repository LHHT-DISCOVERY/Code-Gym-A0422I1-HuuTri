package controller;

import dao_service.CustomerDaoService;
import dao_service.ICustomerDaoService;
import dao_service.ITypeCustomerService;
import dao_service.TypeCustomerService;
import model.Customer;
import model.TypeCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private ICustomerDaoService iCustomerDaoService = new CustomerDaoService();
    private ITypeCustomerService iTypeCustomerService = new TypeCustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormAdd(request, response);
            case "update":
                showFormUpdate(request, response);
                break;

            default:
                display(request, response);
        }

    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerDaoService.findById(id);
        List<TypeCustomer> typeCustomerList = iTypeCustomerService.findAll();
        request.setAttribute("customer", customer);
        request.setAttribute("typeCustomerList", typeCustomerList);
        try {
            request.getRequestDispatcher("view/update.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {
        List<TypeCustomer> typeCustomerList = iTypeCustomerService.findAll();
        request.setAttribute("typeCustomerList", typeCustomerList);
        try {
            request.getRequestDispatcher("view/add.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resultCusotomer(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        List<Customer> customerList = iCustomerDaoService.findCountry(country);
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("view/display.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void display(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = iCustomerDaoService.findAll();
        List<TypeCustomer> typeCustomerList = iTypeCustomerService.findAll();
        request.setAttribute("customerList", customerList);
        request.setAttribute("typeCustomerList", typeCustomerList);
        try {
            request.getRequestDispatcher("view/display.jsp").forward(request, response);
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
            case "find_country":
                resultCusotomer(request, response);
                break;
            case "saveCustomer":
                saveCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "updateCustomer":
                updateCustomer(request, response);
                break;
            default:
                display(request, response);
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idCustomer"));
        int typeCustomer = Integer.parseInt(request.getParameter("typeCustomer"));
        String name = request.getParameter("nameCustomer");
        String birthday = request.getParameter("birthdayCustomer");
        Boolean gender = Boolean.parseBoolean(request.getParameter("Gender"));
        String card = request.getParameter("cardCustomer");
        String phone = request.getParameter("phoneCustomer");
        String email = request.getParameter("emailCustomer");
        String address = request.getParameter("addressCustomer");
        Customer customer = new Customer(id, typeCustomer, name, birthday, gender, card, phone, email, address);
        iCustomerDaoService.update(customer);
        try {
            request.getRequestDispatcher("view/update.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        iCustomerDaoService.remove(id);
        try {
            response.sendRedirect("/CustomerServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void saveCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idCustomer"));
        int typeCustomer = Integer.parseInt(request.getParameter("typeCustomer"));
        String name = request.getParameter("nameCustomer");
        String birthday = request.getParameter("birthdayCustomer");
        Boolean gender = Boolean.parseBoolean(request.getParameter("Gender"));
        String card = request.getParameter("cardCustomer");
        String phone = request.getParameter("phoneCustomer");
        String email = request.getParameter("emailCustomer");
        String address = request.getParameter("addressCustomer");

        Customer customer = new Customer(id, typeCustomer, name, birthday, gender, card, phone, email, address);
        boolean check = iCustomerDaoService.add(customer);
        String message = " ADD NOT SUCCESSFUL";
        if (check) {
            message = " ADD SUCCESSFUL";
        }
        request.setAttribute("messageAdd", message);
        try {
            request.getRequestDispatcher("view/add.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
