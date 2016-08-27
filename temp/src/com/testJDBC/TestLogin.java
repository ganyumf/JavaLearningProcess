package com.testJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestLogin {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入用户名 和密码");
		 String ulogin=sc.nextLine();
		 String upwd=sc.nextLine();
		String sql="select * from myuser where ulogin='"+ulogin+"' and upwd='"+upwd+"'";
		 sql="select * from myuser where ulogin=? and upwd=?";
		System.out.println(sql); 
		JDBC jdbc=new JDBC();
		try { 
			Connection conn=  jdbc.getConnection();
		     PreparedStatement ps=conn.prepareStatement(sql);
		             ps.setString(1, ulogin);//向问号中赋值
		             ps.setString(2, upwd); 
		ResultSet rs =ps.executeQuery() ;
		
			//rs = jdbc.executeQuery(sql); 
		      if(rs.next()){
              System.out.println("成功 欢迎"+rs.getString("uname")); 
		      }else{
		    System.out.println("用户名或密码错误");	  
		      }
		} catch (Exception e) { 
			e.printStackTrace();
		}finally{
			jdbc.closeAll();
		}   
		 
//		 预处理   
	  //执行 对象   
		 
		 
		 
		 
		
		
		
		
	}

}
