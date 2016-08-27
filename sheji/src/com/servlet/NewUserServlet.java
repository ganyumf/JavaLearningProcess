package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TUserDao;
import com.entity.TCustomer;
import com.entity.TUser;

public class NewUserServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NewUserServlet() {
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
		TCustomer t=(TCustomer)request.getSession().getAttribute("currentCustomer");
		long mobileNumber=Long.parseLong(request.getParameter("T1"));
		String roamingStatus=request.getParameter("R1");
		String comLevel=request.getParameter("R2");
		TUserDao td=new TUserDao();
		TUser u=new TUser();
		u.setMobileNumber(mobileNumber);
		u.setRoamingStatus(roamingStatus);
		u.setComLevel(comLevel);
		u.setCustomer(t);
		boolean result=td.addUser(u);
		if(result==true){
			request.setAttribute("message", "<script>alert('添加成功！')</script>");
			request.getRequestDispatcher("newCustomer.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "<script>alert('添加失败！')</script>");
			request.getRequestDispatcher("newCustomer.jsp").forward(request, response);
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
