package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.rmi.*;
import java.rmi.registry.*;

public final class newjspp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

                String s1="",s2="",s3="",s4="",s5="",s6="";
                if(request.getParameter("b1")!=null)
                {
                    String s=request.getParameter("t1");
                    Registry r=LocateRegistry.getRegistry("127.0.0.1",1099);
                    p1.EmpInterface emp=(p1.EmpInterface)r.lookup("EMP");
                    p1.Employees ee=emp.search(s);
                    if(ee!=null)
                    {
                        s1=ee.getEid();
                        s2=ee.getName();
                        s3=ee.getSalary();
                        s4=ee.getMobile();
                        s5=ee.getDoa();
                        s6=ee.getDesignation();
                    }
                }
        
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"t1\" value=\"");
      out.print(s1);
      out.write("\"><br>\n");
      out.write("            <input type=\"text\" name=\"t2\" value=\"");
      out.print(s2);
      out.write("\"><br>\n");
      out.write("            <input type=\"text\" name=\"t3\" value=\"");
      out.print(s3);
      out.write("\"><br>\n");
      out.write("            <input type=\"text\" name=\"t4\" value=\"");
      out.print(s4);
      out.write("\"><br>\n");
      out.write("            <input type=\"text\" name=\"t5\" value=\"");
      out.print(s5);
      out.write("\"><br>\n");
      out.write("            <input type=\"text\" name=\"t6\" value=\"");
      out.print(s6);
      out.write("\"><br>\n");
      out.write("            <input type=\"submit\" name=\"b1\" value=\"Search\">\n");
      out.write("        </form>\n");
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
