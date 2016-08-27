package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginValidateFilter implements Filter{
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession session=req.getSession();
		String uri=req.getRequestURI();
		//System.out.println(uri);
		String end=uri.substring(uri.lastIndexOf('/')+1);
		//System.out.println(end);
		//System.out.println(end.equals("login.do"));
		Object o=session.getAttribute("CurrentUser");
		
		
		if(o!=null||end.equals("login.do")){
			fc.doFilter(request, response);
		}else {
			request.setAttribute("message", "<script>alert('ÇëÏÈµÇÂ¼£¡')</script>");
			request.getRequestDispatcher("index.jsp").forward(req, response);
		}
	}
}
