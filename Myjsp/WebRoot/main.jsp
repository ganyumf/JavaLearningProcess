<%@page import="com.entity.Emp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
    	欢迎您<br>
    	EL表达式 ${emp}<br>
    	${emp.ename}--${emp.job}--${emp.sal} <br>
    	
    	<% 
    	//out.write(request.getParameter("empno")+"--");
    	//out.write(request.getParameter("ename")+"--");
    	//out.write(((Double)request.getAttribute("sal")).toString()+"--");
    	//out.write((String)request.getAttribute("hiredate"));
    	
    	//Emp e=(Emp)request.getAttribute("emp");
    	//out.write(e.getHiredate());
    	//out.write("<br>");
    	%>
 
  </body>
</html>
