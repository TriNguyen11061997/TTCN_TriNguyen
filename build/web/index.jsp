<%@page import="Info.ARCartsInfo"%>
<%@page import="Controller.ARCartsController"%>
<%@page import="Controller.ICProductController"%>
<%@page import="Info.ICProductsInfo"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML>
<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <head>
        <title>Smart phone store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="Assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="Assets/js/script.js" type="text/javascript"></script>
        <script type="text/javascript" src="Assets/js/move-top.js"></script>
        <script type="text/javascript" src="Assets/js/easing.js"></script>
        <link href='//fonts.googleapis.com/css?family=Monda' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="wrap">
            <div class="header">
                <div class="header_top">
                    <div class="logo">
                        <a href="index.jsp"><img src="Assets/images/logo.png" alt="" /></a>
                    </div>
                    <div class="header_top_right">
                        <div class="search_box">
                            <form>
                                <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for Products';
                                        }"><input type="submit" value="SEARCH">
                            </form>
                        </div>
                        <%
                            ARCartsController ar = new ARCartsController();
                            List<ARCartsInfo> listCart = ar.GetALlObject();
                        %>
                        <div class="shopping_cart" id="change">
                            <div class="cart">
                                <a href="/cart" title="View my shopping cart" rel="nofollow">
                                    <strong class="opencart"> </strong>
                                    <span class="cart_title">Giỏ hàng</span>
                                    <span class="no_product"><%=listCart.size()%></span>
                                </a>
                            </div>
                        </div>
                        <div class="languages" title="language">
                            <div id="language" class="wrapper-dropdown" tabindex="1">EN
                                <strong class="opencart"> </strong>
                                <ul class="dropdown languges">					
                                    <li>
                                        <a href="#" title="FranÃ§ais">
                                            <span><img src="Assets/images/gb.png" alt="en" width="26" height="26"></span><span class="lang">English</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="FranÃ§ais">
                                            <span><img src="Assets/images/au.png" alt="fr" width="26" height="26"></span><span class="lang">FranÃ§ais</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="EspaÃ±ol">
                                            <span><img src="Assets/images/bm.png" alt="es" width="26" height="26"></span><span class="lang">EspaÃ±ol</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="Deutsch">
                                            <span><img src="Assets/images/ck.png" alt="de" width="26" height="26"></span><span class="lang">Deutsch</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="Russian">
                                            <span><img src="Assets/images/cu.png" alt="ru" width="26" height="26"></span><span class="lang">Russian</span>
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
                            <span><a href="Public/login.jsp"><img src="Assets/images/login.png" alt="" title="login"/></a></span>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="h_menu">
                    <a id="touch-menu" class="mobile-menu" href="#">Menu</a>
                    <nav>
                        <ul class="menu list-unstyled">
                            <li><a href="index.jsp">Trang chủ</a></li>
                            <li class="activate"><a href="/index_servlet">Sản phẩm</a>
                                <ul class="sub-menu list-unstyled">
                                    <div class="nag-mother-list">
                                        <div class="navg-drop-main">
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 1</a></li>
                                                <li><a href="products.jsp">Product 2</a></li>
                                                <li><a href="products.jsp">Product 3</a>
                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 1</a></li>
                                                <li><a href="products.jsp">Product 2</a></li>
                                                <li><a href="products.jsp">Product 3</a>
                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 1</a></li>
                                                <li><a href="products.jsp">Product 2</a></li>
                                                <li><a href="products.jsp">Product 3</a></li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 1</a></li>
                                                <li><a href="products.jsp">Product 2</a></li>
                                                <li><a href="products.jsp">Product 3</a></li>
                                            </div>
                                            <div class="clear"> </div>
                                        </div>
                                        <div class="navg-drop-main">
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a>

                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a>
                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a></li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a></li>
                                            </div>
                                            <div class="clear"> </div>
                                        </div>
                                        <div class="navg-drop-main">
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a>

                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a>
                                                </li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a></li>
                                            </div>
                                            <div class="nav-drop"> 
                                                <li><a href="products.jsp">Product 4</a></li>
                                                <li><a href="products.jsp">Product 5</a></li>
                                                <li><a href="products.jsp">Product 6</a></li>
                                            </div>
                                            <div class="clear"> </div>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li><a href="products.jsp">Sản phẩm hàng đầu</a>			
                                <ul class="sub-menu list-unstyled sub-menu2">
                                    <div class="navg-drop-main">
                                        <div class="nav-drop nav-top-brand"> 
                                            <li><a href="products.jsp">Product 1</a></li>
                                            <li><a href="products.jsp">Product 2</a></li>
                                            <li><a href="products.jsp">Product 3</a></li>					
                                            <li><a href="products.jsp">Product 4</a></li>
                                            <li><a href="products.jsp">Product 5</a></li>
                                            <li><a href="products.jsp">Product 6</a></li>
                                        </div>								
                                    </div>
                                </ul>
                            </li>		
                            <li><a href="Employee/employee_Home.jsp">Dịch vụ</a>
                                <ul class="sub-menu list-unstyled sub-menu3">
                                    <div class="navg-drop-main">
                                        <div class="nav-drop"> 
                                            <li><a href="products.jsp">Product 4</a></li>
                                            <li><a href="products.jsp">Product 5</a></li>
                                            <li><a href="products.jsp">Product 6</a>

                                            </li>
                                        </div>
                                        <div class="nav-drop"> 
                                            <li><a href="products.jsp">Product 4</a></li>
                                            <li><a href="products.jsp">Product 5</a></li>
                                            <li><a href="products.jsp">Product 6</a>
                                            </li>
                                        </div>
                                        <div class="nav-drop"> 
                                            <li><a href="products.jsp">Product 4</a></li>
                                            <li><a href="products.jsp">Product 5</a></li>
                                            <li><a href="products.jsp">Product 6</a></li>
                                        </div>
                                        <div class="nav-drop"> 
                                            <li><a href="products.jsp">Product 4</a></li>
                                            <li><a href="products.jsp">Product 5</a></li>
                                            <li><a href="products.jsp">Product 6</a></li>
                                        </div>
                                        <div class="clear"> </div>
                                    </div>
                                </ul>
                            </li>
                            <li><a href="Public/about.jsp">Giới thiệu</a></li>                           
                            <li><a href="faq.jsp">Faqs</a></li>
                            <li><a href="contact.jsp">Liên hệ</a></li>
                            <div class="clear"> </div>
                        </ul>
                    </nav> 
                    <script src="Assets/js/menu.js" type="text/javascript"></script>
                </div>
                <%  ICProductController ProductDAO = new ICProductController();
                    List<ICProductsInfo> listPro = ProductDAO.getListProduct();

                %>
                <div class="header_bottom">
                    <div class="header_bottom_left">
                        <div class="section group">
                            <%                                int i = 1;
                                for (ICProductsInfo item1 : listPro) {
                                    if (i == 3) {
                                        break;
                                    }


                            %>
                            <div class="listview_1_of_2 images_1_of_2">
                                <div class="listimg listimg_2_of_1">
                                    <a href="preview.jsp"> <img src="Images/<%=item1.getICProductPicture1()%>" alt="" /></a>
                                </div>
                                <div class="text list_2_of_1">
                                    <h2>Iphone</h2>
                                    <p>Lorem ipsum dolor sit amet sed do eiusmod.</p>
                                    
                                    <div class="button"><span><a href="/cart_add?id=<%=item1.getICProductID()%>" >Giỏ hàng</a></span></div>
                                </div>
                            </div>
                            <%i++;
                                }%>

                        </div>
                        <div class="section group">
                            <div class="listview_1_of_2 images_1_of_2">
                                <div class="listimg listimg_2_of_1">
                                    <a href="preview-3.jsp"> <img src="Assets/images/pic3.jpg" alt="" /></a>
                                </div>
                                <div class="text list_2_of_1">
                                    <h2>Acer</h2>
                                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
                                    <div class="button"><span><a href="preview.jsp">Giỏ hàng</a></span></div>
                                </div>
                            </div>			
                            <div class="listview_1_of_2 images_1_of_2">
                                <div class="listimg listimg_2_of_1">
                                    <a href="preview.jsp"><img src="Assets/images/pic1.png" alt="" /></a>
                                </div>
                                <div class="text list_2_of_1">
                                    <h2>Canon</h2>
                                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
                                    <div class="button"><span><a href="preview.jsp">Giỏ hàng</a></span></div>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="header_bottom_right_images">
                        <!-- FlexSlider -->
                        <section class="slider">
                            <div class="flexslider">
                                <ul class="slides">
                                    <li><img src="Assets/images/1.jpg" alt=""/></li>
                                    <li><img src="Assets/images/2.jpg" alt=""/></li>
                                    <li><img src="Assets/images/3.jpg" alt=""/></li>
                                    <li><img src="Assets/images/4.jpg" alt=""/></li>
                                </ul>
                            </div>
                        </section>
                        <!-- FlexSlider -->
                    </div>
                    <div class="clear"></div>
                </div>	
            </div>
            <div class="main">
                <div class="content">
                    <div class="content_top">
                        <div class="heading">
                            <h3>Feature Products</h3>
                        </div>
                        <div class="sort">
                            <p>Sort by:
                                <select>
                                    <option>Lowest Price</option>
                                    <option>Highest Price</option>
                                    <option>Lowest Price</option>
                                    <option>Lowest Price</option>
                                    <option>Lowest Price</option>
                                    <option>In Stock</option>  				   				
                                </select>
                            </p>
                        </div>
                        <div class="show">
                            <p>Show:
                                <select>
                                    <option>4</option>
                                    <option>8</option>
                                    <option>12</option>
                                    <option>16</option>
                                    <option>20</option>
                                    <option>In Stock</option>  				   				
                                </select>
                            </p>
                        </div>
                        <div class="page-no">
                            <p>Result Pages:<ul>
                                <li><a href="#">1</a></li>
                                <li class="active"><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li>[<a href="#"> Next>>></a >]</li>
                            </ul></p>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <%
                            for (ICProductsInfo item : listPro) {
                        %>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview-3.jsp"><img src="Images/<%=item.getICProductPicture1()%>" alt="" /></a>
                            <h2><%=item.getICProductDesc()%> </h2>
                            <p><%=item.getICProductName()%></p>
                            <p><span class="strike">$528.22</span><span class="price">$<%=item.getICProductSupplierPrice()%></span></p>
                            <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a href="preview-3.jsp" class="cart-button">Giỏ hàng</a></span> </div>
                            <div class="button"><span><a href="preview-3.jsp" class="details">Details</a></span></div>
                        </div>
                        <%}%>

                    </div>
                    <div class="content_bottom">
                        <div class="heading">
                            <h3>New Products</h3>
                        </div>
                        <div class="sort">
                            <p>Sort by:
                                <select>
                                    <option>Lowest Price</option>
                                    <option>Highest Price</option>
                                    <option>Lowest Price</option>
                                    <option>Lowest Price</option>
                                    <option>Lowest Price</option>
                                    <option>In Stock</option>  				   				
                                </select>
                            </p>
                        </div>
                        <div class="show">
                            <p>Show:
                                <select>
                                    <option>4</option>
                                    <option>8</option>
                                    <option>12</option>
                                    <option>16</option>
                                    <option>20</option>
                                    <option>In Stock</option>  				   				
                                </select>
                            </p>
                        </div>
                        <div class="page-no">
                            <p>Result Pages:<ul>
                                <li><a href="#">1</a></li>
                                <li class="active"><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li>[<a href="#"> Next>>></a >]</li>
                            </ul></p>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <%
                            for (ICProductsInfo item2 : listPro) {
                        %>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview-3.jsp"><img src="Images/<%=item2.getICProductPicture1()%>" alt="" /></a>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
                            <h2><%=item2.getICProductName()%> </h2>
                            <p><span class="strike">$438.99</span><span class="price">$<%=item2.getICProductSupplierPrice()%></span></p>
                            <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a href="preview-3.jsp" class="cart-button">Giỏ hàng</a></span> </div>
                            <div class="button"><span><a href="preview-3.jsp" class="details">Details</a></span></div>
                        </div>
                        <%}%>



                    </div>
                </div>
            </div>
        </div>
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
        <link href="Assets/css/flexslider.css" rel='stylesheet' type='text/css' />
        <script defer src="Assets/js/jquery.flexslider.js"></script>
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
<!--        <script>
              function changeActive(id){
		    $.ajaxSetup({
		    headers: {
		      'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
		    }
		  });
		    $.ajax({
		      url: "<%=request.getContextPath()%>/cart_add",
		      type: 'POST',
		      cache: false,
		      data: {
		        aid: id
		      },
		
		      success: function(data){
		        $("#change").html(data);
                        
		      },
		      error: function (){
		        alert('Có lỗi');
		      }
		    }); 
		  }

        </script>-->
    </body>
</html>

