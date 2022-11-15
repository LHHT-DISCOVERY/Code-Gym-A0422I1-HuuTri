package controller;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SachServlet", value = "/SachServlet")
public class SachServlet extends HttpServlet {
    static ISachService iSachService = new SachService();
    static IHocSinhService iHocSinhService = new HocSinhService();
    static ITheMuonSachService iTheMuonSachService = new TheMuonSachService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "thongke":
                show(request, response);
                break;
            case "muon":
                showMuonForm(request, response);
                break;
            case "delete":
                break;
            case "search":
                search(request, response);
                break;
            default:
                list(request, response);
                break;
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Sach> sachList = iSachService.findAll();
        List<TheMuonSach> theMuonSachList = iTheMuonSachService.findAll();
        List<HocSinh> hocSinhList = iHocSinhService.findAll();
        request.setAttribute("theMuonSachList" , theMuonSachList);
        request.setAttribute("sachList", sachList);
        request.setAttribute("hocSinhList", hocSinhList);
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
    }
    

    private void showMuonForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("ma_sach"));
        Sach sach = iSachService.select(id);
        List<Sach> sachList = iSachService.findAll();
        request.setAttribute("sach" ,sach);
        request.setAttribute("sachList" ,sachList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/muon.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void show(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/thongke.jsp").forward(request, response);
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
                break;
            case "muon":
                muon(request, response);
                break;
        }
    }

    private void muon(HttpServletRequest request, HttpServletResponse response) {
//        int maSach = Integer.parseInt(request.getParameter("id"));
//        String tenSach = request.getParameter("nameCustomer");
//        String tacGia = request.getParameter("nameCustomer");
//        String moTa = request.getParameter("nameCustomer");
//        int soLuong = Integer.parseInt(request.getParameter("nameCustomer"));
//        String ngayBatDau = request.getParameter("ngayBatDau");
//        int idPayment_room = Integer.parseInt(request.getParameter("idPayment_room"));
//        Room room = new Room(id, nameCustomer, numberPhone, ngayBatDau, idPayment_room);
//        try {
//            roomService.update(room);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/update.jsp");
        
    
    }
}
