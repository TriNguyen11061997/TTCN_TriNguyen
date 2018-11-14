<%-- 
    Document   : customer_add
    Created on : Nov 10, 2018, 8:29:28 PM
    Author     : Trí Nguyễn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Customer</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="Assets/css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="Assets/css/style.css" rel='stylesheet' type='text/css' />
        <link href="Assets/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="Assets/css/owl.theme.css" type="text/css" media="all">
        <link rel="stylesheet" href="Assets/css/owl.carousel.css" type="text/css" media="screen" property="" />
        <link href="Assets/css/fontawesome-all.css" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
        <link href="Assets/css/appointment_style.css" rel="stylesheet" type="text/css"/>
        <script>
            function myCheck() {
                var year = document.myform.year.value;
                var sdt = document.myform.SoDienThoai.value;
                var cmnd = document.myform.CMND.value;
                var stbh = document.myform.SoTheBaoHiem.value;
                if (isNaN(year)) {
                    alert("Vui lòng nhập đúng năm");
                    return false;
                }
                if (isNaN(sdt)) {
                    alert("Vui lòng nhập đúng số điện thoại");
                    return false;
                }
                if (isNaN(cmnd)) {
                    alert("Vui lòng nhập đúng chứng minh");
                    return false;
                }
                if (isNaN(stbh)) {
                    alert("Vui lòng nhập đúng số thẻ bảo hiểm");
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <div class="w3ls-banner">
            <div class="heading">
                <h1>THÊM KHÁCH HÀNG</h1>
            </div>
            <div class="container_1">
                <div class="heading">
                    <h2>Vui lòng điền thông tin</h2>
                </div>
                <div class="agile-form">
                    <form action="/CustomerAdd_Servlet" method="GET" name="myform" onsubmit="return myCheck()">
                        <ul class="field-list">
                            <li>
                                <label class="form-label">
                                    Mã khách hàng
                                    <span class="form-required"> * </span>
                                </label>
                                <div class="form-input">
                                    <input type="text" name="ARCustomerNo" placeholder="Mã khách hàng" required>
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    Họ Và Tên
                                    <span class="form-required"> * </span>
                                </label>
                                <div class="form-input">
                                    <input type="text" name="ARCustomerName" placeholder="Tên khách hàng" required>
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    Giới Tính
                                    <span class="form-required"> * </span>
                                </label>
                                <div class="form-input">
                                    <select class="form-dropdown" name="GioiTinh">
                                        <option value="Male"> Male </option>
                                        <option value="Female"> Female </option>
                                        <option value="Transgender"> Transgender </option>
                                    </select>
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    Ngày Sinh
                                    <span class="form-required"> * </span>
                                </label>
                                <div class="form-input dob">
                                    <span class="form-sub-label">
                                        <select name="day" class="day" required>
                                            <option value="1"> 1 </option>
                                            <option value="2"> 2 </option>
                                            <option value="3"> 3 </option>
                                            <option value="4"> 4 </option>
                                            <option value="5"> 5 </option>
                                            <option value="6"> 6 </option>
                                            <option value="7"> 7 </option>
                                            <option value="8"> 8 </option>
                                            <option value="9"> 9 </option>
                                            <option value="10"> 10 </option>
                                            <option value="11"> 11 </option>
                                            <option value="12"> 12 </option>
                                            <option value="13"> 13 </option>
                                            <option value="14"> 14 </option>
                                            <option value="15"> 15 </option>
                                            <option value="16"> 16 </option>
                                            <option value="17"> 17 </option>
                                            <option value="18"> 18 </option>
                                            <option value="19"> 19 </option>
                                            <option value="20"> 20 </option>
                                            <option value="21"> 21 </option>
                                            <option value="22"> 22 </option>
                                            <option value="23"> 23 </option>
                                            <option value="24"> 24 </option>
                                            <option value="25"> 25 </option>
                                            <option value="26"> 26 </option>
                                            <option value="27"> 27 </option>
                                            <option value="28"> 28 </option>
                                            <option value="29"> 29 </option>
                                            <option value="30"> 30 </option>
                                            <option value="31"> 31 </option>
                                        </select>
                                        <label class="form-sub-label1"> Day </label>
                                    </span>
                                    <span class="form-sub-label">
                                        <select name="month" required>
                                            <option value="1"> January </option>
                                            <option value="2"> February </option>
                                            <option value="2"> March </option>
                                            <option value="3"> April </option>
                                            <option value="4"> May </option>
                                            <option value="5"> June </option>
                                            <option value="6"> July </option>
                                            <option value="7"> August </option>
                                            <option value="8"> September </option>
                                            <option value="9"> October </option>
                                            <option value="10"> November </option>
                                            <option value="11"> December </option>
                                        </select>
                                        <label class="form-sub-label1"> Month </label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" class="year" name="year" placeholder=" Enter Year" required>
                                        <label class="form-sub-label1"> Year </label>
                                    </span>
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    Địa Chỉ
                                    <span class="form-required"> * </span>
                                </label>
                                <div class="form-input add">
                                    <span class="form-sub-label">
                                        <input type="text" name="SoNhaTenDuong" placeholder=" " required />
                                        <label class="form-sub-label1"> Số nhà,tên đường </label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" name="PhuongXa" placeholder=" " required>
                                        <label class="form-sub-label1">Phường,xã</label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" name="QuanHuyen" placeholder=" " required>
                                        <label class="form-sub-label1"> Quận,huyện,thị trấn,thành phố</label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" name="Tinh" placeholder=" " required>
                                        <label class="form-sub-label1"> Tỉnh,thành phố </label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" name="zipcode" placeholder=" ">
                                        <label class="form-sub-label1"> Postal / Zip Code </label>
                                    </span>
                                    <span class="form-sub-label">
                                        <input type="text" name="Country" placeholder=" " required>
                                        <label class="form-sub-label1"> Quốc gia </label>
                                    </span>
                                </div>
                            </li>
                            <li>
                                <label class="form-label">                          
                                    Số điện thoại
                                </label>
                                <div class="form-input">
                                    <input type="text" name="ARCustomerPhone" placeholder="0905741243">
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    CMND
                                </label>
                                <div class="form-input">
                                    <input type="text" name="CMND" placeholder="205487632">
                                </div>
                            </li>
                            <li>
                                <label class="form-label">
                                    Số thẻ bảo hiểm
                                </label>
                                <div class="form-input">
                                    <input type="text" name="SoTheBaoHiem" placeholder="143434536">
                                </div>
                            </li>                           
                        </ul>
                        <input type="submit" value="Submit">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
