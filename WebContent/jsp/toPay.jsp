<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.bean.Dishes" %>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<!-- Meta -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Title -->
<title>订单确认</title>

<!-- Favicons -->
<link rel="shortcut icon" href="img/favicon.png">
<link rel="apple-touch-icon" href="img/favicon_60x60.png">
<link rel="apple-touch-icon" sizes="76x76" href="img/favicon_76x76.png">
<link rel="apple-touch-icon" sizes="120x120" href="img/favicon_120x120.png">
<link rel="apple-touch-icon" sizes="152x152" href="img/favicon_152x152.png">

<!-- CSS Plugins -->
<link rel="stylesheet" href="plugins/bootstrap/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="plugins/slick-carousel/slick/slick.css" />
<link rel="stylesheet" href="plugins/animate.css/animate.min.css" />
<link rel="stylesheet" href="plugins/animsition/dist/css/animsition.min.css" />

<!-- CSS Icons -->
<link rel="stylesheet" href="css/themify-icons.css" />
<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css" />

<!-- CSS Theme -->
<link id="theme" rel="stylesheet" href="css/themes/theme-beige.min.css" />

</head>

<body>

<!-- Body Wrapper -->
<div id="body-wrapper" class="animsition">

    <!-- Header -->
    <header id="header" class="light">

        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <!-- Logo -->
                    <div class="module module-logo dark">
                        <a href="index.html">
                            <img src="img/icon/main.jpg" alt="" width="88">
                        </a>
                    </div>
                </div>
                <div class="col-md-7">
                    <!-- Navigation -->
                      <nav class="module module-navigation left mr-4">
                        <ul id="nav-main" class="nav nav-main">
                            <li >
                                <a href="toIndexServlet">首页</a>
                              
                            </li>
                           <c:if test="${empty sessionScope.user}">
			                   <li><a href="tologinServlet">登录</a></li>
			               </c:if>
			               <c:if test="${not empty sessionScope.user}">
			                    <li class="has-dropdown">   
                                <a>我的</a>
                                <div class="dropdown-container">
                                    <ul class="dropdown-mega">
                                        <li><a href="toMyOrderServlet">我的订单</a></li>
                                        <li ><a href="exitUserServlet">注销</a></li>
                                    </ul>
                                    <div class="dropdown-image">
                                        <img src="img/photos/dropdown-more.jpg" alt="">
                                    </div>
                                </div>
                            </li>
			               </c:if>
                           
                            <c:if test="${not empty sessionScope.isAdmin}">
                            <li class="has-dropdown">   
                                <a href="#">系统管理</a>
                                <div class="dropdown-container">
                                    <ul class="dropdown-mega">
                                        <li><a href="book-a-table.html">评价管理</a></li>
                                        <li><a href="toMenuCtrolServlet">菜品管理</a></li>
                                        <li><a href="blog.html">酒店信息管理</a></li>
                                    </ul>
                                </div>
                            </li>
                            </c:if>
                        </ul>
                    </nav>
                </div>
               
            </div>
        </div>

    </header>
    <!-- Header / End -->

    <!-- Header -->
    <header id="header-mobile" class="light">

        <div class="module module-nav-toggle">
            <a href="#" id="nav-toggle" data-toggle="panel-mobile"><span></span><span></span><span></span><span></span></a>
        </div>    

        <div class="module module-logo">
            <a href="index.html">
                <img src="img/logo-horizontal-dark.svg" alt="">
            </a>
        </div>

        <a href="#" class="module module-cart" data-toggle="panel-cart">
            <i class="ti ti-shopping-cart"></i>
            <span class="notification">2</span>
        </a>

    </header>
    <!-- Header / End -->

    <!-- Content -->
    <div id="content">

        <!-- Page Title -->
        <div class="page-title bg-dark dark">
            <!-- BG Image -->
            <div class="bg-image bg-parallax"><img src="img/photos/bg-croissant.jpg" alt=""></div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 push-lg-4">
                        <h1 class="mb-0">Checkout</h1>
                        <h4 class="text-muted mb-0">Some informations about our restaurant</h4>
                    </div>
                </div>
            </div>
        </div>

        <!-- Section -->
        <section class="section bg-light">

            <div class="container">
                <div class="row">
                    <div class="col-xl-5 push-xl-7 col-lg-5 push-lg-7">
                        <div class="shadow bg-white stick-to-content mb-4">
                            <div class="bg-dark dark p-4"><h5 class="mb-0">订单信息</h5></div>
                            <table class="table-cart" style="line-height: 1.5;margin-top: 10px;">
                               <c:forEach items="${sessionScope.carlist}" var="dish">
                                <tr>
                                    <td class="title">
                                        <span class="name">${ dish.name}</span>
                                    </td>
                                    <td class="price">${ dish.price}</td>
                                    <td class="price">${ dish.count}</td>
                                </tr>
                                </c:forEach>
                               
                            </table>
                            <div class="cart-summary">
                                <div class="row text-md">
                                    <div class="col-9 text-right text-muted">总额:</div>
                                    <div class="col-3"><strong>${ sessionScope.totalCount}</strong></div>
                                </div>
                            </div>
                        </div>
                    </div> 
                    <div class="col-xl-7 pull-xl-5 col-lg-7 pull-lg-5">
                        <div class="bg-white p-4 p-md-5 mb-4">
                            <h5 class="border-bottom pb-4"><i class="ti ti-user mr-3 text-primary"></i>收货人信息</h5>
                            <div class="row mb-5">
                                <div class="form-group col-sm-12">
                                    <label>收货人姓名:</label>
                                    <input type="text" class="form-control" id="name" value="${user.relname}" disabled="disable"/>
                                </div>
                                <div class="form-group col-sm-12">
                                    <label>订单号:</label>
                                    <input type="text" id="ordernum" class="form-control" value="${ordernum}" disabled="disable"/>
                                </div>
                                <div class="form-group col-sm-12">
                                    <label>房间号:</label>
                                    <input type="text" id="roomid" class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="text-center">
                            <button class="btn btn-primary" onclick="sub()"><span>确认支付</span></button>
                        </div>
                    </div>
                </div>
            </div>

        </section>

        <!-- Footer -->
        <footer id="footer" class="bg-dark dark">
            
            <div class="container">
                <div class="footer-second-row">
                    <span class="text-muted">Copyright Soup 2017©. Made with love by Suelo.</span>
                </div>
            </div>

            <!-- Back To Top -->
            <a href="#" id="back-to-top"><i class="ti ti-angle-up"></i></a>

        </footer>
        <!-- Footer / End -->

    </div>
    <!-- Content / End -->


    <!-- Panel Mobile -->
    <nav id="panel-mobile">
        <div class="module module-logo bg-dark dark">
            <a href="#">
                <img src="img/logo-light.svg" alt="" width="88">
            </a>
            <button class="close" data-toggle="panel-mobile"><i class="ti ti-close"></i></button>
        </div>
        <nav class="module module-navigation"></nav>
        <div class="module module-social">
            <h6 class="text-sm mb-3">Follow Us!</h6>
            <a href="#" class="icon icon-social icon-circle icon-sm icon-facebook"><i class="fa fa-facebook"></i></a>
            <a href="#" class="icon icon-social icon-circle icon-sm icon-google"><i class="fa fa-google"></i></a>
            <a href="#" class="icon icon-social icon-circle icon-sm icon-twitter"><i class="fa fa-twitter"></i></a>
            <a href="#" class="icon icon-social icon-circle icon-sm icon-youtube"><i class="fa fa-youtube"></i></a>
            <a href="#" class="icon icon-social icon-circle icon-sm icon-instagram"><i class="fa fa-instagram"></i></a>
        </div>
    </nav>

    <!-- Body Overlay -->
    <div id="body-overlay"></div>

</div>



<!-- JS Plugins -->
<script src="plugins/jquery/dist/jquery.min.js"></script>
<script src="plugins/tether/dist/js/tether.min.js"></script>
<script src="plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="plugins/slick-carousel/slick/slick.min.js"></script>
<script src="plugins/jquery.appear/jquery.appear.js"></script>
<script src="plugins/jquery.scrollto/jquery.scrollTo.min.js"></script>
<script src="plugins/jquery.localscroll/jquery.localScroll.min.js"></script>
<script src="plugins/jquery-validation/dist/jquery.validate.min.js"></script>
<script src="plugins/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.min.js"></script>
<script src="plugins/skrollr/dist/skrollr.min.js"></script>
<script src="plugins/animsition/dist/js/animsition.min.js"></script>

<!-- JS Core -->
<script src="js/core.js"></script>

<!-- JS Stylewsitcher -->

<script type="text/javascript">


function sub(){
      var txt1=$("#name").val();
      console.log(txt1);
      var txt2=$("#ordernum").val();
      var txt3=$("#roomid").val();
       var url="ToPayPageServlet?ordernum="+txt2+"&roomid="+txt3;
       location.href=url;
}

</script>
</body>

</html>
