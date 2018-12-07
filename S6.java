import javax.servlet.*;
import java.io.*;
public class S6 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.write("<html><body>");
			String s1=req.getParameter("t1");
			String s2=req.getParameter("t2");
			if(s1.equals("admin") && s2.equals("secret"))
			{
				out.write("Welcome Administrator");
			}
			else
			{
				out.write("Invalid Login/Password!!!<br>");
				out.write("<a href='S5'>Go Back</a>");
			}
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}