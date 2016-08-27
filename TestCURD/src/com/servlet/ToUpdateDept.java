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
		  //���ݱ�� ��ѯ ����  ����ʾ���� 
		String deptno=request.getParameter("deptno");
		 //���� dao  ��ȡ���� ��Ϣ 
		  DeptDao dd=new DeptDao();
		 Dept d=  dd.getDeptByNo(deptno); 
		 //��תҳ�� 
		   request.setAttribute("dept", d); 
		 request.getRequestDispatcher("updateDept.jsp").forward(request, response);
		 
		  
		  
		
		
		
		
		  
		
		
		 
	}
	
	
}
