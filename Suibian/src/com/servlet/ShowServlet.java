package com.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowServlet() {
		super();
	}
   @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
       System.out.println("ִ���� showServlet ��  service ����");
      
       
       String uri=  request.getRequestURI();
       System.out.println(uri);
       
       
         String zhi=   request.getParameter("zhi");
        request.getSession().setAttribute("zhi", zhi);
	      request.getRequestDispatcher("main.jsp").forward(request, response);
	      
	   
}
	
	
	
}
