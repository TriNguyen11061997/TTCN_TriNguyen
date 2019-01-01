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
                        <% if (request.getAttribute("list") != null) {
                                List<ARSaleOrdersInfo> listOrder = (List<ARSaleOrdersInfo>) request.getAttribute("list");
                                for (ARSaleOrdersInfo obj : listOrder) {
                        %>

                        <div class="order" data-spm-anchor-id="a2o4n.order_list.0.i2.6416705b3ivQJ6">
                            <div class="order-info">
                                <div>
                                    <div class="info-order-left-text">Đơn hàng <a class="link"> #<%=obj.getARSaleOrderNo()%></a></div>
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
                                for (ARSaleOrderItemsInfo item : listItem) {
                            %>
                            <div class="order-item" data-spm-anchor-id="a2o4n.order_list.0.i3.6416705b3ivQJ6">
                                <div class="item-pic" data-spm="detail_image"><a href="https://my.lazada.vn/customer/order/index/?spm=a2o4n.manage_account.header.15.136a705bRQqHpW#"><img src="../Images/<%=item.getPicture()%>"></a></div>
                                <div class="item-main item-main-mini">
                                    <div>
                                        <div class="text title item-title" data-spm="details_title"><%=item.getARSaleOrderItemName()%></div>
                                        <p class="text desc"></p>
                                        <p class="text desc bold"></p>
                                    </div>
                                </div>
                                <div class="item-quantity"><span><span class="text desc info multiply">Qty:</span><span class="text">&nbsp;<%=item.getARSaleOrderItemQty()%></span></span></div>

                                <% if (obj.getARSaleOrderStatus().equals("New") || obj.getARSaleOrderStatus().equals("Confirm")
                                            || obj.getARSaleOrderStatus().equals("Approve")) {%>
                                <div class="item-status item-capsule">
                                    <p class="capsule">Đang xác nhận</p>
                                </div>
                                <div class="item-status item-capsule">
                                    <p class="capsule"><a href="/CanCelSaleOrder?ID=<%=obj.getARSaleOrderID()%>">Hủy đơn hàng</a></p>
                                </div>
                                <%}%>

                                <% if (obj.getARSaleOrderStatus().equals("Complete")) {%>
                                <div class="item-status item-capsule">
                                    <p class="capsule">Đang vận chuyển</p>
                                </div>
                                <div class="item-status item-capsule">
                                    <p class="capsule"><a href="/CanCelSaleOrder?ID=<%=obj.getARSaleOrderID()%>">Hủy đơn hàng</a></p>
                                </div>
                                <%}%>

                                <% if (obj.getARSaleOrderStatus().equals("Delivered")) {%>
                                <div class="item-status item-capsule">
                                    <p class="capsule">Đã giao</p>
                                </div>                              
                                <%}%>

                                <% if (obj.getARSaleOrderStatus().equals("Cancel")) {%>
                                <div class="item-status item-capsule">
                                    <p class="capsule">Đã hủy</p>
                                </div>                              
                                <%}%>

                                <div class="item-info"></div>
                                <div class="clear"></div>
                            </div>
                            <!--ket thuc hien thi list item-->
                            <%}%>
                        </div>
                        <%}
                            }%>
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

