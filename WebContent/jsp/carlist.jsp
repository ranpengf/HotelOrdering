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
</head>
<body>
     <div class="panel-cart-container">
        <div class="panel-cart-title">
            <h5 class="title">已点</h5>
            <!-- <button class="close" data-toggle="panel-cart"><i class="ti ti-close"></i></button> -->
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
                        <c:if test="${!dish.subItem}">
                        	<button class="btn quantity-btn minusQuantity" disabled onclick="subItem(this,${dish.id},${dish.count})"><i class="iconfont icon-jianqu" aria-hidden="true"></i></button>
                        </c:if>
                        <c:if test="${dish.subItem}">
                            <button class="btn quantity-btn minusQuantity"  onclick="subItem(this,${dish.id},${dish.count})"><i class="iconfont icon-jianqu" aria-hidden="true"></i></button>
                        </c:if>    
                            <input type="text" name="${dish.id}" class="quentities" value="${dish.count}" disabled>
                            <button class="btn quantity-btn" onclick="addItem(this,${dish.id})"><i class="iconfont icon-tianjia" aria-hidden="true"></i></button>
                        </div>
                    </td>
                    <td class="actions">
                        <p class="action-icon" onclick="delCarItem('${dish.name}')"><i class="ti ti-close"></i></p>
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
    <a href="ToPayServlet" class="panel-cart-action btn btn-secondary btn-block btn-lg" ><span>去结算</span></a>
</body>
<script type="text/javascript">
var myCartList = [
	{a:'sdfs1'},
	{a:'sdfs2'},
	{a:'sdfs3'}
]
function subItem(obj,dishid,cartCount){
	var thisMenu = $(obj)[0].parentNode.children
	
    	thisMenu[1].value = Number(thisMenu[1].value) - 1
	var carItem={
		"dishid":dishid,
		"rice":thisMenu[1].value
	}
	$.ajax({
    	"type": "post",
    	"url": "updCarItemServlet",
    	"data":carItem, 
		"dataType":'json',
		"success": function(data, textStatus){
			loadCarHead("carhead.jsp");
			loadCar("carlist.jsp");
			
		},
		"error": function(){
		}
	});
}
function addItem(obj,dishid){
	var thisMenu = $(obj)[0].parentNode.children
	
	 thisMenu[1].value = Number(thisMenu[1].value) + 1
    var carItem={
		"dishid":dishid,
		"rice":thisMenu[1].value
	}
	$.ajax({
    	"type": "post",
    	"url": "updCarItemServlet",
    	"data":carItem, 
		"dataType":'json',
		"success": function(data, textStatus){
			loadCarHead("carhead.jsp");
			loadCar("carlist.jsp");
			
		},
		"error": function(){
		}
	});
}

function delCarItem(name){
	var tUserInfo={
			"name":name,
			"price":price
		}
	$.ajax({
    	"type": "post",
    	"url": "delCarItemServlet",
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
</html>