package com.testJDBC;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC { 

	public static void main(String[] args) throws Exception  {
		 //1.�����  ojdbc14.jar
		 //2. ע�������� ��ȡ���Ӷ��� 
		 //  oracle.jdbc.driver.OracleDriver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 String url="jdbc:oracle:thin:@localhost:1521:orcl";//�������ݿ����Ϣ 
		  String user="scott";//�������ݿ� ���û���
		 String password="tiger";//����
		 Connection conn=DriverManager.getConnection(url, user, password);
//		  3.��ȡִ�ж���  ִ�� sql ��� 
		  Statement st=conn.createStatement();
	 //String sql="insert into area(aid,aname,cityid) values(10,'������',1)";
	 String sql="insert into shi(cid,cname) values(5,'������˹')"; 
	 //���� һ��  ������˹ ��
		int i= st.executeUpdate(sql);//-->��ɾ�� +DDL 
		//sql="select * from emp ";
//		ResultSet rs= st.executeQuery(sql);//-->��ѯ 
		//4 �������� 
		System.out.println("������"+i+"������");
		//5.�ر����� 
		st.close();
		conn.close(); 
		

	}

}
