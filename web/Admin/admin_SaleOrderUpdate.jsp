<%@page import="Util.Constants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>   
    <head>
        <<title>Smart phone store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="../Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
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
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÔNG TIN ĐƠN HÀNG</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_EmployeeUpdate_Servlet" method="post">
                            <input id="name" name="ARSaleOrderID" value="${saleorder.ARSaleOrderID}" class="form-control" type="hidden">
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" name="ARSaleOrderNo" value= "${saleorder.ARSaleOrderNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Ngày chứng từ</label>
                                    <input id="name" name="ARSaleOrderDate" value="${saleorder.ARSaleOrderDate}" class="form-control" type="date" required="" readonly="">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Tình trạng</label>
                                    <select class="form-control locked" name="HREmployeeGender"> 
                                        <% int t = 1;
                                            if (t == 1) {
                                        %>
                                        <option value="0">Tạo mới</option>
                                        <option value="1"selected="selected">Xác nhận</option>
                                        <option value="2" selected="selected">Duyệt</option>
                                        <%} else {%>
                                        <option value="0">Tạo mới</option>
                                        <option value="1"selected="selected">Xác nhận</option>
                                        <option value="2" selected="selected">Duyệt</option>
                                        <%}%>
                                    </select>                                
                                </div>  
                            </div><br> <br> <br>     
                            <div class='form-group locked'>                                                          
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">Khách hàng</label>
                                    <input id="name" name="ARCustomerName" value="${saleorder.customer.ARCustomerName}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="ARCustomerTel1" value="${saleorder.customer.ARCustomerTel1}" class="form-control" type="text" required="" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="ARCustomerEmail" value="${saleorder.customer.ARCustomerEmail}" type="text" placeholder="email@gmail.com" class="form-control" required="">
                                </div>
                            </div> 
                            <br> <br> <br>                          
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Địa chỉ</label>
                                    <input id="name" name="ARCustomerContactAddress" value="${saleorder.customer.ARCustomerContactAddress}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Thành phố</label>
                                    <input id="name" name="ARCustomerContactAddressCity" value="${saleorder.customer.ARCustomerContactAddressCity}" class="form-control" type="text">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Quốc gia</label>
                                    <input id="name" name="ARCustomerContactAddressCountry" value="${saleorder.customer.ARCustomerContactAddressCountry}" class="form-control" type="text">                       
                                </div>  
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">% Chiết khấu</label>
                                    <input id="name" name="ARSaleOrderDiscountPerCent" value="${saleorder.ARSaleOrderDiscountPerCent}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">%Thuế</label>
                                    <input id="name" name="ARSaleOrderTaxPercent"value="${saleorder.ARSaleOrderTaxPercent}" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Phí ship</label>
                                    <input id="name" name="ARSaleOrderShippingFees" value="${saleorder.ARSaleOrderShippingFees}" class="form-control" type="text">                       
                                </div>                                                                
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Tiền Chiết khấu</label>
                                    <input id="name" name="ARSaleOrderDiscountAmount" value="${saleorder.ARSaleOrderDiscountAmount}" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Tiền Thuế</label>
                                    <input id="name" name="ARSaleOrderTaxAmount" value="${saleorder.ARSaleOrderTaxAmount}" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Tổng tiền</label>
                                    <input id="name" name="ARSaleOrderTotalAmount" value="${saleorder.ARSaleOrderTotalAmount}" class="form-control" type="text">                       
                                </div>                                                              
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="name-input-field">Phương thức thanh toán</label>
                                    <input id="name" name="ARSaleOrderPaymentMethod" value= "${Employee.ARSaleOrderPaymentMethod}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Trạng thái thanh toán</label>
                                    <input id="email" name="ARSaleOrderPaymentStatus" value="${saleorder.ARSaleOrderPaymentStatus}" type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Ghi chú</label>
                                    <textarea name="ARSaleOrderDesc" id="desc" cols="0" rows="3" class="form-control">${saleorder.ARSaleOrderDesc}</textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Nhân viên</label>
                                    <input id="email" name="HREmployeeName"value="${saleorder.employee.HREmployeeName}" type="text" placeholder="" class="form-control" required="">
                                </div>
                                <input id="right" type="submit" value="Cập nhật" class="form-control locked" style="background-color: #17a2b8">
                            </div>
                        
                        </form>
                    </div>
                </div> 
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">STT</th>
                        <th style="color:white">Mã nhân viên</th>
                        <th style="color:white">Tên nhân viên</th>
                        <th style="color:white">Ngày sinh</th>
                        <th style="color:white">CMND</th>
                        <th style="color:white">Số điện thoại</th>
                        <th style="color:white">Địa chỉ</th>
                        <th style="color:white">Thành phố</th>
                        <th style="color:white">Trạng thái làm việc</th>
                        <th style="color:white">Edit</th>
                        <th style="color:white">Delete</th>
                        <th style="color:white">Xem chi tiết</th>
                    </tr>                 
                    <c:forEach var="employee" items = "${listEmployees}">                     
                        <tr>
                            <td style="color:black">Nhật Trí</td>
                            <td style="color:black">${employee.HREmployeeNo}</td>
                            <td style="color:black">${employee.HREmployeeName}</td>
                            <td style="color:black">${employee.HREmployeeBirthDay}</td>
                            <td style="color:black">${employee.HREmployeeCardNumber}</td>
                            <td style="color:black">${employee.HREmployeeTel1}</td>
                            <td style="color:black">${employee.HREmployeeContactAddress}</td>
                            <td style="color:black">${employee.HREmployeeContactAddressCity}</td>
                            <td style="color:black">${employee.HREmployeeStatus}</td>
                            <td><a href="/CustomerLoadUpdate_Servlet?ID="><button type="button" class="update btn btn-warning btn-sm"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
                            <td><a href=""><button onclick="myFunction('@i.MaBenhNhan')" type="button" class="delete btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash"></span></button></a></td>
                            <td><a href="/QuanLiBenhNhan/LoadChiSoBenhLi?ma=@i.MaBenhNhan"><button class="btn btn-success" style="height:30px">XEM CHI TIẾT</button></a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>

        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>

