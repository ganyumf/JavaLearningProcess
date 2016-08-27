package com.testJDBC;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC { 

	public static void main(String[] args) throws Exception  {
		 //1.导入包  ojdbc14.jar
		 //2. 注册驱动类 获取连接对象 
		 //  oracle.jdbc.driver.OracleDriver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 String url="jdbc:oracle:thin:@localhost:1521:orcl";//连接数据库的信息 
		  String user="scott";//连接数据库 的用户名
		 String password="tiger";//密码
		 Connection conn=DriverManager.getConnection(url, user, password);
//		  3.获取执行对象  执行 sql 语句 
		  Statement st=conn.createStatement();
	 //String sql="insert into area(aid,aname,cityid) values(10,'呼兰区',1)";
	 String sql="insert into shi(cid,cname) values(5,'鄂尔多斯')"; 
	 //插入 一个  鄂尔多斯 市
		int i= st.executeUpdate(sql);//-->增删改 +DDL 
		//sql="select * from emp ";
//		ResultSet rs= st.executeQuery(sql);//-->查询 
		//4 处理结果集 
		System.out.println("插入了"+i+"条数据");
		//5.关闭连接 
		st.close();
		conn.close(); 
		

	}

}
