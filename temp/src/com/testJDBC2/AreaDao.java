package com.testJDBC2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.testJDBC.JDBC;
public class AreaDao {//对数据库进行 操作 的类
	JDBC jdbc=new JDBC();
	//增
	public boolean addArea(String aname,int cityid)
	{
		String sql="insert into area(aid,aname,cityid) " +
				"values(seq_area.nextval,'"+aname+"',"+cityid+")";
		System.out.println(sql);
		int result=0;
		try {
			result= jdbc.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result>0?true:false;
	}
	//删
	public boolean delArea(int aid)
	{
		String sql="delete from area where aid="+aid;
		System.out.println(sql);
		int result=0;
		try {
			result= jdbc.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result>0?true:false;
	}
	//改
	public boolean updateArea(int aid,String aname,int cityid)
	{
		String sql="update area set aname='"+aname+"',cityid="+cityid+"where aid="+aid;
		System.out.println(sql);
		int result=0;
		try {
			result= jdbc.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result>0?true:false;
	}
	//查 所有记录
	public List<Area> getAllArea()
	{
		String sql="select * from area";
		ResultSet rs;
		List<Area> list=new ArrayList<Area>();
		try {
			rs = jdbc.executeQuery(sql);
			while(rs.next())
			{	
				Area a=new Area();
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setCityid(rs.getInt("cityid"));
				list.add(a);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{jdbc.closeAll();}
		
		
		return list;
	}
//2.写根据cityid查询 area信息的方法，方法名为getAreaByCid
	public Area getAreaByCid()
	{
		
		return null;	
	}
	
	public static void main(String[] args) {
		//1.增删改方法测试
//--查
		AreaDao ad=new AreaDao();
		List<Area> list=ad.getAllArea();
		System.out.println(list.size());
		for(Area a:list)
		{
			System.out.println(a);
		}
//--增	
		//ad.addArea("平房区", 1);
//--删
		//ad.delArea(22);
//--改
		//ad.updateArea(24, "平房", 3);

		
	}
}
