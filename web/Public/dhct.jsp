<%@page import="Controller.ARSaleOrderItemsController"%>
<%@page import="Info.ARSaleOrdersInfo"%>
<%@page import="Info.ARSaleOrderItemsInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
<link href="../Assets/css/index(1).css" rel="stylesheet" type="text/css"/>
<link href="../Assets/css/index(2).css" rel="stylesheet" type="text/css"/>
<div class="main">
    <div class="content">
        <div class="lzd-playground-right" style="margin-left: 55px;">
   <div class="breadcrumb">
      <a class="first " href="https://my.lazada.vn/customer/order/index/">Đơn hàng của tôi</a>
   </div>
   <div id="container" class="container">
      <div class="order-list">
         
         <div class="orders">
             <% if(request.getAttribute("list")!=null){
                 List<ARSaleOrdersInfo> listOrder = (List<ARSaleOrdersInfo>)request.getAttribute("list");
                 for(ARSaleOrdersInfo obj : listOrder){
             %>
             
            <div class="order" data-spm-anchor-id="a2o4n.order_list.0.i2.6416705b3ivQJ6">
               <div class="order-info">
                  <div>
                     <div class="info-order-left-text">Đơn hàng <a class="link"> #<%=obj.getARSaleOrderID()%></a></div>
                     <p class="text info desc">Đặt ngày <%=obj.getARSaleOrderDate()%></p>
                  </div>
                  <a class="pull-left info-order-left"></a><a class="pull-right link manage" style="color: rgb(26, 156, 183);"><%=obj.getARSaleOrderTotalAmount()%> VNĐ</a>
                  <div class="clear"></div>
               </div>
                  
                  <!-- Hien thi list item-->
                  <%
                      ARSaleOrderItemsController orderDAO = new ARSaleOrderItemsController();
                      int idOrder = obj.getARSaleOrderID();
                      List<ARSaleOrderItemsInfo> listItem = orderDAO.GetObjectBySaleOrderID(idOrder);
                      for(ARSaleOrderItemsInfo item : listItem){
                  %>
               <div class="order-item" data-spm-anchor-id="a2o4n.order_list.0.i3.6416705b3ivQJ6">
                  <div class="item-pic" data-spm="detail_image"><a href="https://my.lazada.vn/customer/order/index/?spm=a2o4n.manage_account.header.15.136a705bRQqHpW#"><img src="./Lazada.vn_ Online Shopping Vietnam - Mobiles, Tablets, Home Appliances, TV, Audio &amp; Nhiều hơn_files/kinh-thuc-te-ao-vr-box-the-he-thu-2-den-phoi-trang-6580-5344005-a6849468357bf89fa3d00e44a8dcdccd-catalog.jpg"></a></div>
                  <div class="item-main item-main-mini">
                     <div>
                        <div class="text title item-title" data-spm="details_title"><%=item.getARSaleOrderItemName()%></div>
                        <p class="text desc"></p>
                        <p class="text desc bold"></p>
                     </div>
                  </div>
                  <div class="item-quantity"><span><span class="text desc info multiply">Qty:</span><span class="text">&nbsp;<%=item.getARSaleOrderItemQty()%></span></span></div>
                  <div class="item-status item-capsule">
                     <p class="capsule"><%=obj.getARSaleOrderStatus()%></p>
                  </div>
                  <div class="item-status item-capsule">
                      <p class="capsule"><a href="">Hủy đơn hàng</a></p>
                  </div>
                  <div class="item-info"></div>
                  <div class="clear"></div>
               </div>
                  <!--ket thuc hien thi list item-->
                  <%}%>
            </div>
             <%}}%>
            <div class="order">
               <div class="order-info">
                  <div>
                     <div class="info-order-left-text">Đơn hàng <a class="link"> #314753645</a></div>
                     <p class="text info desc">Đặt ngày 02 thg 10 2017  08:43:06</p>
                  </div>
                  <a class="pull-left info-order-left"></a><a class="pull-right link manage" style="color: rgb(26, 156, 183);">QUẢN LÝ</a>
                  <div class="clear"></div>
               </div>
               <div class="order-item">
                  <div class="item-pic" data-spm="detail_image"><a href="https://my.lazada.vn/customer/order/index/?spm=a2o4n.manage_account.header.15.136a705bRQqHpW#"><img src="./Lazada.vn_ Online Shopping Vietnam - Mobiles, Tablets, Home Appliances, TV, Audio &amp; Nhiều hơn_files/bo-ban-phim-gia-co-va-chuot-chuyen-game-r8-1910-led-7-mau-den-tang-1-mieng-lot-chuot-hang-phan-phoi-chinh-thuc-8621-2246206-.jpg"></a></div>
                  <div class="item-main item-main-mini">
                     <div>
                        <div class="text title item-title" data-spm="details_title">Bộ bàn phím giả cơ và chuột chuyên game R8 1910 Led 7 màu (Đen) +
                           Tặng 1 miếng lót chuột
                        </div>
                        <p class="text desc"></p>
                        <p class="text desc bold"></p>
                     </div>
                  </div>
                  <div class="item-quantity"><span><span class="text desc info multiply">Qty:</span><span class="text">&nbsp;1</span></span></div>
                  <div class="item-status item-capsule">
                     <p class="capsule">Đã giao hàng</p>
                  </div>
                  <div class="item-info">
                     <p class="text delivery-success">Đã giao ngày 04 thg 10 2017</p>
                  </div>
                  <div class="clear"></div>
               </div>
            </div>
           
            
           
           
         </div>
      </div>
   </div>
</div>
        
        
    </div>
</div>
</div>

<%@include file="/Public/footer.jsp" %>
</body>
</html>

