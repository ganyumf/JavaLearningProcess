package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;
 

 

public class DBUtil {
	   //������   ���� ���ݿ�  
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
//	      //��ȡ ���Ӷ���
//	     conn=datasource.getConnection(); 
//		return  conn; 
//	}
	 
	public  Connection  getConn() throws ClassNotFoundException, SQLException{
    Class.forName("oracle.jdbc.driver.OracleDriver");
      String url="jdbc:oracle:thin:@localhost:1521:orcl";
      String user="scott";
      String password="tiger";
      //��ȡ ���Ӷ���
     conn=DriverManager.getConnection(url, user, password); 
	return  conn; 
}
	
	
	
	
	/**
	 * ִ�� ��ɾ��
	 * @param String sql ���� sql ��� 
	 * @return ����  ��Ӱ������ 
	 */
	     // String sql="insert into  dept(deptno,dname,loc) values(?,?,?)";
public int executeUpdate(String sql,Object... parm) throws Exception{
	 conn=   getConn() ; 
      //��ȡִ�ж��� 
       ps=conn.prepareStatement(sql);
       //insert into student (sno,sname,ssex,class) values(?,?,?,?)
              //���� ����
            for(int i=0;i<parm.length;i++){
               ps.setObject(i+1, parm[i]);
             }  
      //ִ�� sql ���   
      int result=  ps.executeUpdate(); 
         closeAll();//�رս����
	 return result;
}  
public  ResultSet   executeQuery(String sql,Object ... parm) throws Exception{ 
       conn=getConn() ;
      //��ȡִ�ж��� 
       ps=conn.prepareStatement(sql);
           //���� ���� 
            for(int i=0;i<parm.length;i++){
            	  ps.setObject(i+1, parm[i]);
            }  
      //ִ�� sql ���   
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
