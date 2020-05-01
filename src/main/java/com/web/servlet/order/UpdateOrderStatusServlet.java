package com.web.servlet.order;

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

import com.bean.OrderInfo;
import com.bean.Orders;
import com.bean.Vuser;
import com.services.OrderService;

@WebServlet("/UpdateOrderStatusServlet")
public class UpdateOrderStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	OrderService orderService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始退订");
		String ordernum = request.getParameter("ordernum");
		String status = request.getParameter("status");
		HttpSession session = request.getSession();
		Vuser user = (Vuser)session.getAttribute("user");
		Orders order = new Orders();
		order.setOrdernum(ordernum);
		order.setStatus(status);
		orderService.update(order);
		PrintWriter out = response.getWriter();
		log.info("订单"+ordernum+"状态改为"+status);
		List<OrderInfo> orders = orderService.ShowMyOrders(user.getPhonenum(), null, null, null);
		session.setAttribute("myorders", orders);
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
