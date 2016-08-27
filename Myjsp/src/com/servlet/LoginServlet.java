package com.servlet;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmpDao;
import com.entity.Emp;


public class LoginServlet extends HttpServlet{
	public int count;
	public LoginServlet() {
		System.out.println("创建LoginServlet对象");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁了LoginServlet");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int co=count+1;
		count=co;
		
		// TODO Auto-generated method stub
		System.out.println("执行了LoginServlet的service方法");
		//接着跳
		String yhbh =request.getParameter("yhbh");
		String yhm  =request.getParameter("yhm");
		//调用dao
		EmpDao ed=new EmpDao();
		Emp emp=ed.login(yhbh, yhm);
			if(emp!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("emp",emp);
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}else{
				request.setAttribute("message", "用户名或密码不正确");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		
				
		
	}
	
}
