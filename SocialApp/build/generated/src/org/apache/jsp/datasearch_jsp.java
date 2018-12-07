package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class datasearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String fld=request.getParameter("fld");
    String txt=request.getParameter("txt");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
    PreparedStatement stmt=con.prepareStatement("Select * from Members where "+fld+" like ?");
    stmt.setString(1,"%"+txt+"%");
    ResultSet rs=stmt.executeQuery();
    String ans="<table>";
    while(rs.next())
    {
        String s1=rs.getString(1);
        String s2=rs.getString("name");
        String s3=rs.getString("city");
        String s4=rs.getString("hobbies");
        String s5=rs.getString("college");
        ans=ans+"<tr>";
        ans=ans+"<td>"+s1+"</td>";
        ans=ans+"<td>"+s2+"</td>";
        ans=ans+"<td>"+s3+"</td>";
        ans=ans+"<td>"+s4+"</td>";
        ans=ans+"<td>"+s5+"</td>";
        ans=ans+"</tr>";
    }
    ans=ans+"</table>";
    out.write(ans);
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
