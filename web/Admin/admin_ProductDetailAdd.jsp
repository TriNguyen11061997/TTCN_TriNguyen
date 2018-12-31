<%-- 
    Document   : admin_ProductDetailAdd
    Created on : Dec 30, 2018, 8:24:34 PM
    Author     : PC
--%>

<%@page import="Info.ICProductsInfo"%>
<%@page import="Controller.ICProductController"%>
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
            <%@include file="/Admin/header.jsp" %>
          
            <div class="main">
                <h2 style="text-align: center;margin-top: 20px; color:darkviolet ">THÊM CHI TIẾT ĐƠN HÀNG</h2>               
                <div class="container">
                    <p style="color: red">${ProductDetailAdd}</p>
                    <div class="row">   
                        <%
                        ICProductController iCProductController = new ICProductController();
                        ICProductsInfo iCProductsInfo = iCProductController.GetObjectByID(Integer.parseInt(request.getParameter("ID")));
                        %>
                        <form class="form-card" action="/Admin_ProductDetailAdd_Servlet" method="post" >
                            <input id="name" name="FK_ICProductID" value="<%=iCProductsInfo.getICProductID()%>" class="form-control" type="hidden">
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Mã đơn hàng</label>
                                    <input id="name" value="<%=iCProductsInfo.getICProductNo()%>"  class="form-control" type="text" readonly="true">                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Tên đơn hàng</label>
                                    <input id="name" value="<%=iCProductsInfo.getICProductName()%>"  class="form-control" type="text"  readonly="true">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="name-input-field">Ngày nhập</label>
                                    <input id="name" value="<%=iCProductsInfo.getICProductDate()%>"  class="form-control" type="date"  readonly="true">                                                  
                                </div>  
                            </div><br> <br> <br>     
                            <div class='form-group locked'>                                                          
                                <div class='col-xs-12 form-group' id="left3">
                                    <label class="control-label locked" for="name-input-field">3G</label>
                                    <select class="form-control" name="ICProductDetail3G">
                                        <option value="Có">Có</option>
                                        <option value="Không">Không</option>
                                    </select>
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">4G</label>
                                    <select class="form-control" name="ICProductDetail4G">
                                        <option value="Có">Có</option>
                                        <option value="Không">Không</option>
                                    </select>
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">SIM</label>
                                    <input id="email" name="ICProductDetailSIM"  type="text"  class="form-control" >
                                </div>
                            </div> 
                            <br> <br> <br>                          
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Kích thước</label>
                                    <input id="name" name="ICProductDetailKichThuoc"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Màu sắc</label>
                                    <input id="name" name="ICProductDetailMauSac"  class="form-control" type="text">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Trọng lượng</label>
                                    <input id="name" name="ICProductDetailTrongLuong"  class="form-control" type="text">                       
                                </div>  
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Loại</label>
                                    <input id="name" name="ICProductDetailLoai"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Màn hình</label>
                                    <input id="name" name="ICProductDetailManHinh" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Hệ điều hành</label>
                                    <input id="name" name="ICProductDetailHeDieuHanh"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Loa ngoài</label>
                                    <select class="form-control" name="ICProductDetailLoaNgoai">
                                        <option value="Có">Có</option>
                                        <option value="Không">Không</option>
                                    </select>
                                </div>
                                 <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Jack 3.5mm</label>
                                    <select class="form-control" name="ICProductDetailJack3dot5mm">
                                        <option value="Có">Có</option>
                                        <option value="Không">Không</option>
                                    </select>
                                </div> 
                                
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Bluetooth</label>
                                    <input id="name" name="ICProductDetailBluetooth"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">GPS</label>
                                    <input id="name" name="ICProductDetailGPS"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">PIN</label>
                                    <input id="name" name="ICProductDetailPin" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">WLAN</label>
                                    <input id="name" name="ICProductDetailWLAN"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Camera chính</label>
                                    <input id="name" name="ICProductDetailCameraChinh"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Camera phụ</label>
                                    <input id="name" name="ICProductDetailCamaraPhu" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Quay phim</label>
                                    <input id="name" name="ICProductDetailQuayPhim"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">CPU</label>
                                    <input id="name" name="ICProductDetailCPU"  class="form-control" type="text" >                                  
                                </div>
                               <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Bộ nhớ trong</label>
                                    <input id="name" name="ICProductDetailBoNhoTrong" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Bảo hành</label>
                                    <input id="name" name="ICProductDetailBaoHanh"  class="form-control" type="text">                       
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

            </div>
        </div>

        <%@include file="/Employee/footer.jsp" %>
    </body>
</html>
