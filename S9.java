import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class S9 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		try{
				PrintWriter out=res.getWriter();
				res.setContentType("text/html");
				out.write("<html><body>");
				out.write("<h1>SERVICE Method</h1>");
				out.write("<form method=post>");
				out.write("Login:<input type=text name='t1'><br>");
				out.write("Password:<input type=text name='t2'><br>");
				out.write("<input type=submit name='b1' value=Login><br>");
				out.write("</form>");
				out.write("</body></html>");
		}catch(Exception ee){}
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try{
				PrintWriter out=res.getWriter();
				res.setContentType("text/html");
				out.write("<html><body>");
				out.write("<h1>GET Method</h1>");
				out.write("<form method=post>");
				out.write("Login:<input type=text name='t1'><br>");
				out.write("Password:<input type=text name='t2'><br>");
				out.write("<input type=submit name='b1' value=Login><br>");
				out.write("</form>");
				out.write("</body></html>");
		}catch(Exception ee){}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try{
				PrintWriter out=res.getWriter();
				res.setContentType("text/html");
				out.write("<html><body>");
				out.write("<h1>POST Method</h1>");
				String s1=req.getParameter("t1");
				String s2=req.getParameter("t2");
				if(s1.equals("admin") && s2.equals("secret"))
				{
					out.write("Welcome Administrator");
				}
				else
				{
					out.write("<a href='S8'>Go Back</a>");
				}
				out.write("</body></html>");
		}catch(Exception ee){}
	}
}