package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;
 

 

public class DBUtil {
	   //工具类   连接 数据库  
	private  Connection conn ;
	private PreparedStatement ps;
	private ResultSet rs;
	
	 
//	public  Connection  getConn() throws ClassNotFoundException, SQLException{
//	   BasicDataSource datasource=new BasicDataSource();
//		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//	     datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
//	     datasource.setUsername("scott");
//	      datasource.setPassword("tiger");
//	      datasource.setInitialSize(10);
//	      //获取 连接对象
//	     conn=datasource.getConnection(); 
//		return  conn; 
//	}
	 
	public  Connection  getConn() throws ClassNotFoundException, SQLException{
    Class.forName("oracle.jdbc.driver.OracleDriver");
      String url="jdbc:oracle:thin:@localhost:1521:orcl";
      String user="scott";
      String password="tiger";
      //获取 连接对象
     conn=DriverManager.getConnection(url, user, password); 
	return  conn; 
}
	
	
	
	
	/**
	 * 执行 增删改
	 * @param String sql 接收 sql 语句 
	 * @return 返回  受影响行数 
	 */
	     // String sql="insert into  dept(deptno,dname,loc) values(?,?,?)";
public int executeUpdate(String sql,Object... parm) throws Exception{
	 conn=   getConn() ; 
      //获取执行对象 
       ps=conn.prepareStatement(sql);
       //insert into student (sno,sname,ssex,class) values(?,?,?,?)
              //设置 参数
            for(int i=0;i<parm.length;i++){
               ps.setObject(i+1, parm[i]);
             }  
      //执行 sql 语句   
      int result=  ps.executeUpdate(); 
         closeAll();//关闭结果集
	 return result;
}  
public  ResultSet   executeQuery(String sql,Object ... parm) throws Exception{ 
       conn=getConn() ;
      //获取执行对象 
       ps=conn.prepareStatement(sql);
           //设置 参数 
            for(int i=0;i<parm.length;i++){
            	  ps.setObject(i+1, parm[i]);
            }  
      //执行 sql 语句   
      rs=  ps.executeQuery();
         return  rs;  
} 
   public void closeAll(){
	    try {
			if(rs!=null){
				 rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(conn!=null){
				conn.close();
			}
			 
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	   
   }
     

}
