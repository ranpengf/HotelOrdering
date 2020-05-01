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
<title>菜品管理</title>

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

<!-- CSS Theme -->
<link id="theme" rel="stylesheet" href="css/themes/theme-beige.min.css" />
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
<script src="plugins/jquery/dist/jquery.min.js"></script>

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
                    <!-- Navigation -->
                    <nav class="module module-navigation left mr-4">
                        <ul id="nav-main" class="nav nav-main">
                            <li >
                                <a href="#">首页</a>
                                <!-- <div class="dropdown-container">
                                    <ul>
                                        <li><a href="index.html">Home Basic</a></li>
                                        <li><a href="index-slider.html">Home Fullwidth Slider</a></li>
                                        <li><a href="index-video.html">Home Video</a></li>
                                    </ul>
                                </div> -->
                            </li>
                            <li><a href="page-offers.html">登录</a></li>
                            <li>
                                <a href="menu-grid-navigation.html">菜单</a>
                            </li>
                            <li class="has-dropdown">   
                                <a href="#">我的</a>
                                <div class="dropdown-container">
                                    <ul class="dropdown-mega">
                                        <li><a href="book-a-table.html">我的订单</a></li>
                                        <li><a href="blog.html">会员管理</a></li>
                                    </ul>
                                    <div class="dropdown-image">
                                        <img src="img/photos/dropdown-more.jpg" alt="">
                                    </div>
                                </div>
                            </li>
                           
                            <li class="has-dropdown">   
                                <a href="#">系统管理</a>
                                <div class="dropdown-container">
                                    <ul class="dropdown-mega">
                                        <li><a href="book-a-table.html">评价管理</a></li>
                                        <li><a href="blog.html">菜品管理</a></li>
                                        <li><a href="blog.html">酒店信息管理</a></li>
                                    </ul>
                                </div>
                            </li>
                            
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
                                    <a href="" class="nav-link">菜品管理</a>
                                    
                                </li>
                                <li class="nav-item">
                                    <a href="" class="nav-link">菜品分类</a>
                                  
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-md-8 push-md-1">
                        <form>
                            <div class="form-group">
                              <label for="exampleInputEmail1">菜品名称</label>
                              <input type="text" class="form-control" placeholder="Text input">
                            </div>
                            <div class="form-group">
                              <label for="exampleInputPassword1">菜品描述</label>
                              <textarea class="form-control" rows="3"></textarea>
                            </div>
                            
                            <div class="form-group">
                                <label for="exampleInputFile">菜品分类</label>
                                <select class="form-control">
                                    <option>特色菜</option>
                                    <option>炒菜类</option>
                                    <option>干锅类</option>
                                    <option>汤</option>
                                    <option>酒水饮料</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputFile">缩略图片</label>
                                <input type="file" id="exampleInputFile">
                            </div>
                            <button type="submit" class="btn btn-primary">添加</button>
                          </form>   
                                
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

    <!-- Panel Cart -->
    <div id="panel-cart">
        <div class="panel-cart-container">
            <div class="panel-cart-title">
                <h5 class="title">Your Cart</h5>
                <button class="close" data-toggle="panel-cart"><i class="ti ti-close"></i></button>
            </div>
            <div class="panel-cart-content">
                <table class="table-cart">
                    <tr>
                        <td class="title">
                            <span class="name"><a href="#productModal" data-toggle="modal">Pizza Chicked BBQ</a></span>
                            <span class="caption text-muted">26”, deep-pan, thin-crust</span>
                        </td>
                        <td class="price">$9.82</td>
                        <td class="actions">
                            <a href="#productModal" data-toggle="modal" class="action-icon"><i class="ti ti-pencil"></i></a>
                            <a href="#" class="action-icon"><i class="ti ti-close"></i></a>
                        </td>
                    </tr>
                    <tr>
                        <td class="title">
                            <span class="name"><a href="#productModal" data-toggle="modal">Beef Burger</a></span>
                            <span class="caption text-muted">Large (500g)</span>
                        </td>
                        <td class="price">$9.82</td>
                        <td class="actions">
                            <a href="#productModal" data-toggle="modal" class="action-icon"><i class="ti ti-pencil"></i></a>
                            <a href="#" class="action-icon"><i class="ti ti-close"></i></a>
                        </td>
                    </tr>
                    <tr>
                        <td class="title">
                            <span class="name"><a href="#productModal" data-toggle="modal">Extra Burger</a></span>
                            <span class="caption text-muted">Small (200g)</span>
                        </td>
                        <td class="price text-success">$0.00</td>
                        <td class="actions">
                            <a href="#productModal" data-toggle="modal" class="action-icon"><i class="ti ti-pencil"></i></a>
                            <a href="#" class="action-icon"><i class="ti ti-close"></i></a>
                        </td>
                    </tr>
                    <tr>
                        <td class="title">
                            <span class="name">Weekend 20% OFF</span>
                        </td>
                        <td class="price text-success">-$8.22</td>
                        <td class="actions"></td>
                    </tr>
                </table>
                <div class="cart-summary">
                    <div class="row">
                        <div class="col-7 text-right text-muted">Order total:</div>
                        <div class="col-5"><strong>$21.02</strong></div>
                    </div>
                    <div class="row">
                        <div class="col-7 text-right text-muted">Devliery:</div>
                        <div class="col-5"><strong>$3.99</strong></div>
                    </div>
                    <hr class="hr-sm">
                    <div class="row text-lg">
                        <div class="col-7 text-right text-muted">Total:</div>
                        <div class="col-5"><strong>$24.21</strong></div>
                    </div>
                </div>
            </div>
        </div>
        <a href="checkout.html" class="panel-cart-action btn btn-secondary btn-block btn-lg"><span>Go to checkout</span></a>
    </div>

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
<div class="modal fade" id="productModal" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header modal-header-lg dark bg-dark">
                <div class="bg-image"><img src="img/photos/modal-add.jpg" alt=""></div>
                <h4 class="modal-title">Specify your dish</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><i class="ti-close"></i></button>
            </div>
            <div class="modal-product-details">
                <div class="row align-items-center">
                    <div class="col-9">
                        <h6 class="mb-0">Boscaiola Pasta</h6>
                        <span class="text-muted">Pasta, Cheese, Tomatoes, Olives</span>
                    </div>
                    <div class="col-3 text-lg text-right">$9.00</div>
                </div>
            </div>
            <div class="modal-body panel-details-container">
                <!-- Panel Details / Size -->
                <div class="panel-details">
                    <h5 class="panel-details-title">
                        <label class="custom-control custom-radio">
                            <input name="radio_title_size" type="radio" class="custom-control-input">
                            <span class="custom-control-indicator"></span>
                        </label>
                        <a href="#panelDetailsSize" data-toggle="collapse">Size</a>
                    </h5>
                    <div id="panelDetailsSize" class="collapse show">
                        <div class="panel-details-content">
                            <div class="form-group">
                                <label class="custom-control custom-radio">
                                    <input name="radio_size" type="radio" class="custom-control-input" checked>
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Small - 100g ($9.99)</span>
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="custom-control custom-radio">
                                    <input name="radio_size" type="radio" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Medium - 200g ($14.99)</span>
                                </label>
                            </div>
                            <div class="form-group">
                                <label class="custom-control custom-radio">
                                    <input name="radio_size" type="radio" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Large - 350g ($21.99)</span>
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Panel Details / Additions -->
                <div class="panel-details">
                    <h5 class="panel-details-title">
                        <label class="custom-control custom-radio">
                            <input name="radio_title_additions" type="radio" class="custom-control-input">
                            <span class="custom-control-indicator"></span>
                        </label>
                        <a href="#panelDetailsAdditions" data-toggle="collapse">Additions</a>
                    </h5>
                    <div id="panelDetailsAdditions" class="collapse">
                        <div class="panel-details-content">
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                            <span class="custom-control-description">Tomato ($1.29)</span>
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                            <span class="custom-control-description">Ham ($1.29)</span>
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                            <span class="custom-control-description">Chicken ($1.29)</span>
                                        </label>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                            <span class="custom-control-description">Cheese($1.29)</span>
                                        </label>
                                    </div>
                                    <div class="form-group">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                            <span class="custom-control-description">Bacon ($1.29)</span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Panel Details / Other -->
                <div class="panel-details">
                    <h5 class="panel-details-title">
                        <label class="custom-control custom-radio">
                            <input name="radio_title_other" type="radio" class="custom-control-input">
                            <span class="custom-control-indicator"></span>
                        </label>
                        <a href="#panelDetailsOther" data-toggle="collapse">Other</a>
                    </h5>
                    <div id="panelDetailsOther" class="collapse">
                        <textarea cols="30" rows="4" class="form-control" placeholder="Put this any other informations..."></textarea>
                    </div>
                </div>
            </div>
            <button type="button" class="modal-btn btn btn-secondary btn-block btn-lg" data-dismiss="modal"><span>Add to Cart</span></button>
        </div>
    </div>
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
</body>

</html>
