import javax.servlet.*;
import java.io.*;
public class S2 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			String s1=req.getContentType();
			int s2=req.getContentLength();
			String s3=req.getScheme();
			String s4=req.getProtocol();
			String s5=req.getServerName();
			int s6=req.getServerPort();
			String s7=req.getRemoteHost();
			String s8=req.getRemoteAddr();
			out.write("<html><body>");
			out.println(s1+"<br>");
			out.println(s2+"<br>");
			out.println(s3+"<br>");
			out.println(s4+"<br>");
			out.println(s5+"<br>");
			out.println(s6+"<br>");
			out.println(s7+"<br>");
			out.println(s8+"<br>");
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}