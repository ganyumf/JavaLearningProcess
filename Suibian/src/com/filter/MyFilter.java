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
		System.out.println("myFilter ��������");
		
	}
	public MyFilter() { 
  System.out.println("������ MyFilter");
	}
	

	public void doFilter(ServletRequest req, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {
		System.out.println("ִ�� �� doFilter ����");
       HttpServletRequest request=(HttpServletRequest)req;
          Object o=  request.getSession().getAttribute("UU");  
        if(o!=null  ){//�� uu  ˵�� ��������½���û� ��������ʹ��  
        	fc.doFilter(req, response); 
        }else{
        	request.getRequestDispatcher("A.jsp").forward(request, response);
        } 
	} 
	public void init(FilterConfig arg0) throws ServletException {
		  System.out.println("��ʼ�� filter ");
		
	}

}
