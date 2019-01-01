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
                    <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">DANH SÁCH SẢN PHẨM</h2>
                </div>
                <br>
                <a href="/Admin/admin_ProductAdd.jsp"><button style="float:left;width:auto;" class="btn btn-success"><span class="glyphicon glyphicon-user"></span>Thêm sản phẩm</button></a>
                <div style="float:right">
                    <form action="Admin_ProductGetSearchData" method="post">
                        <table>
                            <tr>
                                <th><input type="text" name="info" /></th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                            </tr>
                        </table>
                    </form>
                </div>
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">Mã sản phẩm</th>
                        <th style="color:white">Tên sản phẩm</th>
                        <th style="color:white">Mô tả</th>
                        <th style="color:white">Giá NCC</th>
                        <th style="color:white">Giá</th>
                        <th style="color:white">Cập nhật chi tiết</th>
                        <th style="color:white">Edit</th>
                        <th style="color:white">Delete</th>
                    </tr>
                    <c:forEach var="product" items = "${listProduct}">                     
                        <tr>
                            <td style="color:black">${product.ICProductNo}</td>
                            <td style="color:black">${product.ICProductName}</td>
                            <td style="color:black">${product.ICProductDesc}</td>
                            <td style="color:black">${product.ICProductSupplierPrice}</td>
                            <td style="color:black">${product.ICProductPrice}</td>
                            <td><a href="/Admin/admin_ProductDetailAdd.jsp?ID=${product.ICProductID}"><button class="btn btn-success" style="height:30p;width: 100%">Cập nhật chi tiết</button></a></td> 
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

