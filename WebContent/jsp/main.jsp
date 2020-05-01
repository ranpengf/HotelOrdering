<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.Dishes"%>
<%
 
    
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	List<Dishes> carlist=(List<Dishes>)session.getAttribute("carlist");
	if(carlist==null){
	carlist = new ArrayList<>();
	session.setAttribute("carlist", carlist);
	
	}
	Double totalCount=(Double)session.getAttribute("totalCount");
	if(totalCount==null){
 	totalCount = 0.00;
 	}
	session.setAttribute("totalCount",totalCount);
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<!-- Meta -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Title -->
<title>智能酒店订餐系统</title>

<!-- Favicons -->
<link rel="shortcut icon" href="img/favicon.png">
<link rel="apple-touch-icon" href="img/favicon_60x60.png">
<link rel="apple-touch-icon" sizes="76x76" href="img/favicon_76x76.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="img/favicon_120x120.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="img/favicon_152x152.png">

<!-- CSS Plugins -->
<link rel="stylesheet"
	href="plugins/bootstrap/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="plugins/slick-carousel/slick/slick.css" />
<link rel="stylesheet" href="plugins/animate.css/animate.min.css" />
<link rel="stylesheet"
	href="plugins/animsition/dist/css/animsition.min.css" />

<!-- CSS Icons -->
<link rel="stylesheet" href="css/themify-icons.css" />
<link rel="stylesheet" href="fonts/iconfont.css" />
<link rel="stylesheet"
	href="plugins/font-awesome/css/font-awesome.min.css" />
<!-- CSS Theme -->
<link id="theme" rel="stylesheet" href="css/themes/theme-beige.min.css" />
<link href="css/toastr.css" rel="stylesheet" />
<link rel="stylesheet" href="css/reset.css">
<script src="plugins/jquery/dist/jquery.min.js"></script>
<script src="js/toastr.min.js"></script>
</head>
<script type="text/javascript">

