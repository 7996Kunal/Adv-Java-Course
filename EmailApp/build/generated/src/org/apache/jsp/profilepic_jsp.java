package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profilepic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    Class.forName("org.gjt.mm.mysql.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1/emailapp","root","");
    java.sql.PreparedStatement stmt=con.prepareStatement("Select * from members where userlogin=? and profilepic is not null");
    stmt.setObject(1,session.getAttribute("ulogin"));
    java.sql.ResultSet rs=stmt.executeQuery();
    if(rs.next())
    {
        byte[] data=rs.getBytes("profilepic");
        response.setContentType("image/jpeg");
        response.setContentLength(data.length);
        java.io.OutputStream iout=response.getOutputStream();
        iout.write(data);
        iout.close();
    }
    else
    {
        String s=request.getRealPath("");
        java.io.FileInputStream fin=new java.io.FileInputStream(s+"\\images\\Parties.jpg");
        int size=fin.available();
        byte[] data=new byte[size];
        fin.read(data);
        response.setContentType("image/jpeg");
        response.setContentLength(data.length);
        java.io.OutputStream iout=response.getOutputStream();
        iout.write(data);
        iout.close();
    }
    con.close();

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
