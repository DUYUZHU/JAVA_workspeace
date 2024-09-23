import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PublicSum extends HttpServlet
{
	ServletContext sc;    //����
	public void init()
	{
		sc=this.getServletContext();    //ʵ����
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws IOException
	{
		int count;
		response.setContentType("text/html;charset=GBK");
		PrintWriter out=response.getWriter();
		String str=request.getParameter("number");   //ͨ�����еĿؼ����ƻ�ÿؼ���valueֵ
		int num=Integer.parseInt(str);    //�ַ�����ת��Ϊ����

		String o=(String)sc.getAttribute("count");//����Servlet��������count�Ķ���,��û��count�Ķ����򷵻�null
		
		if(o!=null)   //����ڵ�ǰ�������У������ù���Ӧ�ó�������count�Ķ���
		{
			count=Integer.parseInt(o);
		}
		else
		{
			count=0;
		}
		count+=num;
		String result=String.valueOf(count);    //����ת��Ϊ�ַ����� 
		sc.setAttribute("count",result);       //��result�����ֵ����count���󣬼�count��ֵΪresult��ֵ
		out.println("���ڵ��ۼӽ����"+count);
	}
	public void destroy(){}
}