</script>
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
						<a href="index.html"> <img src="img/icon/main.jpg" alt=""
							width="88">
						</a>
					</div>
				</div>
				<div class="col-md-7">
					<!-- Navigation -->
					。
					<nav class="module module-navigation left mr-4">
					<ul id="nav-main" class="nav nav-main">
						<li><a href="toIndexServlet">首页</a></li>
						<c:if test="${empty sessionScope.user}">
							<li><a href="tologinServlet">登录</a></li>
						</c:if>
						<c:if test="${not empty sessionScope.user}">
							<li class="has-dropdown"><a>我的</a>
								<div class="dropdown-container">
									<ul class="dropdown-mega">
										<li><a href="toMyOrderServlet">我的订单</a></li>
										<li><a href="exitUserServlet">注销</a></li>
									</ul>
									<div class="dropdown-image">
										<img src="img/photos/dropdown-more.jpg" alt="">
									</div>
								</div></li>
						</c:if>

						<c:if test="${not empty sessionScope.isAdmin}">
							<li class="has-dropdown"><a href="#">系统管理</a>
								<div class="dropdown-container">
									<ul class="dropdown-mega">
										<li><a href="book-a-table.html">评价管理</a></li>
										<li><a href="toMenuCtrolServlet">菜品管理</a></li>
										<li><a href="blog.html">酒店信息管理</a></li>
									</ul>
								</div></li>
						</c:if>
					</ul>
					</nav>
				</div>
				<div class="col-md-2" id="carhead">
					<a href="#" class="module module-cart right"
						data-toggle="panel-cart"> <span class="cart-icon"> <i
							class="ti ti-shopping-cart"></i> <span class="notification">${carlist.size()}</span>
					</span> <span class="cart-value">${ totalCount} 元</span>
					</a>
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
			<a href="index.html"> <img src="img/logo-horizontal-dark.svg"
				alt="">
			</a>
		</div>

		<a href="#" class="module module-cart" data-toggle="panel-cart"> <i
			class="ti ti-shopping-cart"></i> <span class="notification">2</span>
		</a> </header>
		<!-- Header / End -->

		<!-- Content -->
		<div id="content">

			<!-- Page Title -->
			<div class="page-title bg-light">
				<div class="container">
					<div class="row">
						<div class="col-lg-8 push-lg-4">
							<h1 class="mb-0">Menu Grid</h1>
							<h4 class="text-muted mb-0">Some informations about our
								restaurant</h4>
						</div>
					</div>
				</div>
			</div>
			<!-- Page Content -->
			<div class="page-content">
				<div class="container">
					<div class="row no-gutters">
						<div class="col-md-3" style="padding-right: 20px;">
							<!-- Menu Navigation -->
							<nav id="menu-navigation" class="stick-to-content">
							<ul class="nav nav-menu bg-dark dark">
								<c:forEach items="${ classifys}" var="item">
									<li class="menu-li" onclick="classifydish('${item}')">${item}</li>
								</c:forEach>
							</ul>
							</nav>
						</div>
						<div class="col-md-9">
							<!-- Menu Category / Burgers -->
							<div id="Burgers" class="menu-category">
								<div class="menu-category-title">
									<div class="bg-image">
										<img src="img/photos/menu-title-burgers.jpg" alt="">
									</div>
									<h2 class="title">Delicious</h2>
								</div>
								<div class="input-group" style="padding: 10px 0;">
									<input name="dishsearch" id="dishsearch" type="text"
										class="form-control" placeholder="搜索菜品" required>
									<button class="btn btn-primary btn-submit" type="info"
										onclick="find()">
										<span>搜索</span>
									</button>
									</span>
								</div>
								<div class="menu-category-content padded" id="contentRight">
									<div class="row gutters-sm">
										<c:forEach items="${ sessionScope.dishes}" var="dish">
											<div class="col-lg-4 col-6">
												<!-- Menu Item -->
												<div class="menu-item menu-grid-item">
													<img class="mb-4 menuImg" src="${ dish.imageurl}" alt="">
													<h6 class="mb-0">${dish.name}</h6>
													<div class="dish-desc-style">
														<span>${ dish.description}</span>
													</div>
													<span class="text-muted text-sm">月销量：${ dish.monthsales}</span>
													<div class="row align-items-center mt-4">
														<div class="col-sm-6">
															<span class="text-md mr-4"><span
																class="text-muted">from</span>￥${dish.price}</span>
														</div>
														<div class="col-sm-6 text-sm-right mt-2 mt-sm-0">
															<button class="btn btn-outline-secondary btn-sm"
																onclick="addCart('${dish.name}','${dish.price}','${dish.id}')">
																<span>加入购物车</span>
															</button>
														</div>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>

									<c:if test="${not empty sessionScope.dishtotal}">
										<nav aria-label="Page navigation example">
										<ul class="pagination justify-content-center">
											<li class="page-item pageSizeStyle"><span
												aria-hidden="true">&laquo;</span></li>
											<c:forEach begin="1" end="${page.pages}" var="num">
												<li class="page-item pageSizeStyle"
													onclick="showdish(${num})">${num}</li>
											</c:forEach>
											<li class="page-item pageSizeStyle"><span
												aria-hidden="true">&raquo;</span></li>
										</ul>
										</nav>
									</c:if>
								</div>

							</div>

						</div>
					</div>
				</div>
			</div>

			<!-- Footer -->
			<footer id="footer" class="bg-dark dark">

			<div class="container">
				<div class="footer-second-row">
					<span class="text-muted">Copyright Soup 2020©. Made with
						love by Suelo.</span>
				</div>
			</div>

			<!-- Back To Top --> <a href="#" id="back-to-top"><i
				class="ti ti-angle-up"></i></a> </footer>
			<!-- Footer / End -->

		</div>
		<!-- Content / End -->

		<!-- Panel Cart -->
		<div id="panel-cart">
			<div class="panel-cart-container">
				<div class="panel-cart-title">
					<h5 class="title">已点</h5>
					<button class="close" data-toggle="panel-cart">
						<i class="ti ti-close"></i>
					</button>
				</div>
				<div class="panel-cart-content">
					<table class="table-cart">
						<c:forEach items="${carlist}" var="dish">
							<tr>

								<td class="title"><span class="name">${dish.name}</span></td>
								<td class="price">${dish.price}元</td>
								<td class="price">
									<div class="form-group qiqi-cart-qty">
										<button class="btn quantity-btn minusQuantity" disabled="true">
											<i class="iconfont icon-jia" aria-hidden="true"></i>
										</button>
										<input type="text" class="quentities" value="1" disabled>
										<button class="btn quantity-btn">
											<i class="iconfont icon-jia" aria-hidden="true"></i>
										</button>
									</div>
								</td>
								<td class="actions"><a href="#productModal"
									data-toggle="modal" class="action-icon"><i
										class="ti ti-pencil"></i></a> <a href="#" class="action-icon"><i
										class="ti ti-close"></i></a></td>
							</tr>
						</c:forEach>
					</table>
					<div class="cart-summary">
						<div class="row text-lg">
							<div class="col-7 text-right text-muted">总计:</div>
							<div class="col-5">
								<strong>${totalCount} 元</strong>
							</div>
						</div>
					</div>
				</div>
			</div>
			<a href="ToPayServlet" class=" btn btn-secondary btn-block btn-lg"><span>去结算</span></a>
		</div>
		<!-- Panel Mobile -->
		<nav id="panel-mobile">
		<div class="module module-logo bg-dark dark">
			<a href="#"> <img src="img/logo-light.svg" alt="" width="88">
			</a>
			<button class="close" data-toggle="panel-mobile">
				<i class="ti ti-close"></i>
			</button>
		</div>
		<nav class="module module-navigation"></nav>
		<div class="module module-social">
			<h6 class="text-sm mb-3">Follow Us!</h6>
			<a href="#"
				class="icon icon-social icon-circle icon-sm icon-facebook"><i
				class="fa fa-facebook"></i></a> <a href="#"
				class="icon icon-social icon-circle icon-sm icon-google"><i
				class="fa fa-google"></i></a> <a href="#"
				class="icon icon-social icon-circle icon-sm icon-twitter"><i
				class="fa fa-twitter"></i></a> <a href="#"
				class="icon icon-social icon-circle icon-sm icon-youtube"><i
				class="fa fa-youtube"></i></a> <a href="#"
				class="icon icon-social icon-circle icon-sm icon-instagram"><i
				class="fa fa-instagram"></i></a>
		</div>
		</nav>

		<!-- Body Overlay -->
		<div id="body-overlay"></div>

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

	<script>
