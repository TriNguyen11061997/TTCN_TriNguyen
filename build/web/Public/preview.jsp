<%@page import="Info.ARCustomerCommentsInfo"%>
<%@page import="Info.ICProductDetailsInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
<link href="./Assets/css/main-v2-min.css" rel="stylesheet">
<div class="main">
    <div class="content">
        <div class="section group">
            <div class="cont-desc span_1_of_2" style="width: 98%;">	
                <% if (request.getAttribute("ObjProduct") != null) {
                        ICProductDetailsInfo obj = (ICProductDetailsInfo) request.getAttribute("ObjProduct");

                %>
                <div class="grid images_3_of_2">
                    <img src="Images/<%=obj.getProduct().getICProductPicture1()%>" alt="" />
                </div>

                <div class="desc span_3_of_2">
                    <h2><%=obj.getProduct().getICProductName()%></h2>
                    <p> <%=obj.getProduct().getICProductDesc()%> </p>					
                    <div class="price">
                        <p>Price: <span><%=obj.getProduct().getICProductPrice()%> VNĐ</span></p>
                    </div>
                    <div class="available">
                        <p>Available Options :</p>
                        <ul>
                            <li>Color:
                                <select>
                                    <option>Silver</option>
                                    <option>Black</option>
                                    <option>Dark Black</option>
                                    <option>Red</option>
                                </select></li>
                            <li>Size:<select>
                                    <option>Large</option>
                                    <option>Medium</option>
                                    <option>small</option>
                                    <option>Large</option>
                                    <option>small</option>
                                </select></li>
                            <li>Quality:<select>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select></li>
                        </ul>
                    </div>
                    <div class="share">
                        <p>Share Product :</p>
                        <ul>
                            <li><a href="#"><img src="Assets/images/youtube.png" alt=""></a></li>
                            <li><a href="#"><img src="Assets/images/facebook.png" alt=""></a></li>
                            <li><a href="#"><img src="Assets/images/twitter.png" alt=""></a></li>
                            <li><a href="#"><img src="Assets/images/linkedin.png" alt=""></a></li>
                        </ul>
                    </div>
                    <div class="add-cart">
                        <div class="rating">
                            <p>Rating:<img src="Assets/images/rating.png"><span>[3 of 5 Stars]</span></p>
                        </div>
                        <div class="button"><span>


                                <a <%if (session.getAttribute("HREmployeeID") != null) { %> 
                                    <% int ID = 0;
                                        ID = (Integer) session.getAttribute("HREmployeeID");
                                    %>
                                    href="/cart_add?id=<%=obj.getProduct().getICProductID()%>&idcus=<%=ID%>" <%} else {%> href="/Login_Servlet" <%}%>>Giỏ hàng</a></span></div>
                        <div class="clear"></div>
                    </div>
                </div>
                <br/>
                <br/>
                <div class="product-desc">
                    <div id="thongsokythuat" class="onepageNav">

                        <div class=" thongso-kythuat">
                            <h3 class="detail-title">Thông số kỹ thuật <%=obj.getProduct().getICProductName()%></h3>
                            <div style="font-style: italic;"></div>
                            <div class="phukien-noimage mb-10">
                                <p>
                                    Bộ sản phẩm chuẩn
                                    <br>
                                    <b><%=obj.getProduct().getICProductName()%></b>: Máy, sạc, tai nghe, cây lấy sim, sách hướng dẫn sử dụng
                                </p>

                            </div>

                            <style>
                                #toggleThongSo {
                                    overflow: hidden;
                                    height: 422px;
                                    width: 98%;
                                    margin-left: 100px;

                                }

                            </style>

                            <div id="toggleThongSo" rv-class-show="FeatureProduct | lengthCount 16 | == false" class="show">
                                <table class="tablet" rv-show="FeatureProduct | lengthCount 0" style="width: 70%;">
                                    <tbody><!-- rivets: each-item --><tr>
                                            <th rv-text="item.ProductFeatureDescription">Mạng 3G</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetail3G()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Mạng 4G</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetail4G()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">SIM</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailSIM()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Kích Thước</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailKichThuoc()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Màu Sắc</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailMauSac()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Trọng Lượng</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailTrongLuong()%> </p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Loại</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailLoai()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Màn Hình</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailManHinh()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">RAM</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailRAM()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Bộ Nhớ Trong</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailBoNhoTrong()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">3.5mm jack</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailJack()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Bluetooth</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailBluetooth()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">WLAN</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailWLAN()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Camera chính</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailCameraChinh()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Camera Phụ</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailCamaraPhu()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Quay Phim</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailQuayPhim()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">GPS</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailGPS()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">GPU</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailCPU()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Bảo Hành</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><%=obj.getICProductDetailBaoHanh()%></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Loại Pin</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailPin()%></p></td>
                                        </tr><tr>
                                            <th rv-text="item.ProductFeatureDescription">Hệ Điều Hành</th>
                                            <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailHeDieuHanh()%></p></td>
                                        </tr>
                                    </tbody></table>
                            </div>






                        </div>
                    </div>
                </div>       

                <div class="product-desc">
                    <div id="baiviet" class="onepageNav">

                        <div class="detail-review-chitiet" rv-show="ProductDes.HtmlDetailDesc | stringEmty" style="font-size:18px;">
                            <h3 class="detail-title">Đánh giá chi tiết</h3>


                            <%=obj.getICProductDetailDesc()%>


                        </div>
                    </div>
                    <div class="product-desc">
                        <div id="binhluan" class="onepageNav">
                            <style>
                                [v-cloak]{display: none}

                                .cm__replay--info{
                                    padding: 5px 0;
                                }

                                .cm__admin{
                                    font-size: 11px;
                                    padding: 1px 8px;
                                    display: inline-block;
                                    margin-left: 5px;
                                    background: #e6cf23;
                                    color: black;
                                    border-radius: 3px;
                                    font-weight: normal;
                                    bottom: 2px;
                                    position: relative;
                                }


                                .danhgia-sp{height:30px;line-height:30px}.danhgia-sp .raty{display:inline-block;vertical-align:2%}.captcha{line-height:30px}.captcha input{max-width:150px;display:inline-block;margin-left:10px;font-size:16px;font-weight:bolder;color:#404041}.captcha span{display:inline-block;background-color:#6d6e71;background-image:-webkit-linear-gradient(45deg,#000 25%,transparent 0,transparent 75%,#000 0,#000),-webkit-linear-gradient(45deg,#000 25%,transparent 0,transparent 75%,#000 0,#000);background-image:linear-gradient(45deg,#000 25%,transparent 0,transparent 75%,#000 0,#000),linear-gradient(45deg,#000 25%,transparent 0,transparent 75%,#000 0,#000);background-size:10px 10px;background-position:0 0,5px 5px;padding:0 15px;color:#fff;font-size:20px;letter-spacing:2px;text-transform:uppercase;text-shadow:1px 1px 0 #969696;position:relative;top:2px;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.comments-filter{margin:30px 0 20px;border-bottom:1px solid #e2e3e4}.comments-filter button{background:none;box-shadow:none;border:none}.comment{min-height:20px;padding-right:50px}.rating-scores{position:absolute;top:0;right:15px}.rating-scores i{margin-right:15px;float:left}#content_discussion .media-body{position:relative}#content_discussion .admin-name{font-weight:700;color:#e81c24}#content_discussion .media{border-bottom:1px solid #e2e3e4;padding-bottom:5px;margin-bottom:5px}#content_discussion .media .media{background:#f9f9f9;padding:10px 5px;border-radius:5px;position:relative;overflow:visible}#content_discussion .media .media:before{content:' ';position:absolute;width:0;height:0;left:30px;right:auto;top:-14px;border:7px solid;border-color:transparent #f6f7f7 #f9f9f9 transparent}.small-star img{margin-top:2px;display:block;float:left}.comment-meta>div{padding-right:15px}.comment-meta>div a{font-size:12px;color:#1f5ecc}.comment-meta>div a:hover{color:#184aa0}.comment-meta>div .alert{color:#e81c24;display:none}.comment-meta>div .alert:hover{color:#be131a}.comment-meta:hover .alert{display:block}.sub-comment-input{border:1px solid #e2e3e4;padding:5px 10px;margin-top:15px;max-width:700px;display:none}.comments-loadmore{text-align:center;margin:20px 0}.comments-sub-loadmore{background:#f1f2f2;padding:5px;border-radius:5px;border-bottom:1px solid #e2e3e4;margin-bottom:5px}.comments-sub-loadmore a{display:block}@media screen and (max-width:767px){.rating-scores{display:none}.danhgia-sp{font-size:12px}.captcha input{margin-left:0}.comment{padding-right:10px}}.cm__wrapper{padding:0 10px 10px;background:#fff;margin-bottom:10px;border-bottom:1px solid #ddd}.cm__wrapper:last-child{border-bottom:none}.cm,.cm__heading{margin-bottom:15px}.cm{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-align:start;-webkit-align-items:flex-start;-ms-flex-align:start;align-items:flex-start}.cm .cm{background:#f2f2f2;padding:10px;margin-bottom:0;position:relative;padding-bottom:0}.cm .cm:before{content:'';position:absolute;top:-10px;left:14px;width:0;height:0;border-bottom:10px solid #f2f2f2;border-left:10px solid transparent;border-right:10px solid transparent}.cm__feature .cm .cm{margin-left:20px}.cm__figure{margin-right:10px;width:30px;height:30px;border-radius:3px;background:#cacaca;background-size:cover;text-align:center;line-height:30px;color:#707070;font-weight:700}.cm__body{-webkit-box-flex:1;-webkit-flex:1;-ms-flex:1;flex:1;overflow:hidden}.cm__name{font-weight:700;margin:0;text-overflow:ellipsis;white-space:nowrap;overflow:hidden;display:inline-block;font-size:15px;padding:5px 10px 5px 0}.cm__meta--list{margin:0;padding-bottom:10px}.cm__meta--list a{color:#1f5ecc}.cm__meta--list a:hover{color:#184aa0}.cm__date{font-size:12px;color:#96989b}.cm__content{margin-bottom:10px}.cm__rating{display:inline-block;padding-bottom:5px;white-space:nowrap}.cm__title{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center}.cm__replay{display:none;margin-bottom:15px;padding-top:5px}.cm__feature .cm__replay{margin-left:20px}.cm__replay .input{margin:5px 0}.cm__replay .button{border-radius:3px}.cm__replay2{margin-bottom:15px}.cm__replay2 .cm__replay--content.input{margin-top:0}.cm__replay2 .input{margin:5px 0}.cm__replay2 .button{border-radius:3px}.cm__replay--info{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;-webkit-flex-wrap:wrap;-ms-flex-wrap:wrap;flex-wrap:wrap}.cm__replay--name{max-width:220px}.cm__replay--input{-webkit-box-flex:1;-webkit-flex:1 0 auto;-ms-flex:1 0 auto;flex:1 0 auto}.cm__replay--input .input{display:inline-block;max-width:210px;margin-right:10px}.cm__replay--button{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;-webkit-box-flex:0;-webkit-flex:0 0 auto;-ms-flex:0 0 auto;flex:0 0 auto}.cm__cname{padding:0 8px}.cm__cname--link{padding:0 15px 0 0;color:#1f5ecc}.cm__cname--link:hover{color:#184aa0}.cm__loadmore{display:block;padding:3px 10px;background:#f2f2f2;text-align:right;margin:5px 0}.cm__loadmore:hover{background:#e5e5e5}.cm__feature .cm__loadmore{margin-left:20px}.cm__pagination{text-align:center}.cm__pagination .pagination{display:inline-block}.cm__pagination .pagination>li{margin:0 2px;display:inline-block}.cm__pagination .pagination>li>a{background:#eee;border-radius:3px;color:#000;padding:4px 9px}.cm__pagination .pagination>li.active a,.cm__pagination .pagination>li:hover a{background:#ccc;border-color:#ccc}.cm__filter{padding:5px 0;margin-bottom:20px;border-bottom:1px solid #ddd}.cm__filter select{border:none;box-shadow:none;outline:none;cursor:pointer}.cm__review{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between;-webkit-flex-flow:row wrap;-ms-flex-flow:row wrap;flex-flow:row wrap}.cm__star{margin:0 0 10px;font-weight:700}.cm__star .raty{display:inline-block}.cm input,.cm textarea{font-size:14px}.cm input:focus,.cm textarea:focus{border-color:#777}.cm textarea{box-sizing:border-box;resize:none;overflow:hidden}#popup-comment{border-radius:5px;overflow:hidden}#popup-comment .title{background:#fff100;color:#0c1d77;text-transform:uppercase;padding:10px 15px 7px;margin:0}#popup-comment .cm__name{display:block;padding-top:10px}#popup-comment .content{padding:10px 15px 0}#popup-comment .xemthem{padding:5px 15px 15px}#popup-comment .xemthem a{color:#0c1d77;font-style:italic}#popup-comment .xemthem a:hover{color:#071249}#popup-comment .item:nth-child(odd){background:#eee}.cm__emotion{border:1px solid #ddd;border-radius:4px;padding:10px 15px;display:none}.cm__emotion li{cursor:pointer;padding:3px 2px}.cm__emotion--btn{margin-right:5px}.cm__editable{min-height:50px;display:block;overflow:hidden;background:#fff;border:1px solid #ddd;border-radius:3px;padding:10px 1.5%;font-size:14px;outline:none}.cm__editable:focus{border-color:#777}.cm__editable:empty:before{content:attr(placeholder);color:#acacac;display:block}.cm__wrapper .button{border-radius:3px;display:inline-block;padding:5px 14px;margin-bottom:0;font-size:14px;font-weight:400;line-height:1.42857143;background:#f1f2f2;color:#404041;text-align:center;white-space:nowrap;vertical-align:middle;-ms-touch-action:manipulation;touch-action:manipulation;cursor:pointer;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;background-image:none;border:none}.cm__wrapper .button.bold{font-weight:700}.cm__wrapper .button-blue{background:#1f5ecc;color:#fff}.cm__wrapper .button-blue:focus,.cm__wrapper .button-blue:hover{background:#3d79e1;color:#fff}.cm__wrapper .button-yellow{background:#e68323;color:#fff}.cm__wrapper .button-yellow:focus,.cm__wrapper .button-yellow:hover{background:#eb9d51;color:#fff}.cm__wrapper .button-gray{background:#6d6e71;color:#fff}.cm__wrapper .button-gray:focus,.cm__wrapper .button-gray:hover{background:#86878b;color:#fff}.cm__wrapper .button-red{background:#e81c24;color:#fff}.cm__wrapper .button-red:focus,.cm__wrapper .button-red:hover{background:#ed4a51;color:#fff}.cm__wrapper .input{padding:5px 12px;height:32px;font-size:12px;border-radius:3px;display:inline-block;border:1px solid #e2e3e4;width:100%}.cm__wrapper .input:focus{box-shadow:none;outline:none;border-color:#2e318d}.cm__wrapper .input.more{padding:5px 12px;height:32px;font-size:14px}.cm__wrapper .input.success{border-color:#3c763d;position:relative}.cm__wrapper .input.error{border-color:#a94442;position:relative}.cm__wrapper input:disabled,.cm__wrapper select:disabled,.cm__wrapper textarea:disabled{background:#eee;cursor:not-allowed!important}.cm__wrapper textarea.input{height:auto}.cm__wrapper select.input{padding:4px 6px}

                            </style>

                            <div id="form-comment" class="container">
                                <div class="row">
                                    <div class="col-sm-8">

                                        <div class="cm__wrapper">
                                            <h3 class="cm__heading">Bình luận (10)</h3>
                                            <div class="cm">
                                                <!----> 
                                                <div class="cm__body">
                                                    <div style="display: block" class="cm__replay2">
                                                        <%if (session.getAttribute("HREmployeeID") != null) { %> 
                                                        <% int ID = 0;
                                                            ID = (Integer) session.getAttribute("HREmployeeID");
                                                        %>
                                                        <form action="/Customer_Comment_Servlet?idpro=<%=obj.getProduct().getICProductID()%>&idcus=<%=ID%>" method="POST">
                                                            <%} else {%>   
                                                            <form action="/Login_Servlet" method="POST"> 
                                                                <%}%>
                                                                <textarea name="ARCustomerCommentDesc" cols="80" rows="4" class="cm__editable"></textarea>
                                                                <br/>
                                                                <input class="button-blue button alert" type="submit" value="GỬI" />
                                                            </form>

                                                    </div>
                                                </div>
                                            </div>

                                            <!---->
                                            <!-- binh luan -->
                                            <%
                                                if (request.getAttribute("listcomment") != null) {
                                                    List<ARCustomerCommentsInfo> listComment = (List<ARCustomerCommentsInfo>) request.getAttribute("listcomment");
                                                    for (ARCustomerCommentsInfo cm : listComment) {

                                            %>
                                            <div class="cm cm__first">
                                                <div class="cm__figure">C
                                                </div>
                                                <div class="cm__body">
                                                    <div class="cm__title">
                                                        <h5 class="cm__name"><%=cm.getCustomerName()%></h5>
                                                    </div>
                                                    <div class="cm__content"><%=cm.getARCustomerCommentDesc()%></div>
                                                    <div class="cm__meta">
                                                        <ul class="cm__meta--list list-inline">
                                                            <li><a href="javascript:void(0);" class="cm__meta--reply"><i class="vta vta-back-right"></i> Bình luận</a></li>

                                                            <li>
                                                                <div class="cm__date">Ngày <%=cm.getARCustomerCommentDate()%></div>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <!-- traloi comment-->
                                                    <% if (cm.getEmployee().getHREmployeeName() != null) {%>
                                                    <div class="cm">
                                                        <div class="cm__figure">
                                                            A
                                                        </div>

                                                        <div class="cm__body">
                                                            <div class="cm__title">
                                                                <h5 class="cm__name"><i> Quản trị viên</i> <%=cm.getEmployee().getHREmployeeName()%></h5>           
                                                            </div>
                                                            <div class="cm__content"><%=cm.getEmployeeComment().getHREmployeeCommentDesc()%></div>
                                                            <div class="cm__meta">
                                                                <ul class="cm__meta--list list-inline">
                                                                    <li><a href="javascript:void(0);" class="cm__meta--reply"><i class="vta vta-back-right"></i> Bình luận</a></li>

                                                                    <li>
                                                                        <div class="cm__date">Ngày 02/01/2019</div>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- -->
                                                    <% }%>
                                                </div>
                                            </div>
                                            <%}
                                                }%>
                                            <!--ket thuc binh luan  ; -->

                                        </div>
                                    </div>
                                </div>

                            </div> 
                            <%}%>			
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Public/footer.jsp" %>

