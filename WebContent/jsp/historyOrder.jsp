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
                        
<script type="text/javascript">
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
</script>
</body>
</html>