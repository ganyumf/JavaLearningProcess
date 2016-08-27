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
	//������  ����  ���ݿ�
	public Connection getConn() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@123.206.62.196:1521:orcl";
		String user="scott";
		String password="tiger";
		//��ȡ���Ӷ���
		Connection conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	public int executeUpdate(String sql,Object...parm) throws Exception
	{
		conn=getConn();
		//��ȡִ�ж���
		ps=conn.prepareStatement(sql);
		for(int i=0;i<parm.length;i++)
		{
			ps.setObject(i+1,parm[i]);
		}
		//ִ��sql���
		int result=ps.executeUpdate();
		closeAll();//�رս����
		return result;
	}
	public ResultSet executeQuery(String sql,Object...parm) throws Exception
	{
		conn=getConn();
		//��ȡִ�ж���
		ps=conn.prepareStatement(sql);
		for(int i=0;i<parm.length;i++)
		{
			ps.setObject(i+1,parm[i]);
		}
		//ִ��sql���
		rs=ps.executeQuery();//������ֱ�Ӳ�ѯ�����ŵ���������Ҫ�����ڵ�ǰ�����������ݿ���в���
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
