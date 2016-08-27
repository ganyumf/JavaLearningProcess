package com.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionGetter {
	public static SqlSession getSqlSession(){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		InputStream is=SqlSessionGetter.class.getResourceAsStream("/conf.xml");
		SqlSessionFactory sf=sfb.build(is);
		return sf.openSession();
	}
}
