import javax.servlet.*;
import java.io.*;
public class S5 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.write("<html><body>");
			out.write("<form method='post' action='S6'>");
			out.write("<input type='text' name='t1'><br>");
			out.write("<input type='password' name='t2'><br>");
			out.write("<input type='submit'  value='Submit' name='b1'><br>");
			out.write("</form><hr>");
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}