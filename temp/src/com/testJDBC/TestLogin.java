package com.testJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestLogin {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("�������û��� ������");
		 String ulogin=sc.nextLine();
		 String upwd=sc.nextLine();
		String sql="select * from myuser where ulogin='"+ulogin+"' and upwd='"+upwd+"'";
		 sql="select * from myuser where ulogin=? and upwd=?";
		System.out.println(sql); 
		JDBC jdbc=new JDBC();
		try { 
			Connection conn=  jdbc.getConnection();
		     PreparedStatement ps=conn.prepareStatement(sql);
		             ps.setString(1, ulogin);//���ʺ��и�ֵ
		             ps.setString(2, upwd); 
		ResultSet rs =ps.executeQuery() ;
		
			//rs = jdbc.executeQuery(sql); 
		      if(rs.next()){
              System.out.println("�ɹ� ��ӭ"+rs.getString("uname")); 
		      }else{
		    System.out.println("�û������������");	  
		      }
		} catch (Exception e) { 
			e.printStackTrace();
		}finally{
			jdbc.closeAll();
		}   
		 
//		 Ԥ����   
	  //ִ�� ����   
		 
		 
		 
		 
		
		
		
		
	}

}
