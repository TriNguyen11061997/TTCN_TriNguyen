<%@page import="Info.ICProductDetailsInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
 <link href="./Assets/css/main-v2-min.css" rel="stylesheet">
            <div class="main">
                <div class="content">
                    <div class="section group">
                        <div class="cont-desc span_1_of_2" style="width: 98%;">	
                            <% if(request.getAttribute("ObjProduct")!=null) {
                                ICProductDetailsInfo obj = (ICProductDetailsInfo)request.getAttribute("ObjProduct");
                                
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
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailKichThuoc()%> mm</p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Màu Sắc</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailMauSac()%></p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Trọng Lượng</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailTrongLuong()%> g</p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Loại</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailLoai()%></p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Màn Hình</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailManHinh()%> inches</p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Loa Ngoài</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailLoaNgoai()%></p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">Bộ Nhớ Trong</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailBoNhoTrong()%></p></td>
                                    </tr><tr>
                                        <th rv-text="item.ProductFeatureDescription">3.5mm jack</th>
                                        <td rv-html="item.VariantId | valueVariant item.Value item.ProductFeatureVariantDescription"><p><%=obj.getICProductDetailJack3dot5mm()%></p></td>
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

                       <div class="detail-review-chitiet" rv-show="ProductDes.HtmlDetailDesc | stringEmty" style="">
                           <h3 class="detail-title">Đánh giá chi tiết</h3>
                           <div class="row">

                           

                           </div>
                          
                       </div>





                        <div class="detail-topic paragraph collapse in" id="chitietbaiviet" rv-show="ProductDes.HtmlFullDescription | stringEmty" style="" aria-expanded="true">
<p style="text-align: justify;">Được xem là chiếc điện thoại đắt giá nhất so với các “em út” của mình là Vsmart Joy 1, Joy 1+ và Active 1, smartphone Vsmart Active 1+ “khoác” lên mình thiết kế hiện đại và tinh xảo, sang trọng hướng đến nhiều đối tượng người dùng, phổ biến là các doanh nhân trẻ thành đạt. Hiệu năng mạnh mẽ cùng camera chụp hình chất lượng chắc chắn cho bạn những trải nghiệm tốt nhất trong cuộc sống.</p>
<h3 style="text-align: justify;"><b>Thiết kế hoàn hảo, khung hình tinh xảo</b></h3>
<p style="text-align: justify;">Active 1+ sở hữu lối thiết kế sang trọng với khung kim loại chắc chắn, kết hợp 2 mặt kính tinh xảo và các góc được bo cong mềm mại, mang đến cảm giác cầm nắm dễ chịu cho người sử dụng. Mặt lưng sau là cụm camera kép thiết kế lồi nằm dọc bên trái và nổi bật logo Vsmart hình ngọn lửa thể hiện tinh thần và trí tuệ sáng tạo của người Việt. Ngoài ra còn có cảm biến vân tay 1 chạm giúp bạn dễ dàng mở khóa máy mà vẫn đảm bảo an toàn thông tin cá nhân.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-1.jpg" width="600" height="338" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<h3 style="text-align: justify;"><b>Hình ảnh chất lượng sắt nét nhờ cụm camera kép</b></h3>
<p style="text-align: justify;">Vsmart Active 1+ trang bị cụm camera kép ở phía sau với độ phân giải lớn 24MP và 12MP cho khả năng tự động lấy nét, chụp ảnh xóa phông ảo diệu nhằm mang lại cho bạn những bức ảnh chân dung rõ nét, màu sắc sống động tự nhiên. Máy còn tích hợp các chức năng chụp hình chuyên nghiệp, HDR, Panorama và chế độ làm đẹp thông minh.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-2.jpg" width="600" height="336" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<p style="text-align: justify;">Bên cạnh đó, không thể không kể đến camera trước cảm biến 20MP đi kèm đèn flash trợ sáng, sẵn sàng giúp bạn có được các tấm ảnh selfie giữ được độ chi tiết cao, sáng đẹp tự nhiên dù chụp trong cả môi trường thiếu sáng. Máy còn hỗ trợ khả năng quay phim 4K 2160p@30fps, luôn ghi lại mọi khoảnh khắc ý nghĩa trong cuộc sống của bạn.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-3.jpg" width="600" height="370" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<h3 style="text-align: justify;"><b>Màn hình tràn viền Full HD+</b></h3>
<p style="text-align: justify;">Bạn sẽ được trải nghiệm không gian điện ảnh bất tận trên màn hình lớn 6.18 inches với độ phân giải Full HD+ (1080 x 2280 pixels), giúp hiển thị khung hình sắc nét và sống động. Tấm nền IPS của máy và màn hình tai thỏ thời thượng đã tạo nên một thiết bị được thiết kế tối giản nhưng vẫn đẹp mắt, mở rộng diện tích hiển thị tối đa ở mọi góc nhìn.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-4.jpg" width="600" height="338" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<h3 style="text-align: justify;"><b>Cấu hình vượt trội cho trải nghiệm đỉnh cao</b></h3>
<p style="text-align: justify;">Vsmart Active 1+ sở hữu hiệu năng mạnh mẽ không thua kém các đối thủ trong cùng phân khúc khi được trang bị chip Snapdragon 660 kết hợp bộ RAM 6GB đáp ứng mọi tác vụ cơ bản thường ngày, xử lý các chương trình game đồ họa nặng cũng rất mượt mà, ổn định. Bộ nhớ trong 64GB và khe cắm thẻ nhớ ngoài có thể mở rộng tối đa 256GB cho phép bạn lưu trữ thêm nhiều hình ảnh và dữ liệu quan trọng.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-5.jpg" width="600" height="380" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<p style="text-align: justify;">Máy hoạt động trơn tru trên giao diện độc quyền VOS được tùy biến thông minh thông qua hệ điều hành Android 8.1, giúp người dùng trải nghiệm những tính năng công nghệ một cách hoàn hảo nhất.</p>
<h3 style="text-align: justify;"><b>Dung lượng pin khủng, tích hợp công nghệ sạc nhanh</b></h3>
<p style="text-align: center;"><b><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-6.jpg" width="600" height="338" alt="Vsmart Active 1+" title="Vsmart Active 1+"></b></p>
<p style="text-align: justify;">Bên trong máy là viên pin có dung lượng 3650mAh đáp ứng thoải mái cho mọi nhu cầu giải trí và làm việc hằng ngày của bạn. Đặc biệt khi sạc pin bạn không phải chờ đợi quá lâu vì đã có công nghệ sạc nhanh Quick Charge thông qua cổng USB-C 2.0.</p>
<p style="text-align: center;"><img src="https://cdn1.vienthonga.vn/image/2018/12/2/100000_vsmart-active-1-plus-7.jpg" width="600" height="338" alt="Vsmart Active 1+" title="Vsmart Active 1+"></p>
<p style="text-align: justify;">Active 1+ tích hợp 2 sim 2 sóng, hỗ trợ mạng 4G và vẫn có jack cắm 3.5mm, Bluetooth 4.0 hỗ trợ việc truy xuất dữ liệu dễ dàng với kết nối bên ngoài.</p></div>

                            
                        </div>


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

<div id="form-comment" class="container"><div class="row"><div class="col-sm-8"><div class="cm__wrapper"><h3 class="cm__heading">Đánh giá ()</h3> <div class="cm__feature"> <!----></div></div> <div class="cm__wrapper"><h3 class="cm__heading">Bình luận ()</h3> <div class="cm"><!----> <div class="cm__body"><div style="display: block" class="cm__replay2"><div style="min-height: 90px;padding:5px;" id="cm__editable" contenteditable="true" placeholder="Nhập nội dung thảo luận" class="cm__editable"></div> <div class="cm__replay--info"><!----> <div class="cm__replay--input"><div style="padding:5px;display: none;" class="huong-dan"><a style="color: #2d34ff" href="https://vienthonga.vn/huong-dan-mua-hang#hdcomment" target="_blank">Quy định đăng bình luận</a></div> <span><input type="radio" name="gender4" value="M"> <label style="padding: 0 5px 0 5px">Anh</label></span><span><input type="radio" name="gender4" value="F"> <label style="padding: 0 5px 0 5px">Chị</label></span> <input type="text" name="user-name" placeholder="Họ và Tên" class="input "> <input type="email" name="user-email" placeholder="Email" class="input "> </div> <div class="cm__replay--button"><a href="javasript:void(0);" style="margin-left: 34px" class="button cm__emotion--btn"><img src="https://cdn1.vienthonga.vn/image/2017/2/4/100000_icon-face.png" width="15" alt=""></a> <a href="javascript:void(0)" class="button-blue button alert">GỬI</a></div></div> <div style="display: none" class="cm__emotion"><ul class="list-inline"><li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-ad-mire.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-ad-mire2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-ahaaah.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-angel.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-bleed.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-bleed2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cheer.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cheer2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-confused.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-confused2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cruch.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cry.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cry2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cry3.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-cute.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-depressed.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-desperate.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-desperate2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-dying.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-embarrassed.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-embarrassed2.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-embarrassed3.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-embarrassed4.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-evil.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-frozen.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-haha.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-happy.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-heart.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-hi.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-knife.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-relax.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-shy.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-stone.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-thumb.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-waiting.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-what.gif" contenteditable="false" class="i1-2"></span></li> <li><span><img width="43" height="43" src="https://assets.vienthonga.vn/emotion/onion-wow.gif" contenteditable="false" class="i1-2"></span></li></ul></div> <div class="cm__review"><div class="cm__star">

                                    Đánh giá sản phẩm :
                                    <div class="raty"></div></div> <div id="g-captcha" class="cm__captcha"></div></div></div></div></div> <div class="cm__filter"><select name="" id=""><option value="" selected="selected">Mới nhất</option> <option value="" selected="selected">Top thảo luận</option></select></div> <!----></div></div></div> <div id="popup-comment" style="display: none"><h4 class="title">Viễn thông A - Trả lời</h4> </div></div>




<script>

    function pasteHtmlAtCaret(html) {
        var sel, range;
        if (window.getSelection) {
            // IE9 and non-IE
            sel = window.getSelection();
            if (sel.getRangeAt && sel.rangeCount) {
                range = sel.getRangeAt(0);
                range.deleteContents();

                // Range.createContextualFragment() would be useful here but is
                // non-standard and not supported in all browsers (IE9, for one)
                var el = document.createElement("div");
                el.innerHTML = html;
                var frag = document.createDocumentFragment(), node, lastNode;
                while ( (node = el.firstChild) ) {
                    lastNode = frag.appendChild(node);
                }
                range.insertNode(frag);

                // Preserve the selection
                if (lastNode) {
                    range = range.cloneRange();
                    range.setStartAfter(lastNode);
                    range.collapse(true);
                    sel.removeAllRanges();
                    sel.addRange(range);
                }
            }
        } else if (document.selection && document.selection.type != "Control") {
            // IE < 9
            document.selection.createRange().pasteHTML(html);
        }
    }

    


</script>




<!-- End Google Tag Manager -->


</div> 
                                        
                                    </div>
                            	<%}%>			
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Public/footer.jsp" %>

