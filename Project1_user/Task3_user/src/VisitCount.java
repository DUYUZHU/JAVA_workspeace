import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VisitCount", value = "/VisitCount")
public class VisitCount extends HttpServlet {
    private int visitCount;

    @Override
    public void init() throws ServletException {
        visitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {

        visitCount++;

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head><title>访问计数器</title></head>");
            out.println("<body>");
            out.println("<h1>访问计数器</h1>");
            out.println("<p>该页面已被访问了 " + visitCount + " 次。</p >");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void destroy() {

    }
}
