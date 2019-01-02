<%-- 
    Document   : admin_ProductDetailAdd
    Created on : Dec 30, 2018, 8:24:34 PM
    Author     : PC
--%>

<%@page import="Controller.ICProductDetailsController"%>
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
        <script src="<%=request.getContextPath()%>/Libraries/ckeditor/ckeditor.js" type="text/javascript"></script>
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
                        //ICProductController iCProductController = new ICProductController();
                        //ICProductsInfo iCProductsInfo = iCProductController.GetObjectByID(Integer.parseInt(request.getParameter("ID")));
                        ICProductsInfo iCProductsInfo = (ICProductsInfo)request.getAttribute("iCProductsInfo");
                        
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
                                        <%if("Có".equals(iCProductsInfo.getiCProductDetailsInfo().getICProductDetail3G())){  %>
                                        <option selected="selected" value="Có">Có</option>
                                        <option value="Không">Không</option>
                                        <%}else if("Không".equals(iCProductsInfo.getiCProductDetailsInfo().getICProductDetail3G())){%>
                                        <option  value="Có">Có</option>
                                        <option selected="selected" value="Không">Không</option>
                                        <%}else{%>
                                        <option value="">---Mời chọn---</option>
                                        <option  value="Có">Có</option>
                                        <option value="Không">Không</option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">4G</label>
                                    <select class="form-control" name="ICProductDetail4G">
                                        <%if("Có".equals(iCProductsInfo.getiCProductDetailsInfo().getICProductDetail4G())){  %>
                                        <option selected="selected" value="Có">Có</option>
                                        <option value="Không">Không</option>
                                        <%}else if("Không".equals(iCProductsInfo.getiCProductDetailsInfo().getICProductDetail4G())){%>
                                        <option  value="Có">Có</option>
                                        <option selected="selected" value="Không">Không</option>
                                        <%}else{%>
                                        <option value="">---Mời chọn---</option>
                                        <option  value="Có">Có</option>
                                        <option value="Không">Không</option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="email-input-field">SIM</label>
                                    <input id="email" name="ICProductDetailSIM"  value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailSIM()%>" type="text"  class="form-control" >
                                </div>
                            </div> 
                                    
                            <br> <br> <br>                          
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Kích thước</label>
                                    <input id="name" name="ICProductDetailKichThuoc" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailKichThuoc()%>"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Màu sắc</label>
                                    <input id="name" name="ICProductDetailMauSac" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailMauSac()%>" class="form-control" type="text">                                  
                                </div>    
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Trọng lượng</label>
                                    <input id="name" name="ICProductDetailTrongLuong" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailTrongLuong()%>" class="form-control" type="text">                       
                                </div>  
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Loại</label>
                                    <input id="name" name="ICProductDetailLoai" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailLoai()%>" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Màn hình</label>
                                    <input id="name" name="ICProductDetailManHinh" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailManHinh()%>" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Hệ điều hành</label>
                                    <input id="name" name="ICProductDetailHeDieuHanh" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailHeDieuHanh()%>"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">RAM</label>
                                    <input id="name" name="ICProductDetailRAM" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailRAM()%>"  class="form-control" type="text">                       
                                </div>
                                 <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Jack</label>
                                    <input id="name" name="ICProductDetailJack" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailJack()%>"  class="form-control" type="text">                       
                                </div> 
                                
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Bluetooth</label>
                                    <input id="name" name="ICProductDetailBluetooth" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailBluetooth()%>" class="form-control" type="text">                       
                                </div>                                                                
                            </div>

                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">GPS</label>
                                    <input id="name" name="ICProductDetailGPS" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailGPS()%>" class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">PIN</label>
                                    <input id="name" name="ICProductDetailPin" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailPin()%>" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">WLAN</label>
                                    <input id="name" name="ICProductDetailWLAN" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailWLAN()%>"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">Camera chính</label>
                                    <input id="name" name="ICProductDetailCameraChinh" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailCameraChinh()%>"  class="form-control" type="text" >                                  
                                </div>
                                <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Camera phụ</label>
                                    <input id="name" name="ICProductDetailCamaraPhu" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailCamaraPhu()%>" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Quay phim</label>
                                    <input id="name" name="ICProductDetailQuayPhim"  value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailQuayPhim()%>" class="form-control" type="text">                       
                                </div>                                                                
                            </div>
                            
                            <div class='form-group'>                                                          
                                <div class='col-xs-12 form-group'  id="left3">
                                    <label class="control-label locked" for="name-input-field">CPU</label>
                                    <input id="name" name="ICProductDetailCPU" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailCPU()%>"  class="form-control" type="text" >                                  
                                </div>
                               <div class='col-xs-12 form-group' id="left4">
                                    <label class="control-label locked" for="name-input-field">Bộ nhớ trong</label>
                                    <input id="name" name="ICProductDetailBoNhoTrong" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailBoNhoTrong()%>" class="form-control" type="text">                                  
                                </div> 
                                <div class='col-xs-12 form-group' id="right3">
                                    <label class="control-label locked" for="phone-input-field">Bảo hành</label>
                                    <input id="name" name="ICProductDetailBaoHanh" value="<%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailBaoHanh()%>"  class="form-control" type="text">                       
                                </div>                                                                
                            </div>

                            <div class="form-group locked">
                                <div class='col-xs-12 form-group' id="left">
                                    <label class="control-label locked" for="desc-input-field">Chi tiết</label>
                                    <textarea name="ICProductDetailDesc" id="editor"  cols="0" rows="3" class="form-control"><%=iCProductsInfo.getiCProductDetailsInfo().getICProductDetailDesc()%></textarea>
                                </div>
                                <div class='col-xs-12 form-group' id="right">
                                    <label class="control-label locked" for="email-input-field">Nhân viên xác nhận</label>
                                    <%HREmployeesController objController = new HREmployeesController();
                                        HREmployeesInfo objEmployeesInfo = objController.GetObjectByID(Integer.parseInt(session.getAttribute("HREmployeeID").toString()));
                                    %>
                                    <input id="email" name="FK_HREmployeeID"value="<%= objEmployeesInfo.getHREmployeeName()%>" type="text" placeholder="" class="form-control" required="" readonly="">
                                </div>
                                <input id="right" type="submit" value="Cập nhật" class="form-control locked" style="background-color: #17a2b8">
                            </div>

                        </form>
                                <script>
                                    CKEDITOR.replace('editor');
                                </script>
                    </div>
                </div> 

            </div>
        </div>

        <%@include file="/Employee/footer.jsp" %>
    </body>
</html>
