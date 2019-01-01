<%@page import="java.util.ArrayList"%>
<%@page import="Info.ARCartsInfo"%>
<%@page import="Controller.ARCartsController"%>

<!DOCTYPE HTML>
<!--header-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
<%  ICProductController ProductDAO = new ICProductController();
    List<ICProductsInfo> listPro = ProductDAO.getListProduct();
%>
<div class="header_bottom">
    <div class="header_bottom_left">
        <div class="section group">
            <%   int i = 1;
                for (ICProductsInfo item1 : listPro) {
                    if (i == 3) {
                        break;
                    }
            %>
            <div class="listview_1_of_2 images_1_of_2">
                <div class="listimg listimg_2_of_1">
                    <a href="/preview?id=<%=item1.getICProductID()%>"> <img src="Images/<%=item1.getICProductPicture1()%>" alt="" /></a>
                </div>
                <div class="text list_2_of_1">
                    <h2><%=item1.getICProductName()%></h2>
                    <p><%=item1.getICProductDesc()%></p>
                    <div class="button"><span><a <%if (session.getAttribute("HREmployeeID") != null) { %> 
                                <% int ID = 0;
                                    ID = (Integer) session.getAttribute("HREmployeeID");
                                %>
                                href="/cart_add?id=<%=item1.getICProductID()%>&idcus=<%=ID%>"<%} else {%> href="/Login_Servlet" <%}%> class="cart-button">Giỏ hàng</a></span></div>
                </div>
            </div>
            <%i++;
                }%>
        </div>

        <div class="section group">
            <div class="listview_1_of_2 images_1_of_2">
                <div class="listimg listimg_2_of_1">
                    <a href="preview-3.jsp"> <img src="Assets/images/pic3.jpg" alt="" /></a>
                </div>
                <div class="text list_2_of_1">
                    <h2>Acer</h2>
                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
                    <div class="button"><span><a href="preview.jsp">Giỏ hàng</a></span></div>
                </div>
            </div>			
            <div class="listview_1_of_2 images_1_of_2">
                <div class="listimg listimg_2_of_1">
                    <a href="preview.jsp"><img src="Assets/images/pic1.png" alt="" /></a>
                </div>
                <div class="text list_2_of_1">
                    <h2>Canon</h2>
                    <p>Lorem ipsum dolor sit amet, sed do eiusmod.</p>
                    <div class="button"><span><a href="preview.jsp">Giỏ hàng</a></span></div>
                </div>
            </div>
        </div>
        <div class="clear"></div>
    </div>

    <div class="header_bottom_right_images">
        <!-- FlexSlider -->
        <section class="slider">
            <div class="flexslider">
                <ul class="slides">
                    <li><img src="Assets/images/1.jpg" alt=""/></li>
                    <li><img src="Assets/images/2.jpg" alt=""/></li>
                    <li><img src="Assets/images/3.jpg" alt=""/></li>
                    <li><img src="Assets/images/4.jpg" alt=""/></li>
                </ul>
            </div>
        </section>
        <!-- FlexSlider -->
    </div>
    <div class="clear"></div>
</div>	
<div class="main">
    <div class="content">
        <div class="content_top">
            <div class="heading">
                <h3>Feature Products</h3>
            </div>
            <div class="clear"></div>
        </div>
        <div class="section group">
            <%
                ArrayList<ICProductsInfo> listPro1 = ProductDAO.getItemPagination();
                if (listPro1 != null) {
                    for (ICProductsInfo item : listPro1) {
            %>
            <div class="grid_1_of_4 images_1_of_4">
                <a href="/preview?id=<%=item.getICProductID()%>"><img style="width:266px;height:300px;" src="Images/<%=item.getICProductPicture1()%>" alt="" /></a>

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
        <div class="content_bottom">
            <div class="heading">
                <h3>New Products</h3>
            </div>
            <div class="clear"></div>
        </div>
        <div class="section group">
            <%
                if (listPro1 != null) {
                    ArrayList<ICProductsInfo> list = (ArrayList<ICProductsInfo>) request.getAttribute("listPro");
                    for (ICProductsInfo item2 : listPro1) {
            %>
            <div class="grid_1_of_4 images_1_of_4">
                <a href="preview-3.jsp"><img style="width:266px;height:300px;" src="Images/<%=item2.getICProductPicture1()%>" alt="" /></a>
                <div class="discount">
                    <span class="percentage">40%</span>
                </div>
                <h2><%=item2.getICProductName()%> </h2>
                <p><span class="strike"></span><span class="price"><%=item2.getICProductPrice()%>VNĐ</span></p>
                <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a <%if (session.getAttribute("HREmployeeID") != null) { %> 
                            <% int ID = 0;
                                ID = (Integer) session.getAttribute("HREmployeeID");
                            %>
                            href="/cart_add?id=<%=item2.getICProductID()%>&idcus=<%=ID%>"<%} else {%> href="/Login_Servlet" <%}%> class="cart-button">Giỏ hàng</a></span> </div>
                <div class="button"><span><a href="/preview?id=<%=item2.getICProductID()%>" class="details">Details</a></span></div>
            </div>
            <%}
                }%>
        </div>
    </div>
</div>    
<%@include file="/Public/footer.jsp" %>
