package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_update_dataSource;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_update_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_s_update_dataSource.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_update_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_update_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("        ");
      if (_jspx_meth_s_update_2(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("        ");
      if (_jspx_meth_s_update_3(_jspx_page_context))
        return;
      out.write("        \n");
      out.write("            Done\n");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setDriver("org.gjt.mm.mysql.Driver");
    _jspx_th_s_setDataSource_0.setUrl("jdbc:mysql://127.0.0.1/BankAppDB");
    _jspx_th_s_setDataSource_0.setUser("root");
    _jspx_th_s_setDataSource_0.setPassword("");
    _jspx_th_s_setDataSource_0.setVar("con");
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_s_update_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_s_update_0 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_s_update_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_s_update_0.setPageContext(_jspx_page_context);
    _jspx_th_s_update_0.setParent(null);
    _jspx_th_s_update_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_s_update_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_update_0 = _jspx_th_s_update_0.doStartTag();
      if (_jspx_eval_s_update_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_update_0[0]++;
          _jspx_th_s_update_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_update_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            Create Table Products(pid int,name varchar(20),price int)\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_update_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_update_0[0]--;
      }
      if (_jspx_th_s_update_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_update_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_update_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_update_0.doFinally();
      _jspx_tagPool_s_update_dataSource.reuse(_jspx_th_s_update_0);
    }
    return false;
  }

  private boolean _jspx_meth_s_update_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_s_update_1 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_s_update_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_s_update_1.setPageContext(_jspx_page_context);
    _jspx_th_s_update_1.setParent(null);
    _jspx_th_s_update_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_s_update_1 = new int[] { 0 };
    try {
      int _jspx_eval_s_update_1 = _jspx_th_s_update_1.doStartTag();
      if (_jspx_eval_s_update_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_update_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_update_1[0]++;
          _jspx_th_s_update_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_update_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            Insert into products values(11,'Computer',28500)\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_update_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_update_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_update_1[0]--;
      }
      if (_jspx_th_s_update_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_update_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_update_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_update_1.doFinally();
      _jspx_tagPool_s_update_dataSource.reuse(_jspx_th_s_update_1);
    }
    return false;
  }

  private boolean _jspx_meth_s_update_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_s_update_2 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_s_update_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_s_update_2.setPageContext(_jspx_page_context);
    _jspx_th_s_update_2.setParent(null);
    _jspx_th_s_update_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_s_update_2 = new int[] { 0 };
    try {
      int _jspx_eval_s_update_2 = _jspx_th_s_update_2.doStartTag();
      if (_jspx_eval_s_update_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_update_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_update_2[0]++;
          _jspx_th_s_update_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_update_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            Insert into products values(12,'Keyboard',500)\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_update_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_update_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_update_2[0]--;
      }
      if (_jspx_th_s_update_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_update_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_update_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_update_2.doFinally();
      _jspx_tagPool_s_update_dataSource.reuse(_jspx_th_s_update_2);
    }
    return false;
  }

  private boolean _jspx_meth_s_update_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_s_update_3 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_s_update_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_s_update_3.setPageContext(_jspx_page_context);
    _jspx_th_s_update_3.setParent(null);
    _jspx_th_s_update_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_s_update_3 = new int[] { 0 };
    try {
      int _jspx_eval_s_update_3 = _jspx_th_s_update_3.doStartTag();
      if (_jspx_eval_s_update_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_update_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_update_3[0]++;
          _jspx_th_s_update_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_update_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            Insert into products values(13,'Mouse',150)\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_update_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_update_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_update_3[0]--;
      }
      if (_jspx_th_s_update_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_update_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_update_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_update_3.doFinally();
      _jspx_tagPool_s_update_dataSource.reuse(_jspx_th_s_update_3);
    }
    return false;
  }
}
