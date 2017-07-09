import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        Cookie cookies[] = request.getCookies();
        String str = null;

        for(Cookie c = cookies){
            if(c.getName().equals("t1")){
                str = c.getValue();
            }
        }

        PrintWriter out = response.getWriter();
        out.println("Welcome " + str);

    }
}
