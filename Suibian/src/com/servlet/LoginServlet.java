package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
      doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
        Cookie [] cs=  request.getCookies(); //��ȡ ���� cookies 
            for(Cookie c:cs){
            	System.out.println(c.getMaxAge()); //-1 �ر������ʱ ʧЧ
            	System.out.println(c.getName());//cookie ��
            	System.out.println(URLDecoder.decode(c.getValue(), "utf-8")); //cookieֵ
            }
            
      String uname= request.getParameter("uname");
      String pwd=request.getParameter("pwd");
      String remember=request.getParameter("remember");
      if(remember!=null&&remember.equals("jizhu")){ 
      //д�� cookie 
         Cookie  c1=new Cookie("nn", uname);
             c1.setMaxAge(60*60*24*3); 
         Cookie c2=new Cookie("pp", URLEncoder.encode("ɶʱ", "utf-8"));
            response.addCookie(c1);
            response.addCookie(c2);
      }    
         
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
