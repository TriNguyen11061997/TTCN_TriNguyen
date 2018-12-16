<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Public/header.jsp" %>
                <link href="../Assets/css/cart.css" rel="stylesheet" type="text/css"/>
                <link href="../Assets/css/shoppingcart.css" rel="stylesheet" type="text/css"/>
            </div>
            <div class="main">
                <div class="content">
                   <div class="before-footor-wrapper">
                    <div class="before-payment-success">
                        <div class="product-div">
                            <div class="product-details-header" style="background-color:#7F786D;margin-bottom: 14px;">
                                <div class="wy-inline-block wy-width-60 CartHeads" style="padding-left: 12px">
                                    Sản phẩm của bạn
                                </div>
                                <div class="wy-inline-block CartHeads" style="width: 15%">
                                   Giá
                                </div>
                                <div class="wy-inline-block CartHeads">
                                    Số lượng
                                </div>
                                <div class="wy-inline-block float-right text-right CartHeads" style="padding-right: 20px;">
                                    Tổng tiền
                                </div>
                            </div>
                            <!-- if some other product is there display here><-->
                            <div class="editblock">
<!--                                san pham luu o day-->
                            
                        <%  Double tongPhu = 0.0;
                            Double fax = 0.0;
                           
                             
                            if(request.getAttribute("listProduct")!=null){
                            
                            List<ICProductsInfo> list = (List<ICProductsInfo>)request.getAttribute("listProduct");
                                for(ICProductsInfo item : list){
                            
                            %>
                        <div class="product-details product-block" id="single_product_block_125new">

                                    <input type="hidden" class="product-tax" value="0" />
                                    <div class="wy-inline-block wy-width-60" style="padding-left: 12px">
                                        <span class="font-prod font-smoothing"><span class='prod-name' style="line-height: 25px"><%=item.getICProductName()%></span></span>
                                    </div>
                                    <div class="wy-inline-block unit-price" style="width: 15%" style="line-height: 25px">
                                        <%=item.getICProductSupplierPrice()%>                                  </div>
                                    <div class="wy-inline-block" style="line-height: 25px">
                                        <select class="ItemQuantity" onchange="HandleQuantityChange(this)">
<!--                                           nếu số lượng == bao nhiêu thì option-->
                                        <%  int sl = item.getQty(); 
                                            for(int i=1;i<=20;i++){
                                                if(sl==i){
                                            
                                        %>
                                            <option selected value="<%=i%>"><%=i%></option>
                                            <%}else{%>
                                            <option  value="<%=i%>"><%=i%></option>
                                            <%}}%>
                                            
                                        </select>
                                        <a  class="remove-item remove" href="javascript:void(0)" id="remove_item-125new">
                                            <img class="deleteItem" src="https://www.idera.com/assets/corporate/images/deleteItem.png" width="15" height="18" alt="Delete Cart Item">
                                        </a>
                                    </div>
                                    <div class="wy-inline-block float-right text-right item-total" style="padding-right: 20px; line-height: 25px">
                                        <%
                                            
                                            double tongTien = item.getQty() * item.getICProductSupplierPrice();
                                            tongPhu += tongTien;
                                        %>                                    
                                        <%=tongTien%> VNĐ
                                    </div>

                                    <input type="hidden" class="product-index product-index-0" value="0" />

                                    <div class='hide quantity-popup-125new'>
                                        <div class='quantity-popup-wrapper'>
                                            <div class='quantity-heading myriadSetPro-Semibold'>Quantity
                                            </div>
                                            <ul class='quantity-list'>
                                                <li class='quantity-1'><a onclick="quantitySelectPhone('125new',1)"><div>1</div></a></li>
                                                <li class='quantity-2'><a onclick="quantitySelectPhone('125new',2)"><div>2</div></a></li>
                                                <li class='quantity-3'><a onclick="quantitySelectPhone('125new',3)"><div>3</div></a></li>
                                                <li class='quantity-4'><a onclick="quantitySelectPhone('125new',4)"><div>4</div></a></li>
                                                <li class='quantity-5'><a onclick="quantitySelectPhone('125new',5)"><div>5</div></a></li>
                                                <li class='quantity-6'><a onclick="quantitySelectPhone('125new',6)"><div>6</div></a></li>
                                                <li class='quantity-7'><a onclick="quantitySelectPhone('125new',7)"><div>7</div></a></li>
                                                <li class='quantity-8'><a onclick="quantitySelectPhone('125new',8)"><div>8</div></a></li>
                                                <li class='quantity-9'><a onclick="quantitySelectPhone('125new',9)"><div>9</div></a></li>
                                                <li class='quantity-10'><a onclick="quantitySelectPhone('125new',10)"><div class='last-quantity'>10</div></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                        <%}}%>

                                </div>
                        <%
                            
                            if(session.getAttribute("HREmployeeID")!=null)
                        {
                                id = (Integer)session.getAttribute("HREmployeeID");
                                ARCartsController ar1 = new ARCartsController();
                                List<ARCartsInfo> listar = ar1.getListCartByID(id);
                                if(listar.size()!=0){
                        %>
                            <div class="full-width order-summary">
                                <div class="full-width" style="background-color: #f3f4f5;">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        Tổng phụ :
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        <span class="prod-total"><%=tongPhu%></span> VNĐ
                                        <input type="hidden" id="prod-total" value="299"/>
                                    </div>
                                </div>

                                <div class="full-width">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        **Bảo trì:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;color: #6ea426;">
                                        Miễn phí
                                    </div>
                                </div>

                                <div class="full-width" style="background-color: #f3f4f5;">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        Phí ship hàng:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        <span class="total-tax">30.000 VNĐ</span>
                                        <input type="hidden" id="total-tax" value="0"/>
                                    </div>
                                </div>

                                <div class="full-width">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block" style="font-family:'proxima_nova_rgbold', Arial, Helvetica, sans-serif;">
                                        Tổng toàn bộ:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        <%
                                            Double tongTT = tongPhu + fax + 30000;
                                        %>
                                        <span class="total-amount" style="font-family:'proxima_nova_rgbold', Arial, Helvetica, sans-serif;"><%=tongTT%> VNĐ</span>
                                        <input type="hidden" id="total-amount" value="299" />
                                    </div>
                                </div>
                            </div>
                                        <%}}%>
                        </div>

                        <div class="ChoiceLink" style="color: #00a1dd; font-size: 24px; font-weight: bold;font-family: Arial, Helvetica, sans-serif;padding: 30px 0;">
                            Enter your payment information below to check out.
                        </div>

                        <div class="pay-info-header">
                            <h3>Payment Information:</h3>
                            <p>If you would like to arrange for other payment terms, please contact sales at sales@idera.com or 713.523.4433.</p>
                        </div>


                        <div class="full-width card-info CCFormBox" style="position: relative;">
                            <div class="formCardTitle" style="padding: 20px;border-bottom: 1px solid #fafaf9">
                                Pay with Credit Card
                            </div>
                            <div style="padding: 20px;">
                                <div>
                                    <div class="CCInputLabel wy-inline-block" >Card Number:</div>
                                    <div class="wy-inline-block"><input type="text" id="credit_card" class="inCreditCardNumber" name="cardnum" maxlength="16" size='20'></div>
                                    <div class="CCInputLabel wy-inline-block">CSC:</div>
                                    <div class="wy-inline-block"><input type="text" id="card_cvv" maxlength="4" size="4" name="cardcvv" class="inCSCNumber"></div>
                                    <div class="wy-inline-block" style="position: absolute"><img src="https://www.idera.com/Presentation/Assets/Images/cc-icon-csc.png" width="61" height="30" alt="csc"></div>
                                    <div class="CCInputLabel wy-inline-block" style="margin-left: 63px">Valid Thru</div>
                                    <div class="wy-inline-block">
                                        <select id="card_month" class="inMonth">
                                            <option value="-1">MM</option>
                                            <option value="1">01</option>
                                            <option value="2">02</option>
                                            <option value="3">03</option>
                                            <option value="4">04</option>
                                            <option value="5">05</option>
                                            <option value="6">06</option>
                                            <option value="7">07</option>
                                            <option value="8">08</option>
                                            <option value="9">09</option>
                                            <option value="10">10</option>
                                            <option value="11">11</option>
                                            <option value="12">12</option>
                                        </select>
                                    </div>
                                    <div class="wy-inline-block">
                                        <select id="card_year" class="inYear">
                                            <option value="-1">YYYY</option>
                                            <option value="2018">2018</option>
                                            <option value="2019">2019</option>
                                            <option value="2020">2020</option>
                                            <option value="2021">2021</option>
                                            <option value="2022">2022</option>
                                            <option value="2023">2023</option>
                                            <option value="2024">2024</option>
                                            <option value="2025">2025</option>
                                            <option value="2026">2026</option>
                                        </select>
                                    </div>
                                </div>
                                <div id="card_type" style="margin-left: 129px">
                                    <img src="https://static.webyog.com/images/card-icons2.png" alt="Cards" class="img-topspace">
                                </div>
                                <div class="card-error hide" style="background: #fe4210;color: white;padding: 5px;"></div>
                            </div>
                        </div>

                        <div class="BILLFormBox" style="width: 100%">
                            <div class="formCardTitleBilling">Billing Information</div>
                            <div style="margin-top: 20px;">
                                <div class="wy-inline-block" style="width: 49%;">
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">First Name:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="first_name" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="text-align: right;">
                                            <div class="billLabels wy-inline-block" style="margin-left: 27px">Last Name:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="last_name" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="full-width">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Email:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="purchase_email" class="inputBill" style="width:402px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">City:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="city_bill" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="text-align: right;">
                                            <div class="billLabels wy-inline-block" style="margin-left: 37px">Zip Code:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="zipcode_bill" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class=" wy-inline-block" style="width: 49%;">
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Company:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="cname" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="padding-left: 42px">
                                            <div class="billLabels wy-inline-block">Phone:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="phone_no" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="full-width">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Address:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="address_bill" class="inputBill" style="width:390px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Country:</div>
                                            <div class="wy-inline-block">
                                                <select id="billingCountry" name="billing.country" style="width:146px;" class="billing-list inDrop" onchange="OnCartCountryChange()">
                                                    <option selected="selected" value="-1">Country</option>
                                                    <option value="United States">United States</option>
                                                    <option value="" disabled="disabled">---------------</option>
                                                    <option value="Afghanistan">Afghanistan</option>
                                                    <option value="Albania">Albania</option>
                                                    <option value="Algeria">Algeria</option>
                                                    <option value="American Samoa">American Samoa</option>
                                                    <option value="Andorra">Andorra</option>
                                                    <option value="Angola">Angola</option>
                                                    <option value="Anguilla">Anguilla</option>
                                                    <option value="Antarctica">Antarctica</option>
                                                    <option value="Antigua">Antigua</option>
                                                    <option value="Argentina">Argentina</option>
                                                    <option value="Armenia">Armenia</option>
                                                    <option value="Aruba">Aruba</option>
                                                    <option value="Australia">Australia</option>
                                                    <option value="Austria">Austria</option>
                                                    <option value="Azerbaijan">Azerbaijan</option>
                                                    <option value="Bahamas">Bahamas</option>
                                                    <option value="Bahrain">Bahrain</option>
                                                    <option value="Bangladesh">Bangladesh</option>
                                                    <option value="Barbados">Barbados</option>
                                                    <option value="Belarus">Belarus</option>
                                                    <option value="Belgium">Belgium</option>
                                                    <option value="Belize">Belize</option>
                                                    <option value="Benin">Benin</option>
                                                    <option value="Bermuda">Bermuda</option>
                                                    <option value="Bhutan">Bhutan</option>
                                                    <option value="Bolivia">Bolivia</option>
                                                    <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
                                                    <option value="Botswana">Botswana</option>
                                                    <option value="Brazil">Brazil</option>
                                                    <option value="Brunei">Brunei</option>
                                                    <option value="Bulgaria">Bulgaria</option>
                                                    <option value="Burkina Faso">Burkina Faso</option>
                                                    <option value="Burma">Burma</option>
                                                    <option value="Burundi">Burundi</option>
                                                    <option value="Cambodia">Cambodia</option>
                                                    <option value="Cameroon">Cameroon</option>
                                                    <option value="Canada">Canada</option>
                                                    <option value="Cape Verde">Cape Verde</option>
                                                    <option value="Cayman Islands">Cayman Islands</option>
                                                    <option value="Central African Republic">Central African Republic</option>
                                                    <option value="Chad">Chad</option>
                                                    <option value="Channel Islands - Jersey">Channel Islands - Jersey</option>
                                                    <option value="Chile">Chile</option>
                                                    <option value="China">China</option>
                                                    <option value="Colombia">Colombia</option>
                                                    <option value="Comoros">Comoros</option>
                                                    <option value="Congo (Zaire)">Congo (Zaire)</option>
                                                    <option value="Congo">Congo</option>
                                                    <option value="Cook Islands">Cook Islands</option>
                                                    <option value="Costa Rica">Costa Rica</option>
                                                    <option value="Cote d'Ivoire">Cote d'Ivoire</option>
                                                    <option value="Croatia">Croatia</option>
                                                    <option value="Cyprus">Cyprus</option>
                                                    <option value="Czech Republic">Czech Republic</option>
                                                    <option value="Denmark">Denmark</option>
                                                    <option value="Djibouti">Djibouti</option>
                                                    <option value="Dominica">Dominica</option>
                                                    <option value="Dominican Republic">Dominican Republic</option>
                                                    <option value="Ecuador">Ecuador</option>
                                                    <option value="Egypt">Egypt</option>
                                                    <option value="El Salvador">El Salvador</option>
                                                    <option value="Equatorial Guinea">Equatorial Guinea</option>
                                                    <option value="Eritrea">Eritrea</option>
                                                    <option value="Estonia">Estonia</option>
                                                    <option value="Ethiopia">Ethiopia</option>
                                                    <option value="Falkland Islands">Falkland Islands</option>
                                                    <option value="Fiji">Fiji</option>
                                                    <option value="Finland">Finland</option>
                                                    <option value="France">France</option>
                                                    <option value="French Guiana">French Guiana</option>
                                                    <option value="French Polynesia">French Polynesia</option>
                                                    <option value="Gabon">Gabon</option>
                                                    <option value="Gambia">Gambia</option>
                                                    <option value="Gaza Strip and West Bank">Gaza Strip and West Bank</option>
                                                    <option value="Georgia">Georgia</option>
                                                    <option value="Germany">Germany</option>
                                                    <option value="Ghana">Ghana</option>
                                                    <option value="Gibraltar">Gibraltar</option>
                                                    <option value="Greece">Greece</option>
                                                    <option value="Greenland">Greenland</option>
                                                    <option value="Grenada">Grenada</option>
                                                    <option value="Guadeloupe">Guadeloupe</option>
                                                    <option value="Guam">Guam</option>
                                                    <option value="Guatemala">Guatemala</option>
                                                    <option value="Guinea">Guinea</option>
                                                    <option value="Guinea-Bissau">Guinea-Bissau</option>
                                                    <option value="Guyana">Guyana</option>
                                                    <option value="Haiti">Haiti</option>
                                                    <option value="Honduras">Honduras</option>
                                                    <option value="Hong Kong">Hong Kong</option>
                                                    <option value="Hungary">Hungary</option>
                                                    <option value="Iceland">Iceland</option>
                                                    <option value="India">India</option>
                                                    <option value="Indonesia">Indonesia</option>
                                                    <option value="Iraq">Iraq</option>
                                                    <option value="Ireland">Ireland</option>
                                                    <option value="Israel">Israel</option>
                                                    <option value="Italy">Italy</option>
                                                    <option value="Jamaica">Jamaica</option>
                                                    <option value="Japan">Japan</option>
                                                    <option value="Jordan">Jordan</option>
                                                    <option value="Kazakhstan">Kazakhstan</option>
                                                    <option value="Kenya">Kenya</option>
                                                    <option value="Kiribati">Kiribati</option>
                                                    <option value="Kuwait">Kuwait</option>
                                                    <option value="Kyrgyzstan">Kyrgyzstan</option>
                                                    <option value="Laos">Laos</option>
                                                    <option value="Latvia">Latvia</option>
                                                    <option value="Lebanon">Lebanon</option>
                                                    <option value="Lesotho">Lesotho</option>
                                                    <option value="Liberia">Liberia</option>
                                                    <option value="Libya">Libya</option>
                                                    <option value="Liechtenstein">Liechtenstein</option>
                                                    <option value="Lithuania">Lithuania</option>
                                                    <option value="Luxembourg">Luxembourg</option>
                                                    <option value="Macau">Macau</option>
                                                    <option value="Macedonia">Macedonia</option>
                                                    <option value="Madagascar">Madagascar</option>
                                                    <option value="Malawi">Malawi</option>
                                                    <option value="Malaysia">Malaysia</option>
                                                    <option value="Maldives">Maldives</option>
                                                    <option value="Mali">Mali</option>
                                                    <option value="Malta">Malta</option>
                                                    <option value="Marshall Islands">Marshall Islands</option>
                                                    <option value="Martinique">Martinique</option>
                                                    <option value="Mauritania">Mauritania</option>
                                                    <option value="Mauritius">Mauritius</option>
                                                    <option value="Mayotte">Mayotte</option>
                                                    <option value="Mexico">Mexico</option>
                                                    <option value="Federated States of Micronesia">Federated States of Micronesia</option>
                                                    <option value="Moldova">Moldova</option>
                                                    <option value="Monaco">Monaco</option>
                                                    <option value="Mongolia">Mongolia</option>
                                                    <option value="Montserrat">Montserrat</option>
                                                    <option value="Morocco">Morocco</option>
                                                    <option value="Mozambique">Mozambique</option>
                                                    <option value="Namibia">Namibia</option>
                                                    <option value="Nauru">Nauru</option>
                                                    <option value="Nepal">Nepal</option>
                                                    <option value="Netherlands">Netherlands</option>
                                                    <option value="Netherlands Antilles">Netherlands Antilles</option>
                                                    <option value="New Caledonia">New Caledonia</option>
                                                    <option value="New Zealand">New Zealand</option>
                                                    <option value="Nicaragua">Nicaragua</option>
                                                    <option value="Niger">Niger</option>
                                                    <option value="Nigeria">Nigeria</option>
                                                    <option value="Northern Mariana Islands">Northern Mariana Islands</option>
                                                    <option value="Norway">Norway</option>
                                                    <option value="Oman">Oman</option>
                                                    <option value="Pakistan">Pakistan</option>
                                                    <option value="Palau">Palau</option>
                                                    <option value="Panama">Panama</option>
                                                    <option value="Papua New Guinea">Papua New Guinea</option>
                                                    <option value="Paraguay">Paraguay</option>
                                                    <option value="Peru">Peru</option>
                                                    <option value="Philippines">Philippines</option>
                                                    <option value="Pitcairn Islands">Pitcairn Islands</option>
                                                    <option value="Poland">Poland</option>
                                                    <option value="Portugal">Portugal</option>
                                                    <option value="Puerto Rico">Puerto Rico</option>
                                                    <option value="Qatar">Qatar</option>
                                                    <option value="Reunion">Reunion</option>
                                                    <option value="Romania">Romania</option>
                                                    <option value="Russia">Russia</option>
                                                    <option value="Rwanda">Rwanda</option>
                                                    <option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option>
                                                    <option value="Saint Lucia">Saint Lucia</option>
                                                    <option value="Saint Pierre and Miquelon">Saint Pierre and Miquelon</option>
                                                    <option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines</option>
                                                    <option value="Samoa">Samoa</option>
                                                    <option value="San Marino">San Marino</option>
                                                    <option value="Sao Tome and Principe">Sao Tome and Principe</option>
                                                    <option value="Saudi Arabia">Saudi Arabia</option>
                                                    <option value="Senegal">Senegal</option>
                                                    <option value="Serbia and Montenegro">Serbia and Montenegro</option>
                                                    <option value="Seychelles">Seychelles</option>
                                                    <option value="Sierra Leone">Sierra Leone</option>
                                                    <option value="Singapore">Singapore</option>
                                                    <option value="Slovakia">Slovakia</option>
                                                    <option value="Slovenia">Slovenia</option>
                                                    <option value="Solomon Islands">Solomon Islands</option>
                                                    <option value="Somalia">Somalia</option>
                                                    <option value="South Africa">South Africa</option>
                                                    <option value="South Korea">South Korea</option>
                                                    <option value="Spain">Spain</option>
                                                    <option value="Sri Lanka">Sri Lanka</option>
                                                    <option value="Sudan">Sudan</option>
                                                    <option value="Suriname">Suriname</option>
                                                    <option value="Swaziland">Swaziland</option>
                                                    <option value="Sweden">Sweden</option>
                                                    <option value="Switzerland">Switzerland</option>
                                                    <option value="Syria">Syria</option>
                                                    <option value="Taiwan">Taiwan</option>
                                                    <option value="Tajikistan">Tajikistan</option>
                                                    <option value="Tanzania">Tanzania</option>
                                                    <option value="Thailand">Thailand</option>
                                                    <option value="Togo">Togo</option>
                                                    <option value="Tonga">Tonga</option>
                                                    <option value="Trinidad and Tobago">Trinidad and Tobago</option>
                                                    <option value="Tunisia">Tunisia</option>
                                                    <option value="Turkey">Turkey</option>
                                                    <option value="Turkmenistan">Turkmenistan</option>
                                                    <option value="Turks and Caicos Islands">Turks and Caicos Islands</option>
                                                    <option value="Tuvalu">Tuvalu</option>
                                                    <option value="Uganda">Uganda</option>
                                                    <option value="Ukraine">Ukraine</option>
                                                    <option value="United Arab Emirates">United Arab Emirates</option>
                                                    <option value="United Kingdom">United Kingdom</option>
                                                    <option value="Uruguay">Uruguay</option>
                                                    <option value="Uzbekistan">Uzbekistan</option>
                                                    <option value="Vanuatu">Vanuatu</option>
                                                    <option value="Venezuela">Venezuela</option>
                                                    <option value="Vietnam">Vietnam</option>
                                                    <option value="Virgin Islands, British">Virgin Islands, British</option>
                                                    <option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option>
                                                    <option value="West Bank and Gaza Strip">West Bank and Gaza Strip</option>
                                                    <option value="Western Sahara">Western Sahara</option>
                                                    <option value="Yemen">Yemen</option>
                                                    <option value="Zambia">Zambia</option>
                                                    <option value="Zimbabwe">Zimbabwe</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="wy-inline-block state-bill-block hide" style="padding-left: 49px">
                                            <div class="billLabels wy-inline-block">State:</div>
                                            <div class="wy-inline-block">
                                                <select id="billingCanada" name="state-ca" class="inDrop hide" style="width: 146px; display: none;" onchange="OnCartStateChange()"><option selected="selected" value="-1">State</option><option value="AB">Alberta</option><option value="BC">British Columbia</option><option value="MB">Manitoba</option><option value="NB">New Brunswick</option><option value="NL">Newfoundland and Labrador</option><option value="NT">Northwest Territories</option><option value="NS">Nova Scotia</option><option value="NU">Nunavut</option><option value="ON">Ontario</option><option value="PE">Prince Edward Island</option><option value="QC">Quebec</option><option value="SK">Saskatchewan</option><option value="YT">Yukon Territory</option></select>
                                                <select id="billingUS" name="state-US" class="inDrop" style="width: 146px;" onchange="OnCartStateChange()"><option selected="selected" value="-1">State</option><option value="AL">Alabama</option><option value="AA">Armed Forces Americas</option><option value="AE">Armed Forces Europe</option><option value="AP">Armed Forces Pacific</option><option value="AK">Alaska</option><option value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DC">D.C.</option><option value="DE">Delaware</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennessee</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option></select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="formCallout" style="margin-top:20px;margin-bottom: 10px;text-align: left;">
                                <b class="formCalloutBold" style="color: #e63e07;">Note:</b> Email address must be valid to receive the email which contains download links. To ensure e-mail delivery, please whitelist sales@idera.com.
                            </div>
                            <div class="bill-error hide" style="background: #fe4210;color: white;padding: 5px;"></div>
                        </div>

                        <div class="BILLFormBox" style="width: 100%">
                            <div class="formCardTitleBilling">
                            <span style="font-size:14px; color:#6d6559;">
								<span class="ShippingCheckbox">
									<input id="reseller-checkbox" type="checkbox" name="partner-reseller-checkbox-section" class="open-ship-form">
									<label for="reseller-checkbox">I am a reseller purchasing on behalf of my customer</label>
								</span>
						    </span>
                            </div>
                        </div>

                        <div class="BILLFormBox" style="width: 100%">
                            <div>
                                <span class="formCardTitleBilling">Shipping Information</span>
                                <span style="margin-left: 45px">
                                    <span class="ShippingCheckbox" style="font-size:14px; color:#6d6559;">
                                        <input id="isshipping_diff" type="checkbox"  checked="checked">
                                        <label for="isshipping_diff">Same as Billing (Uncheck if end-user/shipping is different from purchaser/billing)</label>
                                    </span>
                                </span>
                            </div>
                            <div style="margin-top: 20px; display: none;" class="shipping_details">
                                <div class="wy-inline-block" style="width: 49%;">
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">First Name:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="euser-fname" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="text-align: right;">
                                            <div class="billLabels wy-inline-block" style="margin-left: 27px">Last Name:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="euser-lname" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="full-width">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Email:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="euser-email" class="inputBill" style="width:402px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">City:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="city_ship" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="text-align: right;">
                                            <div class="billLabels wy-inline-block" style="margin-left: 37px">Zip Code:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="zipcode_ship" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class=" wy-inline-block" style="width: 49%;">
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Company:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="cname_ship" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                        <div class="wy-inline-block" style="padding-left: 42px">
                                            <div class="billLabels wy-inline-block">Phone:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="phone_no_ship" class="inputBill" style="width:146px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="full-width">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Address:</div>
                                            <div class="wy-inline-block">
                                                <input type="text" id="address_ship" class="inputBill" style="width:390px;">
                                            </div>
                                        </div>
                                    </div>
                                    <div style="margin-bottom: 10px">
                                        <div class="wy-inline-block">
                                            <div class="billLabels wy-inline-block" style="width: 80px;">Country:</div>
                                            <div class="wy-inline-block">
                                                <select id="shipCountry" name="billing.country" style="width:146px;" class="billing-list inDrop" onchange="OnCartCountryChangeShip()">
                                                    <option selected="selected" value="-1">Country</option>
                                                    <option value="United States">United States</option>
                                                    <option value="Afghanistan">Afghanistan</option>
                                                    <option value="Albania">Albania</option>
                                                    <option value="Algeria">Algeria</option>
                                                    <option value="American Samoa">American Samoa</option>
                                                    <option value="Andorra">Andorra</option>
                                                    <option value="Angola">Angola</option>
                                                    <option value="Anguilla">Anguilla</option>
                                                    <option value="Antarctica">Antarctica</option>
                                                    <option value="Antigua">Antigua</option>
                                                    <option value="Argentina">Argentina</option>
                                                    <option value="Armenia">Armenia</option>
                                                    <option value="Aruba">Aruba</option>
                                                    <option value="Australia">Australia</option>
                                                    <option value="Austria">Austria</option>
                                                    <option value="Azerbaijan">Azerbaijan</option>
                                                    <option value="Bahamas">Bahamas</option>
                                                    <option value="Bahrain">Bahrain</option>
                                                    <option value="Bangladesh">Bangladesh</option>
                                                    <option value="Barbados">Barbados</option>
                                                    <option value="Belarus">Belarus</option>
                                                    <option value="Belgium">Belgium</option>
                                                    <option value="Belize">Belize</option>
                                                    <option value="Benin">Benin</option>
                                                    <option value="Bermuda">Bermuda</option>
                                                    <option value="Bhutan">Bhutan</option>
                                                    <option value="Bolivia">Bolivia</option>
                                                    <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
                                                    <option value="Botswana">Botswana</option>
                                                    <option value="Brazil">Brazil</option>
                                                    <option value="Brunei">Brunei</option>
                                                    <option value="Bulgaria">Bulgaria</option>
                                                    <option value="Burkina Faso">Burkina Faso</option>
                                                    <option value="Burma">Burma</option>
                                                    <option value="Burundi">Burundi</option>
                                                    <option value="Cambodia">Cambodia</option>
                                                    <option value="Cameroon">Cameroon</option>
                                                    <option value="Canada">Canada</option>
                                                    <option value="Cape Verde">Cape Verde</option>
                                                    <option value="Cayman Islands">Cayman Islands</option>
                                                    <option value="Central African Republic">Central African Republic</option>
                                                    <option value="Chad">Chad</option>
                                                    <option value="Channel Islands - Jersey">Channel Islands - Jersey</option>
                                                    <option value="Chile">Chile</option>
                                                    <option value="China">China</option>
                                                    <option value="Colombia">Colombia</option>
                                                    <option value="Comoros">Comoros</option>
                                                    <option value="Congo (Zaire)">Congo (Zaire)</option>
                                                    <option value="Congo">Congo</option>
                                                    <option value="Cook Islands">Cook Islands</option>
                                                    <option value="Costa Rica">Costa Rica</option>
                                                    <option value="Cote d'Ivoire">Cote d'Ivoire</option>
                                                    <option value="Croatia">Croatia</option>
                                                    <option value="Cyprus">Cyprus</option>
                                                    <option value="Czech Republic">Czech Republic</option>
                                                    <option value="Denmark">Denmark</option>
                                                    <option value="Djibouti">Djibouti</option>
                                                    <option value="Dominica">Dominica</option>
                                                    <option value="Dominican Republic">Dominican Republic</option>
                                                    <option value="Ecuador">Ecuador</option>
                                                    <option value="Egypt">Egypt</option>
                                                    <option value="El Salvador">El Salvador</option>
                                                    <option value="Equatorial Guinea">Equatorial Guinea</option>
                                                    <option value="Eritrea">Eritrea</option>
                                                    <option value="Estonia">Estonia</option>
                                                    <option value="Ethiopia">Ethiopia</option>
                                                    <option value="Falkland Islands">Falkland Islands</option>
                                                    <option value="Fiji">Fiji</option>
                                                    <option value="Finland">Finland</option>
                                                    <option value="France">France</option>
                                                    <option value="French Guiana">French Guiana</option>
                                                    <option value="French Polynesia">French Polynesia</option>
                                                    <option value="Gabon">Gabon</option>
                                                    <option value="Gambia">Gambia</option>
                                                    <option value="Gaza Strip and West Bank">Gaza Strip and West Bank</option>
                                                    <option value="Georgia">Georgia</option>
                                                    <option value="Germany">Germany</option>
                                                    <option value="Ghana">Ghana</option>
                                                    <option value="Gibraltar">Gibraltar</option>
                                                    <option value="Greece">Greece</option>
                                                    <option value="Greenland">Greenland</option>
                                                    <option value="Grenada">Grenada</option>
                                                    <option value="Guadeloupe">Guadeloupe</option>
                                                    <option value="Guam">Guam</option>
                                                    <option value="Guatemala">Guatemala</option>
                                                    <option value="Guinea">Guinea</option>
                                                    <option value="Guinea-Bissau">Guinea-Bissau</option>
                                                    <option value="Guyana">Guyana</option>
                                                    <option value="Haiti">Haiti</option>
                                                    <option value="Honduras">Honduras</option>
                                                    <option value="Hong Kong">Hong Kong</option>
                                                    <option value="Hungary">Hungary</option>
                                                    <option value="Iceland">Iceland</option>
                                                    <option value="India">India</option>
                                                    <option value="Indonesia">Indonesia</option>
                                                    <option value="Iraq">Iraq</option>
                                                    <option value="Ireland">Ireland</option>
                                                    <option value="Israel">Israel</option>
                                                    <option value="Italy">Italy</option>
                                                    <option value="Jamaica">Jamaica</option>
                                                    <option value="Japan">Japan</option>
                                                    <option value="Jordan">Jordan</option>
                                                    <option value="Kazakhstan">Kazakhstan</option>
                                                    <option value="Kenya">Kenya</option>
                                                    <option value="Kiribati">Kiribati</option>
                                                    <option value="Kuwait">Kuwait</option>
                                                    <option value="Kyrgyzstan">Kyrgyzstan</option>
                                                    <option value="Laos">Laos</option>
                                                    <option value="Latvia">Latvia</option>
                                                    <option value="Lebanon">Lebanon</option>
                                                    <option value="Lesotho">Lesotho</option>
                                                    <option value="Liberia">Liberia</option>
                                                    <option value="Libya">Libya</option>
                                                    <option value="Liechtenstein">Liechtenstein</option>
                                                    <option value="Lithuania">Lithuania</option>
                                                    <option value="Luxembourg">Luxembourg</option>
                                                    <option value="Macau">Macau</option>
                                                    <option value="Macedonia">Macedonia</option>
                                                    <option value="Madagascar">Madagascar</option>
                                                    <option value="Malawi">Malawi</option>
                                                    <option value="Malaysia">Malaysia</option>
                                                    <option value="Maldives">Maldives</option>
                                                    <option value="Mali">Mali</option>
                                                    <option value="Malta">Malta</option>
                                                    <option value="Marshall Islands">Marshall Islands</option>
                                                    <option value="Martinique">Martinique</option>
                                                    <option value="Mauritania">Mauritania</option>
                                                    <option value="Mauritius">Mauritius</option>
                                                    <option value="Mayotte">Mayotte</option>
                                                    <option value="Mexico">Mexico</option>
                                                    <option value="Federated States of Micronesia">Federated States of Micronesia</option>
                                                    <option value="Moldova">Moldova</option>
                                                    <option value="Monaco">Monaco</option>
                                                    <option value="Mongolia">Mongolia</option>
                                                    <option value="Montserrat">Montserrat</option>
                                                    <option value="Morocco">Morocco</option>
                                                    <option value="Mozambique">Mozambique</option>
                                                    <option value="Namibia">Namibia</option>
                                                    <option value="Nauru">Nauru</option>
                                                    <option value="Nepal">Nepal</option>
                                                    <option value="Netherlands">Netherlands</option>
                                                    <option value="Netherlands Antilles">Netherlands Antilles</option>
                                                    <option value="New Caledonia">New Caledonia</option>
                                                    <option value="New Zealand">New Zealand</option>
                                                    <option value="Nicaragua">Nicaragua</option>
                                                    <option value="Niger">Niger</option>
                                                    <option value="Nigeria">Nigeria</option>
                                                    <option value="Northern Mariana Islands">Northern Mariana Islands</option>
                                                    <option value="Norway">Norway</option>
                                                    <option value="Oman">Oman</option>
                                                    <option value="Pakistan">Pakistan</option>
                                                    <option value="Palau">Palau</option>
                                                    <option value="Panama">Panama</option>
                                                    <option value="Papua New Guinea">Papua New Guinea</option>
                                                    <option value="Paraguay">Paraguay</option>
                                                    <option value="Peru">Peru</option>
                                                    <option value="Philippines">Philippines</option>
                                                    <option value="Pitcairn Islands">Pitcairn Islands</option>
                                                    <option value="Poland">Poland</option>
                                                    <option value="Portugal">Portugal</option>
                                                    <option value="Puerto Rico">Puerto Rico</option>
                                                    <option value="Qatar">Qatar</option>
                                                    <option value="Reunion">Reunion</option>
                                                    <option value="Romania">Romania</option>
                                                    <option value="Russia">Russia</option>
                                                    <option value="Rwanda">Rwanda</option>
                                                    <option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option>
                                                    <option value="Saint Lucia">Saint Lucia</option>
                                                    <option value="Saint Pierre and Miquelon">Saint Pierre and Miquelon</option>
                                                    <option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines</option>
                                                    <option value="Samoa">Samoa</option>
                                                    <option value="San Marino">San Marino</option>
                                                    <option value="Sao Tome and Principe">Sao Tome and Principe</option>
                                                    <option value="Saudi Arabia">Saudi Arabia</option>
                                                    <option value="Senegal">Senegal</option>
                                                    <option value="Serbia and Montenegro">Serbia and Montenegro</option>
                                                    <option value="Seychelles">Seychelles</option>
                                                    <option value="Sierra Leone">Sierra Leone</option>
                                                    <option value="Singapore">Singapore</option>
                                                    <option value="Slovakia">Slovakia</option>
                                                    <option value="Slovenia">Slovenia</option>
                                                    <option value="Solomon Islands">Solomon Islands</option>
                                                    <option value="Somalia">Somalia</option>
                                                    <option value="South Africa">South Africa</option>
                                                    <option value="South Korea">South Korea</option>
                                                    <option value="Spain">Spain</option>
                                                    <option value="Sri Lanka">Sri Lanka</option>
                                                    <option value="Sudan">Sudan</option>
                                                    <option value="Suriname">Suriname</option>
                                                    <option value="Swaziland">Swaziland</option>
                                                    <option value="Sweden">Sweden</option>
                                                    <option value="Switzerland">Switzerland</option>
                                                    <option value="Syria">Syria</option>
                                                    <option value="Taiwan">Taiwan</option>
                                                    <option value="Tajikistan">Tajikistan</option>
                                                    <option value="Tanzania">Tanzania</option>
                                                    <option value="Thailand">Thailand</option>
                                                    <option value="Togo">Togo</option>
                                                    <option value="Tonga">Tonga</option>
                                                    <option value="Trinidad and Tobago">Trinidad and Tobago</option>
                                                    <option value="Tunisia">Tunisia</option>
                                                    <option value="Turkey">Turkey</option>
                                                    <option value="Turkmenistan">Turkmenistan</option>
                                                    <option value="Turks and Caicos Islands">Turks and Caicos Islands</option>
                                                    <option value="Tuvalu">Tuvalu</option>
                                                    <option value="Uganda">Uganda</option>
                                                    <option value="Ukraine">Ukraine</option>
                                                    <option value="United Arab Emirates">United Arab Emirates</option>
                                                    <option value="United Kingdom">United Kingdom</option>
                                                    <option value="Uruguay">Uruguay</option>
                                                    <option value="Uzbekistan">Uzbekistan</option>
                                                    <option value="Vanuatu">Vanuatu</option>
                                                    <option value="Venezuela">Venezuela</option>
                                                    <option value="Vietnam">Vietnam</option>
                                                    <option value="Virgin Islands, British">Virgin Islands, British</option>
                                                    <option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option>
                                                    <option value="West Bank and Gaza Strip">West Bank and Gaza Strip</option>
                                                    <option value="Western Sahara">Western Sahara</option>
                                                    <option value="Yemen">Yemen</option>
                                                    <option value="Zambia">Zambia</option>
                                                    <option value="Zimbabwe">Zimbabwe</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="wy-inline-block state-ship-block hide" style="padding-left: 49px" >
                                            <div class="billLabels wy-inline-block">State:</div>
                                            <div class="wy-inline-block">
                                                <select id="shipCanada" name="state-ca" class="inDrop hide" style="width: 146px; display: none;" ><option selected="selected" value="-1">State</option><option value="AB">Alberta</option><option value="BC">British Columbia</option><option value="MB">Manitoba</option><option value="NB">New Brunswick</option><option value="NL">Newfoundland and Labrador</option><option value="NT">Northwest Territories</option><option value="NS">Nova Scotia</option><option value="NU">Nunavut</option><option value="ON">Ontario</option><option value="PE">Prince Edward Island</option><option value="QC">Quebec</option><option value="SK">Saskatchewan</option><option value="YT">Yukon Territory</option></select>
                                                <select id="shipUS" name="state-US" class="inDrop" style="width: 146px;"><option selected="selected" value="-1">State</option><option value="AL">Alabama</option><option value="AA">Armed Forces Americas</option><option value="AE">Armed Forces Europe</option><option value="AP">Armed Forces Pacific</option><option value="AK">Alaska</option><option value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DC">D.C.</option><option value="DE">Delaware</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennessee</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option></select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="ship-error hide" style="background: #fe4210;color: white;padding: 5px;"></div>
                        </div>

                        <div style="text-align:center; padding:40px 0px 20px 0px;">
                            <a <% if(id!=0){%>  href="/submit?idcus=<%=id%>" <%}else{%> href="" <%}%> id="paybutton" class="inSubmitBTN-new" >Submit Order</a>
                        </div>

                        <div style="width:100%; margin:0px auto 0px auto; font-family:'proxima_novalight', Arial, Helvetica, sans-serif; font-size:14px; line-height:normal; color:#CCC; text-align:justify; padding:50px 0px 50px 0px;">
                            * By clicking submit, Customer acknowledges this order is governed by the <a href="https://www.idera.com/legal/softwarelicenseagreement/sql-products#SecondaryNav" target="_blank">Software License Agreement</a> and to the <a href="https://www.idera.com/legal/termsofuse" target="_blank">Terms of Use</a>.<br>
                            ** Maintenance includes access to technical support and product updates for the defined period of the agreement.
                        </div>
                    </div>
                    <div class="hide after-payment-success">
                        <div style="color: #00a1dd; font-size: 24px; font-weight: bold;font-family: Arial, Helvetica, sans-serif;padding-top: 20px;padding-bottom: 10px;">
                            Thank you for purchasing Idera products!
                        </div>
                        <div class="thankyou-msg" style="margin-bottom: 30px;">
                            <div>You will also receive an email with the download link and licence key to the Idera product(s) you selected..</div>
                            <div>To ensure email delivery, please whitelist support@idera.com. If you do not receive your email, please be sure to check both your inbox and filters.</div>
                            <div>Otherwise, please contact technical support at <a href="mailto:ideramysqlsupport@idera.com">ideramysqlsupport@idera.com</a> or call toll free 1.877.GO.IDERA (465.3372) or direct 713.533.5144</div>
                        </div>

                        <div class="after-payment-summary">
                            <div class="product-details-header" style="background-color:#7F786D;margin-bottom: 14px;">
                                <div class="wy-inline-block wy-width-60 CartHeads" style="padding-left: 12px">
                                    Your Items
                                </div>
                                <div class="wy-inline-block CartHeads" style="width: 15%">
                                    Unit Price
                                </div>
                                <div class="wy-inline-block CartHeads">
                                    Quantity
                                </div>
                                <div class="wy-inline-block float-right text-right CartHeads" style="padding-right: 20px;">
                                    Total Price
                                </div>
                            </div>
                            <div class="editblock">
                            </div>
                            <div class="full-width order-summary">
                                <div class="full-width">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        Subtotal:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        $<span class="summary-prod-total">299</span>
                                    </div>
                                </div>

                                <div class="full-width">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        **Maintenance:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;color: #6ea426;">
                                        FREE
                                    </div>
                                </div>

                                <div class="full-width">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        ***Tax:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        $<span class="summary-total-tax">0.00</span>
                                    </div>
                                </div>

                                <div class="full-width" style="background-color: #f3f4f5;">
                                    <div class="wy-inline-block wy-width-60"></div>
                                    <div class="wy-inline-block" style="width: 15%"></div>
                                    <div class="wy-inline-block">
                                        Total:
                                    </div>
                                    <div class="wy-inline-block float-right text-right" style="padding-right: 20px;">
                                        $<span class="summary-total-amount">299</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="pay-info-header"  style="margin: 20px 0;">
                            <h3>Payment Information:</h3>
                        </div>
                        <div class="payment-block clearfix">
                            <div class="wy-inline-block wy-left" style="width: 45%;">
                                <div class="formCardTitleBilling" style="margin-bottom: 20px;">CARD INFORMATION</div>
                                <div>
                                    <div class="wy-inline-block" style="width: 150px;">
                                        Card Number:
                                    </div>
                                    <div class="wy-inline-block card-num" > </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block" style="margin-top: 20px;width: 150px;">
                                        Expiration Date:
                                    </div>
                                    <div class="wy-inline-block card-date" > </div>
                                </div>
                            </div>
                            <div class="wy-inline-block float-right" style="width: 45%;">
                                <div class="formCardTitleBilling" style="margin-bottom: 20px;">BILLING INFORMATION</div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            First Name:
                                        </div>
                                        <div class="wy-inline-block fname"> </div>
                                    </div>
                                    <div class="wy-inline-block float-right" style="width: 40%;">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Last Name:
                                        </div>
                                        <div class="wy-inline-block lname"> </div>
                                    </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Email:
                                        </div>
                                        <div class="wy-inline-block email" > </div>
                                    </div>
                                    <div class="wy-inline-block float-right" style="width: 40%;">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Company:
                                        </div>
                                        <div class="wy-inline-block cname"> </div>
                                    </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Address:
                                        </div>
                                        <div class="wy-inline-block address"> </div>
                                    </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Phone:
                                        </div>
                                        <div class="wy-inline-block  phone"> </div>
                                    </div>
                                    <div class="wy-inline-block float-right" style="width: 40%;">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Zip Code:
                                        </div>
                                        <div class="wy-inline-block zipcode"> </div>
                                    </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            City:
                                        </div>
                                        <div class="wy-inline-block city"> </div>
                                    </div>
                                    <div class="wy-inline-block float-right" style="width: 40%;">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            State:
                                        </div>
                                        <div class="wy-inline-block state"> </div>
                                    </div>
                                </div>
                                <div>
                                    <div class="wy-inline-block">
                                        <div class="wy-inline-block" style="width: 95px;">
                                            Country:
                                        </div>
                                        <div class="wy-inline-block country"> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div style="text-align:center; padding:40px 0px 20px 0px;">
                            <a class="inSubmitBTN-new" href="https://www.idera.com/" style="color: white">Return to Idera.com</a>
                        </div>
                        <div style="width:100%; margin:0px auto 0px auto; font-family:'proxima_novalight', Arial, Helvetica, sans-serif; font-size:14px; line-height:normal; color:#CCC; text-align:justify; padding:50px 0px 50px 0px;">
                            This order is governed by the <a href="https://www.idera.com/legal/softwarelicenseagreement/sql-products#SecondaryNav" target="_blank">Software License Agreement</a>.<br/>
                            ** Maintenance includes access to technical support and product updates for the defined period of the agreement.<br/>
                            *** When Texas is selected as the billing state, order is subject to 8.25% Sales Tax charge. When Indiana is selected, order is subject to a Sales Tax charge of 7%.
                        </div>
                    </div>

                </div>
                    	
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <%@include file="/Public/footer.jsp" %>

