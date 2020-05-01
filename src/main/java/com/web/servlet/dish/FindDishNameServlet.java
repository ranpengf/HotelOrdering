package com.web.servlet.dish;

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

import com.bean.Dishes;
import com.bean.Vuser;
import com.github.pagehelper.PageInfo;
import com.services.DishService;
import com.services.IUserService;

@WebServlet("/findDishNameServlet")
public class FindDishNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	DishService dishService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始查询菜品");
		String name = request.getParameter("name");
		 PageInfo<Dishes> pageInfo = dishService.findDishByName(name, 1, 9);
		 List<Dishes> list = pageInfo.getList();
		if(list.size()!=0){
		PrintWriter out = response.getWriter();
		session.setAttribute("dishes", list);
		session.setAttribute("page", pageInfo);
		out.print("0");
		log.info("成功返回菜品："+list);
		out.flush();
		out.close();
		}else{
			session.removeAttribute("dishes");
			log.error("没有查到对应菜品");
		}
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
