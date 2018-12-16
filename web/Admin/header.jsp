<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header">
    <div class="header_top">
        <div class="logo">
            <a href="/Admin_Home_Servlet"><img src="../Assets/images/logo.png" alt="" /></a>
        </div>
        <div class="header_top_right">
            <div class="search_box">
                <form>
                    <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
                                this.value = 'Search for Products';
                            }"><input type="submit" value="SEARCH">
                </form>
            </div>
            <div class="languages" title="language">
                <div id="language" class="wrapper-dropdown" tabindex="1">EN
                    <strong class="opencart"> </strong>
                    <ul class="dropdown languges">					
                        <li>
                            <a href="#" title="FranÃ§ais">
                                <span><img src="../Assets/images/gb.png" alt="en" width="26" height="26"></span><span class="lang">English</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" title="FranÃ§ais">
                                <span><img src="../Assets/images/au.png" alt="fr" width="26" height="26"></span><span class="lang">FranÃ§ais</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" title="EspaÃ±ol">
                                <span><img src="../Assets/images/bm.png" alt="es" width="26" height="26"></span><span class="lang">EspaÃ±ol</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" title="Deutsch">
                                <span><img src="../Assets/images/ck.png" alt="de" width="26" height="26"></span><span class="lang">Deutsch</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" title="Russian">
                                <span><img src="../Assets/images/cu.png" alt="ru" width="26" height="26"></span><span class="lang">Russian</span>
                            </a>
                        </li>					
                    </ul>
                </div>
                <script type="text/javascript">
                    function DropDown(el) {
                        this.dd = el;
                        this.initEvents();
                    }
                    DropDown.prototype = {
                        initEvents: function () {
                            var obj = this;

                            obj.dd.on('click', function (event) {
                                $(this).toggleClass('active');
                                event.stopPropagation();
                            });
                        }
                    }

                    $(function () {

                        var dd = new DropDown($('#language'));

                        $(document).click(function () {
                            // all dropdowns
                            $('.wrapper-dropdown').removeClass('active');
                        });

                    });

                </script>
            </div>
            <div class="languages" title="language">
                <div id="user" class="wrapper-dropdown" tabindex="1">TK
                    <strong class="opencart"> </strong>
                    <ul class="dropdown languges">					
                        <li>
                            <a href="/Logout_Servlet">Logout</a>
                        </li>
                        <li>
                            <a>Tài khoản</a>
                        </li>
                        <li>
                            <a href="/Logout_Servlet">Logout</a>
                        </li>
                    </ul>
                </div>
                <script type="text/javascript">
                    function DropDown(el) {
                        this.dd = el;
                        this.initEvents();
                    }
                    DropDown.prototype = {
                        initEvents: function () {
                            var obj = this;

                            obj.dd.on('click', function (event) {
                                $(this).toggleClass('active');
                                event.stopPropagation();
                            });
                        }
                    }

                    $(function () {

                        var dd = new DropDown($('#user'));

                        $(document).click(function () {
                            // all dropdowns
                            $('.wrapper-dropdown').removeClass('active');
                        });

                    });

                </script>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
    <div class="h_menu">
        <a id="touch-menu" class="mobile-menu" href="#">Menu</a>
        <nav>
            <ul class="menu list-unstyled">
                <li><a href="/Admin_Home_Servlet">Trang chủ</a></li>
                <li class="activate"><a href="/Admin_EmployeeManagement_Servlet">Nhân viên</a>
                </li>
                <li><a href="/Admin_SaleOrderManagement_Servlet">Đơn bán hàng</a>			                                
                </li>		
                <li><a href="faq.jsp">Hóa đơn bán hàng</a>
                </li>
                <li><a href="/Admin_Revenue_Servlet">Doanh thu</a></li>
                <li><a href="faq.jsp">Tính lương</a></li>                           
                <div class="clear"> </div>
            </ul>
        </nav> 
        <script src="../Assets/js/menu.js" type="text/javascript"></script>
    </div>
</div>