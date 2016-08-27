<%@page import="com.entity.Emp"%>
<%@page import="com.dao.EmpDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
  	 String empno=request.getParameter("empno");
  	 String ename=request.getParameter("ename");
  	 EmpDao cd=new EmpDao();
  	 Emp emp=cd.login(empno,ename);
  	 if(emp!=null){
  	 	//out.println("登录成功,"+emp.getEname());
  	 	//request.setAttribute("sal", emp.getSal());
  	 	//request.setAttribute("hiredate", emp.getHiredate());
  	 	request.setAttribute("emp", emp);
  	 	//如果成功-->main.jsp  请求转发
  	 	RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
  	 	rd.forward(request,response);
  	 	
  	 }else{
  	    //out.println("用户名或密码不正确");
  	    //attribute  属性
  	    request.setAttribute("message","<script>alert('用户名或密码不正确!')</script>");//键值对形式   
  	    //request.getAttribute("message");//必须是同一个request才能获取到
  	    request.getRequestDispatcher("login.jsp").forward(request,response);
  	    //重定向
  	 	//response.sendRedirect("login.jsp");
  	 }
  	 
  
   %>
   
  </body>
</html>
