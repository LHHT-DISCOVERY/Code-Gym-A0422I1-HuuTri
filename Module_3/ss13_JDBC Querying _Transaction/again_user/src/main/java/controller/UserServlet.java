package controller;

import dao_service.IUserDaoService;
import dao_service.UserDaoService;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"/user", "/UserServlet"})
public class UserServlet extends HttpServlet {
    private IUserDaoService userDaoService = new UserDaoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormAdd(request, response);
                break;
            case "update":
                showFormEdit(request, response);
                break;
            case "view":
                showFormView(request, response);
                break;
            default:
                showListUser(request, response);
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        userDaoService.remove(deleteId);
        request.setAttribute("mess", "Xoá thành công");
        showListUser(request, response);
    }

    private void showFormView(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userDaoService.findById(id);
        request.setAttribute("user", user);
        try {
            request.getRequestDispatcher("view/user/view.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userDaoService.findById(id);
        request.setAttribute("user", user);
        try {

            request.getRequestDispatcher("view/user/update.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/user/add.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userDaoService.findAll();
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("view/user/list.jsp").forward(request, response);
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
            case "add":
                addUser(request, response);
                break;
            case "update":
                editUser(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "find_country":
                showResultFind(request, response);
                break;
            case "sort":
                showFormSort(request, response);
                break;
            default:
                showListUser(request, response);
        }
    }

    private void showFormSort(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userDaoService.SortByName();
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("view/user/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showResultFind(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        String search = request.getParameter("search");
        request.setAttribute("search", country);
        request.setAttribute("country", country);
        List<User> userList;
        if (search != null) {
            country = search;
        }

        userList = userDaoService.findCountry(country);
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("view/user/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        userDaoService.update(user);
        request.setAttribute("messageUpdate", "update successful");
        try {
            request.getRequestDispatcher("view/user/update.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        userDaoService.remove(id);
        response.sendRedirect("/user");
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("country", country);


        User user = new User(name, email, country);
        userDaoService.add(user);
        try {
            request.setAttribute("message", "Add successful");
            request.getRequestDispatcher("view/user/add.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
