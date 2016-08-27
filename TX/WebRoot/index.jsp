<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>黑龙江省同信通信规划设计有限公司-登录页面</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jQuery-1.3.2.js" type="text/javascript"></script>
<script type="text/javascript">
<!--
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}
function MM_preloadimages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadimages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->


 function submitL(){
             $("#form1").submit();
         } 
         
         function code(){
  		var path=$("#imag").attr("src");
  		$.ajax(
  		{
  			url:"random",
  			success: function (){
  				$("#imag").attr("src",path+"?"+ new Date().getTime());
  			}
  		}
  		);
  	}
         
         
         
</script>
${message}
  </head>
  
  <body onload="MM_preloadimages('images/login_btn02.gif')">
<form id="form1" action="login.do" method="post">
<div style="clear:both; height:80px; line-height:80px;"></div>
<table width="100%" border="0" cellpadding="0" cellspacing="0" id="login_table">
  <tr>
    <td width="31" valign="bottom"><img src="images/login_img05.gif" width="31" height="65" /></td>
    <td width="296"><table width="296" border="0" cellpadding="0" cellspacing="0" >
      <tr>
        <td><img src="images/logo.jpg" width="296" height="105" /></td>
      </tr>
      <tr>
        <td valign="top" class="back_login02">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td align="center"><div style="clear:both; height:6px; line-height:6px;"></div>
                    <table width="62%" border="0" cellspacing="8" cellpadding="0">
                      <tr>
                        <td colspan="2" align="left">用户名                        
                        <input type="text" name="login" value="${cookie.nn.value}" id="textfield" width="120" class="login_input" size="17" /></td>
                      </tr>
                      <tr>
                        <td colspan="2" align="left">密&nbsp;&nbsp;&nbsp;&nbsp;码
                          <input type="password" name="pwd" value="${cookie.pp.value}" id="textfield2" width="120" class="login_input" size="17" /></td>
                      </tr>
                       <tr>
                        <td width="60%" align="left">验证码:
                          <input type="text" name="checkcode" id="textfield3" class="login_input" width="60" size="7" /></td>
                        <td width="40%" align="left"><img id='imag' src="random" width="80" height="30" /></td>
                        <td><a href="javascript:void(0)" onclick="code()">刷新</a></td>
                      </tr>
                      <tr><td colspan="2">记住用户名和密码<input type="checkbox" name="remember" value="jizhu"> </td></tr>
                  </table></td>
              </tr>
              <tr>
                <td height="90" align="center"><a href="javascript:void(0)" onclick="submitL()" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image5','','images/login_btn02.gif',1)"><img src="images/login_btn01.gif" name="Image5" width="97" height="51" border="0" id="Image5" /></a></td>
              	<!--  <td height="90" align="center"><a href="javascript:void(0)" onclick="javascript:forms[0].submit();" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image5','','images/login_btn02.gif',1)"><img src="images/login_btn01.gif" name="Image5" width="97" height="51" border="0" id="Image5" /></a></td>
               -->
              </tr>
            </table>
        </td>
      </tr>
    </table></td>
    <td width="31" valign="bottom"><img src="images/login_img06.gif" width="31" height="65" /></td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" id="login_table02">
  <tr>
    <td align="center">power by zdlgv5 2016</td>
  </tr>
  <tr>
    <td height="30" align="center" valign="bottom">黑龙江省同信通信规划设计有限公司</td>
  </tr>
</table>
</form>
</body>
</html>
