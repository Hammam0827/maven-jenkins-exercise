/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-12-04 08:52:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/css/mystyle.css", Long.valueOf(1669282295444L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  ");
      out.write("@charset \"UTF-8\";\n");
      out.write(".edit {\n");
      out.write("    float: right;\n");
      out.write("    padding-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  border-spacing: 1;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  background: white;\n");
      out.write("  border-radius: 6px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  max-width: 800px;\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("table * {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("table td, table th {\n");
      out.write("  padding-left: 8px;\n");
      out.write("}\n");
      out.write("table thead tr {\n");
      out.write("  height: 60px;\n");
      out.write("  background: #FFED86;\n");
      out.write("  font-size: 16px;\n");
      out.write("}\n");
      out.write("table tbody tr {\n");
      out.write("  height: 48px;\n");
      out.write("  border-bottom: 1px solid #E3F1D5;\n");
      out.write("}\n");
      out.write("table tbody tr:last-child {\n");
      out.write("  border: 0;\n");
      out.write("}\n");
      out.write("table td, table th {\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("table td.l, table th.l {\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("table td.c, table th.c {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("table td.r, table th.r {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 35.5em) {\n");
      out.write("  table {\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("  table > *, table tr, table td, table th {\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("  table thead {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  table tbody tr {\n");
      out.write("    height: auto;\n");
      out.write("    padding: 8px 0;\n");
      out.write("  }\n");
      out.write("  table tbody tr td {\n");
      out.write("    padding-left: 45%;\n");
      out.write("    margin-bottom: 12px;\n");
      out.write("  }\n");
      out.write("  table tbody tr td:last-child {\n");
      out.write("    margin-bottom: 0;\n");
      out.write("  }\n");
      out.write("  table tbody tr td:before {\n");
      out.write("    position: absolute;\n");
      out.write("    font-weight: 700;\n");
      out.write("    width: 40%;\n");
      out.write("    left: 10px;\n");
      out.write("    top: 0;\n");
      out.write("  }\n");
      out.write("  table tbody tr td:nth-child(1):before {\n");
      out.write("    content: \"Code\";\n");
      out.write("  }\n");
      out.write("  table tbody tr td:nth-child(2):before {\n");
      out.write("    content: \"Stock\";\n");
      out.write("  }\n");
      out.write("  table tbody tr td:nth-child(3):before {\n");
      out.write("    content: \"Cap\";\n");
      out.write("  }\n");
      out.write("  table tbody tr td:nth-child(4):before {\n");
      out.write("    content: \"Inch\";\n");
      out.write("  }\n");
      out.write("  table tbody tr td:nth-child(5):before {\n");
      out.write("    content: \"Box Type\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("  font: 400 14px 'Calibri','Arial';\n");
      out.write("  /* background: #FFDEAD; */\n");
      out.write("}\n");
      out.write("\n");
      out.write("blockquote {\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border-radius: 4px;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1 {\n");
      out.write("  background-color: white; \n");
      out.write("  color: black; \n");
      out.write("  border: 2px solid #FFED86;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1:hover {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2 {\n");
      out.write("  background-color: white; \n");
      out.write("  color: black; \n");
      out.write("  border: 2px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2:hover {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  padding: 12px 12px 12px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: white; \n");
      out.write("  color: black; \n");
      out.write("  border-radius: 4px;\n");
      out.write("  padding: 16px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  float: left;\n");
      out.write("  width: 75%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .col-25, .col-75, input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>To do list</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-navigation.jsp", out, false);
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<h1 class=\"text-center\"><b>Create a ToDo List</b></h1>\n");
      out.write("<br>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form action =\"CreateServlet\" method=\"post\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"ftitle\">Title</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("      <input type=\"text\" id=\"ftite\" name=\"todo\" placeholder=\"title...\" required = \"required\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"ldescription\">Description</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("      <input type=\"text\" id=\"ldescription\" name=\"description\" placeholder=\"description...\" required = \"required\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"date\">Due date</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("      <input type=\"date\" id=\"ldate\" name=\"date\" placeholder=\"date...\" required = \"required\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"subject\">Select Time</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("      <input type=\"time\" id=\"ltime\" name=\"time\" placeholder=\"time...\" required = \"required\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <input type=\"submit\" value=\"Call Servlet\">\n");
      out.write("    <a href=\"");
      out.print(request.getContextPath());
      out.write("/TodoServlet/dashboard\" class=\"button button2\">Back</a>\n");
      out.write("  </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Include the message modal here -->\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "message-modal.jsp", out, false);
      out.write("</div>\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login-modal.jsp", out, false);
      out.write("</div>\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "register-modal.jsp", out, false);
      out.write("</div>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"https://www.w3schools.com/lib/w3.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t//to bring in other HTML on the fly into this page\n");
      out.write("\tw3.includeHTML();\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://kit.fontawesome.com/86ec7c1143.js\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
