package com.dao; 

import util.DBUtil;

import com.entity.TUser;

public class TUserDao {
	DBUtil dbu=new DBUtil(); 
	//新增用户
	public boolean addUser(TUser u){
		String sql="insert into tuser (user_id,mobile_number,roaming_status,com_level,customer_id) " +
				"values(TSEQ_USER_ID.nextval,?,?,?,?)";
		try {
			int result=dbu.executeUpdate(sql,u.getMobileNumber(),u.getRoamingStatus(),u.getComLevel(),u.getCustomer().getCustomerID());
			if(result>0)return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
