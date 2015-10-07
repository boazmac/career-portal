package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \t<head>\n");
      out.write("\t    <meta charset=\"utf-8\">\n");
      out.write("\t    <title>SD Login</title>\n");
      out.write("\t    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t    <meta name=\"description\" content=\"\">\n");
      out.write("\t    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("\t    <!-- Bootstrap core CSS -->\n");
      out.write("\t    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Font Awesome -->\n");
      out.write("\t\t<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t<!-- ionicons -->\n");
      out.write("\t\t<link href=\"css/ionicons.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Simplify -->\n");
      out.write("\t\t<link href=\"css/simplify.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("  \t</head>\n");
      out.write("\n");
      out.write("  \t<body class=\"overflow-hidden light-background\">\n");
      out.write("\t\t<div class=\"wrapper no-navigation preload\">\n");
      out.write("\t\t\t<div class=\"sign-in-wrapper\">\n");
      out.write("\t\t\t\t<div class=\"sign-in-inner\">\n");
      out.write("\t\t\t\t\t<div class=\"login-brand text-center\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-database m-right-xs\"></i> Software <strong class=\"text-skin\">Dynamics</strong>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("                                    <form method=\"POST\" action=\"signin\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group m-bottom-md\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"User Name\">\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"chkRemember\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"chkRemember\"></label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\tRemember me\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"m-top-md p-top-sm\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/signin\"  class=\"btn btn-success block\">Sign in</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"m-top-md p-top-sm\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-12 text-center m-bottom-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"signin.jsp#\" class=\"font-12\">Forgot password ?</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-12 text-center m-bottom-xs\">Do not have an account?</div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/signin\" class=\"btn btn-default block\">Create an accounts</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div><!-- ./sign-in-inner -->\n");
      out.write("\t\t\t</div><!-- ./sign-in-wrapper -->\n");
      out.write("\t\t</div><!-- /wrapper -->\n");
      out.write("\n");
      out.write("\t\t<a href=\"signin.jsp\" id=\"scroll-to-top\" class=\"hidden-print\"><i class=\"icon-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("\t    <!-- javascript\n");
      out.write("\t    ================================================== -->\n");
      out.write("\t    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Jquery -->\n");
      out.write("\t\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Bootstrap -->\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Slimscroll -->\n");
      out.write("\t\t<script src='js/jquery.slimscroll.min.js'></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Popup Overlay -->\n");
      out.write("\t\t<script src='js/jquery.popupoverlay.min.js'></script>\n");
      out.write("\n");
      out.write("\t\t<!-- Modernizr -->\n");
      out.write("\t\t<script src='js/modernizr.min.js'></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Simplify -->\n");
      out.write("\t\t<script src=\"js/simplify/simplify.js\"></script>\n");
      out.write("\t\n");
      out.write("  \t</body>\n");
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
