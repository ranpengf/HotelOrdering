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

@WebServlet("/ShowDishesServlet")
public class ShowDishesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	DishService dishService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Logger log = Logger.getLogger(this.getClass());
		String pageNum = request.getParameter("pageNum");
		String pageSize = request.getParameter("pageSize");
		log.info("开始查询菜品");
		PageInfo<Dishes> pageInfo = null;
		if(pageNum!=null&&pageSize!=null){
			pageInfo = dishService.showallDishes(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
		}else{
		    pageInfo = dishService.showallDishes(1, 9);
		}
		 List<Dishes> list = pageInfo.getList();
		if(list.size()!=0){
		PrintWriter out = response.getWriter();
		session.setAttribute("dishes", list);
		session.setAttribute("page", pageInfo);
		if(pageInfo.getTotal()>pageInfo.getPageSize()){
			session.setAttribute("dishtotal", pageInfo.getTotal());
			}
		out.print("0");
		log.info("成功返回菜品："+list);
		out.flush();
		out.close();
		}else{
			session.removeAttribute("dishes");
			log.error("获取所有菜品出错");
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
