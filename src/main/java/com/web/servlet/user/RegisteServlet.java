package com.web.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bean.Vuser;
import com.services.IUserService;

@WebServlet("/registeServlet")
@ServletSecurity
public class RegisteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	IUserService userService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("开始注册");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String birthday = request.getParameter("birthday");
		Vuser user = new Vuser();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(birthday!=null){
		try {
			user.setBirthday(sdf.parse(birthday));
		} catch (ParseException e) {
			log.info("生日日期格式出错 注册失败");
		}
		}
		user.setRelname(name);
		user.setRegisdate(new Date());
		user.setPassword(password);
		user.setPhonenum(phone);
		userService.registerUser(user);
		
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
