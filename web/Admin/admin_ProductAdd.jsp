<%-- 
    Document   : admin_ProductAdd
    Created on : Dec 29, 2018, 3:51:42 PM
    Author     : PC
--%>

<%@page import="Info.HREmployeesInfo"%>
<%@page import="Controller.HREmployeesController"%>
<%@page import="Info.ARSaleOrdersInfo"%>
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
    </head>
    <body>
        <div class="wrap">
            <%@include file="/Employee/header.jsp" %>
          
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÔNG TIN ĐƠN HÀNG</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_ProductAdd_Servlet" method="post" enctype="multipart/form-data">
                            <input id="name"  class="form-control" type="hidden">
                            <p style="color: red">${ProductAdd}</p>
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" name="ICProductNo"  class="form-control" type="text" required="true">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Tên đơn hàng</label>
                                    <input id="name" name="ICProductName"  class="form-control" type="text"  required="true">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="name-input-field">Ngày nhập</label>
                                    <input id="name" name="ICProductDate"  class="form-control" type="date"  required="true">                                                  
                                </div>  
                            </div><br> <br> <br>     
                            <div class='form-group locked'>                                                          
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">Giá nhập về</label>
                                    <input id="name" name="ICProductSupplierPrice" class="form-control" type="text" required="true">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Giá bán ra</label>
                                    <input id="name" name="ICProductPrice"  class="form-control" type="text" required="true" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">Video sản phẩm</label>
                                    <input id="email" name="ICProductVideo"  type="text"  class="form-control" >
                                </div>
                            </div> 
                            <br> <br> <br>                          
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Ảnh sản phẩm 1</label>
                                    <input id="name" name="ICProductPicture1"  class="form-control" type="file" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Ảnh sản phẩm 2</label>
                                    <input id="name" name="ICProductPicture2"  class="form-control" type="file">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Ảnh sản phẩm 3</label>
                                    <input id="name" name="ICProductPicture3"  class="form-control" type="file">                       
                                </div>  
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Ảnh sản phẩm 4</label>
                                    <input id="name" name="ICProductPicture4"  class="form-control" type="file" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Ảnh sản phẩm 5</label>
                                    <input id="name" name="ICProductPicture5" class="form-control" type="file">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Ảnh sản phẩm 6</label>
                                    <input id="name" name="ICProductPicture6"  class="form-control" type="file">                       
                                </div>                                                                
                            </div>



                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Ghi chú</label>
                                    <textarea name="ICProductDesc" id="desc" cols="0" rows="3" class="form-control">${saleorder.ARSaleOrderDesc}</textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Nhân viên xác nhận</label>
                                    <%HREmployeesController objController = new HREmployeesController();
                                        HREmployeesInfo objEmployeesInfo = objController.GetObjectByID(Integer.parseInt(session.getAttribute("HREmployeeID").toString()));
                                    %>
                                    <input id="email" name="FK_HREmployeeID"value="<%= objEmployeesInfo.getHREmployeeName()%>" type="text" placeholder="" class="form-control" required="" readonly="">
                                </div>
                                <input id="right" type="submit" value="Thêm" class="form-control locked" style="background-color: #17a2b8">
                            </div>

                        </form>
                    </div>
                </div> 
<!--                <table class="table" style="border:1px;">
                    <tr class="tr" style="background-color: #666666">
                        <th style="color:white">Tên sản phẩm</th>
                        <th style="color:white">Mô tả</th>
                        <th style="color:white">Số lượng</th>
                        <th style="color:white">Đơn giá</th>
                        <th style="color:white">Thành tiền</th>
                    </tr>                 
                    <c:forEach var="item" items = "${listSaleOrderItem}">                     
                        <tr>
                            <td style="color:black">${item.ARSaleOrderItemName}</td>
                            <td style="color:black">${item.ARSaleOrderItemDesc}</td>                          
                            <td style="color:black">${item.ARSaleOrderItemQty}</td>
                            <td style="color:black">${item.ARSaleOrderItemUnitCost}</td>
                            <td style="color:black">${item.ARSaleOrderItemTotalAmount}</td>  
                        </tr>
                    </c:forEach>
                </table>-->
            </div>
        </div>

        <%@include file="/Employee/footer.jsp" %>
    </body>
</html>

