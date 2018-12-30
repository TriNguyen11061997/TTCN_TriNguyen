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

                    <div class="button"><span><a href="/cart_add?id=<%=item1.getICProductID()%>" >Giỏ hàng</a></span></div>
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
        <div class="login_panel">
            <h3>Existing Customers</h3>
            <p>Sign in with the form below.</p>
            <form action="/Login_Servlet" method="Post" id="member">
                <input name="UserName" type="text" value="Username" class="field" onfocus="this.value = '';" onblur="if (this.value == '') {
                            this.value = 'Username';
                        }">
                <input name="Password" type="password" value="Password" class="field" onfocus="this.value = '';" onblur="if (this.value == '') {
                            this.value = 'Password';
                        }">
                <p class="note">If you forgot your password just enter your email and click <a href="#">here</a></p>
                <div class="search"><div><input type="submit" value="Sign In" class="grey"></div></div>
            </form>
        </div>
        <div class="register_account">
            <h3>Register New Account</h3>
            <form method="post" action="/CreacteAccount_Servlet">
                <table>
                    <tbody>
                        <tr>
                            <td>

                                <input type="text" required=""  name="name" placeholder="Name">
                                <input type="text" required="true"  name="email" placeholder="Email">
                                <input type="text" required="true"  name="gender" >
                                <input type="text" required="true"  name="user" placeholder="UserName">
                                <input  style="padding: 8px; margin: 5px  0 5px 0; width: 340px; height: 34px"  type="password" required="true" name="password" placeholder="password">
                            </td>
                            <td><div><input type="text" required="true" value="Address" name="address" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Address';
                                    }"></div>
                                        <div><input type="text" required="true" placeholder="city" name="city" ></div>
                                <div><select style="width: 340px;" id="country" name="country" onchange="change_country(this.value)" class="frm-field required">                                      
                                        <option value="AR">Argentina</option>
                                        <option value="AM">Armenia</option>
                                        <option value="AW">Aruba</option>
                                        <option value="AU">Australia</option>
                                        <option value="AT">Austria</option>
                                        <option value="AZ">Azerbaijan</option>
                                        <option value="BS">Bahamas</option>
                                        <option value="BH">Bahrain</option>
                                        <option value="BD">Bangladesh</option>
                                        <option value="BB">Barbados</option>
                                        <option value="BY">Belarus</option>
                                        <option value="BE">Belgium</option>
                                        <option value="BZ">Belize</option>
                                        <option value="BJ">Benin</option>
                                        <option value="BM">Bermuda</option>
                                        <option value="BT">Bhutan</option>
                                        <option value="BO">Bolivia</option>
                                        <option value="BA">Bosnia and Herzegovina</option>
                                        <option value="BW">Botswana</option>
                                        <option value="BV">Bouvet Island</option>
                                        <option value="BR">Brazil</option>
                                        <option value="IO">British Indian Ocean Territory</option>
                                        <option value="BN">Brunei</option>
                                        <option value="BG">Bulgaria</option>
                                        <option value="BF">Burkina Faso</option>
                                        <option value="BI">Burundi</option>
                                        <option value="KH">Cambodia</option>
                                        <option value="CM">Cameroon</option>
                                        <option value="CA">Canada</option>
                                        <option value="CV">Cape Verde</option>
                                        <option value="KY">Cayman Islands</option>
                                        <option value="CF">Central African Republic</option>
                                        <option value="TD">Chad</option>
                                        <option value="CL">Chile</option>
                                        <option value="CN">China</option>
                                        <option value="CX">Christmas Island</option>
                                        <option value="CC">Cocos (Keeling) Islands</option>
                                        <option value="CO">Colombia</option>
                                        <option value="KM">Comoros</option>
                                        <option value="CG">Congo</option>
                                        <option value="CD">Congo, Democratic Republic</option>
                                        <option value="CK">Cook Islands</option>
                                        <option value="CR">Costa Rica</option>
                                        <option value="CI">Cote D'Ivoire (Ivory Coast)</option>
                                        <option value="HR">Croatia (Hrvatska)</option>
                                        <option value="CU">Cuba</option>
                                        <option value="CY">Cyprus</option>
                                        <option value="CZ">Czech Republic</option>
                                        <option value="DK">Denmark</option>
                                        <option value="DJ">Djibouti</option>
                                        <option value="DM">Dominica</option>
                                        <option value="DO">Dominican Republic</option>
                                        <option value="TP">East Timor</option>
                                        <option value="EC">Ecuador</option>
                                        <option value="EG">Egypt</option>
                                        <option value="SV">El Salvador</option>
                                        <option value="GQ">Equatorial Guinea</option>
                                        <option value="ER">Eritrea</option>
                                        <option value="EE">Estonia</option>
                                        <option value="ET">Ethiopia</option>
                                        <option value="FK">Falkland Islands (Islas Malvinas)</option>
                                        <option value="FO">Faroe Islands</option>
                                        <option value="FJ">Fiji Islands</option>
                                        <option value="FI">Finland</option>
                                        <option value="FR">France</option>
                                        <option value="FX">France, Metropolitan</option>
                                        <option value="GF">French Guiana</option>
                                        <option value="PF">French Polynesia</option>
                                        <option value="TF">French Southern Territories</option>
                                        <option value="GA">Gabon</option>
                                        <option value="GM">Gambia, The</option>
                                        <option value="GE">Georgia</option>
                                        <option value="GN">Guinea</option>                                     
                                        <option value="ID">Indonesia</option>
                                        <option value="IR">Iran</option>
                                        <option value="IQ">Iraq</option>                                       
                                        <option value="MX">Mexico</option>
                                        <option value="FM">Micronesia</option>
                                        <option value="MD">Moldova</option>
                                        <option value="MC">Monaco</option>
                                        <option value="MN">Mongolia</option>
                                        <option value="ME">Montenegro</option>
                                        <option value="MS">Montserrat</option>
                                        <option value="MA">Morocco</option>
                                        <option value="MZ">Mozambique</option>
                                        <option value="MM">Myanmar</option>
                                        <option value="NA">Namibia</option>
                                        <option value="NR">Nauru</option>
                                        <option value="NP">Nepal</option>                                     
                                        <option value="PE">Peru</option>
                                        <option value="PH">Philippines</option>
                                        <option value="PN">Pitcairn Island</option>
                                        <option value="PL">Poland</option>
                                        <option value="PT">Portugal</option>
                                        <option value="PR">Puerto Rico</option>
                                        <option value="QA">Qatar</option>
                                        <option value="RE">Reunion</option>
                                        <option value="RO">Romania</option>
                                        <option value="RU">Russia</option>
                                        <option value="Rwanda">Rwanda</option>
                                        <option value="Việt Nam" selected="">Việt Nam</option>
                                        <option value="SH">Saint Helena</option>
                                        <option value="KN">Saint Kitts And Nevis</option>
                                        <option value="LC">Saint Lucia</option>
                                        <option value="PM">Saint Pierre and Miquelon</option>
                                        <option value="VC">Saint Vincent And The Grenadines</option>
                                        <option value="WS">Samoa</option>
                                        <option value="SM">San Marino</option>
                                        <option value="ST">Sao Tome and Principe</option>
                                        <option value="SA">Saudi Arabia</option>
                                        <option value="SN">Senegal</option>
                                    </select></div>		        
                                <div>
                                    <input type="text" required="true" name="numberID" placeholder="CMND"> 
                                    <input type="text" required="true" name="phone"  placeholder="Số điện thoại">
                                </div>
                            </td>
                        </tr> 
                    </tbody></table> 
                <p style="color: red">${dangky}</p>
                <div class="search"><div><input type="submit" value="Create Account" class="grey"></div></div>
                <p class="terms">By clicking 'Create Account' you agree to the <a href="#">Terms &amp; Conditions</a>.</p>
                <div class="clear"></div>
            </form>
        </div>  	
        <div class="clear"></div>
    </div>
</div>
</div>

<%@include file="/Public/footer.jsp" %>
</body>
</html>