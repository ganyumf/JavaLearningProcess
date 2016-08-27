package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter{
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	public void doFilter(ServletRequest req, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest)req;
		Object o=request.getParameter("zhi");
		if(o!=null){
			fc.doFilter(req, response);
		}else {
			request.getRequestDispatcher("A.jsp").forward(request, response);
		}
	}
}
