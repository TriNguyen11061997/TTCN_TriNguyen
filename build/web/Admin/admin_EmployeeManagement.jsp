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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="../Assets/css/appointment_style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Admin/header.jsp" %>
            <div class="main">
                <div>
                    <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">DANH SÁCH NHÂN VIÊN</h2>
                </div>
                <br>
                <a href="/Admin_EmployeeLoadAdd"><button style="float:left;width:auto;" class="btn btn-success"><span class="glyphicon glyphicon-user"></span>Thêm nhân viên</button></a>
                <div style="float:right">
                    <form action="/Admin_EmployeeSort_Servlet" method="post">
                        <table>
                            <tr>
                                <th><input type="text" name="thongtin_search" /></th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                            </tr>
                        </table>
                    </form>
                </div>
                <div style="float:left;margin-left:30px;">
<!--                    <form action="" method="post">
                        <table>
                            <tr>
                                <th>
                                    <select name="thongtin_sort">
                                        <option value="0">Mã khách hàng</option>
                                        <option value="1">Tên khách hàng</option>
                                        <option value="2">Ngày sinh</option>
                                    </select>
                                </th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Sort</button></th>
                            </tr>
                        </table>
                    </form>-->
                </div>
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
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
                    </tr>
                    <c:forEach var="employee" items = "${listEmployees}">                     
                        <tr>
                            <td style="color:black">${employee.HREmployeeNo}</td>
                            <td style="color:black">${employee.HREmployeeName}</td>
                            <td style="color:black">${employee.HREmployeeBirthDay}</td>
                            <td style="color:black">${employee.HREmployeeCardNumber}</td>
                            <td style="color:black">${employee.HREmployeeTel1}</td>
                            <td style="color:black">${employee.HREmployeeContactAddress}</td>
                            <td style="color:black">${employee.HREmployeeContactAddressCity}</td>
                            <td style="color:black">${employee.HREmployeeStatus}</td>

                            <td><a href="/Admin_EmployeeLoadUpdate_Servlet?ID=${employee.HREmployeeID}"><button type="button" class="update btn btn-warning btn-sm"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
                            <td><a href="/Admin_EmployeeDelete_Servlet?ID=${employee.HREmployeeID}"><button onclick="myFunction('@i.MaBenhNhan')" type="button" class="delete btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash"></span></button></a></td>

                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>   
    </body>
</html>

