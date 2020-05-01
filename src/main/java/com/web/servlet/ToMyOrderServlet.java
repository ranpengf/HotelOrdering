package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bean.Classify;
import com.bean.Dishes;
import com.bean.OrderInfo;
import com.bean.Orders;
import com.bean.Vuser;
import com.github.pagehelper.PageInfo;
import com.services.ClassifyService;
import com.services.DishService;
import com.services.OrderService;

@WebServlet("/toMyOrderServlet")
public class ToMyOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	OrderService orderService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/jsp/order.jsp";
		String ordernum = request.getParameter("out_trade_no");
		Logger log = Logger.getLogger(this.getClass());
		HttpSession session = request.getSession(false);
		Vuser user  = (Vuser) session.getAttribute("user");
		//获取用户所有的订单
		List<OrderInfo> orders = orderService.ShowMyOrders(user.getPhonenum(), null, null, null);
		session.setAttribute("myorders", orders);
		session.setAttribute("type", "1");
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	 @Override
		public void init(ServletConfig config) throws ServletException {  
			SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext()); 

		} 
	


}
