import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_chuyen_doi_tien", urlPatterns = "/Servlet_chuyen_doi_tien")
public class Servlet_chuyen_doi_tien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double money = Double.parseDouble(request.getParameter("VN"));
        double result  =  Double.parseDouble(request.getParameter("VN")) / 23000;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + money + " VND </h1>");
        writer.println("<h1> = " + result + " USD</h1>");
        writer.println("</html>");
    }
}
