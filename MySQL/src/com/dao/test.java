package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Emp;

import util.DBUtil;

public class test {
	public static void main(String[] args) {
		DBUtil dbu=new DBUtil();
		String sql="SELECT * FROM emp";
		List<Emp>list =null;
		try {
			ResultSet rs=dbu.executeQuery(sql);
			list=new ArrayList<Emp>();
			while(rs.next()){
				Emp e=new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				list.add(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbu.closeAll();
		}
		for(Emp e:list){
			System.out.println(e.getEname());
		}
	}
}
