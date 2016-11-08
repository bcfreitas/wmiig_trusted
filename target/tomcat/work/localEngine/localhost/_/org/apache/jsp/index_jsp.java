package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>The World's Most Interesting Infographic</title>\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        $(\"#goButton\").click(makeRequest);\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      function makeRequest() {\n");
      out.write("        // Define properties\n");
      out.write("        var AUTH_ENDPOINT = \"https://www.facebook.com/dialog/oauth\";\n");
      out.write("        var RESPONSE_TYPE = \"code\";\n");
      out.write("        var CLIENT_ID = \"205600876548519\";\n");
      out.write("        var REDIRECT_URI = \"http://wmiig.com:8080/callback\";\n");
      out.write("        var SCOPE = \"public_profile friend_list\";\n");
      out.write("\n");
      out.write("        // Build authorization request endpoint\n");
      out.write("        var requestEndpoint = AUTH_ENDPOINT + \"?\" +\n");
      out.write("          \"response_type=\" + encodeURIComponent(RESPONSE_TYPE) + \"&\" +\n");
      out.write("          \"client_id=\" + encodeURIComponent(CLIENT_ID) + \"&\" +\n");
      out.write("          \"redirect_uri=\" + encodeURIComponent(REDIRECT_URI) + \"&\" +\n");
      out.write("          \"scope=\" + encodeURIComponent(SCOPE);\n");
      out.write("\n");
      out.write("        // Send to authorization request endpoint\n");
      out.write("        window.location.href = requestEndpoint;\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <button id=\"goButton\" type=\"button\">Go!</button>\n");
      out.write("    <div id=\"results\"></div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
