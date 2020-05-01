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
<title>用户登录</title>

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
<link rel="stylesheet" href="css/reset.css">
<link href="css/toastr.css" rel="stylesheet" />
<script src="plugins/jquery/dist/jquery.min.js"></script>
<script src="js/toastr.min.js"></script>
</head>
<script type="text/javascript">
toastr.options = { // toastr配置
        "closeButton": true, //是否显示关闭按钮
        "debug": false, //是否使用debug模式
        "progressBar": true, //是否显示进度条，当为false时候不显示；当为true时候，显示进度条，当进度条缩短到0时候，消息通知弹窗消失
        "positionClass": "toast-top-center",//显示的动画时间
        "showDuration": "400", //显示的动画时间
        "hideDuration": "1000", //消失的动画时间
        "timeOut": "7000", //展现时间
        "extendedTimeOut": "1000", //加长展示时间
        "showEasing": "swing", //显示时的动画缓冲方式
        "hideEasing": "linear", //消失时的动画缓冲方式
        "showMethod": "fadeIn", //显示时的动画方式
        "hideMethod": "fadeOut" //消失时的动画方式
    }
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
                        <a href="index.html">
                            <img src="img/icon/main.jpg" alt="" width="88">
                        </a>
                    </div>
                </div>
                <div class="col-md-7">
                    <!-- Navigation -->
                    <nav class="module module-navigation left mr-4">
                        <ul id="nav-main" class="nav nav-main">
                            <li>
                                <a href="toIndexServlet">首页</a>
                            </li>
                            <c:if test="${empty sessionScope.user}">
			                   <li><a href="tologinServlet">登录</a></li>
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
    <div id="content bg-dark dark">
        <div class="bg-image bg-parallax"><img id="login-bg" src="img/photos/bg-croissant.jpg" alt=""></div>

        <!-- Page Title -->
        <!-- <div class="page-title">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 push-lg-4">
                        <h1 class="mb-0">Checkout</h1>
                        <h4 class="text-muted mb-0">Some informations about our restaurant</h4>
                    </div>
                </div>
            </div>
        </div> -->

        <!-- Section -->
        <section class="section">
            <div class="container loginStyle" id="loginForm">
                <div class="bg-white p-4 p-md-5 mb-4">
                    <h5 class="border-bottom pb-2"><i class="ti ti-user mr-3 text-primary"></i>登录</h5>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>手机号:</label>
                            <input type="text" class="form-control" id="phone">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>密码:</label>
                            <input type="password" class="form-control" id="password">
                        </div>
                    </div>
                    <div class="row text-lg">
                        <div class="form-group col-sm-12" style="text-align: right;">
                            <label class="custom-control custom-checkbox">
                                <input type="checkbox" class="custom-control-input" id="isAdmin">
                                <span class="custom-control-indicator"></span>
                                <span class="custom-control-description">我是管理员</span>
                            </label>
                        </div>
                    </div>
                    <!-- <h5 class="border-bottom pb-2" style="margin-bottom:10px"><i class="ti ti-wallet mr-3 text-primary"></i>管理员</h5> -->
                    <div class="text-center">
                        <button class="btn btn-primary" id="login" onclick="login()"><span>登录</span></button>
                        <button class="btn btn-primary" id="toRegister"><span>注册</span></button>
                    </div>
                </div>
            </div>
            <div class="container loginStyle" id="registerForm">
                <div class="bg-white p-4 p-md-5 mb-4">
                    <h5 class="border-bottom pb-2"><i class="ti ti-user mr-3 text-primary"></i>登录</h5>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>姓名:</label>
                            <input type="text" class="form-control" id="rname">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>密码:</label>
                            <input type="password" class="form-control" id="rpassword">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>确认密码:</label>
                            <input type="password" class="form-control" id="rsurepassw">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                            <label>电话:</label>
                            <input type="text" class="form-control" id="rphone">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="form-group col-sm-12">
                            <label>生日:</label>
                            <input type="date" class="form-control" id="rbirthday">
                        </div>
                    </div>
                    <div class="text-center">
                        <button class="btn btn-primary" id="reLogin"><span>返回登陆</span></button>
                        <button class="btn btn-primary" id="register" onclick="registe()"><span>提交</span></button>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer id="footer">
              
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

    <!-- Panel Cart -->
    
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

<!-- Modal / Product -->

<!-- JS Plugins -->

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
<script type="js/login.js"></script>

<!-- JS Core -->
<script src="js/core.js"></script>
<script type="text/javascript">
    $('#toRegister').click(function () {
        $('#registerForm').addClass('active')
        $('#loginForm').hide();
        $('#registerForm').show();
    })
    $('#reLogin').click(function () {
        $('#loginForm').addClass('active');
        $('#loginForm').show();
        $('#registerForm').hide();
    })
    function login(){
    	var phone = $('#phone').val();
    	var password = $('#password').val();
    	if ($('#isAdmin').is(":checked")) {

    		var isadmin = "true";

    		} else {

    		var isadmin = "false";

    		}
    	
    	console.log(isadmin);
    	 if (phone==""){
    		 toastr.warning("用户名不能为空！");
    	        return;
    	    }
    	    else if (password==""){
    	    	toastr.warning("密码不能为空！");
    	        return;
    	    }else{
    	    	var tUserInfo={
    				"phone":phone,
    				"password":password,
    				"isAdmin":isadmin
    			}	
    	    	$.ajax({
    		    	"type": "post",
    		    	"url": "loginServlet",
    		    	"data":tUserInfo,
    				"dataType":'json',
    		    	"success": function(data, textStatus){
    		    		toastr.success("登录成功");
    		    		window.location.href="toIndexServlet"; 
    		    	},
    		    	"error": function(){
    		    		toastr.warning('用户名或密码错误！！！');
    		    	}
    	    	});    
    	    }
    	}
 function registe(){
	 var rname = $('#rname').val();
 	var rpassword = $('#rpassword').val();
 	var rsurepassw = $('#rsurepassw').val();
 	var rphone = $('#rphone').val();
 	var rbirthday = $('#rbirthday').val();
 	if(rsurepassw!=rpassword){
 		toastr.warning('两次输入密码不一致');
 		return;
 	}
 	var tUserInfo={
 			"name":rname,
			"phone":rphone,
			"password":rpassword,
			"birthday":rbirthday
		}	
    	$.ajax({
	    	"type": "post",
	    	"url": "registeServlet",
	    	"data":tUserInfo,
			"dataType":'json',
	    	"success": function(data, textStatus){
	    			console.log(data);
	    		 $('#loginForm').addClass('active');
	    	     $('#loginForm').show();
	    	     $('#registerForm').hide();
	    	     toastr.success("注册成功");
	    	},
	    	"error": function(){
	    		 toastr.warning('注册失败');
	    	}
    	});    
 	
 }
</script>
</body>
</html>