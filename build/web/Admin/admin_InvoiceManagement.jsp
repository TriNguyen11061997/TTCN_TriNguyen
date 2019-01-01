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
                        <th style="color:white">Ngày chứng từ</th>
                        <th style="color:white">Mã hóa đơn</th>
                        <th style="color:white">Mã đơn hàng</th>
                        <th style="color:white">Khách hàng</th>
                        <th style="color:white">Tên đơn hàng</th>
                        <th style="color:white">Ghi chú</th>
                        <th style="color:white">Nhân viên</th>                      
                        <th style="color:white">Tình trạng</th>   
                        <th style="color:white">Tổng tiền</th>
                        <th style="color:white">Xuất hóa đơn</th>
                    </tr>
                    <c:forEach var="invoice" items = "${listInvoice}">                     
                        <tr>
                            <td style="color:black">${invoice.ARInvoiceDate}</td>
                            <td style="color:black">${invoice.ARInvoiceNo}</td>
                            <td style="color:black">${invoice.saleorder.ARSaleOrderNo}</td>
                            <td style="color:black">${invoice.customer.ARCustomerName}</td>
                            <td style="color:black">${invoice.ARInvoiceName}</td>
                            <td style="color:black">${invoice.ARInvoiceDesc}</td>
                            <td style="color:black">${invoice.employee.HREmployeeName}</td>
                            <td style="color:black">${invoice.ARInvoiceStatus}</td>
                            <td style="color:black">${invoice.ARInvoiceTotalAmount}</td>                                               
                            <td><a href="/Employee_InvoiceExport_Servlet?ID=${invoice.ARInvoiceID}"><button class="btn btn-success" style="heightMaBenhNhan:30px">XUẤT HÓA ĐƠN</button></a></td>             
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>
