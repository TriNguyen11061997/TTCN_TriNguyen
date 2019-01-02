<%@page import="java.util.ArrayList"%>
<%@page import="Info.ARCartsInfo"%>
<%@page import="Controller.ARCartsController"%>

<!DOCTYPE HTML>
<!--header-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
<%  ICProductController objCProductController = new ICProductController();
%>
<div class="main">
    <div class="content">
        <div class="content_top">
            <div class="clear"></div>
        </div>
        <div class="section group">
            <%
                List<ICProductsInfo> listProductsInfos = (List<ICProductsInfo>) request.getAttribute("listProduct");
                if (listProductsInfos != null) {
                    for (ICProductsInfo item : listProductsInfos) {
            %>
            <div class="grid_1_of_4 images_1_of_4" style="margin: 1% 1% 1% 0%;width: 21%;">
                <a href="/preview?id=<%=item.getICProductID()%>"><img style="height:100px;" src="../Images/<%=item.getICProductPicture1()%>" alt="" /></a>
                <p><%=item.getICProductName()%></p>
                <p><span class="strike"></span><span class="price"><%=item.getICProductPrice()%> VNĐ</span></p>
                <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a <%if (session.getAttribute("HREmployeeID") != null) { %> 
                            <% int ID = 0;
                                ID = (Integer) session.getAttribute("HREmployeeID");
                            %>
                            href="/cart_add?id=<%=item.getICProductID()%>&idcus=<%=ID%>"<%} else {%> href="/Login_Servlet" <%}%> class="cart-button">Giỏ hàng</a></span> </div>
                <div class="button"><span><a href="/preview?id=<%=item.getICProductID()%>" class="details">Details</a></span></div>
            </div>
            <%}
                }%>
        </div>

    </div>
</div>    
<%@include file="/Public/footer.jsp" %>
