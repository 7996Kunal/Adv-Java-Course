package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p13_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script>\n");
      out.write("            var xmlhttp;\n");
      out.write("            function f3()\n");
      out.write("            {\n");
      out.write("                s=document.getElementById(\"t1\").value;\n");
      out.write("                xmlhttp=new XMLHttpRequest();\n");
      out.write("                xmlhttp.open(\"GET\",\"p12.jsp?id=\"+s,true);\n");
      out.write("                xmlhttp.onreadystatechange=f4;\n");
      out.write("                xmlhttp.send(null);\n");
      out.write("            }\n");
      out.write("            function f4()\n");
      out.write("            {\n");
      out.write("                if(xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("                {\n");
      out.write("                    s=xmlhttp.responseText;\n");
      out.write("                    document.getElementById(\"t2\").value=s;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"d1\"></div>\n");
      out.write("        <hr>\n");
      out.write("        <input type=\"text\" name=\"t1\" id=\"t1\" onkeyup=\"f3()\" onblur=\"f3()\"><br>\n");
      out.write("        <input type=\"text\" name=\"t2\" id=\"t2\"><br>\n");
      out.write("        <input type=\"button\" value=\"Click Here\" onclick=\"f3()\">\n");
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
