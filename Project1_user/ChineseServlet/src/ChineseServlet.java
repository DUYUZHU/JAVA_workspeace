/*1. 请按照以下要求设计一个向页面输出中文的类 ChineseServlet。要求如下：
        （1）创建一个 ChineseServlet 类，使其继承 HttpServlet 类并重写该类的 doGet()方法。
        （2）在 doGet()方法中，使用 HttpServletResponse 对象的 setContentType()方法将浏览器
        编码改为 utf-8。
        （3）使用 HttpServletResponse 对象获取输出流，向浏览器输出“JavaWeb 程序设计任务
        教程”的中文字样。*/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ChineseServlet", urlPatterns = "/chinese")
public class ChineseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 设置响应的内容类型和编码为 utf-8

        PrintWriter out = response.getWriter(); // 获取输出流

        out.println("<html>");
        out.println("<head><title>ChineseServlet</title></head>");
        out.println("<body>");
        out.println("<h1>JavaWeb 程序设计任务教程</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
