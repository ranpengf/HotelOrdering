package com.web.servlet.dish;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.github.pagehelper.PageInfo;
import com.services.DishService;

@WebServlet("/ShowDishesByClassify")
public class ShowDishesByClassify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private DishService dishService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		Logger log = Logger.getLogger(this.getClass());
		log.info("查询菜品通过分类");
		PageInfo<Dishes> pageInfo = dishService.showDishByClassify(name,1,9);
		log.info("返回菜品"+pageInfo.getList().toString());
		HttpSession session = request.getSession();
		session.removeAttribute("dishes");
		session.setAttribute("dishes",pageInfo.getList());
		session.setAttribute("page", pageInfo);
		if(pageInfo.getTotal()>pageInfo.getPageSize()){
			session.setAttribute("dishtotal", pageInfo.getTotal());
			}
		PrintWriter out = response.getWriter();
		out.print("0");
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
