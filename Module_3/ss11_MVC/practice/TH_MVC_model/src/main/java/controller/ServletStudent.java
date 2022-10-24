package controller;

import model.Student;
import service.IStudentService;
import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "controller.ServletStudent", urlPatterns = {"/student" ,"/ServletStudent"})
public class ServletStudent extends HttpServlet {

    private IStudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                save(request, response);
                break;
            default:
                showStudentList(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null) {
//            action = "";
//        }
//        switch (action) {
//            case "add":
//                save(request, response);
//                break;
//            default:
//                showStudentList(request, response);
//        }
    }

    private void showStudentList(HttpServletRequest request, HttpServletResponse response) {
        List<Student> studentList = studentService.findAll();
        request.setAttribute("studentList", studentList);
        try {
            request.getRequestDispatcher("view/student/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        boolean gender = Boolean.getBoolean(request.getParameter("gender"));
        String birthday = request.getParameter("birthday");
        float point = Float.parseFloat(request.getParameter("point"));
        String account = request.getParameter("account");
        int classID = Integer.parseInt(request.getParameter("classID"));
        String email = request.getParameter("email");
        Student student = new Student(id, name, gender, birthday, point, account, classID, email);
        studentService.add(student);
        String mess = "Thêm Mới Thành Công ";
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/student/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
