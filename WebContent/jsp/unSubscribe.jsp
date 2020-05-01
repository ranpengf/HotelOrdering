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
<html>
<head>
<link href="css/toastr.css" rel="stylesheet" />
<script src="js/toastr.min.js"></script>
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
<body>
<div id="historyOrder">
                            <table class="table table-striped">
                                <thead>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>订单号</td>
                                        <td>订单日期</td>
                                        <td>订单内容</td>
										<td>消费金额</td>
                                        <td>订单状态</td>
										<td>操作</td>
                                    </tr>
                                     <c:forEach items="${ myorders}"  var="order">
									<tr>
                                        <td>${ order.ordernum}</td>
                                        <td>${order.date}</td>
                                        <td>${order.content}</td>
                                        <td>${order.amount}</td>
                                        <td>${order.status}</td>
										<td>
										<c:choose>
										<c:when test="${order.status=='待支付'}">
										<button class="btn btn-primary returnOrder" onclick="returnOrderAction(this,'${order.date}','${ order.ordernum}')"><span>退单</span></button>
										</c:when>
										<c:when test="${order.status=='已支付'}">
									        <button class="btn btn-primary finishOrder" onclick="finishOrder('${order.ordernum}')"><span>已收货</span></button>
										</c:when>
										<c:when test="${order.status=='已完成'}">
											<button class="btn btn-primary toComment" onclick="reviewOrder('${order.ordernum}')"><span>评论</span></button>
								        </c:when>
								        </c:choose>
								        </td>
                                    </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot></tfoot>
                            </table>

                        </div>
   <!-- 评论  -->
    <!-- Modal  -->
    <div class="modal fade" id="commentInfo" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header modal-header-lg dark bg-dark">
                    <div class="bg-image"><img src="img/photos/bg-review.jpg" style="display:initial;" alt=""></div>
                    <h4 class="modal-title">评论</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><i class="ti-close"></i></button>
                </div>
                <div class="modal-body panel-details-container">
                <div class="panel-details">
                    <form id="starForm">
                    	<input value="" id="orderId" style="display:none;">
                        <div class="form-group">
                            <label style="display: block;">爱我有几分：</label>
                            <span class="iconfont icon-zan"></span>
                            <span class="iconfont icon-zan"></span>
                            <span class="iconfont icon-zan"></span>
                            <span class="iconfont icon-zan"></span>
                            <span class="iconfont icon-zan"></span>
                            <span class="tip"></span>
                        </div>
                        <div class="form-group">
                            <label for="message">给我一些建议吧!</label>
                            <textarea name="message" id="commentContent" cols="30" rows="5" class="form-control" required></textarea>
                        </div>
                    </form>
                </div>
                </div>
                <button class="btn btn-secondary btn-block btn-lg" onclick="saveComments()"><span>保存</span></button>
            </div>
        </div>
    </div>
   
<script type="text/javascript">
	/* 初始化弹框 */
	toastr.options = {
        "closeButton": true,
        "debug": false,
        "newestOnTop": false,
        "progressBar": false,
        "positionClass": "toast-top-right",
        "preventDuplicates": false,
        "showDuration": "300",
        "hideDuration": "1000",
        "timeOut": 0,
        "extendedTimeOut": 0,
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut",
        "tapToDismiss": false
    }
	function loadView(name){
		$("#contentRight").empty();
		$("#contentRight").load("/HotelOrdering/jsp/"+name);
	}
	// 点击退货的事件
	function returnOrderAction(obj,orderCreateTime,ordernum) {
		var thisOrder = $(obj)[0].parentNode.children
		console.log(thisOrder,"thisOrder")
		var nowtime = new Date().getTime()/1000;
		var endReOrderTime = new Date(orderCreateTime).getTime()/1000+300;
		if (nowtime > endReOrderTime) {
		    toastr.info("当前订单已超过规定时间(5分钟)，不可退订，收货后请确认收货！！")
		    loadView("unSubscribe.jsp");
		} else {
			/*toastr.success("确认退单？<br /><button type='button' onclick=`'returnOrder(ordernum)'` class='btn btn-success reOrder'><span>退单</span></button><button type='button' onclick='cancelReturn()' class='btn btn-primary reOrder'><span>取消</span></button>")
			/* toastr.success("收货成功！快去评论吧！<br /><button type='button' onclick='reviewOrder()' class='btn btn-success'><span>评论</span></button>"); */
			var a=confirm('你确定要退订吗？');
			if(!a){
				return ;
				}else{
					console.log("1231");
			    	var tUserInfo={
						"ordernum":ordernum,
					}	
			    	$.ajax({
				    	"type": "post",
				    	"url": "UnSubscribeServlet",
				    	"data":tUserInfo,
						"dataType":'json',
				    	"success": function(data, textStatus){
				    		 toastr.success("退订成功");
				    		 loadView("unSubscribe.jsp");
				    	},
				    	"error": function(){
				    		
				    	}
			    	});   
				}
			}
		}
	
	// 退单
	/* function returnOrder(ordernum) {
		console.log("ordernum:"+ordernum);
		
	} */
	function cancelReturn() {
		toastr.clear();
	}
	// 点击评价
	function reviewOrder(obj,ordernum) {
		console.log(ordernum,"$")
	    $("#commentInfo").modal('show')
	    $("#orderId")[0].value = ordernum
	    console.log($("#orderId")[0].value,"$")
	    
	}
	function finishOrder(ordernum) {
	    toastr.success("`收货成功！快去评论吧！<br />");
	    var tUserInfo={
				"status":"3",
				"ordernum":ordernum
			}	
	    	$.ajax({
		    	"type": "post",
		    	"url": "UpdateOrderStatusServlet",
		    	"data":tUserInfo,
				"dataType":'json',
		    	"success": function(data, textStatus){
		    		 loadView("unSubscribe.jsp");
		    	},
		    	"error": function(){
		    		
		    	}
	    	}); 
	   
	}
	
	// 评分
	var tip=['','1分','2分','3分','4分','5分'];
	$('#starForm').on('mousedown','.iconfont',function(){
	    if($(this).hasClass('icon-zan1')){
	        var score = 0;
	        $(this).parent().attr('data-rh-score' ,score);
	        $(this).addClass('icon-zan').removeClass('icon-zan1').siblings('.iconfont').addClass('icon-zan').removeClass('icon-zan1');
	        $(this).nextAll('.tip').text(tip[0]);
	    }else{
	        var score = $(this).index();
	        $(this).parent().attr('data-rh-score' ,score);
	        $(this).addClass('icon-zan1').removeClass('icon-zan').prevAll('.iconfont').addClass('icon-zan1').removeClass('icon-zan');
	        $(this).nextAll('.tip').text(tip[score]);
	    }
	});
	// 保存评论
	function saveComments() {
	    console.log($('.tip').text(),"分数")
	    console.log($('#commentContent').val(),"评论内容")
	    var review={
	    			"reviewlev":$('.tip').text(),
					"content":$('#commentContent').val(),
					"ordernum":$("#orderId").val(),
					}	
			    	$.ajax({
				    	"type": "post",
				    	"url": "addReviewServlet",
				    	"data":review,
						"dataType":'json',
				    	"success": function(data, textStatus){
				    		toastr.success("评论成功");
				    		$("#commentInfo").modal('hide');
				    		toastr.clear();
				    	},
				    	"error": function(){
				    		
				    	}
			    	});   
	   
	}</script>
</body>
</html>