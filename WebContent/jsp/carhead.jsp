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
       <a href="#" class="module module-cart right" data-toggle="panel-cart">
                        <span class="cart-icon">
                            <i class="ti ti-shopping-cart"></i>
                            <span class="notification">${carlist.size()}</span>
                        </span>
                        <span class="cart-value">${ totalCount} 元</span>
                    </a>
</body>
<script >
var $panelCartToggle = $('[data-toggle="panel-cart"]'),
$panelCart = $('#panel-cart');

function showPanelCart() {
$panelCart.addClass('show');
$bodyOverlay.fadeIn(400);
}

function hidePanelCart() {
$panelCart.removeClass('show');
$bodyOverlay.fadeOut(400);
}
    $panelCartToggle.on('click', function(){
        if($panelCart.hasClass('show')) {
            hidePanelCart();
        } else {
            showPanelCart();
        }
        return false;
    });
    $panelCart.find('[data-toggle="modal"]').on('click', function(){
        $($(this).attr('href')).modal('show');
    });

</script>
</html>