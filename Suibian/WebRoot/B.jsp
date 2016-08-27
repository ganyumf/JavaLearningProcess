<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

      <%
       String uname=   request.getParameter("uname");
            out.write("xxx"+uname);
            if(uname.equals("admin")){
               out.write("重复不可用");
            }else{
            out.write("可用");
            }
            
      
       %>   

 