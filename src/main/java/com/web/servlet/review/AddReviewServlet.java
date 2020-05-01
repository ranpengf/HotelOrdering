package com.web.servlet.review;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bean.Reviews;
import com.bean.Vuser;
import com.services.ReviewService;

@WebServlet("/addReviewServlet")
public class AddReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ReviewService reviewService;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger log = Logger.getLogger(this.getClass());
		log.info("添加评论");
		Vuser user = (Vuser)request.getSession().getAttribute("user");
		String content = request.getParameter("content");
		String lev = request.getParameter("reviewlev");
		String ordernum = request.getParameter("ordernum");
		Integer reviewlev = Integer.valueOf(lev.charAt(0));
		Reviews review = new Reviews();
		review.setContent(content);
		review.setReviewlev(reviewlev);
		review.setOrdernum(ordernum);
		review.setPeoplename(user.getRelname());
		review.setPeoplephone(user.getPhonenum());
		reviewService.addReviewServlet(review);

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
