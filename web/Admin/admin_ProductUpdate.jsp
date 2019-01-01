<%-- 
    Document   : admin_ProductUpdate
    Created on : Dec 31, 2018, 2:45:58 PM
    Author     : PC
--%>


<%@page import="Info.ICProductsInfo"%>
<%@page import="Controller.GeNumberingsController"%>
<%@page import="Info.HREmployeesInfo"%>
<%@page import="Controller.HREmployeesController"%>
<%@page import="Info.ARSaleOrdersInfo"%>
<%@page import="Util.Constants"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>   
    <head>
        <title>Smart phone store</title>
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
            <%@include file="/Admin/header.jsp" %>

            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">CHỈNH SỬA SẢN PHẨM</h2>               
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Admin_ProductUpdate_Servlet" method="post" >
                            
                            <p style="color: red">${ProductUpdate}</p>
                                     <%
                                        ICProductsInfo iCProductsInfo = (ICProductsInfo)request.getAttribute("iCProductsInfo");
                                    %>
                                    <input id="name"  class="form-control" name="ICProductID" value="<%=iCProductsInfo.getICProductID() %>" type="hidden">
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
      
                                    <label class="control-label locked" for="name-input-field">Mã sản phẩm</label>
                                    <input id="name" name="ICProductNo"  class="form-control" value="<%=iCProductsInfo.getICProductNo() %>" type="text" required="true" readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Tên sản phẩm</label>
                                    <input id="name" name="ICProductName"  class="form-control" value="<%=iCProductsInfo.getICProductName()%>" type="text"  required="true">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="name-input-field">Ngày nhập</label>
                                    <input id="name" name="ICProductDate"  class="form-control" value="<%=iCProductsInfo.getICProductDate()%>" type="date"  required="true">                                                  
                                </div>  
                            </div><br> <br> <br>     
                            <div class='form-group locked'>                                                          
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">Giá nhập về</label>
                                    <input id="name" name="ICProductSupplierPrice" class="form-control" value="<%=iCProductsInfo.getICProductSupplierPrice()%>" type="text" required="true">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Giá bán ra</label>
                                    <input id="name" name="ICProductPrice"  class="form-control" value="<%=iCProductsInfo.getICProductPrice()%>" type="text" required="true" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">Video sản phẩm</label>
                                    <input id="email" name="ICProductVideo"  type="text" value="<%=iCProductsInfo.getICProductVideo()%>"  class="form-control" >
                                </div>
                            </div> 
                            <br> <br> <br>                          
                            



                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Ghi chú</label>
                                    <textarea name="ICProductDesc" id="desc" cols="0" rows="3" value="<%=iCProductsInfo.getICProductDesc()%>" class="form-control"><%=iCProductsInfo.getICProductDesc()%></textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Nhân viên</label>
                                    <%HREmployeesController objController = new HREmployeesController();
                                        HREmployeesInfo objEmployeesInfo = objController.GetObjectByID(Integer.parseInt(session.getAttribute("HREmployeeID").toString()));
                                    %>
                                    <input id="email" name="FK_HREmployeeID"value="<%= objEmployeesInfo.getHREmployeeName()%>" type="text" placeholder="" class="form-control" required="" readonly="">
                                </div>
                                <input id="right" type="submit" value="Cập nhập" class="form-control locked" style="background-color: #17a2b8">
                            </div>

                        </form>
                    </div>
                </div> 
            </div>
        </div>

        <%@include file="/Admin/footer.jsp" %>
    </body>
</html>