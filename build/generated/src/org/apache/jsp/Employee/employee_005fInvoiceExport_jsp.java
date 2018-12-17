package org.apache.jsp.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Info.ARInvoicesInfo;
import Util.Constants;

public final class employee_005fInvoiceExport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>   \r\n");
      out.write("    <head>\r\n");
      out.write("        <<title>Smart phone store</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"../Assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <link href=\"../Assets/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <script src=\"../Assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"../Assets/js/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <link href=\"../Assets/css/form1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"main\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"/Admin_Home_Servlet\"><img src=\"../Assets/images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h2 style=\"text-align: center;margin-top: 20px; color:darkviolet \">PHIẾU GIAO HÀNG</h2>               \r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">                       \r\n");
      out.write("                        <form class=\"form-card\" action=\"/Admin_InvoiceUpdate_Servlet\" method=\"post\">\r\n");
      out.write("                            <input id=\"name\" name=\"ARInvoiceID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"hidden\">\r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Mã đơn hàng</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARInvoiceNo\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.saleorder.ARSaleOrderNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Ngày chứng từ</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARInvoiceDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"date\"  readonly=\"\">                                  \r\n");
      out.write("                                </div>                                   \r\n");
      out.write("                            </div><br> <br> <br>     \r\n");
      out.write("                            <div class='form-group locked'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Khách hàng</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Số điện thoại</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerTel1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerTel1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"email-input-field\">Email</label>\r\n");
      out.write("                                    <input id=\"email\" name=\"ARCustomerEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"email@gmail.com\" class=\"form-control\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <br> <br> <br>                          \r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Địa chỉ</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerContactAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Tỉnh,Thành phố</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddressCity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerContactAddressCity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                                  \r\n");
      out.write("                                </div>    \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Quốc gia</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddressCountry\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.customer.ARCustomerContactAddressCountry}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                       \r\n");
      out.write("                                </div>  \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Tiền Chiết khấu</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARInvoiceDiscountAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceDiscountAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Phí ship</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARInvoiceTaxAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceFeeShipment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                                  \r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Tổng tiền</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARInvoiceTotalAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceTotalAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                       \r\n");
      out.write("                                </div>                                                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class='form-group'>                              \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Phương thức thanh toán</label>\r\n");
      out.write("                                    <select class=\"form-control locked\">\r\n");
      out.write("                                        ");

                                            ARInvoicesInfo objARInvoicesInfo = (ARInvoicesInfo) request.getAttribute("invoice");
                                            if (objARInvoicesInfo.getSaleorder().getARSaleOrderPaymentMethod().equals("AfterReceipt")) {
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"AfterReceipt\" selected=\"selected\">Thanh toán sau khi nhận hàng</option>\r\n");
      out.write("                                        <option value=\"PaymentCash\" >Thanh toán bằng thẻ tín dụng</option>\r\n");
      out.write("                                        ");
 } else {
      out.write("\r\n");
      out.write("                                        <option value=\"AfterReceipt\" >Thanh toán sau khi nhận hàng</option>\r\n");
      out.write("                                        <option value=\"PaymentCash\" selected=\"selected\">Thanh toán bằng thẻ tín dụng</option>\r\n");
      out.write("                                        ");
}
      out.write(" \r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"email-input-field\">Trạng thái thanh toán</label>\r\n");
      out.write("                                    <select class=\"form-control locked\" name=\"ARInvoicePaymentStatus\"> \r\n");
      out.write("                                        ");

                                            if (objARInvoicesInfo.getSaleorder().getARSaleOrderPaymentStatus().equals("Paid")) {
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"Paid\"selected=\"selected\">Đã thanh toán</option>\r\n");
      out.write("                                        <option value=\"Unpaid\">Chưa thanh toán</option>\r\n");
      out.write("                                        ");
 } else {
      out.write("\r\n");
      out.write("                                        <option value=\"Paid\">Đã thanh toán</option>\r\n");
      out.write("                                        <option value=\"Unpaid\" selected=\"selected\">Chưa thanh toán</option>\r\n");
      out.write("                                        ");
}
      out.write("   \r\n");
      out.write("\r\n");
      out.write("                                    </select>      \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>     \r\n");
      out.write("                            <div class=\"form-group locked\">\r\n");
      out.write("                                <div class='col-xs-12 form-group'>\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"desc-input-field\">Ghi chú</label>\r\n");
      out.write("                                    <textarea name=\"ARInvoiceDesc\" id=\"desc\" cols=\"0\" rows=\"3\" class=\"form-control\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.ARInvoiceDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("                <table class=\"table\" style=\"border:1px;\">\r\n");
      out.write("                    <tr class=\"tr\" style=\"background-color: #666666\">\r\n");
      out.write("                        <th style=\"color:white\">Tên sản phẩm</th>\r\n");
      out.write("                        <th style=\"color:white\">Mô tả</th>\r\n");
      out.write("                        <th style=\"color:white\">Số lượng</th>\r\n");
      out.write("                        <th style=\"color:white\">Đơn giá</th>\r\n");
      out.write("                        <th style=\"color:white\">Thành tiền</th>\r\n");
      out.write("                    </tr>                 \r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h6 style=\"float: right;margin-right: 100px;\">\r\n");
      out.write("                <u>Nhân viên xuất hóa đơn</u>\r\n");
      out.write("            </h6>\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("            <h6 style=\"float: right;margin-right: 150px;\">\r\n");
      out.write("                <u>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${invoice.employee.HREmployeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</u>\r\n");
      out.write("            </h6>\r\n");
      out.write("            <br><br>\r\n");
      out.write("        </div>       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSaleOrderItem}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                     \r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ARSaleOrderItemName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ARSaleOrderItemDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                          \r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ARSaleOrderItemQty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ARSaleOrderItemUnitCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ARSaleOrderItemTotalAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>  \r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
