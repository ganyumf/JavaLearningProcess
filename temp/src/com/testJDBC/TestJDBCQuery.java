package com.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestJDBCQuery {
	
	public static void main(String[] args) throws Exception {
//		2.ע�� ���� ��ȡ���Ӷ��� 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:Orcl";
		String user="ScOtT";
		String password="tiger"; 
		Connection conn =DriverManager.getConnection(url, user, password);
//	   3.��ȡִ�ж���  ִ�� sql ��� 
		Statement st=conn.createStatement();  
		//String sql="select * from emp ";
//		String sql="select d.dname,count(ename)  from emp e,dept d "+
//                    "where e.deptno(+)=d.deptno group by d.dname  ";
		// 1.�ȴ��� ��  
//		String sql="" +
//				"create table myuser (uuid number(10) not null primary key," +
//				" uname varchar2(20) ," +
//				" ulogin varchar2(20)," +
//				" upwd varchar2(20)," +
//				" isadmin number  default 0 ) " +
//				"";
//		int  b=   st.executeUpdate(sql);
//		   System.out.println("��Ӱ������"+b);
		// 2.��¼ ��ѯ 
		//�û���  ���� 
		Scanner sc=new Scanner(System.in);
		 System.out.println("�������û��� ������");
		String ulogin=sc.next();
		String pwd=sc.next();
		String sql="select * from  myuser where ulogin ='"+ulogin+"' and upwd='"+pwd+"' ";
		   //1. sql  ȫ�����  X
		  // 2. sql ���� �û��� �� ���� ��ѯ��������¼  
 	   System.out.println(sql);
        ResultSet rs= st.executeQuery(sql);  
////     4.�������� 
//      //   System.out.println( rs.next());//ȡһ�� ���� �ж� �����Ƿ���ڴ���: true  ����false  
        
        while(rs.next()){ 
           System.out.println("��ӭ��"+rs.getString("uname"));
//           System.out.print(rs.getString("dname")+"--");//����������е����� ��getXXX �� XXX ���� ����
          } 
       //��� ���  �� ��Ӷ���� 
//	  5.�ر� 
        rs.close(); 
        st.close();
        conn.close();  
	   //�û� �ӿ���̨����   ��������     ��ѯ ������  Ա���� ��չʾ���	
//1  ͳ�� �������ŵ����� �� ��������  ������ ����� ����̨��
//   myuser�� uid uname     ulogin  upwd isadmin  
//             1   ������      zsf    123    1  
//             2   ����            ls    123    0 
//   ͨ�� jdbc  ʵ�ֵ�¼����  �û� ���� �û��� ������
//        ��ѯ���ݿ�  �ж��Ƿ� ��ȷ  ��ȷ ��� ��ӭ�� xxx ���� ��� �û������벻��ȷ
		 
		
	}
	
	
	
	

}
