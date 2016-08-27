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
		// �� ��  �� 
		String pname=   request.getParameter("pname");
		String pstart=  request.getParameter("pstart");
		 String pend=   request.getParameter("pend");
		//����dao
		  DeptDao dd=new DeptDao();
		  List<Dept> list= dd.getDeptBySql(pname, pstart, pend);
		  
		  //��ת�� index.jsp  չʾ���� 
		      request.setAttribute("list", list);
	  request.getRequestDispatcher("index.jsp").forward(request, response);
		     
//		                          ��ַ    ֵ������    �ܲ��ܷ����ⲿ��Ŀ
		  //����ת��    ����      ����             ����
		  //�ض���        ��             ��                 ��
		  
		  
		  
		  
		  
		 
		 
		
		
		
		
		
		 
	}
	
	
}
