
<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
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
  </head>
  
  <body>
   	java代码
   		<%out.println("这是java代码??<br>");
   		for(int i=1;i<=9;i++)
   		{
   			for(int j=1;j<=i;j++)
   			{
   				out.print(j+"*"+i+"="+j*i+" ");
   			}
   			out.print("<br>");
   		}
   		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="scott";
		String password="tiger";
		Connection conn=DriverManager.getConnection(url, user, password);
		String sql="select * from emp";
   		PreparedStatement ps=conn.prepareStatement(sql);
   			ResultSet rs=ps.executeQuery();
   			while(rs.next()){
   				out.print(rs.getString("empno")+"--");
   				out.print(rs.getString("ename")+"--");
   				out.print("<br>");
   			}
   		 %>
   	
   	
   	
  </body>
</html>
