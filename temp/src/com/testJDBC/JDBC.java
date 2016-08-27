package com.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
 private Connection conn;
 private Statement st;
 private ResultSet rs;
	
	
//���� ���Ӷ���  
    public  Connection  getConnection() throws SQLException, ClassNotFoundException{
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	 String url="jdbc:oracle:thin:@localhost:1521:orcl";
    	 String user="scott";
    	 String pwd="tiger";
    	 return DriverManager.getConnection(url, user, pwd);
    }
	
//ִ�� sql ���  
    /**
     * ִ�� ��ѯ �õ�
     * @param sql
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    
   public ResultSet executeQuery(String sql) throws SQLException, ClassNotFoundException{
	      conn=getConnection();
	      st= conn.createStatement();
	      rs= st.executeQuery(sql); 
	    return rs;
   } 
   public void closeAll(){
	   try {
	   if(rs!=null){ 
			rs.close(); 
		}
		if(st!=null){
		st.close();
		}
		if(conn!=null){
		conn.close();
		}
	   } catch (SQLException e) { 
			e.printStackTrace();
		}
   }
   
   
   /**
    * ִ�� ��ɾ�� �õķ��� 
    * @param sql
    * @return
    * @throws SQLException
    * @throws ClassNotFoundException
    */
   public int  executeUpdate(String sql) throws SQLException, ClassNotFoundException{
	      conn=getConnection();
	     st=conn.createStatement();
	   int result= st.executeUpdate(sql); 
	            closeAll();//�ر�����
	    return result;
   }
    
//�ر� ���� 
 
	
	
	
	
	

}
