package controller;

import model.Payment;
import model.Room;
import service.IPaymentService;
import service.IRoomService;
import service.PaymentService;
import service.RoomService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "RoomServlet", value = "/room")
public class RoomServlet extends HttpServlet {
    static IRoomService roomService = new RoomService();
    static IPaymentService paymentService = new PaymentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteCustomer(request, response);
                    break;
                case "search":
                    search(request,response);
                    break;
                default:
                    list(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        String searchAccount = request.getParameter("searchNumberPhone");
        String searchClassId = request.getParameter("idPayment_rom");

        List<Room> rooms = roomService.search(searchName,searchAccount,searchClassId);
        request.setAttribute("roomList",rooms);
        List<Payment> paymentList = paymentService.findAll();
        request.setAttribute("paymentList", paymentList);
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Room existingRom = roomService.selectCustomer(id);
        List<Payment> paymentList = paymentService.findAll();
        request.setAttribute("paymentList", paymentList);
        request.setAttribute("rom", existingRom);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        try {
            roomService.deleteRom(deleteId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("mess", "Xoá thành công");
        try {
            list(request, response);
        } catch (SQLException | IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        List<Payment> paymentList = paymentService.findAll();
        request.setAttribute("paymentList", paymentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException  {
        List<Room> roomList = roomService.findAll();
        List<Payment> paymentList = paymentService.findAll();
        request.setAttribute("roomList", roomList);
        request.setAttribute("paymentList", paymentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
        }
    }


    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameCustomer = request.getParameter("nameCustomer");
        int numberPhone = Integer.parseInt(request.getParameter("numberPhone"));
        String ngayBatDau = request.getParameter("ngayBatDau");
        int idPayment_room = Integer.parseInt(request.getParameter("idPayment_room"));
        Room room = new Room(id, nameCustomer, numberPhone, ngayBatDau, idPayment_room);
        try {
            roomService.updateRom(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException| IOException e) {
            e.printStackTrace();
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("nameCustomer");
        int numberPhone = Integer.parseInt(request.getParameter("numberPhone"));
        String ngayBatDau = request.getParameter("ngayBatDau");
        int idPayment_room = Integer.parseInt(request.getParameter("idPayment_room"));
        Room room = new Room(nameCustomer,numberPhone,ngayBatDau,idPayment_room);
        try {
            roomService.insert(room);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String mess = "Successfully Added New";
        request.setAttribute("mess", mess);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
