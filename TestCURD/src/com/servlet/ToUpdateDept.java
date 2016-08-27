package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptDao;
import com.entity.Dept;

public class ToUpdateDept extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  //根据编号 查询 对象  并显示出来 
		String deptno=request.getParameter("deptno");
		 //调用 dao  获取对象 信息 
		  DeptDao dd=new DeptDao();
		 Dept d=  dd.getDeptByNo(deptno); 
		 //跳转页面 
		   request.setAttribute("dept", d); 
		 request.getRequestDispatcher("updateDept.jsp").forward(request, response);
		 
		  
		  
		
		
		
		
		  
		
		
		 
	}
	
	
}
