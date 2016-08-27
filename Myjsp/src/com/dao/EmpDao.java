package com.dao;



import java.sql.ResultSet;

import com.entity.Emp;

import util.DBUtil;

public class EmpDao {
	DBUtil dbu=new DBUtil();
	public int add(String empno,String ename)
	{
		int result=0;
		String sql="insert into emp (empno,ename) values (?,?)";
		try {
			result=dbu.executeUpdate(sql, empno,ename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	//µÇÂ½·½·¨
	public Emp login(String empno,String ename)
	{
		String sql="select * from emp where empno=? and ename=?";
		Emp emp=null;
		ResultSet rs;
		try {
			rs = dbu.executeQuery(sql, empno,ename);
			while(rs.next())
			{
				emp=new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return emp;
	}
	
}
