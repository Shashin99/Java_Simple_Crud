/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-10-09 18:15:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Contact Us - Online Music Store</title>\r\n");
      out.write("<style>\r\n");
      out.write("    /* General Styles */\r\n");
      out.write("    body {\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        background-color: #f4f4f4;\r\n");
      out.write("    }\r\n");
      out.write("    header {\r\n");
      out.write("        background-color: #282828;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("    header h1 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        font-size: 2.5rem;\r\n");
      out.write("    }\r\n");
      out.write("    nav {\r\n");
      out.write("        margin: 20px 0;\r\n");
      out.write("    }\r\n");
      out.write("    nav a {\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 14px 20px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        margin: 0 10px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    nav a:hover {\r\n");
      out.write("        background-color: #ff6b6b;\r\n");
      out.write("    }\r\n");
      out.write("    section {\r\n");
      out.write("        padding: 40px;\r\n");
      out.write("        max-width: 800px;\r\n");
      out.write("        margin: 20px auto;\r\n");
      out.write("        background-color: white;\r\n");
      out.write("        border-radius: 10px;\r\n");
      out.write("        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("    section h2 {\r\n");
      out.write("        font-size: 2rem;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    section p {\r\n");
      out.write("        font-size: 1.2rem;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    /* Contact Form */\r\n");
      out.write("    .contact-form {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-form input, \r\n");
      out.write("    .contact-form textarea {\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-form button {\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        background-color: #282828;\r\n");
      out.write("        color: white;\r\n");
      out.write("        border: none;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        transition: background-color 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-form button:hover {\r\n");
      out.write("        background-color: #ff6b6b;\r\n");
      out.write("    }\r\n");
      out.write("    /* Back to Home Button */\r\n");
      out.write("    .home-button {\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        padding: 15px 30px;\r\n");
      out.write("        background-color: #282828;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        font-size: 1.2rem;\r\n");
      out.write("        transition: background-color 0.3s;\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .home-button:hover {\r\n");
      out.write("        background-color: #ff6b6b;\r\n");
      out.write("    }\r\n");
      out.write("    footer {\r\n");
      out.write("        background-color: #282828;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        position: fixed;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        bottom: 0;\r\n");
      out.write("    }\r\n");
      out.write("    footer a {\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        margin: 0 10px;\r\n");
      out.write("    }\r\n");
      out.write("    footer a:hover {\r\n");
      out.write("        text-decoration: underline;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Header Section -->\r\n");
      out.write("<header>\r\n");
      out.write("    <h1>Online Music Store</h1>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"Home.jsp\">Home</a>\r\n");
      out.write("        <a href=\"browse.jsp\">Browse Music</a>\r\n");
      out.write("        <a href=\"account.jsp\">Your Account</a>\r\n");
      out.write("        <a href=\"InsertFeedback.jsp\">Give Feedback</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- Contact Us Section -->\r\n");
      out.write("<section>\r\n");
      out.write("    <h2>Contact Us</h2>\r\n");
      out.write("    <p>If you have any questions or feedback, feel free to reach out to us!</p>\r\n");
      out.write("\r\n");
      out.write("    <h3>Contact Details</h3>\r\n");
      out.write("    <p><strong>Email:</strong> Minioc@onlinemusicstore.com</p>\r\n");
      out.write("    <p><strong>Phone:</strong> 0111 567 987 </p>\r\n");
      out.write("    <p><strong>Address:</strong> 123 , Gemenupura, Kothalawala, Kaduwela</p>\r\n");
      out.write("\r\n");
      out.write("    <h3>Send Us a Message</h3>\r\n");
      out.write("    <form class=\"contact-form\" action=\"sendContact.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Your Name\" required>\r\n");
      out.write("        <input type=\"email\" name=\"email\" placeholder=\"Your Email\" required>\r\n");
      out.write("        <textarea name=\"message\" rows=\"5\" placeholder=\"Your Message\" required></textarea>\r\n");
      out.write("        <button type=\"submit\">Send Message</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"Home.jsp\" class=\"home-button\">Back to Home</a>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
