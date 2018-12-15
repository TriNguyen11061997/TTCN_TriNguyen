<%@page import="Info.HREmployeesInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
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
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">CẬP NHẬT THÔNG TIN NHÂN VIÊN</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_EmployeeUpdate_Servlet" method="post">
                            <input id="name" name="HREmployeeID" value="${Employee.HREmployeeID}" class="form-control" type="hidden">
                            <input id="name" name="HREmployeePicture" value="${Employee.HREmployeePicture}" class="form-control" type="hidden">
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left1">
                                    <img class="image1" src="../Images/${Employee.HREmployeePicture}" alt=""/>
                                </div>                               
                                <div class='col-xs-12 form-group'  id="right1">
                                    <label class="control-label locked" for="name-input-field">Mã nhân viên</label>
                                    <input id="name" name="HREmployeeNo" value= "${Employee.HREmployeeNo}" class="form-control" type="text" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right1">
                                    <label class="control-label locked" for="name-input-field">Tên nhân viên</label>
                                    <input id="name" name="HREmployeeName" value= "${Employee.HREmployeeName}" class="form-control" type="text" required="">                                  
                                </div>                               
                            </div>
                            <br><br><br><br><br><br><br>

                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="phone-input-field">Giới tính</label>
                                    <select class="form-control locked" name="HREmployeeGender"> 
                                        <%
                                            HREmployeesInfo objEmployeesInfo = (HREmployeesInfo) request.getAttribute("Employee");
                                            if (objEmployeesInfo.getHREmployeeGender() == 0) {%>
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
                                    <textarea name="HREmployeeContactAddress" id="address"value= "${Employee.HREmployeeContactAddress}" cols="0" rows="3" class="form-control locked">${Employee.HREmployeeContactAddress}</textarea>
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Mô tả</label>
                                    <textarea name="HREmployeeDesc" id="desc" value= "${Employee.HREmployeeDesc}" cols="0" rows="3" class="form-control locked">${Employee.HREmployeeDesc}</textarea>
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
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>

