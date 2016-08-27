package com.testJDBC2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.testJDBC.JDBC;
public class AreaDao {//�����ݿ���� ���� ����
	JDBC jdbc=new JDBC();
	//��
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
	//ɾ
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
	//��
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
	//�� ���м�¼
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
//2.д����cityid��ѯ area��Ϣ�ķ�����������ΪgetAreaByCid
	public Area getAreaByCid()
	{
		
		return null;	
	}
	
	public static void main(String[] args) {
		//1.��ɾ�ķ�������
//--��
		AreaDao ad=new AreaDao();
		List<Area> list=ad.getAllArea();
		System.out.println(list.size());
		for(Area a:list)
		{
			System.out.println(a);
		}
//--��	
		//ad.addArea("ƽ����", 1);
//--ɾ
		//ad.delArea(22);
//--��
		//ad.updateArea(24, "ƽ��", 3);

		
	}
}
