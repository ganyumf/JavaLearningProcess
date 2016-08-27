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
	<script type="text/javascript" src="js/jquery.js"></script>
  </head>
  <script>
  	function checkuname(){
  		var uname=$("input[name=uname]").val();
  		$.ajax(
  		{
  			url:"B.jsp", //请求地址
  			type:"POST", //请求类型
  			dataType:"html",//返回结果类型
  			data:"uname="+uname,//传递的参数
  			success: function (data){//响应的回调函数
  				//alert(data);
  				$("#message").text(data);
  			}
  		}
  	);
}
  </script>
  
  
  <body>
  	cookie nn:${cookie.nn.value}
    <form action="login.do" method="post">
    	用<input type="text" name="uname" value="${cookie.nn.value}">
    	<a href="javascript:void(0)" onclick="checkuname()">检查用户名</a><div id="message"></div><br>
    	密<input type="password" name="pwd"><br>
    	记住密码<input type="checkbox" name="remember" value="jizhu">
    	<input type="submit" value="submit">
    </form>
  </body>
</html>
