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
                                                <div class="col-sm-6"><span class="text-md mr-4"><span class="text-muted">from</span>￥${dish.price}</span></div>
                                                <div class="col-sm-6 text-sm-right mt-2 mt-sm-0"><button class="btn btn-outline-secondary btn-sm" onclick="addCart('${dish.name}','${dish.price}','${dish.id}')"><span>加入购物车</span></button></div>
                                            </div>
                                        </div>
                                    </div>
                                 </c:forEach>
                                </div>
                               
                                <c:if test="${not empty sessionScope.dishtotal}">                           
                                <nav aria-label="Page navigation example">
                                    <ul class="pagination justify-content-center">
                                      <li class="page-item pageSizeStyle" >
                                          <span aria-hidden="true">&laquo;</span>
                                      </li>
                                      <c:forEach begin="1" end="${page.pages}" var="num">
            								<li class="page-item pageSizeStyle" onclick="showdish(${num})">${num}</li>
        								</c:forEach>
                                      <li class="page-item pageSizeStyle" >
                                          <span aria-hidden="true">&raquo;</span>
                                      </li>
                                    </ul>
                                </nav>
                                </c:if>
</body>
</html>