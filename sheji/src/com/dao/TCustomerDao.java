package com.dao;

import java.sql.ResultSet;

import com.entity.TCustomer;

import util.DBUtil;

public class TCustomerDao {
	DBUtil dbu=new DBUtil();
	//查询客户信息
	public TCustomer findCustomerById(String idNum){
		String sql="select * from tcustomer where ID_Number=?";
		TCustomer c=null;
		try {
			ResultSet rs=dbu.executeQuery(sql, idNum);
			while(rs.next()){
				c=new TCustomer();
				c.setCustomerAddress(rs.getString("customer_address"));
				c.setCustomerBirtyday(rs.getString("customer_birtyday"));
				c.setCustomerID(rs.getInt("customer_id"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setCustomerSex(rs.getString("customer_sex"));
				c.setIdNumber(rs.getString("id_number"));
				c.setIdType(rs.getString("id_type"));				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbu.closeAll();
		}
		return c;
	} 
	
	
	//新增客户信息
	public boolean addCustomer(TCustomer tc){
		String sql="insert into tcustomer (Customer_ID,ID_Type,ID_Number,Customer_Name,Customer_Birtyday,Customer_Sex,Customer_Address) " +
				"values(TSEQ_CUSTOMER_ID.nextval,?,?,?,?,?,?)";
		try {
			int result=dbu.executeUpdate(sql, tc.getIdType(),tc.getIdNumber(),tc.getCustomerName(),tc.getCustomerBirtyday(),tc.getCustomerSex(),tc.getCustomerAddress());
			if(result>0)return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbu.closeAll();
		}
		return false;
	} 
}
