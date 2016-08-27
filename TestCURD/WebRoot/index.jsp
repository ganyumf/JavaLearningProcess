<%@page import="com.entity.Dept"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  ${message }
  </head>
  
  <body> 
    <form action="showDept.do"  method="post"   >
       部门名称 <input type="text" name="pname">
     部门编号<input type="text" name="pstart"> 
     --<input type="text" name="pend">
    <br><input type="submit" value="查询">  
    </form> 
    
    <%
         List<Dept> list=(List) request.getAttribute("list"); 
          if(list !=null){
             for(Dept d:list){
               out.write(d.getDeptno()+"--");
               out.write(d.getDname()+"--");
               out.write(d.getLoc()+"--  ");
               out.write("<a href='toUpdate.do?deptno="+d.getDeptno()+"' >修改</a> <br>");
              } 
          } 
     %>
    
    
     
       
           


  </body>
</html>
