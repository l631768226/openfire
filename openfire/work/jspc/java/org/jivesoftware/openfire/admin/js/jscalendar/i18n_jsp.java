/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2018-05-17 09:44:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.jivesoftware.openfire.admin.js.jscalendar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.jivesoftware.util.JiveGlobals;
import org.jivesoftware.util.LocaleUtils;

public final class i18n_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

    response.setContentType("text/javascript; charset=" + "UTF-8");
    DateFormat fullDay = new SimpleDateFormat("EEEE", JiveGlobals.getLocale());
    DateFormat shortDay = new SimpleDateFormat("EEE", JiveGlobals.getLocale());
    DateFormat fullMonth = new SimpleDateFormat("MMMM", JiveGlobals.getLocale());
    DateFormat shortMonth = new SimpleDateFormat("MMM", JiveGlobals.getLocale());
    Calendar c = Calendar.getInstance();

      out.write("\n// full day names (yes we really do want Sunday twice)\nCalendar._DN = new Array (\n    ");
 for (int i=1; i<9;i++) {
        c.set(Calendar.DAY_OF_WEEK, i);
    
      out.print( "\"" + fullDay.format(c.getTime()) + "\"" + (i < 8 ? "," : "") );
 } 
      out.write("\n);\n\n// short day names (yes we really do want Sunday twice)\nCalendar._SDN = new Array(\n    ");
 for (int i=1; i<9;i++) {
        c.set(Calendar.DAY_OF_WEEK, i);
    
      out.print( "\"" + shortDay.format(c.getTime()) + "\"" + (i < 8 ? "," : "") );
 } 
      out.write("\n);\n\nCalendar._FD = 0;\n\n// full month names\nCalendar._MN = new Array(\n    ");
 for (int i=0; i<12;i++) {
        c.set(Calendar.MONTH, i);
    
      out.print( "\"" + fullMonth.format(c.getTime()) + "\"" + (i < 11 ? "," : "") );
 } 
      out.write("\n);\n\n// short month names\nCalendar._SMN = new Array(\n    ");
 for (int i=0; i<12;i++) {
        c.set(Calendar.MONTH, i);
    
      out.print( "\"" + shortMonth.format(c.getTime()) + "\"" + (i < 11 ? "," : "") );
 } 
      out.write("\n);\n\n// tooltips\nCalendar._TT = {};\nCalendar._TT[\"INFO\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.info"));
      out.write("\";\nCalendar._TT[\"ABOUT\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.about"));
      out.write("\";\nCalendar._TT[\"PREV_YEAR\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.prev_year"));
      out.write("\";\nCalendar._TT[\"PREV_MONTH\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.prev_month"));
      out.write("\";\nCalendar._TT[\"GO_TODAY\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.go_today"));
      out.write("\";\nCalendar._TT[\"NEXT_MONTH\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.next_month"));
      out.write("\";\nCalendar._TT[\"NEXT_YEAR\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.next_year"));
      out.write("\";\nCalendar._TT[\"SEL_DATE\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.select_date"));
      out.write("\";\nCalendar._TT[\"DRAG_TO_MOVE\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.drag_to_move"));
      out.write("\";\nCalendar._TT[\"PART_TODAY\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.part_today"));
      out.write("\";\nCalendar._TT[\"DAY_FIRST\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.day_first"));
      out.write("\";\nCalendar._TT[\"WEEKEND\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.weekend"));
      out.write("\";\nCalendar._TT[\"CLOSE\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.close"));
      out.write("\";\nCalendar._TT[\"TODAY\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.today"));
      out.write("\";\nCalendar._TT[\"TIME_PART\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.time_part"));
      out.write("\";\nCalendar._TT[\"DEF_DATE_FORMAT\"] = \"%Y-%m-%d\";\nCalendar._TT[\"TT_DATE_FORMAT\"] = \"%a, %b %e\";\nCalendar._TT[\"WK\"] = \"wk\";\nCalendar._TT[\"TIME\"] = \"");
      out.print( LocaleUtils.getLocalizedString("calendar.time"));
      out.write('"');
      out.write(';');
      out.write('\n');
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
