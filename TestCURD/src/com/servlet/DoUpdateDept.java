package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptDao;
import com.entity.Dept;

public class DoUpdateDept extends HttpServlet {
   @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
          //�ӵ��� 
	   //Ҫ�޸ĵ�ֵ 
	    String deptno=request.getParameter("deptno");
	    String dname=request.getParameter("dname");
	    String loc=request.getParameter("loc");
	    //���� dao   ���� ���²��� 
	      DeptDao dd=new DeptDao();
	      Dept dept=new Dept();
	          dept.setDeptno(Integer.parseInt(deptno));
	          dept.setDname(dname);
	          dept.setLoc(loc);
	     boolean b= dd.updateDept(dept);
       //���³ɹ� ���� չʾҳ�� 
	     if(b){ 
	     request.setAttribute("message", "<script>alert('���³ɹ�');</script>");  
	       
	     }else{//ʧ�� 
	    request.setAttribute("message", "<script>alert('����ʧ��');</script>");  
		  }
	     request.getRequestDispatcher("index.jsp").forward(request, response); 
	   
}
	
	
}
