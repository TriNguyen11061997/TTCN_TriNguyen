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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="../Assets/css/form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÊM MỚI NHÂN VIÊN</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_EmployeesAdd_Servlet" method="post">

                            <div class='form-group'>                        
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Mã nhân viên</label>
                                    <input id="name" name="HREmployeeNo" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Tên nhân viên</label>
                                    <input id="name" name="HREmployeeName" class="form-control" type="text" required="">                                  
                                </div>                               
                            </div>
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="phone-input-field">Giới tính</label>
                                    <select class="form-control locked" name="HREmployeeGender">
                                        <option value="1">Nam</option>
                                        <option value="0">Nữ</option>
                                        <option value="2">Giới tính khác</option>
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
                                    <input id="name" name="HREmployeeBirthDay" class="form-control" type="date" required="">                                  
                                </div>
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="HREmployeeTel1" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Chứng minh nhân dân</label>
                                    <input id="name" name="HREmployeeIDNumber" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Số tài khoản</label>
                                    <input id="name" name="HREmployeeCardNumber" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="HREmployeeEmail" type="text" placeholder="email@email.com" class="form-control locked" required="">
                                </div>
                            </div>                                                     
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Thành phố </label>
                                    <input id="name" name="HREmployeeContactAddressCity" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Quốc gia</label>
                                    <input id="name" name="HREmployeeContactAddressCountry" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Address</label>
                                    <textarea name="HREmployeeContactAddress" id="address" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Mô tả</label>
                                    <textarea name="HREmployeeDesc" id="desc" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>
                            <input type="submit"  value="Submit" class="form-control locked" style="background-color: #17a2b8">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>

