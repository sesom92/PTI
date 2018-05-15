package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/favicon-new.ico\" />\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div style=\"text-align:center;clear:both;\">\n");
      out.write("            <h1><img src=\"../img/hehe1.png\"></h1>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"signup.jsp\">Sign Up</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4 col-lg-offset-4\"> \n");
      out.write("                    <div class=\"panel panel-success\">\n");
      out.write("                        <div class=\"panel-heading\"></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form action=\"../loginServlet\" method=\"post\">\n");
      out.write("                                <center>\n");
      out.write("                                    ");
 try {
                                            if (request.getParameter("error").equals("y")) {
                                    
      out.write("\n");
      out.write("                                    <h5 style=\"color:red\">Username/Password incorrect!!</h5>\n");
      out.write("                                    ");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("                                    ");

                                        try {
                                            if (request.getParameter("out").equals("y")) {
                                                session.removeAttribute("sname");
                                                session.invalidate();
                                                Model.Member.clear();
                                                
                                    
      out.write(" \n");
      out.write("                                    <h5 style=\"color:red\">Anda telah Logout</h5>\n");
      out.write("                                    ");
 }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("                                </center>\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label><b>Username</b></label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <br>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label><b>Password</b></label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr><tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <br>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                <div style=\"background-color:#f1f1f1\">\n");
      out.write("                                    <button type=\"submit\" class=\"editbtn\">Login</button>\n");
      out.write("                                    Forgot <a href=\"#\">password?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"text-align:center;clear:both;\">\n");
      out.write("            <p>&copy; 2018.</p>\n");
      out.write("        </div>\n");
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
