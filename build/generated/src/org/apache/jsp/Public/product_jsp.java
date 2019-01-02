package org.apache.jsp.Public;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Info.ARCartsInfo;
import Controller.ARCartsController;
import Info.ADUsersInfo;
import Info.ARCartsInfo;
import Controller.ARCartsController;
import Controller.ICProductController;
import Info.ICProductsInfo;
import java.util.List;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Public/header.jsp");
    _jspx_dependants.add("/Public/footer.jsp");
  }

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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--header-->\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Smart Store</title>\r\n");
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
      out.write("                        <a href=\"/index_servlet\"><img src=\"Assets/images/logo.png\" alt=\"\" /></a>\r\n");
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
                        
      out.write("\r\n");
      out.write("                        <div class=\"shopping_cart\" id=\"change\">\r\n");
      out.write("                            <div class=\"cart\">\r\n");
      out.write("                                ");
int id = 0;
                                    if (session.getAttribute("HREmployeeID") != null) {
                                        id = (Integer) session.getAttribute("HREmployeeID");
                                    }
                                
      out.write("\r\n");
      out.write("                                <a href=\"/cart?idcus=");
      out.print(id);
      out.write("\" title=\"View my shopping cart\" rel=\"nofollow\">\r\n");
      out.write("                                    <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                    <span class=\"cart_title\">Giỏ hàng</span>\r\n");
      out.write("                                    ");
