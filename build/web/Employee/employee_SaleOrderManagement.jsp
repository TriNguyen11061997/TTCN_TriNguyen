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
            <%@include file="/Employee/header.jsp" %>
            <div class="main">
                <div>
                    <h2 style="text-align: center;margin-top: 20px; color: ">DANH SÁCH ĐƠN HÀNG</h2>
                </div>
                <div style="float:right">
                    <form action="" method="post">
                        <table>
                            <tr>
                                <th><input type="text" name="thongtin_search" /></th>
                                <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                            </tr>
                        </table>
                    </form>
                </div>
                <div style="float:left;">
                    <form action="" method="post">
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
                    </form>
                </div>
                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">Ngày chứng từ</th>
                        <th style="color:white">Mã đơn hàng</th>
                        <th style="color:white">Khách hàng</th>
                        <th style="color:white">Tên đơn hàng</th>
                        <th style="color:white">Ghi chú</th>
                        <th style="color:white">Nhân viên</th>
                        <th style="color:white">Tình trạng</th>
                        <th style="color:white">Tổng tiền</th>
                        <th style="color:white">Edit</th>
                        <th style="color:white">Delete</th>                       
                    </tr>
                    <c:forEach var="saleOrder" items = "${listSaleOrder}">                     
                        <tr>
                            <td style="color:black">${saleOrder.ARSaleOrderDate}</td>
                            <td style="color:black">${saleOrder.ARSaleOrderNo}</td>
                            <td style="color:black">${saleOrder.customer.ARCustomerName}</td>
                            <td style="color:black">${saleOrder.ARSaleOrderName}</td>
                            <td style="color:black">${saleOrder.ARSaleOrderDesc}</td>
                             <td style="color:black">${saleOrder.employee.HREmployeeName}</td>
                             <td style="color:black">${saleOrder.ARSaleOrderStatus}</td>
                             <td style="color:black">${saleOrder.ARSaleOrderTotalAmount}</td>                         
                            <td><a href="/Employee_SaleOrderLoadUpdate_Servlet?ARSaleOrderID=${saleOrder.ARSaleOrderID}"><button type="button" class="update btn btn-warning btn-sm"><span class="glyphicon glyphicon-pencil"></span></button></a></td>
                            <td><a href=""><button onclick="myFunction('@i.MaBenhNhan')" type="button" class="delete btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash"></span></button></a></td>                          
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
            <%@include file="/Employee/footer.jsp" %>
    </body>
</html>

