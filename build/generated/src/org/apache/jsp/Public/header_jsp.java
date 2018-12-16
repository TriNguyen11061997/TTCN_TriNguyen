package org.apache.jsp.Public;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Info.ARCartsInfo;
import Controller.ARCartsController;
import Controller.ICProductController;
import Info.ICProductsInfo;
import java.util.List;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Free Smart Store Website Template | login :: w3layouts</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href=\"../Assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <link href=\"../Assets/css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <link href=\"../Assets/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <script src=\"../Assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Monda' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../Assets/js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../Assets/js/easing.js\"></script> \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <div class=\"header_top\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <a href=\"/index\"><img src=\"Assets/images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"header_top_right\">\r\n");
      out.write("                        <div class=\"search_box\">\r\n");
      out.write("                            <form action=\"/search\" method=\"POST\">\r\n");
      out.write("                                <input type=\"text\" name=\"name\" value=\"Search for Products\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                            this.value = 'Search for Products';\r\n");
      out.write("                                        }\"><input type=\"submit\" value=\"SEARCH\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            ARCartsController ar = new ARCartsController();
                            List<ARCartsInfo> listCart = ar.GetALlObject();

                        
      out.write("\r\n");
      out.write("                        <div class=\"shopping_cart\" id=\"change\">\r\n");
      out.write("                            <div class=\"cart\">\r\n");
      out.write("                                <a href=\"/cart\" title=\"View my shopping cart\" rel=\"nofollow\">\r\n");
      out.write("                                    <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                    <span class=\"cart_title\">Giỏ hàng</span>\r\n");
      out.write("                                    ");
if (listCart != null) {
      out.write("\r\n");
      out.write("                                    <span class=\"no_product\">");
      out.print(listCart.size());
      out.write("</span>\r\n");
      out.write("                                    ");
} else {
      out.write("\r\n");
      out.write("                                    <span class=\"no_product\">Rỗng</span>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"languages\" title=\"language\">\r\n");
      out.write("                            <div id=\"language\" class=\"wrapper-dropdown\" tabindex=\"1\">\r\n");
      out.write("                                <span><a href=\"/Login_Servlet\"><img src=\"Assets/images/login.png\" alt=\"\" title=\"login\"/></a></span>\r\n");
      out.write("                                <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                <ul class=\"dropdown languges\" style=\"width:200px;\">\t\t\t\t\t\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                            <span class=\"lang\">Thông tin cá nhân</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                            <span class=\"lang\">Thông tin giỏ hàng</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"Public/login.jsp\" title=\"EspaÃ±ol\">\r\n");
      out.write("                                            <span class=\"lang\">Đăng nhập</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"Deutsch\">\r\n");
      out.write("                                           <span class=\"lang\">Đăng xuất</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <script type=\"text/javascript\">\r\n");
      out.write("                                function DropDown(el) {\r\n");
      out.write("                                    this.dd = el;\r\n");
      out.write("                                    this.initEvents();\r\n");
      out.write("                                }\r\n");
      out.write("                                DropDown.prototype = {\r\n");
      out.write("                                    initEvents: function () {\r\n");
      out.write("                                        var obj = this;\r\n");
      out.write("\r\n");
      out.write("                                        obj.dd.on('click', function (event) {\r\n");
      out.write("                                            $(this).toggleClass('active');\r\n");
      out.write("                                            event.stopPropagation();\r\n");
      out.write("                                        });\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                $(function () {\r\n");
      out.write("\r\n");
      out.write("                                    var dd = new DropDown($('#language'));\r\n");
      out.write("\r\n");
      out.write("                                    $(document).click(function () {\r\n");
      out.write("                                        // all dropdowns\r\n");
      out.write("                                        $('.wrapper-dropdown').removeClass('active');\r\n");
      out.write("                                    });\r\n");
      out.write("\r\n");
      out.write("                                });\r\n");
      out.write("\r\n");
      out.write("                            </script>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"h_menu\">\r\n");
      out.write("                    <a id=\"touch-menu\" class=\"mobile-menu\" href=\"#\">Menu</a>\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <ul class=\"menu list-unstyled\">\r\n");
      out.write("                            <li><a href=\"/index\">Trang chủ</a></li>\r\n");
      out.write("                            <li class=\"activate\"><a href=\"/product\">Sản phẩm</a>\r\n");
      out.write("                                <ul class=\"sub-menu list-unstyled\">\r\n");
      out.write("                                    <div class=\"nag-mother-list\">\r\n");
      out.write("                                        <div class=\"navg-drop-main\">\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 1</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 2</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 3</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 1</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 2</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 3</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 1</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 2</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 3</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 1</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 2</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 3</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clear\"> </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"navg-drop-main\">\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clear\"> </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"navg-drop-main\">\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"nav-drop\"> \r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                                <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"clear\"> </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"\">Sản phẩm hàng đầu</a>\t\t\t\r\n");
      out.write("                                <ul class=\"sub-menu list-unstyled sub-menu2\">\r\n");
      out.write("                                    <div class=\"navg-drop-main\">\r\n");
      out.write("                                        <div class=\"nav-drop nav-top-brand\"> \r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 1</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 2</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 3</a></li>\t\t\t\t\t\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                        </div>\t\t\t\t\t\t\t\t\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\t\t\r\n");
      out.write("                            <li><a href=\"\">Dịch vụ</a>\r\n");
      out.write("                                <ul class=\"sub-menu list-unstyled sub-menu3\">\r\n");
      out.write("                                    <div class=\"navg-drop-main\">\r\n");
      out.write("                                        <div class=\"nav-drop\"> \r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"nav-drop\"> \r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 6</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"nav-drop\"> \r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"nav-drop\"> \r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 4</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 5</a></li>\r\n");
      out.write("                                            <li><a href=\"products.jsp\">Product 6</a></li>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clear\"> </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"/about\">Giới thiệu</a></li>                           \r\n");
      out.write("                            <li><a href=\"/faq\">Faqs</a></li>\r\n");
      out.write("                            <li><a href=\"/contact\">Liên hệ</a></li>\r\n");
      out.write("                            <div class=\"clear\"> </div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav> \r\n");
      out.write("                    <script src=\"Assets/js/menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                </div>\r\n");
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
