<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <head>
        <title>Smart phone store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="../Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="../Assets/js/jquery.min.js"></script>
        <script src="../Assets/js/script.js" type="text/javascript"></script>
        <script type="text/javascript" src="../Assets/js/move-top.js"></script>
        <script type="text/javascript" src="../Assets/js/easing.js"></script>
        <link href='//fonts.googleapis.com/css?family=Monda' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
        <link href="../Assets/css/appointment_style.css" rel="stylesheet" type="text/css"/>
        <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700" rel="stylesheet">
    </head>
    <body>
        <div class="wrap">
            <div class="header">
                <div class="header_top">
                    <div class="logo">
                        <a href="index.jsp"><img src="../Assets/images/logo.png" alt="" /></a>
                    </div>
                    <div class="header_top_right">
                        <div class="search_box">
                            <form>
                                <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for Products';
                                        }"><input type="submit" value="SEARCH">
                            </form>
                        </div>
                        <div class="languages" title="language">
                            <div id="language" class="wrapper-dropdown" tabindex="1">EN
                                <strong class="opencart"> </strong>
                                <ul class="dropdown languges">					
                                    <li>
                                        <a href="#" title="FranÃ§ais">
                                            <span><img src="../Assets/images/gb.png" alt="en" width="26" height="26"></span><span class="lang">English</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="FranÃ§ais">
                                            <span><img src="../Assets/images/au.png" alt="fr" width="26" height="26"></span><span class="lang">FranÃ§ais</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="EspaÃ±ol">
                                            <span><img src="../Assets/images/bm.png" alt="es" width="26" height="26"></span><span class="lang">EspaÃ±ol</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="Deutsch">
                                            <span><img src="../Assets/images/ck.png" alt="de" width="26" height="26"></span><span class="lang">Deutsch</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="Russian">
                                            <span><img src="../Assets/images/cu.png" alt="ru" width="26" height="26"></span><span class="lang">Russian</span>
                                        </a>
                                    </li>					
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
                        <div class="currency" title="currency">
                            <div id="currency" class="wrapper-dropdown" tabindex="1">$
                                <strong class="opencart"> </strong>
                                <ul class="dropdown">
                                    <li><a href="#"><span>$</span>Dollar</a></li>
                                    <li><a href="#"><span>â¬</span>Euro</a></li>
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

                                    var dd = new DropDown($('#currency'));

                                    $(document).click(function () {
                                        // all dropdowns
                                        $('.wrapper-dropdown').removeClass('active');
                                    });

                                });

                            </script>
                        </div>
                        <div class="login">
                            <span><a href="login.jsp"><img src="../Assets/images/login.png" alt="" title="login"/></a></span>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="h_menu">
                    <a id="touch-menu" class="mobile-menu" href="#">Menu</a>
                    <nav>
                        <ul class="menu list-unstyled">
                            <li><a href="/employee_servlet">Home</a></li>
                            <li class="activate"><a href="/Employee_CustomerHome_Servlet">Khách hàng</a></li>
                            <li><a href="/Employee_SaleOrderHome_Servlet">Đơn bán hàng</a></li>		
                            <li><a href="">Hóa đơn bán hàng</a></li>
                            <li><a href="">Bình luận</a></li>
                            <li><a href="">Bài đăng</a></li>
                            <li><a href="/employee/product">Sản phẩm</a></li>
                            <div class="clear"> </div>
                        </ul>
                    </nav> 
                    <script src="../Assets/js/menu.js" type="text/javascript"></script>
                </div>
                <div>
                    <h2 style="text-align: center;margin-top: 20px; color: ">DANH SÁCH SẢN PHẨM</h2>
                </div>
                <a href="/customer_add.jsp"><button style="float:left;width:auto;" class="btn btn-success"><span class="glyphicon glyphicon-user"></span>Thêm sản phẩm</button></a>
                <div style="float:right">
                    <form action="" method="post">
                        <table>
                            <tr>
                                <th><input type="text" name="thongtin_search" /></th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                            </tr>
                        </table>
                    </form>
                </div>
                <div style="float:left;margin-left:30px;">
                    <form action="" method="post">
                        <table>
                            <tr>
                                <th>
                                    <select name="thongtin_sort">
                                        <option value="0">Mã khách hàng</option>
                                        <option value="1">Tên khách hàng</option>
                                        <option value="2">Ngày sinh</option>
                                    </select>
                                </th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Sort</button></th>
                            </tr>
                        </table>
                    </form>
                </div>
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">STT</th>
                        <th style="color:white">Mã sản phẩm</th>
                        <th style="color:white">Tên sản phẩm</th>
                        <th style="color:white">Mô tả</th>
                        <th style="color:white">Hình ảnh</th>
                        <th style="color:white">Edit</th>
                        <th style="color:white">Delete</th>
                        <th style="color:white">Xem chi tiết</th>
                    </tr>

                    <tr>
                        <td style="color:black">1</td>
                        <td style="color:black">VLXX1</td>
                        <td style="color:black">SAMSUN GALAXY NOTE 9 </td>
                        <td style="color:black">Điện thoại max đẹp</td>
                        <td style="color:black;width: 100px;height:100px;"><img src="/Images/note9.png"  /></td>
                        <td><a href="/CustomerLoadUpdate_Servlet?ID="><button type="button" class="update btn btn-warning btn-sm"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
                        <td><a href=""><button onclick="myFunction('@i.MaBenhNhan')" type="button" class="delete btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash"></span></button></a></td>
                        <td><a href="/QuanLiBenhNhan/LoadChiSoBenhLi?ma=@i.MaBenhNhan"><button class="btn btn-success" style="height:30px">XEM CHI TIẾT</button></a></td>
                    </tr>
                </table>
                <div class="footer">
                    <div class="wrapper">	
                        <div class="section group">
                            <div class="col_1_of_4 span_1_of_4">
                                <h4>Information</h4>
                                <ul>
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">Customer Service</a></li>
                                    <li><a href="#"><span>Advanced Search</span></a></li>
                                    <li><a href="#">Orders and Returns</a></li>
                                    <li><a href="#"><span>Contact Us</span></a></li>
                                </ul>
                            </div>
                            <div class="col_1_of_4 span_1_of_4">
                                <h4>Why buy from us</h4>
                                <ul>
                                    <li><a href="about.jsp">About Us</a></li>
                                    <li><a href="faq.jsp">Customer Service</a></li>
                                    <li><a href="#">Privacy Policy</a></li>
                                    <li><a href="contact.jsp"><span>Site Map</span></a></li>
                                    <li><a href="preview-2.jsp"><span>Search Terms</span></a></li>
                                </ul>
                            </div>
                            <div class="col_1_of_4 span_1_of_4">
                                <h4>My account</h4>
                                <ul>
                                    <li><a href="contact.jsp">Sign In</a></li>
                                    <li><a href="index.jsp">View Cart</a></li>
                                    <li><a href="#">My Wishlist</a></li>
                                    <li><a href="#">Track My Order</a></li>
                                    <li><a href="faq.jsp">Help</a></li>
                                </ul>
                            </div>
                            <div class="col_1_of_4 span_1_of_4">
                                <h4>Contact</h4>
                                <ul>
                                    <li><span>+91-123-456789</span></li>
                                    <li><span>+00-123-000000</span></li>
                                </ul>
                                <div class="social-icons">
                                    <h4>Follow Us</h4>
                                    <ul>
                                        <li class="facebook"><a href="#" target="_blank"> </a></li>
                                        <li class="twitter"><a href="#" target="_blank"> </a></li>
                                        <li class="googleplus"><a href="#" target="_blank"> </a></li>
                                        <li class="contact"><a href="#" target="_blank"> </a></li>
                                        <div class="clear"></div>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="copy_right">
                            <p>&copy; 2013 Smart Store. All Rights Reserved | Design by <a href="http://w3layouts.com">W3Layouts</a> </p>
                        </div>
                    </div>
                </div>
                <script type="text/javascript">
                    $(document).ready(function () {
                        /*
                         var defaults = {
                         containerID: 'toTop', // fading element id
                         containerHoverID: 'toTopHover', // fading element hover id
                         scrollSpeed: 1200,
                         easingType: 'linear' 
                         };
                         */

                        $().UItoTop({easingType: 'easeOutQuart'});

                    });
                </script>
                <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
                <link href="../Assets/css/flexslider.css" rel='stylesheet' type='text/css' />
                <script defer src="../Assets/js/jquery.flexslider.js"></script>
                <script type="text/javascript">
                    $(function () {
                        SyntaxHighlighter.all();
                    });
                    $(window).load(function () {
                        $('.flexslider').flexslider({
                            animation: "slide",
                            start: function (slider) {
                                $('body').removeClass('loading');
                            }
                        });
                    });
                </script>

                </body>
                </html>

