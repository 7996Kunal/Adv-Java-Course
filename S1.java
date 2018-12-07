import javax.servlet.*;
import java.io.*;
public class S1 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			//res.setContentType("application/pdf");
			out.write("<html><body>");
			out.println("Hello From Server");
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}