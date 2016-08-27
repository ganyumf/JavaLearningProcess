package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Dept;
import com.util.DBUtil;

public class DeptDao {
	DBUtil dbu=new DBUtil();
	
	public List  getDeptBySql(String pname,String pstart,String pend ){
		String sql=" select * from dept where 1=1 ";
		 ArrayList parms=new ArrayList();//���� �����б� 
		 ArrayList list=new ArrayList();//�������ݿ��е� ��Ϣ���󲢷���
		   if(pname!=null&& ! "".equals(pname)){
			  sql+=" and dname like  ? "; 
			     pname="%"+pname+"%";
			     parms.add(pname);
		   } 
		   if(pstart!=null&&!"".equals(pstart)){
			   sql+=" and deptno between ? and ? "; 
			   parms.add(pstart);
			   parms.add(pend);
		   }
		   System.out.println(sql); 
		       try {
		ResultSet rs=	dbu.executeQuery(sql, parms.toArray());
		     while(rs.next()){
		    	Dept d=new Dept(); 
		    	  d.setDeptno( rs.getInt("deptno"));
		    	   d.setDname( rs.getString("dname"));
		    	  d.setLoc(rs.getString("loc"));
		    	 list.add(d);
		     } 
			} catch (Exception e) { 
				e.printStackTrace();
			}finally{
				dbu.closeAll();
			}
		    return list; 
	}
	
	 public Dept getDeptByNo(String deptno){
		 String sql="select * from dept where deptno=?";  
		     Dept d=null;//���صĲ�ѯ����
		  try {
			ResultSet rs=  dbu.executeQuery(sql, deptno);
			      while(rs.next()){
			    	  d=new Dept();
			    	  d.setDeptno(rs.getInt("deptno"));
			    	  d.setDname(rs.getString("dname"));
			    	  d.setLoc(rs.getString("loc")); 
			      }
		}  catch (Exception e) { 
			e.printStackTrace();
		}finally{
		   dbu.closeAll(); 
		} 
		return d; 
		 
	 }
	
	 public boolean updateDept(Dept dept){
		   String sql="update dept set dname=? , loc=?  where deptno=? ";
		   int re=0;
		   try {
			re= dbu.executeUpdate(sql, dept.getDname(),dept.getLoc(),dept.getDeptno());
		} catch (Exception e) { 
			e.printStackTrace();
		}
		 return re>0?true:false; 
	 }
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	

}
