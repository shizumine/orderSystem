/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-19 08:53:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editItemType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/jsp/manage/footer.jsp", Long.valueOf(1521449276756L));
    _jspx_dependants.put("/WEB-INF/jsp/manage/header.jsp", Long.valueOf(1521449319254L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>彭彭网上餐馆</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/plugins/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/plugins/jquery-weui/css/jquery-weui.min.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<a href=\"/manage/addItemType\">添加菜品种类</a> <a\r\n");
      out.write("\t\t\thref=\"/manage/findAllItemType\">查询菜品种类(提供修改)</a> <a\r\n");
      out.write("\t\t\thref=\"/manage/addItem\">添加菜品</a> <a href=\"/manage/findItem\">查询菜品(提供修改)</a>\r\n");
      out.write("\t\t<a href=\"#\">添加原料</a> <a href=\"#\">查询原料</a>\r\n");
      out.write("\t</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form role=\"form\" action=\"/manage/editItemTypeCommit\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"id\"/>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label for=\"name\">修改名称</label> <input type=\"text\"\r\n");
      out.write("\t\t\tclass=\"form-control\" id=\"name\" name=\"name\" placeholder=\"请输入菜品种类名称\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemType.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"20\" required=\"required\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-success\">提交</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/js/jquery-weui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/js/swiper.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/lib/fastclick.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/shizumine.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/index.js\"></script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
