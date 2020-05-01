package com.web.servlet.classfiy;

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

import com.services.ClassifyService;

@WebServlet("/ShowAllClassfiyServlet")
public class ShowAllClassfiyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	ClassifyService classifyService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始查询所有菜品分类信息");
		List<String> list = null;
		try {
			list = classifyService.getAllClassify();
		} catch (Exception e) {
			log.error("查询所有菜品分类出错 错误信息：" + e.getMessage());
		}
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		session.setAttribute("classifys", list);
		out.print("<result>success</result>");
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
