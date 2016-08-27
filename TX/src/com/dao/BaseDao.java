package com.dao;

import org.apache.ibatis.session.SqlSession;


import com.util.SqlSessionGetter;

public class BaseDao {
	protected SqlSession session=SqlSessionGetter.getSqlSession();
}
