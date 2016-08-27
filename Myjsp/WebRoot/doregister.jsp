<%@page import="java.util.Map.Entry"%>
<%@ page language="java" import="java.util.*,com.dao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doregister.jsp' starting page</title>
    
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
    	String bh=request.getParameter("bianhao");
    	String xm=request.getParameter("xingming");
    	EmpDao ed=new EmpDao();
    	int result=ed.add(bh,xm);
    	if(result>0)
    	{
    		out.write("插入成功！");
    	}else{
    		out.write("插入失败！");
    	}
    	out.write("编号"+bh);
    	out.write("姓名"+xm);
    	out.print(request.getParameterMap()+"<br>");
    	Set<Entry> es=request.getParameterMap().entrySet();
    	for(Entry e:es)
    	{
    		out.write(e.getKey()+"--"+e.getValue());
    	}
    	
    	
     %>
  </body>
</html>
