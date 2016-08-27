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
<link href="css/style_frame.css" rel="stylesheet" type="text/css" />
<link href="css/jquery.treeview.css" rel="stylesheet"/>
<script src="js/jquery-1.6.2.min.js"></script>
<script src="ui/jquery.ui.core.js"></script>
<script src="ui/jquery.ui.widget.js"></script>
<script src="ui/jquery.ui.accordion.js"></script>
<script src="js/jquery.cookie.js" type="text/javascript"></script>
<script src="js/jquery.treeview.js" type="text/javascript"></script>
<script src="js/demo.js" type="text/javascript"></script>	
    <script>
	$(function() {
		var icons = {
			header: "ui-icon-circle-arrow-e",
			headerSelected: "ui-icon-circle-arrow-e"
		};
		$( "#accordion" ).accordion({
			icons: icons
		});		
	});
	</script>
  </head>
  
 <body>
    <form id="form1" runat="server">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="back_top01">
  <tr>
    <td height="83" colspan="2" align="left"><img src="images/top_img01.gif" width="390" height="83" /></td>
  </tr>
  <tr>
    <td width="15%" height="45" align="left" valign="top"><table border="0" cellpadding="0" cellspacing="0" class="back_top02">
      <tr>
        <td width="55" align="right"><img src="images/top_img02.gif" width="27" height="26" align="absmiddle" /></td>
        <td width="154" align="left" style="font-family:arial;font-size:11px;">&nbsp;&nbsp;<span id="localtime"></span>
            <script type="text/javascript">
function showLocale(objD)
{
	var str,colorhead,colorfoot;
	var yy = objD.getYear();
	if(yy<1900) yy = yy+1900;
	var MM = objD.getMonth()+1;
	if(MM<10) MM = '0' + MM;
	var dd = objD.getDate();
	if(dd<10) dd = '0' + dd;
	var hh = objD.getHours();
	if(hh<10) hh = '0' + hh;
	var mm = objD.getMinutes();
	if(mm<10) mm = '0' + mm;
	var ss = objD.getSeconds();
	if(ss<10) ss = '0' + ss;
	var ww = objD.getDay();
	if  ( ww==0 )  colorhead="<font color=\"#ffffff\">";
	if  ( ww > 0 && ww < 6 )  colorhead="<font color=\"#ffffff\">";
	if  ( ww==6 )  colorhead="<font color=\"#ffffff\">";
	if  (ww==0)  ww="周日";
	if  (ww==1)  ww="周一";
	if  (ww==2)  ww="周二";
	if  (ww==3)  ww="周三";
	if  (ww==4)  ww="周四";
	if  (ww==5)  ww="周五";
	if  (ww==6)  ww="周六";
	colorfoot="</font>"
	str = colorhead + yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + "  " + ww + colorfoot;
	return(str);
}
function tick()
{
	var today;
	today = new Date();
	document.getElementById("localtime").innerHTML = showLocale(today);
	window.setTimeout("tick()", 1000);
}
tick();
      </script></td>
      </tr>
    </table></td>
    <td width="85%" align="center"><table width="98%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="65%" align="left"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="25%"><img src="images/top_icon04.gif" width="24" height="26" hspace="5" align="absmiddle" /><span class="font_white">欢迎您：网站管理员 :)</span></td>
              <td width="75%"><table border="0" cellpadding="0" cellspacing="0" class="back_top03">
                <tr>
                  <td><span class="font_bold">点左侧相关菜单，进入网站管理操作:)</span></td>
                </tr>
              </table></td>
              </tr>
          </table></td>
        <td width="35%" align="right"><table width="278" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="left"><img src="images/top_icon01.gif" width="26" height="24" hspace="5" align="absmiddle" /><a class="link_white" href="member_main.jsp" target="mainFrame">系统首页</a></td>
            <td align="left"><img src="images/top_icon02.gif" width="26" height="24" hspace="5" align="absmiddle" /><a class="link_white" href="http://www.hljtx.com/" target="_blank">网站首页</a></td>
            <td align="left"><img src="images/top_icon03.gif" width="20" height="24" hspace="5" align="absmiddle" /><a class="link_white" href="index.jsp">退出系统</a></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="209" valign="top">
    <table width="209" border="0" cellpadding="0" cellspacing="0" class="back_left01">
  <tr>
    <td align="center" valign="top"><table border="0" cellpadding="0" cellspacing="0" class="back_left02">
      <tr>
        <td><span class="font_bold02">系统功能菜单</span></td>
      </tr>
    </table>
      <table width="140" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>
          <div id="accordion">
	<h3 onFocus="this.blur();">资源管理</h3>
	<div>
    <ul>
    <li><a href='zycx.html' target="mainFrame">资源查询</a></li>    
    <li><a href='fbzy.html' target="mainFrame">发布的资源</a></li>
    <li><a href='wdpl.html' target="mainFrame">我的评论</a></li>
    <li><a href='xzzy.html' target="mainFrame">下载的资源</a></li>
    </ul>	
	</div>
    <h3 onFocus="this.blur();">系统管理</h3>
	<div>
    <ul>
    <li><a href='bmgl.html' target="mainFrame">部门管理</a></li>
    <li><a href='qzgl.html' target="mainFrame">群组管理</a></li>
    <li><a href='rzgl.html' target="mainFrame">日志管理</a></li>
    <li><a href='jsgl.html' target="mainFrame">角色管理</a></li>
    <li><a href='yhgl.jsp' target="mainFrame">用户管理</a></li>   
    </ul>	
	</div> 
     <h3 onFocus="this.blur();">部门意见管理</h3>
	<div>
    <ul>
    <li><a href='bmyj.html' target="mainFrame">部门意见管理</a></li>
    <li><a href='fbyj.html' target="mainFrame">发表意见</a></li>		
    </ul>	 
	</div> 
    <h3 onFocus="this.blur();">部门意见管理</h3>
	<div>
    <ul>
    <li><a href='bmyj.html' target="mainFrame">部门意见管理</a></li>
    <li><a href='fbyj.html' target="mainFrame">发表意见</a></li>		
    </ul>	 
	</div>    	   
