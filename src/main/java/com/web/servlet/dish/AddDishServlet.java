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
import com.services.DishService;

@WebServlet("/AddDishesServlet")
public class AddDishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private DishService dishService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		Logger log = Logger.getLogger(this.getClass());
		log.info("��ʼ��ѯ���в�Ʒ��Ϣ");
	//	List<Dishes> list = dishService.showDishByClassify(name);
		HttpSession session = request.getSession();
//		session.setAttribute("dishes",list);
//		if(list.size()!=0){
		PrintWriter out = response.getWriter();
		out.print("124578");
		out.flush();
		out.close();
//		}else{
//			log.error("��ѯ���в�Ʒ����");
//		}
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
