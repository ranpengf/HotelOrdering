package com.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bean.Dishes;
import com.bean.Vuser;
import com.services.OrderService;

@WebServlet("/ToPayServlet")
public class ToPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	OrderService orderService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/jsp/toPay.jsp";
		Logger log = Logger.getLogger(this.getClass());
		HttpSession session = request.getSession(false);
		Vuser user = (Vuser) session.getAttribute("user");
		Double amount = (Double) session.getAttribute("totalCount");
		List<Dishes>carlist = (List<Dishes>) session.getAttribute("carlist");
		String ordernum = orderService.addOrder(user.getId(), BigDecimal.valueOf(amount), carlist, new Date(), "000");
		log.info("生成订单"+ordernum);
		session.setAttribute("ordernum", ordernum);
		session.setAttribute("carlist", carlist);
		session.setAttribute("totalCount", amount);
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
