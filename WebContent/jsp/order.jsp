<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
	
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<!-- Meta -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Title -->
<title>我的订单</title>

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
<link rel="stylesheet" href="fonts/iconfont.css" />
<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet" href="css/reset.css">
<link href="css/toastr.css" rel="stylesheet" />

<!-- CSS Theme -->
<link id="theme" rel="stylesheet" href="css/themes/theme-beige.min.css" />
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
<script src="plugins/jquery/dist/jquery.min.js"></script>
<script src="js/toastr.min.js"></script>

<script src="js/moment.min.js"></script>

<script src="js/bootstrap-datetimepicker.min.js"></script>

<style>
    .searchInfos{
        height: 40px;
    }
    label, #orderStatus, .searchBtn, #datetimepicker1 {
        height: 30px;
        line-height: 30px;
        padding: 0;
        margin: 0;
    }
    .input-group-addon {
        height: 30px;
        line-height: 30px;
    }
</style>

<script>
$(function () {
    $('#datetimepicker1').datetimepicker({
        format: 'YYYY-MM-DD',
        locale: moment.locale('zh-cn')
    });
    $('#datetimepicker2').datetimepicker({
        format: 'YYYY-MM-DD hh:mm',
        locale: moment.locale('zh-cn')
    });
});

</script>

</head>

<body data-spy="scroll" data-target="#side-navigation" data-offset="70">

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
                    <!-- Navigation -->。
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

        

    </header>
    <!-- Header / End -->

    <!-- Content -->
    <div id="content">

        <!-- Page Title -->
        <div class="page-title bg-light">
            <div class="bg-image bg-parallax"><img src="img/photos/bg-desk.jpg" alt=""></div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 push-lg-4">
                        <h1 class="mb-0">FAQ</h1>
                        <h4 class="text-muted mb-0">Some informations about our restaurant</h4>
                    </div>
                </div>
            </div>
        </div>

        <!-- Section -->
        <section class="section">
            
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <!-- Side Navigation -->
                        <nav id="side-navigation" class="stick-to-content pt-4" data-local-scroll>
                            <h5 class="mb-3"><i class="ti ti-align-justify mr-3 text-muted"></i>Pick a content:</h5>
                            <ul class="nav nav-vertical">
                                <li class="nav-item">
                                  		<span class="nav-link" onclick="toHistoryOrder()">历史订单</span>
                                    
                                </li>
                                <li class="nav-item">
                                    	<span class="nav-link" onclick="toUnSubscribe()">订单退订</span>
                                  
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-md-8 push-md-1" id="contentRight">
                       <div id="historyOrder">
                            <table class="table table-striped">
                                <thead>
                                        <div class="row searchInfos">
                                            <div class="form-group col-md-5">
                                                <div class="row">
                                                    <label for="datetimepicker1" class="col-md-4" >选择日期：</label>
                                                    <!--指定 date标记-->
                                                    <div class='input-group date col-md-8' id='datetimepicker1'>
                                                        <input type='text' class="form-control" id="date" />
                                                        <span class="input-group-addon">
                                                            <i class="iconfont icon-date"></i>
                                                        </span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group col-md-5">
                                                <div class="row">
                                                    <label for="orderStatus" class="col-md-4">订单状态</label>
                                                    <select class="form-control col-md-8" id="orderStatus">
                                                        <option>待支付</option>
                                                        <option>已支付</option>
                                                        <option>已完成</option>
                                                        <option>已退订</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <button type="submit" class="btn btn-default col-md-2 searchBtn" onclick="searchOrders()">查询</button>
                                        </div>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>订单号</td>
                                        <td>订单日期</td>
                                        <td>订单内容</td>
                                        <td>订单花费</td>
                                        <td>订单状态</td>
                                    </tr>
                                    <c:forEach items="${ myorders}"  var="order">
									<tr>
                                        <td>${ order.ordernum}</td>
                                        <td>${order.date  }</td>
                                        <td>${order.content}</td>
                                        <td>${order.amount}</td>
                                        <td>${order.status }</td>
                                    </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot></tfoot>
                            </table>

                        </div>
                    </div>
                </div>
            </div>

        </section>

        <!-- Footer -->
        <footer id="footer" class="bg-dark dark">
            
            <div class="container">
                <div class="footer-second-row">
                    <span class="text-muted">Copyright Soup 2020©. Made with love by Suelo.</span>
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

 <!-- Panel Cart -->
   <div id="panel-cart">
        <div class="panel-cart-container">
            <div class="panel-cart-title">
                <h5 class="title">已点</h5>
                <button class="close" data-toggle="panel-cart"><i class="ti ti-close"></i></button>
            </div>
            <div class="panel-cart-content">
                <table class="table-cart">
                	<c:forEach items="${carlist}" var="dish">
                    <tr>
                    	
                        <td class="title">
                            <span class="name">${dish.name}</span>
                        </td>
                        <td class="price">${dish.price}元</td>
                        <td class="price">
                            <div class="form-group qiqi-cart-qty">
                                <button class="btn quantity-btn minusQuantity" disabled="true"><i class="iconfont icon-jia" aria-hidden="true"></i></button>
                                <input type="text" class="quentities" value="1" disabled>
                                <button class="btn quantity-btn"><i class="iconfont icon-jia" aria-hidden="true"></i></button>
                            </div>
                        </td>
                        <td class="actions">
                            <a href="#productModal" data-toggle="modal" class="action-icon"><i class="ti ti-pencil"></i></a>
                            <a href="#" class="action-icon"><i class="ti ti-close"></i></a>
                        </td>
                    </tr>
               		</c:forEach>
                </table>
                <div class="cart-summary">
                    <div class="row text-lg">
                        <div class="col-7 text-right text-muted">总计:</div>
                        <div class="col-5"><strong>${totalCount} 元</strong></div>
                    </div>
                </div>
            </div>
        </div>
        <a href="ToPayServlet" class=" btn btn-secondary btn-block btn-lg"><span>去结算</span></a>
    </div>
