package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function f1()\n");
      out.write("            {\n");
      out.write("                a1=document.getElementById(\"t1\");\n");
      out.write("                a2=document.getElementById(\"t2\");\n");
      out.write("                a3=document.getElementById(\"t3\");\n");
      out.write("                a4=document.getElementById(\"t4\");\n");
      out.write("                a5=document.getElementById(\"t5\");\n");
      out.write("                a6=document.getElementById(\"t6\");\n");
      out.write("                if(a1.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter your name!!!!\");\n");
      out.write("                    a1.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(a2.value.length<8 || a2.value!=a3.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Both password must be same.\\nMinimum 8 characters\");\n");
      out.write("                    a2.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(parseInt(a4.value)<18)\n");
      out.write("                {\n");
      out.write("                    alert(\"Age should be greater than 18\");\n");
      out.write("                    a4.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                mb=a5.value;\n");
      out.write("                if(mb.length!=10)\n");
      out.write("                {\n");
      out.write("                    alert(\"Invalid Mobile Number\");\n");
      out.write("                    a5.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    for(i=0;i<10;i++)\n");
      out.write("                    {\n");
      out.write("                        c=mb.substring(i,i+1);\n");
      out.write("                        if(c<'0' || c>'9')\n");
      out.write("                        {\n");
      out.write("                            alert(\"Invalid Digits in Mobile Number\");\n");
      out.write("                            a5.focus;\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                email=a6.value;\n");
      out.write("                ln=email.length;\n");
      out.write("                at=email.indexOf(\"@\");\n");
      out.write("                dot=email.lastIndexOf(\".\");\n");
      out.write("                if(ln<10 || at<4 || dot<7 || dot-at<3 || ln-dot<3)\n");
      out.write("                {\n");
      out.write("                    alert(\"Invalid Email!!!!!\");\n");
      out.write("                    a6.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            function f2()\n");
      out.write("            {\n");
      out.write("                x1=document.getElementById(\"c1\");\n");
      out.write("                //alert(x1.value);\n");
      out.write("                //alert(x1.checked);\n");
      out.write("                if(x1.checked)\n");
      out.write("                    document.getElementById(\"b1\").disabled=false;\n");
      out.write("                else\n");
      out.write("                    document.getElementById(\"b1\").disabled=true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"p6.jsp\">              \n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr><td>Name:</td><td><input type='text' name='t1' id='t1'></td><td></td></tr>\n");
      out.write("            <tr><td>Password:</td><td><input type='text' name='t2' id='t2'></td><td></td></tr>\n");
      out.write("            <tr><td>Re-Password:</td><td><input type='text' name='t3' id='t3'></td><td></td></tr>\n");
      out.write("            <tr><td>Age:</td><td><input type='text' name='t4' id='t4'></td><td></td></tr>\n");
      out.write("            <tr><td>Mobile:</td><td><input type='text' name='t5' id='t5'></td><td></td></tr>\n");
      out.write("            <tr><td>Email:</td><td><input type='text' name='t6' id='t6'></td><td></td></tr>\n");
      out.write("            <tr><td></td><td><input type='checkbox' name='c1' id='c1' onchange=\"f2()\">I Agrees</td><td></td></tr>\n");
      out.write("            <tr><td></td><td></td><td></td></tr>\n");
      out.write("            <tr><td></td><td></td><td></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"submit\" value=\"Register\" id='b1' onclick=\"return f1()\" disabled></td><td></td></tr>\n");
      out.write("        </table>\n");
      out.write("            </form>\n");
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
