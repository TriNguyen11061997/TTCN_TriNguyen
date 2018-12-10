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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="../Assets/css/form.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">CẬP NHẬT NHÂN VIÊN</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_EmployeeUpdate_Servlet">

                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left1">
                                    <img class="image1" src="../Images/employee_1.jpg" alt=""/>
                                </div>                               
                                <div class='col-xs-12 form-group'  id="right1">
                                    <label class="control-label locked" for="name-input-field">Mã nhân viên</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right1">
                                    <label class="control-label locked" for="name-input-field">Tên nhân viên</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>                               
                            </div>
                            <br><br><br><br><br><br><br>

                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="phone-input-field">Giới tính</label>
                                    <select class="form-control locked">
                                        <option>Nam</option>
                                        <option>Nữ</option>
                                        <option>Giới tính khác</option>
                                    </select>                                
                                </div>
                                <div class='col-xs-12 form-group'  id="right">
                                    <label class="control-label locked" for="name-input-field">Tình trạng</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                            </div>                           
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="name-input-field">Ngày sinh</label>
                                    <input id="name" name="name" class="form-control" type="date" required="">                                  
                                </div>
                            </div>
                            <div class='form-group'>                              
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="name-input-field">Số điện thoại</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Chứng minh nhân dân</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Số tài khoản</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="email-input-field">Email</label>
                                    <input id="email" name="email" type="text" placeholder="email@email.com" class="form-control locked" required="">
                                </div>
                            </div>                                                     
                            <div class='form-group'>
                                <div class='col-xs-12 form-group'  id="left">
                                    <label class="control-label locked" for="name-input-field">Thành phố </label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="name-input-field">Quốc gia</label>
                                    <input id="name" name="name" class="form-control" type="text" required="">                                  
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Address</label>
                                    <textarea name="address" id="address" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group'>
                                    <label class="control-label locked" for="desc-input-field">Mô tả</label>
                                    <textarea name="desc" id="desc" cols="0" rows="3" class="form-control locked"></textarea>
                                </div>
                            </div>
                            <input type="submit" value="Submit" class="form-control locked" style="background-color: #17a2b8">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>

