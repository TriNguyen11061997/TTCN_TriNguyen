<%@page import="Info.ARCustomersInfo"%>
<%@page import="Info.HREmployeesInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <% ARCustomersInfo Customer = (ARCustomersInfo)request.getAttribute("Customer");%>
    <head>
        <title>Smart phone store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="../Assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="../Assets/css/menu.css" rel="stylesheet" type="text/css" media="all"/>
        <script src="../Assets/js/jquery.min.js"></script>
        <script src="../Assets/js/script.js" type="text/javascript"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="../Assets/css/form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Employee/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÔNG TIN CÁ NHÂN</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Employee_HomeUpdate_Servlet" method="post">
                            <input id="name" name="ARCustomerID" value="${Customer.ARCustomerID}" class="form-control" type="hidden">
                            
                            <div class='form-group'>
                                                             
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Mã khách hàng</label>
                                    <input id="name" name="ARCustomerNo" value= "${Customer.ARCustomerNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Tên khách hàng</label>
                                    <input id="name" name="ARCustomerName" value= "${Customer.ARCustomerName}" class="form-control" type="text" required="">                                  
                                </div>                               
                            </div>
                            

                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="phone-input-field">Giới tính</label>
                                    <select class="form-control locked" name="ARCustomerGender"> 
                                        <%if (Customer.getARCustomerGender() == 0) {%>
                                        <option value="0" selected="selected">Nữ</option>
                                        <option value="1">Nam</option>
                                        <%} else {%>
                                        <option value="0">Nữ</option>
                                        <option value="1" selected="selected">Nam</option>
                                        <%}%>
                                    </select>                                
                                </div>
                                <div class='col-xs-12 form-group'  id="right">
                                    <label class="control-label locked" for="name-input-field">Tình trạng</label>
                                    <select class="form-control locked" name="HREmployeeStatus">
                                        
                                        <option value="Working">Đang đặt hàng</option>
                                        <option value="NotWorking">Chưa đặt hàng</option>
                                       
                                    </select>                                         
                                </div>
                            </div>                           
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="name-input-field">Ngày sinh</label>
                                    <input id="name" value= "${Customer.ARCustomerBirthDay}" name="ARCustomerBirthDay" class="form-control" type="date">                                  
                                </div>
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="ARCustomerTel1" value= "${Customer.ARCustomerTel1}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="ARCustomerEmail" value= "${Customer.ARCustomerEmail}" type="text" placeholder="email@gmail.com" class="form-control" required="">
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Chứng minh nhân dân</label>
                                    <input id="name" name="ARCustomerIDNumber" value= "${Customer.ARCustomerIDNumber}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Số tài khoản</label>
                                    <input id="name" name="ARCustomerCardNumber" value= "${Customer.ARCustomerCardNumber}" class="form-control" type="text" >                                  
                                </div>
                            </div>                                                                           
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Thành phố </label>
                                    <input id="name" name="ARCustomerContactAddressCity" value= "${Customer.ARCustomerContactAddressCity}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Quốc gia</label>
                                    <input id="name" name="ARCustomerContactAddressCountry"value= "${Customer.ARCustomerContactAddressCountry}" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Address</label>
                                    <textarea name="ARCustomerContactAddress" id="address" cols="0" rows="3" class="form-control locked">${Customer.ARCustomerContactAddress}</textarea>
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Mô tả</label>
                                    <textarea name="ARCustomerDesc" id="desc" value= "${Customer.ARCustomerDesc}" cols="0" rows="3" class="form-control locked">${Employee.HREmployeeDesc}</textarea>
                                </div>
                            </div>

                            
                            <input type="submit" value="Cập nhật" class="form-control locked" style="background-color: #17a2b8">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Employee/footer.jsp" %>
    </body>
</html>

