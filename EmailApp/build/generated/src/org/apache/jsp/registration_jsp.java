package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            var xmlhttp;\n");
      out.write("            function checkUser()\n");
      out.write("            {\n");
      out.write("                s=document.getElementById(\"t1\").value;\n");
      out.write("                xmlhttp=new XMLHttpRequest();\n");
      out.write("                xmlhttp.onreadystatechange=showUserStatus;\n");
      out.write("                xmlhttp.open(\"GET\",\"userstatus.jsp?ulogin=\"+s,true);\n");
      out.write("                xmlhttp.send(null);\n");
      out.write("            }\n");
      out.write("            function showUserStatus()\n");
      out.write("            {\n");
      out.write("                if(xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("                {\n");
      out.write("                    reply=xmlhttp.responseText.trim();\n");
      out.write("                    if(reply==\"Y\")\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"d1\").innerHTML=\"This id Already Exists!!!\";\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"d1\").innerHTML=\"\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function verifyData()\n");
      out.write("            {\n");
      out.write("                tt1=document.getElementById(\"t1\");\n");
      out.write("                tt2=document.getElementById(\"t2\");\n");
      out.write("                tt3=document.getElementById(\"t3\");\n");
      out.write("                tt4=document.getElementById(\"t4\");\n");
      out.write("                tt5=document.getElementById(\"t5\");\n");
      out.write("                tt6=document.getElementById(\"t6\");\n");
      out.write("                tt7=document.getElementById(\"t7\");\n");
      out.write("                tt8=document.getElementById(\"t8\");\n");
      out.write("                tt9=document.getElementById(\"t9\");\n");
      out.write("                tt10=document.getElementById(\"t10\");\n");
      out.write("                tt11=document.getElementById(\"t11\");\n");
      out.write("                if(tt1.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"User name is Compulsory!!\");\n");
      out.write("                    tt1.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(tt11.value!=tt10.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Invalid Captch Text!!!\");\n");
      out.write("                    tt10.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"images/mailbanner.jpg\" width=\"100%\"><hr>\n");
      out.write("        <form method=\"post\" action=\"register.jsp\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"3\">Member Registration</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>User Name:</td><td><input type=\"text\" name=\"t1\" id=\"t1\" onBlur=\"checkUser()\"></td><td style=\"width:100px\"><div id=\"d1\"></div></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password:</td><td><input type=\"password\" name=\"t2\" id=\"t2\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Re-Type Password:</td><td><input type=\"password\" name=\"t3\" id=\"t3\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Alternate Email:</td><td><input type=\"email\" name=\"t4\" id=\"t4\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name:</td><td><input type=\"text\" name=\"t5\" id=\"t5\" placeholder=\"Enter Name\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Mobile:</td><td><input type=\"text\" name=\"t6\" id=\"t6\" placeholder=\"Enter Mobile\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date of Birth:</td><td><input type=\"date\" name=\"t7\" id=\"t7\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Security Question:</td><td><select name=\"t8\" id=\"t8\"><option>Pet Name?</option><option>Favorite Destination?</option><option>1st Movie?</option></select></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Answer:</td><td><input type=\"text\" name=\"t9\" id=\"t9\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Captcha Text:</td><td><input type=\"text\" id=\"t10\" name=\"t10\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td></td><td><input type=\"hidden\" id=\"t11\" name=\"t11\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td><td><img src=\"captcha.jsp\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td></td><td><input type=\"submit\" value=\"Register\" name=\"b1\" id=\"b1\" onClick=\"return verifyData()\"></td><td></td>\n");
      out.write("            </tr>\n");
      out.write("        </table></form>\n");
      out.write("        <hr>\n");
      out.write("    <center>All Rights Reserved</center>\n");
      out.write("    <center><address>Copyright 2018</address></center>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.session.id.substring(5,13)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
