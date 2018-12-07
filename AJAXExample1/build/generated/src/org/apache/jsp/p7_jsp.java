package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class p7_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        PreparedStatement stmt;
        ResultSet rs;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            var xmlhttp;\n");
      out.write("            function getCities()\n");
      out.write("            {\n");
      out.write("                s=document.getElementById(\"s1\").value;\n");
      out.write("                xmlhttp=new XMLHttpRequest();\n");
      out.write("                xmlhttp.onreadystatechange=showCities;\n");
      out.write("                xmlhttp.open(\"GET\",\"p8.jsp?state=\"+s,true);\n");
      out.write("                xmlhttp.send(null);\n");
      out.write("            }\n");
      out.write("            function showCities()\n");
      out.write("            {\n");
      out.write("                if(xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("                {\n");
      out.write("                    ans=xmlhttp.responseText.trim();\n");
      out.write("                    ss=document.getElementById(\"s2\");\n");
      out.write("                    ss.length=0;\n");
      out.write("                    arr=ans.split(\"#\");\n");
      out.write("                    for(i=0;i<arr.length;i++)\n");
      out.write("                    {\n");
      out.write("                        opt=document.createElement(\"option\");\n");
      out.write("                        opt.text=arr[i];\n");
      out.write("                        opt.value=arr[i];\n");
      out.write("                        ss.appendChild(opt);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            stmt=con.prepareStatement("Select distinct states from indianstates order by states");
            rs=stmt.executeQuery();
        
      out.write("\n");
      out.write("        <select id=\"s1\" onchange=\"getCities()\">\n");
      out.write("            ");

                while(rs.next())
                {
                    out.write("<option>"+rs.getString(1)+"</option>");
                }
            
      out.write("\n");
      out.write("        </select><br><br>\n");
      out.write("        <select id=\"s2\"></select>\n");
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
