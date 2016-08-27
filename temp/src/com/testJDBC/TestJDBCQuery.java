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
//		2.注册 驱动 获取连接对象 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:Orcl";
		String user="ScOtT";
		String password="tiger"; 
		Connection conn =DriverManager.getConnection(url, user, password);
//	   3.获取执行对象  执行 sql 语句 
		Statement st=conn.createStatement();  
		//String sql="select * from emp ";
//		String sql="select d.dname,count(ename)  from emp e,dept d "+
//                    "where e.deptno(+)=d.deptno group by d.dname  ";
		// 1.先创建 表  
//		String sql="" +
//				"create table myuser (uuid number(10) not null primary key," +
//				" uname varchar2(20) ," +
//				" ulogin varchar2(20)," +
//				" upwd varchar2(20)," +
//				" isadmin number  default 0 ) " +
//				"";
//		int  b=   st.executeUpdate(sql);
//		   System.out.println("受影响行数"+b);
		// 2.登录 查询 
		//用户名  密码 
		Scanner sc=new Scanner(System.in);
		 System.out.println("请输入用户名 和密码");
		String ulogin=sc.next();
		String pwd=sc.next();
		String sql="select * from  myuser where ulogin ='"+ulogin+"' and upwd='"+pwd+"' ";
		   //1. sql  全查出来  X
		  // 2. sql 根据 用户名 和 密码 查询出单条记录  
 	   System.out.println(sql);
        ResultSet rs= st.executeQuery(sql);  
////     4.处理结果集 
//      //   System.out.println( rs.next());//取一行 数据 判断 该行是否存在存在: true  否则false  
        
        while(rs.next()){ 
           System.out.println("欢迎您"+rs.getString("uname"));
//           System.out.print(rs.getString("dname")+"--");//将结果集中列的数据 以getXXX 中 XXX 类型 返回
          } 
       //输出 编号  名 雇佣日期 
//	  5.关闭 
        rs.close(); 
        st.close();
        conn.close();  
	   //用户 从控制台输入   部门名称     查询 部门名  员工名 并展示结果	
//1  统计 各个部门的人数 及 部门名称  并将其 输出到 控制台上
//   myuser表 uid uname     ulogin  upwd isadmin  
//             1   张三疯      zsf    123    1  
//             2   李四            ls    123    0 
//   通过 jdbc  实现登录功能  用户 输入 用户名 和密码
//        查询数据库  判断是否 正确  正确 输出 欢迎您 xxx 否则 输出 用户名密码不正确
		 
		
	}
	
	
	
	

}