<!-- JS Plugins -->

<script src="plugins/tether/dist/js/tether.min.js"></script>
<script src="plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="plugins/slick-carousel/slick/slick.min.js"></script>
<script src="plugins/jquery.appear/jquery.appear.js"></script>
<script src="plugins/jquery.scrollto/jquery.scrollTo.min.js"></script>
<script src="plugins/jquery.localscroll/jquery.localScroll.min.js"></script>
<script src="plugins/jquery-validation/dist/jquery.validate.min.js"></script>
<script src="plugins/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.min.js"></script>
<script src="plugins/twitter-fetcher/js/twitterFetcher_min.js"></script>
<script src="plugins/skrollr/dist/skrollr.min.js"></script>
<script src="plugins/animsition/dist/js/animsition.min.js"></script>

<!-- JS Core -->
<script src="js/core.js"></script>

<script type="text/javascript">

function loadView(name){
	$("#contentRight").empty();
	$("#contentRight").load("/HotelOrdering/jsp/"+name);
}
	function toHistoryOrder(){
		var tUserInfo={
				"orderStatus":null,
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "getOrdersServlet",
		    	"data":tUserInfo,
				"dataType":'json',
		    	"success": function(data, textStatus){
		    		loadView("historyOrder.jsp");
		    	},
		    	"error": function(){
		    		
		    	}
	    	});   
	}
	function toUnSubscribe(){
		
		var tUserInfo={
				"orderStatus":1,
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "getOrdersServlet",
		    	"data":tUserInfo,
				"dataType":'json',
		    	"success": function(data, textStatus){
		    		loadView("unSubscribe.jsp");
		    	},
		    	"error": function(){
		    		
		    	}
	    	}); 
		
	}
	function init(){
		loadView("historyOrder.jsp");
		
	}
function searchOrders(){
	var date = $('#date').val();
	var orderStatus = $('#orderStatus').val();
	    	var tUserInfo={
				"date":date,
				"orderStatus":orderStatus,
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "getOrdersServlet",
		    	"data":tUserInfo,
				"dataType":'json',
		    	"success": function(data, textStatus){
		    		loadView("historyOrder.jsp");
		    	},
		    	"error": function(){
		    		
		    	}
	    	});    
	    }
init();
</script>
</body>

</html>
