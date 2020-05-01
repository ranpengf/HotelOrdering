package com.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CookieFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpSession session = req.getSession(false);
//		String uri = req.getRequestURI();
//		 if (uri.indexOf("tologinServlet")>-1){
//			 chain.doFilter(request, response);
//           
//         }
//		 if(uri.equals("/HotelOrdering/")){
//			 chain.doFilter(request, response);
//		 }
//		 if (uri.indexOf("toIndexServlet")>-1){
//			 chain.doFilter(request, response);
//           
//         }
//		 PrintWriter writer = response.getWriter();
//		if (session != null) {
//			if (session.getAttribute("user") == null) {
//				writer.print("01");
//				writer.close();
//				return ;
//			} else {
//				writer.print("02");
//				writer.close();
//				return ;
//			}
//		}else{
			chain.doFilter(request, response);
//	  }
		

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
