package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.User;
import com.util.CreateMD5;

@Repository("userDao")
public class UserDao extends BaseDao{
	public User login(User u){
		u.setPwd(CreateMD5.getMd5(u.getPwd()));
		return session.selectOne("login",u);
	}
}
