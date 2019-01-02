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
                    <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">DANH SÁCH HÓA ĐƠN</h2>
                </div>
                <div style="float:right">
                    <form action="/Admin_InvoiceGetSearchData" method="post">
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
                        <th style="color:white">Ngày</th>
                        <th style="color:white">Mã sản phẩm</th>
                        <th style="color:white">Tên sản phẩm</th>
                        <th style="color:white">Mã khách hàng</th>
                        <th style="color:white">Tên khách hàng</th>
                        <th style="color:white">Khách hàng bình luân</th>
                        <th style="color:white">Mã nhân viên</th>
                        <th style="color:white">Tên nhân viên</th>
                        <th style="color:white">Nhân viên bình luận</th>                      
                        <th style="color:white">Trả lời</th>
                    </tr>
                    <c:forEach var="cm" items = "${listComment}">                     
                        <tr>
                            <td style="color:black">${cm.ARCustomerCommentDate}</td>
                            <td style="color:black">${cm.product.ICProductNo}</td>                            
                            <td style="color:black">${cm.product.ICProductName}</td>
                            <td style="color:black">${cm.customer.ARCustomerNo}</td>
                            <td style="color:black">${cm.customer.ARCustomerName}</td>
                            <td style="color:black">${cm.ARCustomerCommentDesc}</td>
                            <td style="color:black">${cm.employee.HREmployeeNo}</td>
                            <td style="color:black">${cm.employee.HREmployeeName}</td>
                            <td style="color:black">${cm.employeeComment.HREmployeeCommentDesc}</td>                                           
                            <td><a href="/Employee_CommentLoad?ID=${cm.ARCustomerCommentID}"><button class="btn btn-success" style="heightMaBenhNhan:30px">TRẢ LỜI</button></a></td>             
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>
