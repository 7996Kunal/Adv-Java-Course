import javax.servlet.*;
import java.io.*;
public class S4 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.write("<html><body>");
			String s1=req.getContentType();
			int s2=req.getContentLength();
			String s3=req.getParameter("t1");
			String s4=req.getParameter("t2");
			out.write(s1+"<br>");
			out.write(s2+"<br>");
			out.write(s3+"<br>");
			out.write(s4+"<br>");
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}