<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  function check(){
	  	var empno=document.getElementById("empno");
	  	var ename=document.getElementById("ename");
	  	if(empno.value==""||ename.value==""){
	  	  alert("用户名或密码不能为空");
	  	  return false;
	  	}
	  	  return true;
	  }
	  function yincang(){
	    var div=document.getElementById("mess");
	    div.style.display="none";//隐藏起来  显示可以设置为空
	    var empno=document.getElementById("empno");
	    if(empno.value=="请输入用户编号"){
	    	empno.value="";
	    }
	  }
	   function show(){
	    var div=document.getElementById("mess");
	    div.style.display="";
	    var empno=document.getElementById("empno");
	    if(empno.value==""){
	    	empno.value="请输入用户编号";
	    }
	  }
	
	</script>

  </head>
  
  <body>
  <div id="mess">
 	<%
 	 String mess=(String) request.getAttribute("message");//Object类型
 	 if(mess!=""){
 	 out.write(mess);
 	 }
 	 %>
  </div>
    <form action="login.do">
      <table align="center">
        <tr >
          <td colspan="3"><img alt="图片不见了" src="abc.jpeg" width="300" height="200"></td>
        </tr>
      	<tr>
      	  <td>用户编号</td>
      	  <td><input type="text" name="yhbh" value="请输入用户编号" id="yhbh" onfocus="yincang()" onblur="show()"></td>
      	  <td><a href="register.jsp">注册账号</a></td>
      	</tr>
      	<tr>
      	  <td>用户名</td>
      	  <td><input type="password" name="yhm" id="yhm" onfocus="yincang()" onblur="show()"></td>
      	  <td><a href="register.jsp">忘记密码</a></td>
      	</tr>
      	<tr>
      	  <td colspan="3" align="center"><input type="submit" value="登录" onclick="return check()"></td>
      	</tr>
      </table>
    </form>
 
  </body>
</html>
