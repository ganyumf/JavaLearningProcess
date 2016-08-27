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
 	${message}
 </head>
<body>
<!-- ImageReady Slices (index.psd) -->
<TABLE WIDTH=750 BORDER=0 align="center" CELLPADDING=0 CELLSPACING=0>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_01.gif" WIDTH=444 HEIGHT=237 ALT=""></TD>
		<TD>
			<IMG SRC="images/index_02.gif" WIDTH=306 HEIGHT=99 ALT=""></TD>
	</TR>
	<TR>
		<TD >
			<IMG SRC="images/index_03.gif" WIDTH=306 HEIGHT=138 ALT=""></TD>
	</TR>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_04.gif" WIDTH=444 HEIGHT=363 ALT=""></TD>
		<TD width="306" height="185" background="images/index_05.gif"><table width="250" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><form  action="login.do" method="post">
              <div align="center">
                <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="30"><div align="center"><strong>用户名：</strong>
                        <INPUT name="loginname" type="text" value="${cookie.loginname.value}">
                        <br>
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30"><div align="center"><strong>密&nbsp;&nbsp;&nbsp;码：</strong>
                        <INPUT name="password" type="password" value="${cookie.password.value}">
                        
                        
                    </div></td></tr>
                    <tr><td ><div align="left"><strong>记住此用户</strong>
                          <input type="checkbox" name="remember" value="jizhu">
                        
                        
                    </div></td></tr>
                 
                    
                  </tr>
                  <tr>
                    <td height="30">
                      <div align="center">
                        <INPUT type="submit" size="4" value="进入系统">
                      </div></td>
                  </tr>
                </table>
                </div>
            </form></td>
          </tr>
        </table></TD>
	</TR>
	<TR>
		<TD>
			<IMG SRC="images/index_06.gif" WIDTH=306 HEIGHT=178 ALT=""></TD>
	</TR>
</TABLE>
<!-- End ImageReady Slices -->

</body>
</html>
