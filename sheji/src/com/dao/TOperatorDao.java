package com.dao;

import java.sql.ResultSet;
import util.DBUtil;
import com.entity.TOperator;

public class TOperatorDao {
	DBUtil dbu=new DBUtil();
	
	//µÇÂ½
	public TOperator login(String id,String pwd){
		String sql="select * from TOperator where  operator_id=? and operator_pwd=? ";
		TOperator to=null;
		try {
			ResultSet rs = dbu.executeQuery(sql, id,pwd);
			while(rs.next()){
				to=new TOperator();
				to.setOperatorId(rs.getInt("operator_id"));
				to.setOperatorName(rs.getString("operator_name"));
				to.setOperatorPwd(rs.getString("operator_pwd"));
				to.setIsAdmin(rs.getInt("is_admin"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbu.closeAll();
		}
		return to;
	}
	
	
	
}