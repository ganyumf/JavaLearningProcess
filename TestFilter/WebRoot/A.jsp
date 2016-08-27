<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'A.jsp' starting page</title>
    
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
  
  	在线人数：${applicationScope.count}
    <form action="show.do" method="post"> 
    	<input type="text" name="zhi">
    	<input type="submit" value="提交">
    </form>
    
    <div class="links"><p class="line-1" style="display:none;"><a href="http://www.tencent.com/zh-cn/index.shtml" class="link" target="_blank">关于腾讯</a>|<a href="http://www.qq.com/privacy.htm" class="link" target="_blank">隐私政策</a>|<a href="http://crm2.qq.com/page/portalpage/wpa.php?uin=800033878&amp;=1&amp;ty=1&amp;ap=000018{$SP|146|295$}&amp;as=2&amp;v=2" class="link" target="_blank">投诉举报</a>|<a href="http://www.tencent.com/en-us/index.shtml" class="link" target="_blank">About Tencent</a></p><p class="line-2"><span class="slide">Copyright ©2013-2016</span><span class="slide">Qcloud.com. All Rights Reserved. 腾讯云 版权所有</span></p><p class="last"><a href="//www.qcloud.com/doc/product/301/2007" target="_blank">增值电信业务营业许可证：B1.B2-20130326</a> <a target="_blank" href="//www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010802020287"><img class="icon" src="//mccdn.qcloud.com/static/img/d0289dc0a46fc5b15b3363ffa78cf6c7/image.png" style="display: inline-block;width: 20px;height: 20px;vertical-align: middle;margin-right: 5px;">京公网安备 11010802017518</a><a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备11018762号</a><span class="slide">京ICP证150476号</span></p></div>
  </body>
</html>
