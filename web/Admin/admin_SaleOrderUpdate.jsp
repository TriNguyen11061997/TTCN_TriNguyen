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
        <style>
            .form-card {
                width: 100%;
                display: inline-block;             
                margin-bottom: 2%;
            }
            #left3{
                width: 33%;
                float: left;
            }
            #left4{
                width: 33%;
                float: left;
                margin-left: 0.5%;
            }
            #none{
                width: 33%;
                float: none;
            }
            #right3{
                width: 33%;
                float: right;
            }
        </style>

    </head>
    <body>
        <div class="wrap">
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÔNG TIN ĐƠN HÀNG</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_EmployeeUpdate_Servlet" method="post">
                            <input id="name" name="HREmployeeID" value="${Employee.HREmployeeID}" class="form-control" type="hidden">
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" name="HREmployeeNo" value= "${Employee.HREmployeeNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Ngày chứng từ</label>
                                    <input id="name" name="HREmployeeName" value= "${Employee.HREmployeeName}" class="form-control" type="date" required="">                                  
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
                            </div>
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group' id="none">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" name="HREmployeeNo" value= "${Employee.HREmployeeNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">Ngày chứng từ</label>
                                    <input id="name" name="HREmployeeName" value= "${Employee.HREmployeeName}" class="form-control" type="date" required="">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="">
                                    <label class="control-label locked" for="name-input-field">Tình trạng</label>
                                    <select class="form-control locked" name="HREmployeeStatus">
                                        <option value="Working">Đang làm việc</option>
                                        <option value="NotWorking">Ngưng làm việc</option>
                                    </select>                                         
                                </div>
                            </div>                    
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="name-input-field">Ngày sinh</label>
                                    <input id="name" value= "${Employee.HREmployeeBirthDay}" name="HREmployeeBirthDay" class="form-control" type="date" required="">                                  
                                </div>
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="HREmployeeTel1" value= "${Employee.HREmployeeTel1}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="HREmployeeEmail" value= "${Employee.HREmployeeEmail}" type="text" placeholder="email@gmail.com" class="form-control" required="">
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Chứng minh nhân dân</label>
                                    <input id="name" name="HREmployeeIDNumber" value= "${Employee.HREmployeeIDNumber}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Số tài khoản</label>
                                    <input id="name" name="HREmployeeCardNumber" value= "${Employee.HREmployeeCardNumber}" class="form-control" type="text" required="">                                  
                                </div>
                            </div>                                                                           
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Thành phố </label>
                                    <input id="name" name="HREmployeeContactAddressCity" value= "${Employee.HREmployeeContactAddressCity}" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Quốc gia</label>
                                    <input id="name" name="HREmployeeContactAddressCountry"value= "${Employee.HREmployeeContactAddressCountry}" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Address</label>
                                    <textarea name="HREmployeeContactAddress" id="address"value= "${Employee.HREmployeeContactAddress}" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Mô tả</label>
                                    <textarea name="HREmployeeDesc" id="desc" value= "${Employee.HREmployeeDesc}" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>

                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="name-input-field">Ngày bắt đầu làm việc</label>
                                    <input id="name" name="HREmployeeStartWorkingDate" value= "${Employee.HREmployeeStartWorkingDate}" class="form-control" type="date" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Ngày kết thúc làm việc</label>
                                    <input id="email" name="HREmployeeEndWorkingDate" value= "${Employee.HREmployeeEndWorkingDate}" type="date"  class="form-control locked" readonly="">
                                </div>
                            </div>
                            <input type="submit" value="Cập nhật" class="form-control locked" style="background-color: #17a2b8">
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

