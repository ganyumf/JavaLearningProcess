package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.TOperatorDao;
import com.entity.TOperator;

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
		doPost(request,response);
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String operator_id=request.getParameter("loginname");
		String operator_pwd=request.getParameter("password");
		String remember=request.getParameter("remember");
		//System.out.println(operator_id);
		if(remember!=null&&remember.equals("jizhu")){
			Cookie c1=new Cookie("loginname", operator_id);
			//URLEncoder.encode("中文","utf-8");
			//URLDecoder.decode("中文","utf-8");
			c1.setMaxAge(60*60*24*7);
			Cookie c2=new Cookie("password", operator_pwd);
			c2.setMaxAge(60*60*24*7);
			response.addCookie(c1);
			response.addCookie(c2);
		}
		TOperatorDao td=new TOperatorDao();
		TOperator to=td.login(operator_id, operator_pwd);
		if(to!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("CurrentUser",to);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "<script>alert('用户名或密码不正确！')</script>");
			request.getRequestDispatcher("index.jsp").forward(request, response);
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
