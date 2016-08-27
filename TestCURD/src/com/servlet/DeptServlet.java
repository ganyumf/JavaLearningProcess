package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptDao;
import com.entity.Dept;

public class DeptServlet  extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		 request.setCharacterEncoding("utf-8");
		 response.setCharacterEncoding("utf-8");
		// 接 调  跳 
		String pname=   request.getParameter("pname");
		String pstart=  request.getParameter("pstart");
		 String pend=   request.getParameter("pend");
		//调用dao
		  DeptDao dd=new DeptDao();
		  List<Dept> list= dd.getDeptBySql(pname, pstart, pend);
		  
		  //跳转到 index.jsp  展示出来 
		      request.setAttribute("list", list);
	  request.getRequestDispatcher("index.jsp").forward(request, response);
		     
//		                          地址    值丢不丢    能不能访问外部项目
		  //请求转发    不变      不丢             不能
		  //重定向        变             丢                 能
		  
		  
		  
		  
		  
		 
		 
		
		
		
		
		
		 
	}
	
	
}
