import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class S10 extends HttpServlet
{
	public void processRequest(HttpServletRequest req,HttpServletResponse res)
	{
		try{
		}catch
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try{
				processRequest(req,res);
		}catch(Exception ee){}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try{
				processRequest(req,res);
		}catch(Exception ee){}
	}
}