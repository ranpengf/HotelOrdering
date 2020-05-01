package com.web.servlet;

import java.io.IOException;

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

import com.bean.Orders;
import com.services.OrderService;

@WebServlet("/ToPayPageServlet")
public class ToPayPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	OrderService orderService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/jsp/alipay.trade.page.pay.jsp";
		Logger log = Logger.getLogger(this.getClass());
		String roomid = request.getParameter("roomid");
		String ordernum = request.getParameter("ordernum");
		HttpSession session = request.getSession();
		Double totalCount = (Double) session.getAttribute("totalCount");
		Orders order = new Orders();
		order.setOrdernum(ordernum);
		order.setRoomid(roomid);
		orderService.update(order);
		url=url+"?WIDtotal_amount="+totalCount.toString()+"&WIDsubject=餐饮&WIDout_trade_no="+ordernum+"&WIDbody=酒店房间号"+roomid+"点餐";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	 @Override
		public void init(ServletConfig config) throws ServletException {  
			SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext()); 

		} 
	


}
