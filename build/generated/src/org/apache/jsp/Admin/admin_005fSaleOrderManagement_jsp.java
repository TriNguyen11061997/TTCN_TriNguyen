package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fSaleOrderManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Smart phone store</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <link href=\"../Assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <link href=\"../Assets/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("        <script src=\"../Assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"../Assets/js/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../Assets/js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../Assets/js/easing.js\"></script>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Monda' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../Assets/css/appointment_style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <div class=\"header_top\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"../Assets/images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"header_top_right\">\r\n");
      out.write("                        <div class=\"search_box\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <input type=\"text\" value=\"Search for Products\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                            this.value = 'Search for Products';\r\n");
      out.write("                                        }\"><input type=\"submit\" value=\"SEARCH\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"languages\" title=\"language\">\r\n");
      out.write("                            <div id=\"language\" class=\"wrapper-dropdown\" tabindex=\"1\">EN\r\n");
      out.write("                                <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                <ul class=\"dropdown languges\">\t\t\t\t\t\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                            <span><img src=\"../Assets/images/gb.png\" alt=\"en\" width=\"26\" height=\"26\"></span><span class=\"lang\">English</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"FranÃ§ais\">\r\n");
      out.write("                                            <span><img src=\"../Assets/images/au.png\" alt=\"fr\" width=\"26\" height=\"26\"></span><span class=\"lang\">FranÃ§ais</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"EspaÃ±ol\">\r\n");
      out.write("                                            <span><img src=\"../Assets/images/bm.png\" alt=\"es\" width=\"26\" height=\"26\"></span><span class=\"lang\">EspaÃ±ol</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"Deutsch\">\r\n");
      out.write("                                            <span><img src=\"../Assets/images/ck.png\" alt=\"de\" width=\"26\" height=\"26\"></span><span class=\"lang\">Deutsch</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\" title=\"Russian\">\r\n");
      out.write("                                            <span><img src=\"../Assets/images/cu.png\" alt=\"ru\" width=\"26\" height=\"26\"></span><span class=\"lang\">Russian</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\t\t\t\t\t\r\n");
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
      out.write("                        <div class=\"currency\" title=\"currency\">\r\n");
      out.write("                            <div id=\"currency\" class=\"wrapper-dropdown\" tabindex=\"1\">$\r\n");
      out.write("                                <strong class=\"opencart\"> </strong>\r\n");
      out.write("                                <ul class=\"dropdown\">\r\n");
      out.write("                                    <li><a href=\"#\"><span>$</span>Dollar</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><span>â¬</span>Euro</a></li>\r\n");
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
      out.write("                                    var dd = new DropDown($('#currency'));\r\n");
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
      out.write("                        <div class=\"login\">\r\n");
      out.write("                            <span><a href=\"login.jsp\"><img src=\"../Assets/images/login.png\" alt=\"\" title=\"login\"/></a></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"h_menu\">\r\n");
      out.write("                    <a id=\"touch-menu\" class=\"mobile-menu\" href=\"#\">Menu</a>\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <ul class=\"menu list-unstyled\">\r\n");
      out.write("                            <li><a href=\"Employee/employee_Home.jsp\">Trang chủ</a></li>\r\n");
      out.write("                            <li class=\"activate\"><a href=\"/Employee_CustomerHome_Servlet\">Khách hàng</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"/Employee_SaleOrderHome_Servlet\">Đơn bán hàng</a>\t\t\t                                \r\n");
      out.write("                            </li>\t\t\r\n");
      out.write("                            <li><a href=\"\">Hóa đơn bán hàng</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"\">Bình luận</a></li>\r\n");
      out.write("                            <li><a href=\"\">Bài đăng</a></li>\r\n");
      out.write("                            <li><a href=\"\">Liên hệ</a></li>\r\n");
      out.write("                            <div class=\"clear\"> </div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav> \r\n");
      out.write("                    <script src=\"../Assets/js/menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h2 style=\"text-align: center;margin-top: 20px; color: \">DANH SÁCH KHÁCH HÀNG</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"/customer_add.jsp\"><button style=\"float:left;width:auto;\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-user\"></span>Thêm khách hàng</button></a>\r\n");
      out.write("                <div style=\"float:right\">\r\n");
      out.write("                    <form action=\"\" method=\"post\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th><input type=\"text\" name=\"thongtin_search\" /></th>\r\n");
      out.write("                                <th><button type=\"submit\" class=\"btn btn-success\" style=\"width:auto;\">Search</button></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"float:left;margin-left:30px;\">\r\n");
      out.write("                    <form action=\"\" method=\"post\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    <select name=\"thongtin_sort\">\r\n");
      out.write("                                        <option value=\"0\">Mã khách hàng</option>\r\n");
      out.write("                                        <option value=\"1\">Tên khách hàng</option>\r\n");
      out.write("                                        <option value=\"2\">Ngày sinh</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th><button type=\"submit\" class=\"btn btn-success\" style=\"width:auto;\">Sort</button></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table class=\"table\" style=\"border:1px;\">\r\n");
      out.write("                    <tr class=\"tr\" style=\"background-color: #666666\">\r\n");
      out.write("                        <th style=\"color:white\">STT</th>\r\n");
      out.write("                        <th style=\"color:white\">Mã đơn hàng</th>\r\n");
      out.write("                        <th style=\"color:white\">Tên đơn hàng</th>\r\n");
      out.write("                        <th style=\"color:white\">Số điện thoại</th>\r\n");
      out.write("                        <th style=\"color:white\">Edit</th>\r\n");
      out.write("                        <th style=\"color:white\">Delete</th>\r\n");
      out.write("                        <th style=\"color:white\">Xem chi tiết</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                <div class=\"footer\">\r\n");
      out.write("                    <div class=\"wrapper\">\t\r\n");
      out.write("                        <div class=\"section group\">\r\n");
      out.write("                            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                                <h4>Information</h4>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Customer Service</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><span>Advanced Search</span></a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Orders and Returns</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><span>Contact Us</span></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                                <h4>Why buy from us</h4>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                                    <li><a href=\"faq.jsp\">Customer Service</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                                    <li><a href=\"contact.jsp\"><span>Site Map</span></a></li>\r\n");
      out.write("                                    <li><a href=\"preview-2.jsp\"><span>Search Terms</span></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                                <h4>My account</h4>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"contact.jsp\">Sign In</a></li>\r\n");
      out.write("                                    <li><a href=\"index.jsp\">View Cart</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">My Wishlist</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("                                    <li><a href=\"faq.jsp\">Help</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col_1_of_4 span_1_of_4\">\r\n");
      out.write("                                <h4>Contact</h4>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><span>+91-123-456789</span></li>\r\n");
      out.write("                                    <li><span>+00-123-000000</span></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"social-icons\">\r\n");
      out.write("                                    <h4>Follow Us</h4>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li class=\"facebook\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                        <li class=\"twitter\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                        <li class=\"googleplus\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                        <li class=\"contact\"><a href=\"#\" target=\"_blank\"> </a></li>\r\n");
      out.write("                                        <div class=\"clear\"></div>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"copy_right\">\r\n");
      out.write("                            <p>&copy; 2013 Smart Store. All Rights Reserved | Design by <a href=\"http://w3layouts.com\">W3Layouts</a> </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        /*\r\n");
      out.write("                         var defaults = {\r\n");
      out.write("                         containerID: 'toTop', // fading element id\r\n");
      out.write("                         containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("                         scrollSpeed: 1200,\r\n");
      out.write("                         easingType: 'linear' \r\n");
      out.write("                         };\r\n");
      out.write("                         */\r\n");
      out.write("\r\n");
      out.write("                        $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("                <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 1;\"></span></a>\r\n");
      out.write("                <link href=\"../Assets/css/flexslider.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("                <script defer src=\"../Assets/js/jquery.flexslider.js\"></script>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    $(function () {\r\n");
      out.write("                        SyntaxHighlighter.all();\r\n");
      out.write("                    });\r\n");
      out.write("                    $(window).load(function () {\r\n");
      out.write("                        $('.flexslider').flexslider({\r\n");
      out.write("                            animation: \"slide\",\r\n");
      out.write("                            start: function (slider) {\r\n");
      out.write("                                $('body').removeClass('loading');\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
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
    _jspx_th_c_forEach_0.setVar("saleOrder");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSaleOrder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                     \r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleOrder.ARSaleOrderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleOrder.ARSaleOrderNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${saleOrder.ARSaleOrderName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"color:black\">Trí Nguyễn</td>\r\n");
          out.write("                            <td><a href=\"/CustomerLoadUpdate_Servlet?ID=\"><button type=\"button\" class=\"update btn btn-warning btn-sm\"><span class=\"glyphicon glyphicon-pencil\"></span></button></a></td>\r\n");
          out.write("                            <td><a href=\"\"><button onclick=\"myFunction('@i.MaBenhNhan')\" type=\"button\" class=\"delete btn btn-danger btn-sm\"><span class=\"glyphicon glyphicon-trash\"></span></button></a></td>\r\n");
          out.write("                            <td><a href=\"/QuanLiBenhNhan/LoadChiSoBenhLi?ma=@i.MaBenhNhan\"><button class=\"btn btn-success\" style=\"height:30px\">XEM CHI TIẾT</button></a></td>\r\n");
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
