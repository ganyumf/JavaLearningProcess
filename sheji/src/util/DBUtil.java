package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	//工具类  连接  数据库
	public Connection getConn() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@123.206.62.196:1521:orcl";
		String user="scott";
		String password="tiger";
		//获取连接对象
		Connection conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	public int executeUpdate(String sql,Object...parm) throws Exception
	{
		conn=getConn();
		//获取执行对象
		ps=conn.prepareStatement(sql);
		for(int i=0;i<parm.length;i++)
		{
			ps.setObject(i+1,parm[i]);
		}
		//执行sql语句
		int result=ps.executeUpdate();
		closeAll();//关闭结果集
		return result;
	}
	public ResultSet executeQuery(String sql,Object...parm) throws Exception
	{
		conn=getConn();
		//获取执行对象
		ps=conn.prepareStatement(sql);
		for(int i=0;i<parm.length;i++)
		{
			ps.setObject(i+1,parm[i]);
		}
		//执行sql语句
		rs=ps.executeQuery();//并不是直接查询出来放到结果集里，需要不断在当前连接中与数据库进行操作
		return rs;
	}
	public void closeAll() 
	{
		try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
