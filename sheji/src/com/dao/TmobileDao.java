package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;

public class TmobileDao {
	DBUtil dbu=new DBUtil();
	public boolean piliangAdd(String start,String end,String type)
	{
		long startl=Long.parseLong(start);
		long endl=Long.parseLong(end);
		boolean flag=false;
		String sql="insert into tmobiles(mobile_number,mobile_type,card_number) " +
				"values(?,?,'card') ";
		Connection conn=null;
		try {
			conn = dbu.getConn();
			conn.setAutoCommit(false);
			PreparedStatement ps=conn.prepareStatement(sql);
			long starttime=System.currentTimeMillis();
			for(long i=startl;i<endl;i++)
			{
				ps.setLong(1, i);
				ps.setString(2, type);
				ps.addBatch();
				long count=i-startl;
				if(count%30000==0)
				{
					ps.executeBatch();//将指令集中的 sql  提交给数据库
				}
			}
			ps.executeBatch();//没除尽的也要执行
		//	conn.commit();//手动提交 真正的将数据 存入数据库
			long endtime=System.currentTimeMillis();
			System.out.println(endtime-starttime);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	
	//分页查询
	public long[] find(int yeshu){
		String sql="select * from(select x.*,rownum r from (select a.* from tmobiles a order by mobile_number asc)x)xx where r>=? and r<=?";
		long [] ls=new long[10];
		int min=(yeshu-1)*10+1;
		int max=yeshu*10;
		try {
			ResultSet rs=dbu.executeQuery(sql, min,max);
			int i=0;
			while(rs.next()){
				ls[i]=rs.getLong("mobile_number");
				i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbu.closeAll();
		}
		return ls;
	}
}
