/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.104
 * Generated at: 2025-04-10 18:17:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1744308626508L));
    _jspx_dependants.put("jar:file:/D:/VisionForgeX/EclipseProjects/Spring_Core/SpringMVC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Welcome to My Portfolio</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background-color: #f4f4f9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 15px 0;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 1.5em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".intro {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin: 50px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".intro h1 {\r\n");
      out.write("	color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".intro p {\r\n");
      out.write("	color: #666;\r\n");
      out.write("	font-size: 1.2em;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("	padding: 10px 0;\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	font-size: 1em;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<header> Welcome to My Portfolio </header>\r\n");
      out.write("	");

	String name = (String) request.getAttribute("name");
	String sname = (String) request.getAttribute("sname");
	
	
      out.write("\r\n");
      out.write("	<div class=\"intro\">\r\n");
      out.write("		<h1>\r\n");
      out.write("			Hello, I’m\r\n");
      out.write("			");
      out.print(name);
      out.write("\r\n");
      out.write("			!\r\n");
      out.write("		</h1>\r\n");
      out.write("		<p>Welcome to my professional portfolio. Explore my work, skills,\r\n");
      out.write("			and achievements.</p>\r\n");
      out.write("		<p>\r\n");
      out.write("			Hello i am calling to\r\n");
      out.write("			");
      out.print(sname);
      out.write("\r\n");
      out.write("		</p>\r\n");
      out.write("		<br> <br>\r\n");
      out.write("		<h3>-----------------------getting all\r\n");
      out.write("			subjects------------------------------</h3>\r\n");
      out.write("		<h3>Subjects</h3>\r\n");
      out.write("		<ul>\r\n");
      out.write("			");
 List<String> subjects = (List<String>) request.getAttribute("subjects");
       for (String subject : subjects) { 
      out.write("\r\n");
      out.write("			<li><h3>");
      out.print( subject );
      out.write("</h3></li>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("		<a href=\"about.jsp\" class=\"button\">Learn More About Me</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<footer> © 2025 Your Name | All Rights Reserved </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
