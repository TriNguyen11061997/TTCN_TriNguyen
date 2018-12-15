<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
            </div>
            <%
                if(request.getAttribute("listsearch")==null){
            %>
            <div class="main">
                <div class="content">
                    <div class="content_top">
                        <div class="heading">
                            <h3>Feature Products</h3>
                        </div>
                        <%if(request.getAttribute("current_page")!=null&&request.getAttribute("sumpage")!=null){%>
                        <div class="page-no">
                            <p>Result Pages:<ul>
                                <%	
                                    int current_page = (Integer) request.getAttribute("current_page");
                                    String active = "";
                                    int sumpage = (Integer)request.getAttribute("sumpage");%>
                                    <% 
                                    for(int j=1;j<=sumpage;j++){
                                            if(current_page == j){
                                                active = "class = 'active'";
                                            }else{
                                                active = "";
                                            }

                                                   
                                    %>
                                <li <%=active %> ><a href="<%=request.getContextPath()%>/index?page=<%=j%>"><%=j%></a></li>
                                <%}%>
                                
                                <li <%if(current_page==sumpage){ %> class="disabled" <%} %>>[<a href="<%=request.getContextPath() %>/index?page=<%=current_page+1%>"> Next>>></a >]</li>
                            </ul></p>
                        </div>
                        <%}%>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <%
                            if(request.getAttribute("listPro")!=null){
                                ArrayList<ICProductsInfo> list = (ArrayList<ICProductsInfo>)request.getAttribute("listPro");
                            for (ICProductsInfo item : list) {
                        %>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="/preview?id=<%=item.getICProductID()%>"><img src="Images/<%=item.getICProductPicture1()%>" alt="" /></a>
                            <h2><%=item.getICProductDesc()%> </h2>
                            <p><%=item.getICProductName()%></p>
                            <p><span class="strike">$528.22</span><span class="price">$<%=item.getICProductSupplierPrice()%></span></p>
                            <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a href="/cart_add?id=<%=item.getICProductID()%>" class="cart-button">Giỏ hàng</a></span> </div>
                            <div class="button"><span><a href="/preview?id=<%=item.getICProductID()%>" class="details">Details</a></span></div>
                        </div>
                        <%}}%>

                    </div>
                    <div class="content_bottom">
                        <div class="heading">
                            <h3>New Products</h3>
                        </div>
                        
                       
                        <%if(request.getAttribute("current_page")!=null&&request.getAttribute("sumpage")!=null){%>
                        <div class="page-no">
                            <p>Result Pages:<ul>
                                <%	
                                    int current_page = (Integer) request.getAttribute("current_page");
                                    String active = "";
                                    int sumpage = (Integer)request.getAttribute("sumpage");%>
                                    <% 
                                    for(int j=1;j<=sumpage;j++){
                                            if(current_page == j){
                                                active = "class = 'active'";
                                            }else{
                                                active = "";
                                            }

                                                   
                                    %>
                                <li <%=active %> ><a href="<%=request.getContextPath()%>/index?page=<%=j%>"><%=j%></a></li>
                                <%}%>
                                
                                <li <%if(current_page==sumpage){ %> class="disabled" <%} %>>[<a href="<%=request.getContextPath() %>/index?page=<%=current_page+1%>"> Next>>></a >]</li>
                            </ul></p>
                        </div>
                        <%}%>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <%
                            if(request.getAttribute("listPro")!=null){
                                ArrayList<ICProductsInfo> list = (ArrayList<ICProductsInfo>)request.getAttribute("listPro");
                            for (ICProductsInfo item2 : list) {
                        %>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview-3.jsp"><img src="Images/<%=item2.getICProductPicture1()%>" alt="" /></a>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
                            <h2><%=item2.getICProductName()%> </h2>
                            <p><span class="strike">$438.99</span><span class="price">$<%=item2.getICProductSupplierPrice()%></span></p>
                            <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a href="/cart_add?id=<%=item2.getICProductID()%>" class="cart-button">Giỏ hàng</a></span> </div>
                            <div class="button"><span><a href="/preview?id=<%=item2.getICProductID()%>" class="details">Details</a></span></div>
                        </div>
                        <%}}%>



                    </div>
                </div>
            </div>
                        <%}else{%>
                        
                        <h3 style="color:red;font-weight: bold;margin-top: 10px;">DANH SÁCH TÌM KIẾM</h3>
                        <div class="section group">
                        <%
                            if(request.getAttribute("listsearch")!=null){
                                ArrayList<ICProductsInfo> list = (ArrayList<ICProductsInfo>)request.getAttribute("listsearch");
                            for (ICProductsInfo item2 : list) {
                        %>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview-3.jsp"><img src="Images/<%=item2.getICProductPicture1()%>" alt="" /></a>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
                            <h2><%=item2.getICProductName()%> </h2>
                            <p><span class="strike"></span><span class="price">$<%=item2.getICProductSupplierPrice()%></span></p>
                            <div class="button"><span><img src="Assets/images/cart.jpg" alt="" /><a href="/cart_add?id=<%=item2.getICProductID()%>" class="cart-button">Giỏ hàng</a></span> </div>
                            <div class="button"><span><a href="/preview?id=<%=item2.getICProductID()%>" class="details">Details</a></span></div>
                        </div>
                        <%}}%>



                    </div>
                        
                        <%}%>
        </div>
        <%@include file="/Public/footer.jsp" %>

