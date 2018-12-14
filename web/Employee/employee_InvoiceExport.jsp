<%@page import="Info.ARSaleOrdersInfo"%>
<%@page import="Util.Constants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>   
    <head>
        <<title>Smart phone store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        
        <link href="../Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="../Assets/js/jquery.min.js"></script>
        <script src="../Assets/js/script.js" type="text/javascript"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="../Assets/css/form1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <div class="main">
                <div>
                    <a href="/Admin_Home_Servlet"><img src="../Assets/images/logo.png" alt="" /></a>
                </div>
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">PHIẾU GIAO HÀNG</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_SaleOrderUpdate_Servlet" method="post">
                            <input id="name" name="ARSaleOrderID" value="${saleorder.ARSaleOrderID}" class="form-control" type="hidden">
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" name="ARSaleOrderNo" value= "${saleorder.ARSaleOrderNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Ngày chứng từ</label>
                                    <input id="name" name="ARSaleOrderDate" value="${saleorder.ARSaleOrderDate}" class="form-control" type="date"  readonly="">                                  
                                </div>                                   
                            </div><br> <br> <br>     
                            <div class='form-group locked'>                                                          
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">Khách hàng</label>
                                    <input id="name" name="ARCustomerName" value="${saleorder.customer.ARCustomerName}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="ARCustomerTel1" value="${saleorder.customer.ARCustomerTel1}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="ARCustomerEmail" value="${saleorder.customer.ARCustomerEmail}" type="text" placeholder="email@gmail.com" class="form-control" >
                                </div>
                            </div> 
                            <br> <br> <br>                          
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Địa chỉ</label>
                                    <input id="name" name="ARCustomerContactAddress" value="${saleorder.customer.ARCustomerContactAddress}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Tỉnh,Thành phố</label>
                                    <input id="name" name="ARCustomerContactAddressCity" value="${saleorder.customer.ARCustomerContactAddressCity}" class="form-control" type="text">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Quốc gia</label>
                                    <input id="name" name="ARCustomerContactAddressCountry" value="${saleorder.customer.ARCustomerContactAddressCountry}" class="form-control" type="text">                       
                                </div>  
                            </div>


                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Tiền Chiết khấu</label>
                                    <input id="name" name="ARSaleOrderDiscountAmount" value="${saleorder.ARSaleOrderDiscountAmount}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Phí ship</label>
                                    <input id="name" name="ARSaleOrderTaxAmount" value="${saleorder.ARSaleOrderTaxAmount}" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Tổng tiền</label>
                                    <input id="name" name="ARSaleOrderTotalAmount" value="${saleorder.ARSaleOrderTotalAmount}" class="form-control" type="text" readonly="">                       
                                </div>                                                              
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="name-input-field">Phương thức thanh toán</label>
                                    <select class="form-control locked" name="ARSaleOrderPaymentMethod"> 

                                        <option value="AfterReceipt" selected="selected">Thanh toán sau khi nhận hàng</option>
                                        <option value="PaymentCash" >Thanh toán bằng thẻ tín dụng</option>

                                    </select>                                        
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Trạng thái thanh toán</label>
                                    <select class="form-control locked" name="ARSaleOrderPaymentStatus"> 

                                        <option value="Paid"selected="selected">Đã thanh toán</option>
                                        <option value="Unpaid">Chưa thanh toán</option>


                                    </select>      
                                </div>
                            </div>     
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Ghi chú</label>
                                    <textarea name="ARSaleOrderDesc" id="desc" cols="0" rows="3" class="form-control">${saleorder.ARSaleOrderDesc}</textarea>
                                </div>
                            </div>

                        </form>
                    </div>
                </div> 
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">Tên sản phẩm</th>
                        <th style="color:white">Mô tả</th>
                        <th style="color:white">Số lượng</th>
                        <th style="color:white">Đơn giá</th>
                        <th style="color:white">Thành tiền</th>
                        <th style="color:white">Edit</th>
                        <th style="color:white">Delete</th>
                    </tr>                 
                    <c:forEach var="item" items = "${listSaleOrderItem}">                     
                        <tr>
                            <td style="color:black">${item.ARSaleOrderItemName}</td>
                            <td style="color:black">${item.ARSaleOrderItemDesc}</td>                          
                            <td style="color:black">${item.ARSaleOrderItemQty}</td>
                            <td style="color:black">${item.ARSaleOrderItemUnitCost}</td>
                            <td style="color:black">${item.ARSaleOrderItemTotalAmount}</td>  
                            <td><a href="/CustomerLoadUpdate_Servlet?ID="><button type="button" class="update btn btn-warning btn-sm"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
                            <td><a href=""><button onclick="myFunction('@i.MaBenhNhan')" type="button" class="delete btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash"></span></button></a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <h6 style="float: right;margin-right: 100px;">
                <u>Nhân viên xuất hóa đơn</u>
            </h6>
            <br><br><br><br><br><br><br><br>
        </div>       
    </body>
</html>

