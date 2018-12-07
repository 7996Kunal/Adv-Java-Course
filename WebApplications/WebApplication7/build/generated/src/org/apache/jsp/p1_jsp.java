package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class p1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

        String msg="";        
        if(request.getParameter("b1")!=null)
        {
            String s1=request.getParameter("t1");
            String s2=request.getParameter("t2");
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
            PreparedStatement stmt=con.prepareStatement("Select * from users where ulogin=? and upass=?");
            stmt.setString(1,s1);
            stmt.setString(2,s2);
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                if(request.getParameter("c1")!=null)
                {
                    Cookie c=new Cookie("UN",s1);
                    c.setMaxAge(7*24*60*60);
                    response.addCookie(c);
                }
                session.setAttribute("ULOGIN",s1);
                session.setAttribute("CON",con);
                response.sendRedirect("p2.jsp");
            }
            else
            {
                msg="Invalid ID/Password!!!";
                con.close();
            }
        }
        Cookie[] ck=request.getCookies();
        String v="";
        if(ck!=null)
        {
            for(int i=0;i<ck.length;i++)
            {
                String nm=ck[i].getName();
                if(nm.equals("UN"))
                {
                    v=ck[i].getValue();
                }
            }
        }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table align='center'>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Login:</td><td><input type='text' name='t1' value='");
      out.print(v);
      out.write("'></td><td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td><td><input type='password' name='t2'></td><td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><input type='checkbox' name='c1'> Remember Me</td><td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><input type='submit' name='b1' value='Login'></td><td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><font color='red'>");
      out.print(msg);
      out.write("</font></td><td></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
