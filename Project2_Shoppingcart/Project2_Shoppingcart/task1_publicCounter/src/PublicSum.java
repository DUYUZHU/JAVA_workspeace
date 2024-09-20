import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PublicSum extends HttpServlet
{
	ServletContext sc;    //声明
	public void init()
	{
		sc=this.getServletContext();    //实例化
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws IOException
	{
		int count;
		response.setContentType("text/html;charset=GBK");
		PrintWriter out=response.getWriter();
		String str=request.getParameter("number");   //通过表单中的控件名称获得控件的value值
		int num=Integer.parseInt(str);    //字符串型转变为整型

		String o=(String)sc.getAttribute("count");//返回Servlet上下文中count的对象,如没有count的对象，则返回null
		
		if(o!=null)   //如果在当前服务器中，曾调用过该应用程序，则有count的对象。
		{
			count=Integer.parseInt(o);
		}
		else
		{
			count=0;
		}
		count+=num;
		String result=String.valueOf(count);    //整型转变为字符串型 
		sc.setAttribute("count",result);       //把result对象的值赋给count对象，即count的值为result的值
		out.println("现在的累加结果是"+count);
	}
	public void destroy(){}
}