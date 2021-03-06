<%@page import="Info.ADUsersInfo"%>
<%@page import="Info.ARCartsInfo"%>
<%@page import="Controller.ARCartsController"%>
<%@page import="Controller.ICProductController"%>
<%@page import="Info.ICProductsInfo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Smart Store</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="../Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/slider.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="../Assets/js/jquery.min.js"></script>
        <link href='//fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Monda' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="../Assets/js/move-top.js"></script>
        <script type="text/javascript" src="../Assets/js/easing.js"></script> 

    </head>
    <body>
        <div class="wrap">
            <div class="header">
                <div class="header_top">
                    <div class="logo">
                        <a href="/index_servlet"><img src="Assets/images/logo.png" alt="" /></a>
                    </div>
                    <div class="header_top_right">
                        <div class="search_box">
                            <form action="/search" method="POST">
                                <input type="text" name="info" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for Products';
                                        }"><input type="submit" value="SEARCH">
                            </form>
                        </div>
                        <%
                            ARCartsController ar = new ARCartsController();
                        %>
                        <div class="shopping_cart" id="change">
                            <div class="cart">
                                <%int id = 0;
                                    if (session.getAttribute("HREmployeeID") != null) {
                                        id = (Integer) session.getAttribute("HREmployeeID");
                                    }
                                %>
                                <a href="/cart?idcus=<%=id%>" title="View my shopping cart" rel="nofollow">
                                    <strong class="opencart"> </strong>
                                    <span class="cart_title">Giỏ hàng</span>
                                    <%if (session.getAttribute("HREmployeeID") != null) {
                                            List<ARCartsInfo> listar = ar.getListCartByID(id);%>
                                    <span class="no_product"><%=listar.size()%></span>
                                    <%} else {%>
                                    <span class="no_product">Rỗng</span>
                                    <%}%>
                                </a>
                            </div>
                        </div>
                        <div class="languages" title="language">
                            <div id="language" class="wrapper-dropdown" tabindex="1">
                                <span><a href="">TK</a></span>
                                <strong class="opencart"> </strong>
                                <ul class="dropdown languges" style="width:200px;">
                                    <%if (session.getAttribute("HREmployeeID") != null) {%>
                                    <li>
                                        <a href="/customer" title="Thông tin cá nhân">
                                            <span class="lang">Thông tin cá nhân</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/dhct" title="Thông tin giỏ hàng">
                                            <span class="lang">Đơn hàng của bạn</span>
                                        </a>
                                    </li>
                                    <%}%>
                                    <%if (session.getAttribute("HREmployeeID") == null) {%>
                                    <li>
                                        <a href="/Login_Servlet" title="Đăng nhập">
                                            <span class="lang">Đăng nhập</span>
                                        </a>
                                    </li>
                                    <%}%>
                                    <%if (session.getAttribute("HREmployeeID") != null) {%>
                                    <li>
                                        <a href="/Logout_Servlet" title="Đăng xuất">
                                            <span class="lang">Đăng xuất</span>
                                        </a>
                                    </li>
                                    <%}%>
                                </ul>
                            </div>
                            <script type="text/javascript">
                                function DropDown(el) {
                                    this.dd = el;
                                    this.initEvents();
                                }
                                DropDown.prototype = {
                                    initEvents: function () {
                                        var obj = this;

                                        obj.dd.on('click', function (event) {
                                            $(this).toggleClass('active');
                                            event.stopPropagation();
                                        });
                                    }
                                }

                                $(function () {

                                    var dd = new DropDown($('#language'));

                                    $(document).click(function () {
                                        // all dropdowns
                                        $('.wrapper-dropdown').removeClass('active');
                                    });

                                });

                            </script>
                        </div>


                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="h_menu">
                    <a id="touch-menu" class="mobile-menu" href="#">Menu</a>
                    <nav>
                        <ul class="menu list-unstyled">
                            <li><a href="/index_servlet">Trang chủ</a></li>
                            <li><a href="/product">Sản phẩm yêu thích</a>
                            </li>
                            </li>		
                            <li><a href="">Tin tức</a>
                            </li>
                            <li><a href="/about">Giới thiệu</a></li>                           
                            <li><a href="/faq">Faqs</a></li>
                            <li><a href="/contact">Liên hệ</a></li>
                            <div class="clear"> </div>
                        </ul>
                    </nav> 
                    <script src="Assets/js/menu.js" type="text/javascript"></script>
                </div>
            </div>

