package com.web.servlet.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bean.Orders;
import com.services.OrderService;

@WebServlet("/UnSubscribeServlet")
public class UnSubscribeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	OrderService orderservice;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始退订");
		String ordernum = request.getParameter("ordernum");
		Orders order = new Orders();
		order.setOrdernum(ordernum);
		order.setStatus("4");
		orderservice.update(order);
		PrintWriter out = response.getWriter();
		log.info("订单"+ordernum+"退订成功");
		out.print("0");
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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
