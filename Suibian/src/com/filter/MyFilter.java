package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter  {

	public void destroy() {
		System.out.println("myFilter 被消灭了");
		
	}
	public MyFilter() { 
  System.out.println("创建了 MyFilter");
	}
	

	public void doFilter(ServletRequest req, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {
		System.out.println("执行 了 doFilter 方法");
       HttpServletRequest request=(HttpServletRequest)req;
          Object o=  request.getSession().getAttribute("UU");  
        if(o!=null  ){//有 uu  说明 是正常登陆的用户 可以正常使用  
        	fc.doFilter(req, response); 
        }else{
        	request.getRequestDispatcher("A.jsp").forward(request, response);
        } 
	} 
	public void init(FilterConfig arg0) throws ServletException {
		  System.out.println("初始化 filter ");
		
	}

}
