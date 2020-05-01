package com.web.servlet.user;

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
import com.github.pagehelper.PageInfo;
import com.services.ClassifyService;
import com.services.DishService;

@WebServlet("/exitUserServlet")
public class exitUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	ClassifyService classifyService;

	@Autowired
	DishService dishService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/jsp/main.jsp";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始查询所有菜品分类信息");
		PageInfo<Dishes> pageInfo = null;
		List<String> list = null;
		try {
			list = classifyService.getAllClassify();
			pageInfo= dishService.showallDishes(1, 9);
		} catch (Exception e) {
			log.error("查询所有菜品分类出错 错误信息：" + e.getMessage());
		}
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		session.setAttribute("classifys", list);
		session.setAttribute("dishes", pageInfo.getList());
		session.removeAttribute("user");
		session.removeAttribute("isAdmin");
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
