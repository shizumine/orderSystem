/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-26 08:18:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addItem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/jsp/manage/footer.jsp", Long.valueOf(1521621994376L));
    _jspx_dependants.put("/WEB-INF/jsp/manage/header.jsp", Long.valueOf(1521787666833L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/plugins/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/plugins/jquery-weui/css/jquery-weui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/index.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/plugins/theme/default/layer.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\"\r\n");
      out.write("\t\tstyle=\"margin-bottom: 0\">\r\n");
      out.write("\t\t<div class=\"navbar-header col-md-2\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\".sidebar-collapse\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"/manage/index\">彭彭订餐后台</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t<a href=\"message-task.html\" class=\"btn btn-info\" title=\"New Message\"><b>30\r\n");
      out.write("\t\t\t</b><i class=\"fa fa-envelope-o fa-2x\"></i></a> <a href=\"message-task.html\"\r\n");
      out.write("\t\t\t\tclass=\"btn btn-primary\" title=\"New Task\"><b>40 </b><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-bars fa-2x\"></i></a> <a href=\"login.html\"\r\n");
      out.write("\t\t\t\tclass=\"btn btn-danger\" title=\"Logout\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-exclamation-circle fa-2x\"></i></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"col-md-2 navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"sidebar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"user-img-div\"></div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"index.html\"><i class=\"fa fa-dashboard \"></i>Home</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#menu-manage\">菜品管理</a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-manage\" class=\"dropdown collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/manage/findAllItemType\">查询菜品种类</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/manage/findAllItemMaterial\">查询原料</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/manage/addItem\">添加菜品</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/manage/findAllItem\">查询菜品</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
      out.write("\r\n");
      out.write("<div class=\"col-md-10\">\r\n");
      out.write("\t<form role=\"form\" class=\"form-horizontal\"\r\n");
      out.write("\t\taction=\"/manage/addItemCommit\" method=\"post\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<div class=\"form-group\"><h2 class=\"col-md-offset-2 col-md-2\">添加菜品</h2></div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"name\" class=\"col-md-2 control-label\">菜品名称</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"请输入菜品名称\" maxlength=\"20\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"discount\" class=\"col-md-2 control-label\">折扣</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"discount\"\r\n");
      out.write("\t\t\t\t\tname=\"discount\" placeholder=\"折扣(1-9)折，0为不打折\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"price\" class=\"col-md-2 control-label\">价格</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"price\" name=\"price\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"请输入价格\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"vipprice\" class=\"col-md-2 control-label\">会员价</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"vipprice\"\r\n");
      out.write("\t\t\t\t\tname=\"vipprice\" placeholder=\"请输入会员价\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"cost\" class=\"col-md-2 control-label\">成本</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cost\" name=\"cost\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"请输入成本\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"item-type\" class=\"col-md-2 control-label\">菜品种类</label>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<select class=\"form-control\" name=\"itemTypeId\">\r\n");
      out.write("\t\t\t\t\t<option>---请选择菜品种类---</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary btn-block\" onclick=\"add_material_line()\">点我添加原料</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"material-line\"></div>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"sale\" value=\"0\" />\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<label for=\"inputfile\">上传图片</label> <input type=\"file\"\r\n");
      out.write("\t\t\t\t\tid=\"inputfile\" name=\"inputfile\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">提交</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/js/jquery-weui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/js/swiper.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/jquery-weui/lib/fastclick.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/plugins/layer/layer.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/manage/addItem.jsp(50,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/manage/addItem.jsp(50,5) '${itemTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${itemTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/manage/addItem.jsp(50,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("itemType");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemType.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemType.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
