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

@WebServlet("/getOrdersServlet")
public class GetOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	OrderService orderservice;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		String date = request.getParameter("date");
		String orderStatus = request.getParameter("orderStatus").toString();
		switch (orderStatus) {
		case "待支付":
			orderStatus="1";
			break;
		case "已支付":
			orderStatus="2";
			break;
		case "已完成":
			orderStatus="3";
			break;
		case "已退订":
			orderStatus="4";
			break;
		case "已评论":
			orderStatus="5";
			break;
		default:
			break;
		}
		Vuser user = (Vuser) request.getSession().getAttribute("user");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<OrderInfo> list = null;
		try {
			if(date!=null){
				Date date2 = sdf.parse(date);
				list = orderservice.ShowMyOrders(user.getPhonenum(), null, date2, null);
			}else{
				list = orderservice.ShowMyOrders(user.getPhonenum(), null, null, null);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.setAttribute("myorders", list);
		PrintWriter out = response.getWriter();
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
