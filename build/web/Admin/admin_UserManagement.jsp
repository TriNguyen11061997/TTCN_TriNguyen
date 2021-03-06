<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="../Assets/css/appointment_style.css" rel="stylesheet" type="text/css"/>
        <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700" rel="stylesheet">
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <div>
                    <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">QUẢN LÝ TÀI KHOẢN</h2>
                </div> 
                <br>
                <form action="/Admin_UserAdd" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-6">                                                    
                            <select style="width: 49%" name="FK_HREmployeeID">    
                                <option>--Nhân viên--</option>
                                <c:forEach var="employee" items="${listEmployee}">
                                    <option value="${employee.HREmployeeID}">${employee.HREmployeeNo}  ${employee.HREmployeeName}</option>
                                </c:forEach>
                            </select>
                            <input style="width: 49%;float: right" name="ADUserName" type="text" class="form-control" id="inputPassword4" placeholder="UserName">

                        </div>
                        <div class="form-group col-md-6">                                                    
                            <input style="width: 49%;float: left" name="ADPassword" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                            <select style="width: 49%;float: right" name="FK_ADUserGroupID">
                                <option value="1">Quản lý</option>
                                <option value="2" selected="">Nhân viên</option>                              
                            </select>
                            <input style="float: right;width: 100%" type="submit" class="form-control"  id="inputPassword4" value="SUBMIT" class="btn btn-primary">
                        </div>

                    </div> 

                </form>
                <br>
                <div style="float:left;">
                    <form action="/Admin_Revenue_Servlet" method="get">
                        <table>
                            <tr>
                                <th>
                                    <select name="month">                                      
                                        <option value="0" selected="selected">--Tháng--</option>
                                        <option value="1">Tháng 1</option>
                                        <option value="2">Tháng 2</option>
                                        <option value="3">Tháng 3</option>
                                        <option value="4">Tháng 4</option>
                                        <option value="5">Tháng 5</option>
                                        <option value="6">Tháng 6</option>
                                        <option value="7">Tháng 7</option>
                                        <option value="8">Tháng 8</option>
                                        <option value="9">Tháng 9</option>
                                        <option value="10">Tháng 10</option>
                                        <option value="11">Tháng 11</option>
                                        <option value="12">Tháng 12</option>
                                    </select>
                                <th>
                                    <select name="year">
                                        <option value="0" selected="selected">--Năm--</option>
                                        <option value="2009">2009</option>
                                        <option value="2010">2010</option>
                                        <option value="2011">2011</option>
                                        <option value="2012">2012</option>
                                        <option value="2013">2013</option>
                                        <option value="2014">2014</option>
                                        <option value="2015">2015</option>
                                        <option value="2016">2016</option>
                                        <option value="2017">2017</option>
                                        <option value="2018">2018</option>
                                        <option value="2019">2019</option>
                                    </select>
                                </th>
                                </th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                            </tr>
                        </table>
                    </form>
                </div>

                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">Mã</th>
                        <th style="color:white">Họ và tên</th>
                        <th style="color:white">UserName</th>
                        <th style="color:white">Nhóm</th>         
                    </tr>
                    <c:forEach var="user" items = "${listUser}">                     
                        <tr>
                            <td style="color:black">${user.ma}</td>
                            <td style="color:black">${user.ten}</td>
                            <td style="color:black">${user.ADUserName}</td> 
                            <td style="color:black">${user.userGroup}</td> 
                        </tr>
                    </c:forEach>                   
                </table>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>

