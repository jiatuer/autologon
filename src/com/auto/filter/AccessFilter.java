package com.auto.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccessFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	  System.out.println("Access Filter destroy.....");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response =(HttpServletResponse)arg1;
		HttpSession session = request.getSession();
		String URI = request.getRequestURI();
		int index_0 = URI.lastIndexOf("/"); 
		String s_0 = URI.substring(index_0+1, URI.length());
		System.out.println(s_0);
//		System.out.println("URL:"+request.getRequestURL());
		System.out.println("URI:"+request.getRequestURI());
		
		if(s_0.equals("login.jsp")||s_0.equals("LoginServlet")){
			arg2.doFilter(arg0, arg1);
		}
		else{
			if(session.getAttribute("login")==null){
				response.sendRedirect("/right/login.jsp");	
//				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
//				rd.forward(request, response);				
			}
			else{
				arg2.doFilter(arg0, arg1);
			}
		}
		
		
//		arg2.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Access Filter initializing...");
	}

}
