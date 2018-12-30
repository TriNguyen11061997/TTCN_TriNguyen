package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Info.ARSaleOrdersInfo;
import Util.Constants;

public final class admin_005fSaleOrderUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/header.jsp");
    _jspx_dependants.add("/Admin/footer.jsp");
  }

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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <link href=\"../Assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <link href=\"../Assets/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
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
      out.write("            ");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"header_top\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <a href=\"/Admin_Home_Servlet\"><img src=\"../Assets/images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header_top_right\">\r\n");
      out.write("            <div class=\"search_box\">\r\n");
      out.write("                <form>\r\n");
      out.write("                    <input type=\"text\" value=\"Search for Products\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                this.value = 'Search for Products';\r\n");
      out.write("                            }\"><input type=\"submit\" value=\"SEARCH\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"languages\" title=\"language\">\r\n");
      out.write("                <div id=\"language\" class=\"wrapper-dropdown\" tabindex=\"1\">EN\r\n");
      out.write("                    <strong class=\"opencart\"> </strong>\r\n");
      out.write("                    <ul class=\"dropdown languges\">\t\t\t\t\t\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                <span><img src=\"../Assets/images/gb.png\" alt=\"en\" width=\"26\" height=\"26\"></span><span class=\"lang\">English</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                <span><img src=\"../Assets/images/au.png\" alt=\"fr\" width=\"26\" height=\"26\"></span><span class=\"lang\">FranÃ§ais</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" title=\"EspaÃ±ol\">\r\n");
      out.write("                                <span><img src=\"../Assets/images/bm.png\" alt=\"es\" width=\"26\" height=\"26\"></span><span class=\"lang\">EspaÃ±ol</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" title=\"Deutsch\">\r\n");
      out.write("                                <span><img src=\"../Assets/images/ck.png\" alt=\"de\" width=\"26\" height=\"26\"></span><span class=\"lang\">Deutsch</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" title=\"Russian\">\r\n");
      out.write("                                <span><img src=\"../Assets/images/cu.png\" alt=\"ru\" width=\"26\" height=\"26\"></span><span class=\"lang\">Russian</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\t\t\t\t\t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    function DropDown(el) {\r\n");
      out.write("                        this.dd = el;\r\n");
      out.write("                        this.initEvents();\r\n");
      out.write("                    }\r\n");
      out.write("                    DropDown.prototype = {\r\n");
      out.write("                        initEvents: function () {\r\n");
      out.write("                            var obj = this;\r\n");
      out.write("\r\n");
      out.write("                            obj.dd.on('click', function (event) {\r\n");
      out.write("                                $(this).toggleClass('active');\r\n");
      out.write("                                event.stopPropagation();\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    $(function () {\r\n");
      out.write("\r\n");
      out.write("                        var dd = new DropDown($('#language'));\r\n");
      out.write("\r\n");
      out.write("                        $(document).click(function () {\r\n");
      out.write("                            // all dropdowns\r\n");
      out.write("                            $('.wrapper-dropdown').removeClass('active');\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"languages\" title=\"language\">\r\n");
      out.write("                <div id=\"user\" class=\"wrapper-dropdown\" tabindex=\"1\">TK\r\n");
      out.write("                    <strong class=\"opencart\"> </strong>\r\n");
      out.write("                    <ul class=\"dropdown languges\">\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"/Admin_Home_Servlet\">TT cá nhân</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"/Logout_Servlet\">Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    function DropDown(el) {\r\n");
      out.write("                        this.dd = el;\r\n");
      out.write("                        this.initEvents();\r\n");
      out.write("                    }\r\n");
      out.write("                    DropDown.prototype = {\r\n");
      out.write("                        initEvents: function () {\r\n");
      out.write("                            var obj = this;\r\n");
      out.write("\r\n");
      out.write("                            obj.dd.on('click', function (event) {\r\n");
      out.write("                                $(this).toggleClass('active');\r\n");
      out.write("                                event.stopPropagation();\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    $(function () {\r\n");
      out.write("\r\n");
      out.write("                        var dd = new DropDown($('#user'));\r\n");
      out.write("\r\n");
      out.write("                        $(document).click(function () {\r\n");
      out.write("                            // all dropdowns\r\n");
      out.write("                            $('.wrapper-dropdown').removeClass('active');\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"h_menu\">\r\n");
      out.write("        <a id=\"touch-menu\" class=\"mobile-menu\" href=\"#\">Menu</a>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul class=\"menu list-unstyled\">\r\n");
      out.write("                <li><a href=\"/Admin_Home_Servlet\">TT Cá nhân</a></li>\r\n");
      out.write("                <li class=\"activate\"><a href=\"/Admin_EmployeeManagement_Servlet\">Nhân viên</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"/Admin_SaleOrderManagement_Servlet\">Đơn bán hàng</a>\t\t\t                                \r\n");
      out.write("                </li>\t\t\r\n");
      out.write("                <li><a href=\"/Admin_InvoiceManagement_Servlet\">Hóa đơn</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"/Admin_ProductManagement\">Sản phẩm</a></li>             \r\n");
      out.write("                <li><a href=\"/Admin_Revenue_Servlet\">Doanh thu</a></li>\r\n");
      out.write("                <li><a href=\"faq.jsp\">Tính lương</a></li>                           \r\n");
      out.write("                <div class=\"clear\"> </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav> \r\n");
      out.write("        <script src=\"../Assets/js/menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("            <div class=\"main\">\r\n");
      out.write("                <h2 style=\"text-align: center;margin-top: 20px; color:darkviolet \">THÔNG TIN ĐƠN HÀNG</h2>               \r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">                       \r\n");
      out.write("                        <form class=\"form-card\" action=\"/Admin_SaleOrderUpdate_Servlet\" method=\"post\">\r\n");
      out.write("                            <input id=\"name\" name=\"ARSaleOrderID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"hidden\">\r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Mã đơn hàng</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderNo\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Ngày chứng từ</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"date\"  readonly=\"\">                                  \r\n");
      out.write("                                </div>    \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Tình trạng</label>\r\n");
      out.write("                                    <select class=\"form-control locked\" name=\"ARSaleOrderStatus\"> \r\n");
      out.write("                                        ");

                                            ARSaleOrdersInfo objARSaleOrdersInfo = (ARSaleOrdersInfo) request.getAttribute("saleorder");
                                            if (objARSaleOrdersInfo.getARSaleOrderStatus().equals("Confirm")) {
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"New\" disabled=\"\">Tạo mới</option>\r\n");
      out.write("                                        <option value=\"Confirm\" selected=\"selected\">Xác nhận</option>\r\n");
      out.write("                                        <option value=\"Approve\">Duyệt</option>\r\n");
      out.write("                                        <option value=\"Cancel\" >Hủy</option>\r\n");
      out.write("                                        <option value=\"Approve\" disabled=\"\">Hoàn tất</option>\r\n");
      out.write("                                        ");
} else {
      out.write("\r\n");
      out.write("                                        <option value=\"New\" disabled=\"\">Tạo mới</option>\r\n");
      out.write("                                        <option value=\"Confirm\" >Xác nhận</option>\r\n");
      out.write("                                        <option value=\"Approve\" selected=\"selected\">Duyệt</option>\r\n");
      out.write("                                        <option value=\"Cancel\">Hủy</option>\r\n");
      out.write("                                        <option value=\"Approve\" disabled=\"\">Hoàn tất</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>                                \r\n");
      out.write("                                </div>  \r\n");
      out.write("                            </div><br> <br> <br>     \r\n");
      out.write("                            <div class='form-group locked'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Khách hàng</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Số điện thoại</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerTel1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerTel1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"email-input-field\">Email</label>\r\n");
      out.write("                                    <input id=\"email\" name=\"ARCustomerEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"email@gmail.com\" class=\"form-control\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <br> <br> <br>                          \r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Địa chỉ</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerContactAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Tỉnh,Thành phố</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddressCity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerContactAddressCity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                                  \r\n");
      out.write("                                </div>    \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Quốc gia</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARCustomerContactAddressCountry\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.customer.ARCustomerContactAddressCountry}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                       \r\n");
      out.write("                                </div>  \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">% Chiết khấu</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderDiscountPerCent\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderDiscountPerCent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">%Thuế</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderTaxPercent\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderTaxPercent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                                  \r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Phí ship</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderShippingFees\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderShippingFees}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                       \r\n");
      out.write("                                </div>                                                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class='form-group'>                                                          \r\n");
      out.write("                                <div class='col-xs-12 form-group'  id=\"left3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Tiền Chiết khấu</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderDiscountAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderDiscountAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" >                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left4\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Tiền Thuế</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderTaxAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderTaxAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\">                                  \r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right3\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"phone-input-field\">Tổng tiền</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"ARSaleOrderTotalAmount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderTotalAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" type=\"text\" readonly=\"\">                       \r\n");
      out.write("                                </div>                                                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class='form-group'>                              \r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"name-input-field\">Phương thức thanh toán</label>\r\n");
      out.write("                                    <select class=\"form-control locked\" name=\"ARSaleOrderPaymentMethod\"> \r\n");
      out.write("                                        ");

                                            if (objARSaleOrdersInfo.getARSaleOrderPaymentMethod().equals("AfterReceipt")) {
                                        
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
      out.write("\r\n");
      out.write("                                    </select>                                        \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"email-input-field\">Trạng thái thanh toán</label>\r\n");
      out.write("                                    <select class=\"form-control locked\" name=\"ARSaleOrderPaymentStatus\"> \r\n");
      out.write("                                        ");

                                            if (objARSaleOrdersInfo.getARSaleOrderPaymentStatus().equals("Paid")) {
                                        
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
      out.write("                                      \r\n");
      out.write("\r\n");
      out.write("                                    </select>      \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group locked\">\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"left\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"desc-input-field\">Ghi chú</label>\r\n");
      out.write("                                    <textarea name=\"ARSaleOrderDesc\" id=\"desc\" cols=\"0\" rows=\"3\" class=\"form-control\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.ARSaleOrderDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class='col-xs-12 form-group' id=\"right\">\r\n");
      out.write("                                    <label class=\"control-label locked\" for=\"email-input-field\">Nhân viên xác nhận</label>\r\n");
      out.write("                                    <input id=\"email\" name=\"HREmployeeName\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleorder.employee.HREmployeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"\" class=\"form-control\" required=\"\" readonly=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input id=\"right\" type=\"submit\" value=\"Cập nhật\" class=\"form-control locked\" style=\"background-color: #17a2b8\">\r\n");
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
      out.write("                       \r\n");
      out.write("                    </tr>                 \r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"wrapper\">\t\r\n");
      out.write("        <div class=\"section group\">\r\n");
      out.write("            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                <h4>Information</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Customer Service</a></li>\r\n");
      out.write("                    <li><a href=\"#\"><span>Advanced Search</span></a></li>\r\n");
      out.write("                    <li><a href=\"#\">Orders and Returns</a></li>\r\n");
      out.write("                    <li><a href=\"#\"><span>Contact Us</span></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                <h4>Why buy from us</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"faq.jsp\">Customer Service</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                    <li><a href=\"contact.jsp\"><span>Site Map</span></a></li>\r\n");
      out.write("                    <li><a href=\"preview-2.jsp\"><span>Search Terms</span></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                <h4>My account</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"contact.jsp\">Sign In</a></li>\r\n");
      out.write("                    <li><a href=\"index.jsp\">View Cart</a></li>\r\n");
      out.write("                    <li><a href=\"#\">My Wishlist</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("                    <li><a href=\"faq.jsp\">Help</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                <h4>Contact</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span>+91-123-456789</span></li>\r\n");
      out.write("                    <li><span>+00-123-000000</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"social-icons\">\r\n");
      out.write("                    <h4>Follow Us</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"facebook\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                        <li class=\"twitter\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                        <li class=\"googleplus\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                        <li class=\"contact\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"copy_right\">\r\n");
      out.write("            <p>&copy; 2013 Smart Store. All Rights Reserved | Design by <a href=\"http://w3layouts.com\">W3Layouts</a> </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        /*\r\n");
      out.write("         var defaults = {\r\n");
      out.write("         containerID: 'toTop', // fading element id\r\n");
      out.write("         containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("         scrollSpeed: 1200,\r\n");
      out.write("         easingType: 'linear' \r\n");
      out.write("         };\r\n");
      out.write("         */\r\n");
      out.write("\r\n");
      out.write("        $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 1;\"></span></a>\r\n");
      out.write("<link href=\"../Assets/css/flexslider.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<script defer src=\"../Assets/js/jquery.flexslider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        SyntaxHighlighter.all();\r\n");
      out.write("    });\r\n");
      out.write("    $(window).load(function () {\r\n");
      out.write("        $('.flexslider').flexslider({\r\n");
      out.write("            animation: \"slide\",\r\n");
      out.write("            start: function (slider) {\r\n");
      out.write("                $('body').removeClass('loading');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>");
      out.write("\r\n");
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
