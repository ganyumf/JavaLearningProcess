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
	
	
//创建 连接对象  
    public  Connection  getConnection() throws SQLException, ClassNotFoundException{
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	 String url="jdbc:oracle:thin:@localhost:1521:orcl";
    	 String user="scott";
    	 String pwd="tiger";
    	 return DriverManager.getConnection(url, user, pwd);
    }
	
//执行 sql 语句  
    /**
     * 执行 查询 用的
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
    * 执行 增删改 用的方法 
    * @param sql
    * @return
    * @throws SQLException
    * @throws ClassNotFoundException
    */
   public int  executeUpdate(String sql) throws SQLException, ClassNotFoundException{
	      conn=getConnection();
	     st=conn.createStatement();
	   int result= st.executeUpdate(sql); 
	            closeAll();//关闭连接
	    return result;
   }
    
//关闭 连接 
 
	
	
	
	
	

}
