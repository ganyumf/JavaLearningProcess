package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmpDao;
import com.entity.Emp;

public class RegisterServlet extends HttpServlet{
	public RegisterServlet() {
		System.out.println("����LoginServlet����");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("������RegisterServlet");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ִ����RegisterServlet��service����");
		//������
		String bh=request.getParameter("bianhao");
    	String xm=request.getParameter("xingming");
    	EmpDao ed=new EmpDao();
    	int result=ed.add(bh,xm);
    	if(result>0)
    	{
    		System.out.println("����ɹ���");
    	}else{
    		System.out.println("����ʧ�ܣ�");
    	}
		
				
		
	}
}
