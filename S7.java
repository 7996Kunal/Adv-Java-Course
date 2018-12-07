import javax.servlet.*;
import java.io.*;
public class S7 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			String s1=req.getParameter("t1");
			String s2=req.getParameter("t2");
			String s3=req.getParameter("b1");
			out.write("<html><body>");
			if(s3==null)
			{
				out.write("<form method='post'>");
				out.write("<input type='text' name='t1'><br>");
				out.write("<input type='password' name='t2'><br>");
				out.write("<input type='submit'  value='Submit' name='b1'><br>");
				out.write("</form><hr>");
			}
			else
			{
				if(s1.equals("admin") && s2.equals("secret"))
				{
					out.write("Weclome Administrator");
				}
				else
				{
					out.write("Invalid Login/Password!!!<br>");
					out.write("<a href='S7'>Go Back</a>");
				}
			}
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}