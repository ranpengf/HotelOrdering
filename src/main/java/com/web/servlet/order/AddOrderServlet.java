package com.web.servlet.order;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.bean.Dishes;
import com.bean.OrderInfo;
import com.bean.Vuser;
import com.services.DishService;
import com.services.IUserService;
import com.services.OrderService;

@WebServlet("/AddOrderServlet")
public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	OrderService orderservice;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("创建订单");
		String ordernum = request.getParameter("custPhoneNum");
		String customerName = request.getParameter("amount");
		String custPhoneNum = request.getParameter("custPhoneNum");
		BigDecimal amount = new BigDecimal(Double.parseDouble(request.getParameter("amount")));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date createdate = null;
		try {
			createdate = sdf.parse(request.getParameter("createTime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<OrderInfo> list = orderservice.showAllOrders(ordernum, customerName, custPhoneNum, amount, createdate,null);
		HttpSession session = request.getSession();
		session.setAttribute("orders", list);
		PrintWriter out = response.getWriter();
		out.print("124578");
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
