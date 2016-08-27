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
          //接调跳 
	   //要修改的值 
	    String deptno=request.getParameter("deptno");
	    String dname=request.getParameter("dname");
	    String loc=request.getParameter("loc");
	    //调用 dao   进行 更新操作 
	      DeptDao dd=new DeptDao();
	      Dept dept=new Dept();
	          dept.setDeptno(Integer.parseInt(deptno));
	          dept.setDname(dname);
	          dept.setLoc(loc);
	     boolean b= dd.updateDept(dept);
       //跟新成功 调到 展示页面 
	     if(b){ 
	     request.setAttribute("message", "<script>alert('更新成功');</script>");  
	       
	     }else{//失败 
	    request.setAttribute("message", "<script>alert('更新失败');</script>");  
		  }
	     request.getRequestDispatcher("index.jsp").forward(request, response); 
	   
}
	
	
}