if (session.getAttribute("HREmployeeID") != null) {
                                            List<ARCartsInfo> listar = ar.getListCartByID(id);
      out.write("\r\n");
      out.write("                                    <span class=\"no_product\">");
      out.print(listar.size());
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
      out.write("                                <span><a href=\"\">TK</a></span>\r\n");
      out.write("                                <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                <ul class=\"dropdown languges\" style=\"width:200px;\">\r\n");
      out.write("                                    ");
if (session.getAttribute("HREmployeeID") != null) {
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"/customer\" title=\"Thông tin cá nhân\">\r\n");
      out.write("                                            <span class=\"lang\">Thông tin cá nhân</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"/dhct\" title=\"Thông tin giỏ hàng\">\r\n");
      out.write("                                            <span class=\"lang\">Đơn hàng của bạn</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                    ");
if (session.getAttribute("HREmployeeID") == null) {
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"/Login_Servlet\" title=\"Đăng nhập\">\r\n");
      out.write("                                            <span class=\"lang\">Đăng nhập</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                    ");
if (session.getAttribute("HREmployeeID") != null) {
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"/Logout_Servlet\" title=\"Đăng xuất\">\r\n");
      out.write("                                            <span class=\"lang\">Đăng xuất</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
}
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
      out.write("                            <li><a href=\"/index_servlet\">Trang chủ</a></li>\r\n");
      out.write("                            <li class=\"activate\"><a href=\"/product\">Sản phẩm ưa thích</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            </li>\t\t\r\n");
      out.write("                            <li><a href=\"\">Tin tức</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"/about\">Giới thiệu</a></li>                           \r\n");
      out.write("                            <li><a href=\"/faq\">Faqs</a></li>\r\n");
      out.write("                            <li><a href=\"/contact\">Liên hệ</a></li>\r\n");
      out.write("                            <div class=\"clear\"> </div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav> \r\n");
      out.write("                    <script src=\"Assets/js/menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write('\n');
  ICProductController ProductDAO = new ICProductController();
    List<ICProductsInfo> listPro = ProductDAO.getListProduct();

      out.write("\n");
      out.write("<div class=\"header_bottom\">\n");
      out.write("    <div class=\"header_bottom_left\">\n");
      out.write("        <div class=\"section group\">\n");
      out.write("            ");
   int i = 1;
                for (ICProductsInfo item1 : listPro) {
                    if (i == 3) {
                        break;
                    }
            
      out.write("\n");
      out.write("            <div class=\"listview_1_of_2 images_1_of_2\">\n");
      out.write("                <div class=\"listimg listimg_2_of_1\">\n");
      out.write("                    <a href=\"/preview?id=");
      out.print(item1.getICProductID());
      out.write("\"> <img src=\"Images/");
      out.print(item1.getICProductPicture1());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text list_2_of_1\">\n");
      out.write("                    <h2>");
      out.print(item1.getICProductName());
      out.write("</h2>\n");
      out.write("                    <p>");
      out.print(item1.getICProductDesc());
      out.write("</p>\n");
      out.write("                    <div class=\"button\"><span><a ");
if (session.getAttribute("HREmployeeID") != null) { 
      out.write(" \n");
      out.write("                                ");
 int ID = 0;
                                    ID = (Integer) session.getAttribute("HREmployeeID");
                                
      out.write("\n");
      out.write("                                href=\"/cart_add?id=");
      out.print(item1.getICProductID());
      out.write("&idcus=");
      out.print(ID);
      out.write('"');
} else {
      out.write(" href=\"/Login_Servlet\" ");
}
      out.write(" class=\"cart-button\">Giỏ hàng</a></span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
i++;
                }
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section group\">\n");
      out.write("            <div class=\"listview_1_of_2 images_1_of_2\">\n");
      out.write("                <div class=\"listimg listimg_2_of_1\">\n");
      out.write("                    <a href=\"preview-3.jsp\"> <img src=\"Assets/images/pic3.jpg\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text list_2_of_1\">\n");
      out.write("                    <h2>Acer</h2>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>\n");
      out.write("                    <div class=\"button\"><span><a href=\"preview.jsp\">Giỏ hàng</a></span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\t\n");
      out.write("            <div class=\"listview_1_of_2 images_1_of_2\">\n");
      out.write("                <div class=\"listimg listimg_2_of_1\">\n");
      out.write("                    <a href=\"preview.jsp\"><img src=\"Assets/images/pic1.png\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text list_2_of_1\">\n");
      out.write("                    <h2>Canon</h2>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>\n");
      out.write("                    <div class=\"button\"><span><a href=\"preview.jsp\">Giỏ hàng</a></span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"header_bottom_right_images\">\n");
      out.write("        <!-- FlexSlider -->\n");
      out.write("        <section class=\"slider\">\n");
      out.write("            <div class=\"flexslider\">\n");
      out.write("                <ul class=\"slides\">\n");
      out.write("                    <li><img src=\"Assets/images/1.jpg\" alt=\"\"/></li>\n");
      out.write("                    <li><img src=\"Assets/images/2.jpg\" alt=\"\"/></li>\n");
      out.write("                    <li><img src=\"Assets/images/3.jpg\" alt=\"\"/></li>\n");
      out.write("                    <li><img src=\"Assets/images/4.jpg\" alt=\"\"/></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- FlexSlider -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("</div>\t\n");
      out.write("<div class=\"main\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div class=\"content_top\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <h3>Feature Products</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section group\">\n");
      out.write("            ");

                ArrayList<ICProductsInfo> listPro1 = ProductDAO.getItemPagination();
                List<ICProductsInfo> listItems = ProductDAO.getItemBanChay();
                if (listItems != null) {
                    for (ICProductsInfo item : listItems) {
            
      out.write("\n");
      out.write("            <div class=\"grid_1_of_4 images_1_of_4\">\n");
      out.write("                <a href=\"/preview?id=");
      out.print(item.getICProductID());
      out.write("\"><img style=\"width:266px;height:300px;\" src=\"Images/");
      out.print(item.getICProductPicture1());
      out.write("\" alt=\"\" /></a>\n");
      out.write("\n");
      out.write("                <p>");
      out.print(item.getICProductName());
      out.write("</p>\n");
      out.write("                <p><span class=\"strike\"></span><span class=\"price\">");
      out.print(item.getICProductPrice());
      out.write(" VNĐ</span></p>\n");
      out.write("                <div class=\"button\"><span><img src=\"Assets/images/cart.jpg\" alt=\"\" /><a ");
if (session.getAttribute("HREmployeeID") != null) { 
      out.write(" \n");
      out.write("                            ");
 int ID = 0;
                                ID = (Integer) session.getAttribute("HREmployeeID");
                            
      out.write("\n");
      out.write("                            href=\"/cart_add?id=");
      out.print(item.getICProductID());
      out.write("&idcus=");
      out.print(ID);
      out.write('"');
} else {
      out.write(" href=\"/Login_Servlet\" ");
}
      out.write(" class=\"cart-button\">Giỏ hàng</a></span> </div>\n");
      out.write("                <div class=\"button\"><span><a href=\"/preview?id=");
      out.print(item.getICProductID());
      out.write("\" class=\"details\">Details</a></span></div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
                }
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content_bottom\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <h3>New Products</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section group\">\n");
      out.write("            ");

                if (listPro1 != null) {
                    ArrayList<ICProductsInfo> list = (ArrayList<ICProductsInfo>) request.getAttribute("listPro");
                    for (ICProductsInfo item2 : listPro1) {
            
      out.write("\n");
      out.write("            <div class=\"grid_1_of_4 images_1_of_4\">\n");
      out.write("                <a href=\"preview-3.jsp\"><img style=\"width:266px;height:300px;\" src=\"Images/");
      out.print(item2.getICProductPicture1());
      out.write("\" alt=\"\" /></a>\n");
      out.write("               \n");
      out.write("                <h2>");
      out.print(item2.getICProductName());
      out.write(" </h2>\n");
      out.write("                <p><span class=\"strike\"></span><span class=\"price\">");
      out.print(item2.getICProductPrice());
      out.write("VNĐ</span></p>\n");
      out.write("                <div class=\"button\"><span><img src=\"Assets/images/cart.jpg\" alt=\"\" /><a ");
if (session.getAttribute("HREmployeeID") != null) { 
      out.write(" \n");
      out.write("                            ");
 int ID = 0;
                                ID = (Integer) session.getAttribute("HREmployeeID");
                            
      out.write("\n");
      out.write("                            href=\"/cart_add?id=");
      out.print(item2.getICProductID());
      out.write("&idcus=");
      out.print(ID);
      out.write('"');
} else {
      out.write(" href=\"/Login_Servlet\" ");
}
      out.write(" class=\"cart-button\">Giỏ hàng</a></span> </div>\n");
      out.write("                <div class=\"button\"><span><a href=\"/preview?id=");
      out.print(item2.getICProductID());
      out.write("\" class=\"details\">Details</a></span></div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
                }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>    \n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("            <div class=\"wrapper\">\t\r\n");
      out.write("                <div class=\"section group\">\r\n");
      out.write("                    <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                        <h4>Information</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Customer Service</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><span>Advanced Search</span></a></li>\r\n");
      out.write("                            <li><a href=\"#\">Orders and Returns</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><span>Contact Us</span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                        <h4>Why buy from us</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"faq.jsp\">Customer Service</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                            <li><a href=\"contact.jsp\"><span>Site Map</span></a></li>\r\n");
      out.write("                            <li><a href=\"preview-2.jsp\"><span>Search Terms</span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                        <h4>My account</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"contact.jsp\">Sign In</a></li>\r\n");
      out.write("                            <li><a href=\"index.jsp\">View Cart</a></li>\r\n");
      out.write("                            <li><a href=\"#\">My Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("                            <li><a href=\"faq.jsp\">Help</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                        <h4>Contact</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><span>+91-123-456789</span></li>\r\n");
      out.write("                            <li><span>+00-123-000000</span></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"social-icons\">\r\n");
      out.write("                            <h4>Follow Us</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"facebook\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                <li class=\"twitter\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                <li class=\"googleplus\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                <li class=\"contact\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"copy_right\">\r\n");
      out.write("                    <p>&copy; 2013 Smart Store. All Rights Reserved | Design by <a href=\"http://w3layouts.com\">W3Layouts</a> </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                                $(document).ready(function () {\r\n");
      out.write("                                    /*\r\n");
      out.write("                                     var defaults = {\r\n");
      out.write("                                     containerID: 'toTop', // fading element id\r\n");
      out.write("                                     containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("                                     scrollSpeed: 1200,\r\n");
      out.write("                                     easingType: 'linear' \r\n");
      out.write("                                     };\r\n");
      out.write("                                     */\r\n");
      out.write("\r\n");
      out.write("                                    $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("                                });\r\n");
      out.write("        </script>\r\n");
      out.write("        <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 1;\"></span></a>\r\n");
      out.write("        <link href=\"Assets/css/flexslider.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <script defer src=\"Assets/js/jquery.flexslider.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                                $(function () {\r\n");
      out.write("                                    SyntaxHighlighter.all();\r\n");
      out.write("                                });\r\n");
      out.write("                                $(window).load(function () {\r\n");
      out.write("                                    $('.flexslider').flexslider({\r\n");
      out.write("                                        animation: \"slide\",\r\n");
      out.write("                                        start: function (slider) {\r\n");
      out.write("                                            $('body').removeClass('loading');\r\n");
      out.write("                                        }\r\n");
      out.write("                                    });\r\n");
      out.write("                                });\r\n");
      out.write("        </script>\r\n");
      out.write("<!--        <script>\r\n");
      out.write("              function changeActive(id){\r\n");
      out.write("\t\t    $.ajaxSetup({\r\n");
      out.write("\t\t    headers: {\r\n");
      out.write("\t\t      'X-CSRF-TOKEN': $('meta[name=\"csrf-token\"]').attr('content')\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t    $.ajax({\r\n");
      out.write("\t\t      url: \"");
      out.print(request.getContextPath());
      out.write("/cart_add\",\r\n");
      out.write("\t\t      type: 'POST',\r\n");
      out.write("\t\t      cache: false,\r\n");
      out.write("\t\t      data: {\r\n");
      out.write("\t\t        aid: id\r\n");
      out.write("\t\t      },\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t      success: function(data){\r\n");
      out.write("\t\t        $(\"#change\").html(data);\r\n");
      out.write("                        \r\n");
      out.write("\t\t      },\r\n");
      out.write("\t\t      error: function (){\r\n");
      out.write("\t\t        alert('Có lỗi');\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t    }); \r\n");
      out.write("\t\t  }\r\n");
      out.write("\r\n");
      out.write("        </script>-->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\n');
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