</div>
<div class="beijing09">标准化管理</div>
<div style="padding-left:15px;">
    <ul id="red" class="treeview-red">
	<li><span>设计部</span>
        <ul>
           <li>设计部经理
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
            <li>设计部专员
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
        </ul>
    </li>
	<li><span>培训部</span>
    <ul>
           <li>设计部经理
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
            <li>设计部专员
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
        </ul>
    </li>
	<li><span>人事部</span>
    <ul>
           <li>设计部经理
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
            <li>设计部专员
              <ul>
                <li>工作内容
                  <ul>
                     <li><a href="zycx.html" target="mainFrame">标准化内容</a></li>
                  </ul>
                </li>
              </ul>
           </li>
        </ul>
    </li>
	</ul></div>  
<div class="beijing09"><a href="bzhcjgl.html" target="mainFrame">标准化层级管理</a></div>  
<div class="beijing09"><a href="tlzgl.html" target="mainFrame">讨论组管理</a></div>         </td>
        </tr>
      </table>
      <div style="clear:both; height:15px; line-height:15px;"></div>
    <table width="140" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="center"><img src="images/left_icon01.gif" width="55" height="54" border="0" /></td>
        <td align="center"><img src="images/left_icon02.gif" width="55" height="54" border="0" /></td>
      </tr>
    </table>
    <div style="clear:both; height:15px; line-height:15px;"></div></td>
  </tr>
</table>    </td>
    <td align="center" valign="top"><iframe src="member_main.jsp" name="mainFrame" id="mainFrame" frameborder="0" scrolling="Auto" allowtransparency="true" width="100%" height="549px"></iframe></td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="back_bottom01">
  <tr>
    <td><a onfocus="this.blur()" href="http://www.hljtx.com" target="_blank"><img src="images/bottom02.gif" width="107" height="41" border="0" /></a></td>
  </tr>
</table>
    </form>
</body>
</html>