function loadView(name){
	$("#contentRight").empty();
	$("#contentRight").load("/HotelOrdering/jsp/"+name);
}
function loadCar(name){
	$("#panel-cart").empty();
	$("#panel-cart").load("/HotelOrdering/jsp/"+name);
	
}
function loadCarHead(name){
	$("#carhead").empty();
	$("#carhead").load("/HotelOrdering/jsp/"+name);
}
	function classifydish(name){
		var tUserInfo={
				"name":name
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "ShowDishesByClassify",
		    	"data":tUserInfo, 
				"dataType":'json',
				"success": function(data, textStatus){
					loadView("dishlist.jsp");
				},
				"error": function(){
				}
			});
	
	}
	function find(){
		var name=$("#dishsearch").val();
		var tUserInfo={
				"name":name
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "findDishNameServlet",
		    	"data":tUserInfo, 
				"dataType":'json',
				"success": function(data, textStatus){
					loadView("dishlist.jsp");
				},
				"error": function(){
				}
			});
	
	}


function showdish(pageNum){
		var tUserInfo={
				"classify":1,
				"pageNum":pageNum,
				"pageSize":9
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "ShowDishesServlet",
		    	"data":tUserInfo, 
				"dataType":'json',
				"success": function(data, textStatus){
					loadView("dishlist.jsp");
				},
				"error": function(){
				}
			});
}
function addCart(name,price) {
	var tUserInfo={
			"name":name,
			"price":price
		}
	$.ajax({
    	"type": "post",
    	"url": "addCarlistServlet",
    	"data":tUserInfo, 
		"dataType":'json',
		"success": function(data, textStatus){
			loadCarHead("carhead.jsp");
			loadCar("carlist.jsp");
		},
		"error": function(){
		}
	});
}

</script>
</body>

</html>
