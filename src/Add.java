import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//        rd.forward(request,response);

        String str = request.getParameter("t1");
        Cookie cookie = new Cookie("t1", str);
        response.addCookie(cookie);

        response.sendRedirect("SecondServlet");
    }
}
