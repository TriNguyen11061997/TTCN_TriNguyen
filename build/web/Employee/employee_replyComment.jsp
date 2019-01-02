<%@page import="Info.HREmployeesInfo"%>
<%@page import="Controller.HREmployeesController"%>
<%@page import="Info.ARSaleOrdersInfo"%>
<%@page import="Util.Constants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <%@include file="/Employee/header.jsp" %>
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">TRẢ LỜI BÌNH LUẬN</h2>   
                <br>
                <div class="container">
                    <div class="row">                       
                        <form class="form-card" action="/Employee_CommentReply" method="post">
                            <input id="name" name="ARCustomerCommentID" value="${comment.ARCustomerCommentID}" class="form-control" type="hidden">  
                            <input id="name" name="FK_ICProductID" value="${comment.FK_ICProductID}" class="form-control" type="hidden">
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Ngày</label>
                                    <input id="name" name="ARCustomerCommentDate" value="${comment.ARCustomerCommentDate}" class="form-control" type="text"  readonly="">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Mã sản phẩm</label>
                                    <input id="name" name="ARSaleOrderTaxAmount" value="${comment.product.ICProductNo}" class="form-control" type="text" readonly="">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Tên sản phẩm</label>
                                    <input id="name" name="ARSaleOrderTotalAmount" value="${comment.product.ICProductName}" class="form-control" type="text" readonly="">                       
                                </div>                                                              
                            </div>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Bình luận của khách hàng</label>
                                    <textarea name="ARCustomerCommentDesc" id="desc" cols="0" rows="3" class="form-control">${comment.ARCustomerCommentDesc}</textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Khách hàng</label>
                                    <input id="email" name="HREmployeeName"value="${comment.customer.ARCustomerNo}" type="text" placeholder="" class="form-control" required="" readonly="" >
                                </div>
                                <div class='col-xs-12 form-group' id="right">        
                                    <input id="email" name="HREmployeeName"value="${comment.customer.ARCustomerName}" type="text" placeholder="" class="form-control" required="" readonly="">
                                </div>
                            </div>
                            <br><br> <br><br> <br><br> <br><br><br>
                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Nhân viên trả lời</label>
                                    <textarea name="HREmployeeCommentDesc" id="desc" cols="0" rows="3" class="form-control">${comment.employeeComment.HREmployeeCommentDesc}</textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <%
                                        HREmployeesController objController = new HREmployeesController();
                                        int ID = Integer.parseInt(session.getAttribute("HREmployeeID").toString());
                                        HREmployeesInfo obEmployeesInfo = objController.GetObjectByID(ID);
                                    %>
                                    <label class="control-label locked" for="email-input-field">Nhân viên</label>
                                    <input id="name" name="HREmployeeID" value="<%=obEmployeesInfo.getHREmployeeID()%>" class="form-control" type="hidden">
                                    <input id="email" name="HREmployeeName"value="<%=obEmployeesInfo.getHREmployeeName()%>" type="text" placeholder="" class="form-control" required="" readonly="">
                                </div>
                                <input id="right" type="submit" value="Trả lời" class="form-control locked" style="background-color: #17a2b8">
                            </div>

                        </form>
                    </div>
                </div> 
            </div>
        </div>

        <%@include file="/Employee/footer.jsp" %>
    </body>
</html>

