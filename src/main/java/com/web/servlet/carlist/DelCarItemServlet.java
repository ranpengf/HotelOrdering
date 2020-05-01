package com.web.servlet.carlist;

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

@WebServlet("/delCarItemServlet")
public class DelCarItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		 HttpSession session = request.getSession(false);
		 List<Dishes> carlist = (List<Dishes>) session.getAttribute("carlist");
		 Double totalCount = (Double)session.getAttribute("totalCount");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		totalCount= totalCount-Double.parseDouble(price);
		Dishes dish = new Dishes();
		dish.setName(name);
		dish.setPrice(BigDecimal.valueOf(Double.parseDouble(price)));
		if(carlist.remove(dish)){
			log.info("成功从购物车中删除菜品"+name);
		}else{
			log.info("从购物车中删除菜品"+name+"失败");
		}
		
		session.removeAttribute("carlist");
		session.removeAttribute("totalCount");
		session.setAttribute("carlist", carlist);
		session.setAttribute("totalCount", totalCount);
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
