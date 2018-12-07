import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class S8 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.write("<html><body>");
			out.write("<form method='post'>");
			out.write("<input type='text' name='t1'><br>");
			out.write("<input type='password' name='t2'><br>");
			out.write("<input type='submit'  value='Submit' name='b1'><br>");
			out.write("</form><hr>");
			out.print("</body></html>");
		}catch(Exception ee){}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			String s1=req.getParameter("t1");
			String s2=req.getParameter("t2");
			out.write("<html><body>");
			if(s1.equals("admin") && s2.equals("secret"))
			{
				out.write("Weclome Administrator");
			}
			else
			{
				out.write("Invalid Login/Password!!!<br>");
				out.write("<a href='S8'>Go Back</a>");
			}
			out.print("</body></html>");
		}catch(Exception ee){}
	}
}