<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateDept.jsp' starting page</title>
    
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
        <form action="doUpdate.do"  method="post" >
       部门编号 <input type="text" name="deptno" readonly="readonly"  value="${dept.deptno }"> 
<br>部门名称 <input type="text" name="dname" value="${dept.dname }">
<br>部门位置<input type="text" name="loc" value="${dept.loc }">
<br>
    <input type="submit" value="更新">                                                      
         
        
        </form> 




  </body>
</html>
