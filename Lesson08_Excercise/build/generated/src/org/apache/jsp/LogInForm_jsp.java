package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogInForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String emptyUserName = (String) request.getAttribute("emptyUser");
        String emptyPassword = (String) request.getAttribute("emptyPass");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"SolveLogIn\" method=\"post\">\n");
      out.write("            <fieldset style=\"width: 30%\">\n");
      out.write("                <legend>Personal information</legend>\n");
      out.write("                User name<br/>\n");
      out.write("                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"userName\" onfocus=\"this.style.backgroundColor = 'white'\" ");

                    if (emptyUserName != null && !emptyUserName.isEmpty()) {
                        out.print("style='background-color: red'");
                    }
                       
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.emptyUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("                Password<br/>\n");
      out.write("                <input type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"password\" onfocus=\"this.style.backgroundColor = 'white'\" ");

                    if (emptyPassword != null && !emptyPassword.isEmpty()) {
                        out.print("style='background-color: red'");
                    }
                       
      out.write('/');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.emptyPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/><br/>\n");
      out.write("                <input type=\"submit\" value=\"Log in\" name=\"logIn\"/>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
