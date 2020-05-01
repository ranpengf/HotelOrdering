package com.web.servlet.user;

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

import com.bean.Vuser;
import com.services.IUserService;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	IUserService userService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始登录");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String isadmin = request.getParameter("isAdmin");
		
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		log.info("手机号：" + phone + "  密码：" + password + "， 是否是管理员" + isadmin);
		Vuser user = userService.loginUser(phone, password,isadmin);
		if (user != null) {
			session.setAttribute("user", user);
			PrintWriter out = response.getWriter();
			out.print("0");
			out.flush();
			out.close();
		} else {
			log.info("登录失败，账户密码错误");
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
