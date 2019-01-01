<%@page import="java.util.ArrayList"%>
<%@page import="Info.ARCustomersInfo"%>
<%@page import="Controller.ARCustomersController"%>
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
        <link href="../Assets/css/cart.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/shoppingcart.css" rel="stylesheet" type="text/css"/>
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
                                <input type="text" style="height: 2.5%" name="name" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
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
                                    <%
                                        List<ARCartsInfo> listar = null;
                                        if (session.getAttribute("HREmployeeID") != null) {
                                            listar = ar.getListCartByID(id);%>
                                    <span class="no_product"><%=listar.size()%></span>
                                    <%} else {%>
                                    <span class="no_product">Rỗng</span>
                                    <%}%>
                                </a>
                            </div>
                        </div>
                        <div class="languages" title="language">
                            <div id="language" class="wrapper-dropdown" tabindex="1">
                                <span><a href="" style="color: black">TK</a></span>
                                <strong class="opencart"> </strong>
                                <ul class="dropdown languges" style="width:200px;">
                                    <%if (session.getAttribute("HREmployeeID") != null) {%>
                                    <li>
                                        <a href="/customer" title="Thông tin cá nhân">
                                            <span class="lang">Thông tin cá nhân</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" title="Thông tin giỏ hàng">
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
                            <li class="activate"><a href="/product">Sản phẩm</a>
                            </li>
                            <li><a href="">Sản phẩm hàng đầu</a>			
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
                            <li><a href="">Dịch vụ</a>


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
            <div class="main">
                <div class="content">
                    <div class="before-footor-wrapper">
                        <div class="before-payment-success">
                            <div class="product-div">
                                <div class="product-details-header" style="background-color:#7F786D;margin-bottom: 14px;">
                                    <div class="wy-inline-block wy-width-60 CartHeads" style="padding-left: 12px">
                                        Sản phẩm của bạn
                                    </div>
                                    <div class="wy-inline-block CartHeads" style="width: 15%">
                                        Giá
                                    </div>
                                    <div class="wy-inline-block CartHeads">
                                        Số lượng
                                    </div>
                                    <div class="wy-inline-block float-right text-right CartHeads" style="padding-right: 20px;">
                                        Tổng tiền
                                    </div>
                                </div>
                                <!-- if some other product is there display here><-->
                                <div class="editblock">
                                    <!--                                san pham luu o day-->

                                    <%  Double tongPhu = 0.0;
                                        Double fax = 0.0;
                                        if (request.getAttribute("listProduct") != null) {
                                            List<ICProductsInfo> list = (List<ICProductsInfo>) request.getAttribute("listProduct");
                                            for (ICProductsInfo item : list) {

                                    %>
                                    <div class="product-details product-block" id="single_product_block_125new">

                                        <input type="hidden" class="product-tax" value="0" />
                                        <div class="wy-inline-block wy-width-60" style="padding-left: 12px">
                                            <span class="font-prod font-smoothing"><span class='prod-name' style="line-height: 25px"><%=item.getICProductName()%></span></span>
                                        </div>
                                        <div class="wy-inline-block unit-price" style="width: 15%" style="line-height: 25px">
                                            <%=item.getICProductPrice()%>                                  </div>
                                        <div class="wy-inline-block" style="line-height: 25px">
                                            <select class="ItemQuantity" onchange="HandleQuantityChange(this)">
                                                <!--                                           nếu số lượng == bao nhiêu thì option-->
                                                <%  int sl = item.getQty();
                                                    for (int i = 1; i <= 20; i++) {
                                                        if (sl == i) {

                                                %>
                                                <option selected value="<%=i%>"><%=i%></option>
                                                <%} else {%>
                                                <option  value="<%=i%>"><%=i%></option>
                                                <%}
                                                    }%>

                                            </select>
                                            <a  class="remove-item remove" href="/Cart_Delete?ID=<%=item.getARCartID()%>" id="remove_item-125new">
                                                <img class="deleteItem" src="https://www.idera.com/assets/corporate/images/deleteItem.png" width="15" height="18" alt="Delete Cart Item">
                                            </a>
                                        </div>
                                        <div class="wy-inline-block float-right text-right item-total" style="padding-right: 20px; line-height: 25px">
                                            <%

                                                double tongTien = item.getQty() * item.getICProductPrice();
                                                tongPhu += tongTien;
                                            %>                                    
                                            <%=tongTien%> VNĐ
                                        </div>

                                        <input type="hidden" class="product-index product-index-0" value="0" />

                                        <div class='hide quantity-popup-125new'>
                                            <div class='quantity-popup-wrapper'>
                                                <div class='quantity-heading myriadSetPro-Semibold'>Quantity
                                                </div>
                                                <ul class='quantity-list'>
                                                    <li class='quantity-1'><a onclick="quantitySelectPhone('125new', 1)"><div>1</div></a></li>
                                                    <li class='quantity-2'><a onclick="quantitySelectPhone('125new', 2)"><div>2</div></a></li>
                                                    <li class='quantity-3'><a onclick="quantitySelectPhone('125new', 3)"><div>3</div></a></li>
                                                    <li class='quantity-4'><a onclick="quantitySelectPhone('125new', 4)"><div>4</div></a></li>
                                                    <li class='quantity-5'><a onclick="quantitySelectPhone('125new', 5)"><div>5</div></a></li>
                                                    <li class='quantity-6'><a onclick="quantitySelectPhone('125new', 6)"><div>6</div></a></li>
                                                    <li class='quantity-7'><a onclick="quantitySelectPhone('125new', 7)"><div>7</div></a></li>
                                                    <li class='quantity-8'><a onclick="quantitySelectPhone('125new', 8)"><div>8</div></a></li>
                                                    <li class='quantity-9'><a onclick="quantitySelectPhone('125new', 9)"><div>9</div></a></li>
                                                    <li class='quantity-10'><a onclick="quantitySelectPhone('125new', 10)"><div class='last-quantity'>10</div></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <%}
                                        }%>

                                </div>
                                <%
                                    if (session.getAttribute("HREmployeeID") != null) {
                                        id = (Integer) session.getAttribute("HREmployeeID");
                                        ARCartsController ar1 = new ARCartsController();
                                        if (listar.size() != 0) {
                                %>
                                <div class="full-width order-summary">
                                    <div class="full-width" style="background-color: #f3f4f5;">
                                        <div class="wy-inline-block wy-width-60"></div>
                                        <div class="wy-inline-block" style="width: 15%"></div>
                                        <div class="wy-inline-block">
                                            Tổng phụ :
                                        </div>
                                        <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                            <span class="prod-total"><%=tongPhu%></span> VNĐ
                                            <input type="hidden" id="prod-total" value="299"/>
                                        </div>
                                    </div>

                                    <div class="full-width">
                                        <div class="wy-inline-block wy-width-60"></div>
                                        <div class="wy-inline-block" style="width: 15%"></div>
                                        <div class="wy-inline-block">
                                            **Bảo trì:
                                        </div>
                                        <div class="wy-inline-block float-right text-right" style="padding-right: 20px;color: #6ea426;">
                                            Miễn phí
                                        </div>
                                    </div>

                                    <div class="full-width" style="background-color: #f3f4f5;">
                                        <div class="wy-inline-block wy-width-60"></div>
                                        <div class="wy-inline-block" style="width: 15%"></div>
                                        <div class="wy-inline-block">
                                            Phí ship hàng:
                                        </div>
                                        <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                            <span class="total-tax">30.000 VNĐ</span>
                                            <input type="hidden" id="total-tax" value="0"/>
                                        </div>
                                    </div>

                                    <div class="full-width">
                                        <div class="wy-inline-block wy-width-60"></div>
                                        <div class="wy-inline-block" style="width: 15%"></div>
                                        <div class="wy-inline-block" style="font-family:'proxima_nova_rgbold', Arial, Helvetica, sans-serif;">
                                            Tổng toàn bộ:
                                        </div>
                                        <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                            <%
                                                Double tongTT = tongPhu + fax + 30000;
                                            %>
                                            <span class="total-amount" style="font-family:'proxima_nova_rgbold', Arial, Helvetica, sans-serif;"><%=tongTT%> VNĐ</span>
                                            <input type="hidden" id="total-amount" value="299" />
                                        </div>
                                    </div>
                                </div>
                                <%}
                                    }%>
                            </div>

                            <div class="pay-info-header">
                                <h3>Thông tin giao hàng:</h3>
                            </div>


                            <div class="full-width card-info CCFormBox" style="position: relative;">
                                <div class="formCardTitle" style="padding: 20px;border-bottom: 1px solid #fafaf9">
                                    Phương thức thanh toán
                                </div>
                                <div style="padding: 20px;">
                                    <div>
                                        <div class="CCInputLabel wy-inline-block" >Card Number:</div>
                                        <div class="wy-inline-block"><input type="text" id="credit_card" class="inCreditCardNumber" name="cardnum" maxlength="16" size='20'></div>
                                        <div class="CCInputLabel wy-inline-block">CSC:</div>
                                        <div class="wy-inline-block"><input type="text" id="card_cvv" maxlength="4" size="4" name="cardcvv" class="inCSCNumber"></div>
                                        <div class="wy-inline-block" style="position: absolute"><img src="https://www.idera.com/Presentation/Assets/Images/cc-icon-csc.png" width="61" height="30" alt="csc"></div>
                                        <div class="CCInputLabel wy-inline-block" style="margin-left: 63px">Valid Thru</div>
                                        <div class="wy-inline-block">
                                            <select id="card_month" class="inMonth">
                                                <option value="-1">MM</option>
                                                <option value="1">01</option>
                                                <option value="2">02</option>
                                                <option value="3">03</option>
                                                <option value="4">04</option>
                                                <option value="5">05</option>
                                                <option value="6">06</option>
                                                <option value="7">07</option>
                                                <option value="8">08</option>
                                                <option value="9">09</option>
                                                <option value="10">10</option>
                                                <option value="11">11</option>
                                                <option value="12">12</option>
                                            </select>
                                        </div>
                                        <div class="wy-inline-block">
                                            <select id="card_year" class="inYear">
                                                <option value="-1">YYYY</option>
                                                <option value="2018">2018</option>
                                                <option value="2019">2019</option>
                                                <option value="2020">2020</option>
                                                <option value="2021">2021</option>
                                                <option value="2022">2022</option>
                                                <option value="2023">2023</option>
                                                <option value="2024">2024</option>
                                                <option value="2025">2025</option>
                                                <option value="2026">2026</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div id="card_type" style="margin-left: 129px">
                                        <img src="https://static.webyog.com/images/card-icons2.png" alt="Cards" class="img-topspace">
                                    </div>
                                    <div class="card-error hide" style="background: #fe4210;color: white;padding: 5px;"></div>
                                </div>
                            </div>

                            <div class="BILLFormBox" style="width: 96.5%">
                                <div class="formCardTitleBilling">Thông tin của bạn</div>
                                <% ARCustomersController objARCustomersController = new ARCustomersController();
                                    ARCustomersInfo objARCustomersInfo = objARCustomersController.GetObjectByID(id);
                                %>
                                <div style="margin-top: 20px;">
                                    <div class="wy-inline-block" style="width: 49%;">
                                        <div style="margin-bottom: 10px">
                                            <div class="full-width">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Họ tên:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerName()%>" id="purchase_email" class="inputBill" style="width:402px;" readonly="">
                                                </div>
                                            </div>
                                        </div>
                                        <div style="margin-bottom: 10px">
                                            <div class="full-width">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Email:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerEmail()%>" id="purchase_email" class="inputBill" style="width:402px;" readonly="">
                                                </div>
                                            </div>
                                        </div>
                                        <div style="margin-bottom: 10px">
                                            <div class="full-width">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Thành phố:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerContactAddressCity()%>" id="purchase_email" class="inputBill" style="width:402px;" readonly="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class=" wy-inline-block" style="width: 49%;">
                                        <div style="margin-bottom: 10px">
                                            <div class="wy-inline-block">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Phone:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerTel1()%>" id="cname" class="inputBill" style="width:146px;" readonly="">
                                                </div>
                                            </div>
                                            <div class="wy-inline-block" style="padding-left: 42px">
                                                <div class="billLabels wy-inline-block">CMND:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerIDNumber()%>" id="phone_no" class="inputBill" style="width:146px;" readonly="">
                                                </div>
                                            </div>
                                        </div>
                                        <div style="margin-bottom: 10px">
                                            <div class="full-width">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Address:</div>
                                                <div class="wy-inline-block">
                                                    <input type="text" value="<%=objARCustomersInfo.getARCustomerContactAddress()%>" id="address_bill" class="inputBill" style="width:390px;" readonly="">
                                                </div>
                                            </div>
                                        </div>                                      

                                        <div style="margin-bottom: 10px">
                                            <div class="wy-inline-block">
                                                <div class="billLabels wy-inline-block" style="width: 80px;">Quốc gia:</div>
                                                <div class="wy-inline-block">
                                                    <input value="<%=objARCustomersInfo.getARCustomerContactAddressCountry()%>" type="text" id="cname" class="inputBill" style="width:146px;" readonly="">
                                                </div>
                                            </div>
                                            <div class="wy-inline-block" style="padding-left: 42px">
                                                <button style="color: #000;background-color: #6ea426;height: 5%;width: 165%"><a href="/customer">Chỉnh sửa thông tin</a></button>                                               
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="bill-error hide" style="background: #fe4210;color: white;padding: 5px;"></div>
                            </div>                
                            <div style="text-align:center; padding:40px 0px 20px 0px;">
                                <a <% if (id != 0) {%>  href="/submit?idcus=<%=id%>" <%} else {%> href="" <%}%> id="paybutton" class="inSubmitBTN-new" >Submit Order</a>
                            </div>                            
                        </div>


                    </div>

                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <%@include file="/Public/footer.jsp" %>
    </body>
</html>

