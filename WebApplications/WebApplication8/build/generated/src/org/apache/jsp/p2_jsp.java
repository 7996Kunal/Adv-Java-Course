package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_m_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_m_set_var_value_nobody.release();
    _jspx_tagPool_m_forEach_var_end_begin.release();
    _jspx_tagPool_m_out_value_nobody.release();
    _jspx_tagPool_m_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"t1\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Click Here\" name=\"b1\">\n");
      out.write("        </form>\n");
      out.write("        ");
      if (_jspx_meth_m_set_0(_jspx_page_context))
        return;
      out.write("<br>\n");
      out.write("        ");
      if (_jspx_meth_m_out_0(_jspx_page_context))
        return;
      out.write("<br>\n");
      out.write("    ");
      if (_jspx_meth_m_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_m_if_1(_jspx_page_context))
        return;
      out.write("    \n");
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

  private boolean _jspx_meth_m_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_m_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_m_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_m_set_0.setPageContext(_jspx_page_context);
    _jspx_th_m_set_0.setParent(null);
    _jspx_th_m_set_0.setVar("x");
    _jspx_th_m_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.t1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m_set_0 = _jspx_th_m_set_0.doStartTag();
    if (_jspx_th_m_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m_set_var_value_nobody.reuse(_jspx_th_m_set_0);
      return true;
    }
    _jspx_tagPool_m_set_var_value_nobody.reuse(_jspx_th_m_set_0);
    return false;
  }

  private boolean _jspx_meth_m_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_m_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_m_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_m_out_0.setPageContext(_jspx_page_context);
    _jspx_th_m_out_0.setParent(null);
    _jspx_th_m_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.t1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m_out_0 = _jspx_th_m_out_0.doStartTag();
    if (_jspx_th_m_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m_out_value_nobody.reuse(_jspx_th_m_out_0);
      return true;
    }
    _jspx_tagPool_m_out_value_nobody.reuse(_jspx_th_m_out_0);
    return false;
  }

  private boolean _jspx_meth_m_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_m_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_m_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_m_if_0.setPageContext(_jspx_page_context);
    _jspx_th_m_if_0.setParent(null);
    _jspx_th_m_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.b1 eq nil}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_m_if_0 = _jspx_th_m_if_0.doStartTag();
    if (_jspx_eval_m_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        Enter Some Value and press submit\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_m_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_m_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m_if_test.reuse(_jspx_th_m_if_0);
      return true;
    }
    _jspx_tagPool_m_if_test.reuse(_jspx_th_m_if_0);
    return false;
  }

  private boolean _jspx_meth_m_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_m_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_m_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_m_if_1.setPageContext(_jspx_page_context);
    _jspx_th_m_if_1.setParent(null);
    _jspx_th_m_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.b1 ne nil}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_m_if_1 = _jspx_th_m_if_1.doStartTag();
    if (_jspx_eval_m_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_m_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_m_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_m_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_m_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m_if_test.reuse(_jspx_th_m_if_1);
      return true;
    }
    _jspx_tagPool_m_if_test.reuse(_jspx_th_m_if_1);
    return false;
  }

  private boolean _jspx_meth_m_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_m_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_m_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_m_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_m_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_m_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_if_1);
    _jspx_th_m_forEach_0.setBegin(1);
    _jspx_th_m_forEach_0.setEnd(10);
    _jspx_th_m_forEach_0.setVar("i");
    int[] _jspx_push_body_count_m_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_m_forEach_0 = _jspx_th_m_forEach_0.doStartTag();
      if (_jspx_eval_m_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_m_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_m_forEach_0, _jspx_page_context, _jspx_push_body_count_m_forEach_0))
            return true;
          out.write("<br>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_m_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_m_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_m_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_m_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_m_forEach_0.doFinally();
      _jspx_tagPool_m_forEach_var_end_begin.reuse(_jspx_th_m_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_m_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_m_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_m_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_m_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_m_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_m_out_1.setPageContext(_jspx_page_context);
    _jspx_th_m_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_forEach_0);
    _jspx_th_m_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.t1}x${i}=${param.t1*i}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m_out_1 = _jspx_th_m_out_1.doStartTag();
    if (_jspx_th_m_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m_out_value_nobody.reuse(_jspx_th_m_out_1);
      return true;
    }
    _jspx_tagPool_m_out_value_nobody.reuse(_jspx_th_m_out_1);
    return false;
  }
}
