package com.reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
//		Class s=Student.class;
//		Field f=s.getField("age");
//		Student stu=new Student();
//		stu.age=22;
//		f.set(stu, 33);
//		System.out.println(stu.age);
		Map m1=new HashMap();
		Map m2=new HashMap();
		Map m3=new HashMap();
		m1.put("name","����");
		m1.put("age",23);
		m1.put("sex","��");
		m2.put("name","����2");
		m2.put("age",23);
		m2.put("sex","��");
		m3.put("name","����3");
		m3.put("age",23);
		m3.put("sex","��");
		ArrayList <Map>list=new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		for (int i = 0; i < list.size(); i++) {
			
		Map mm=list.get(i);
		System.out.println(mm.get("sex"));

		}
		
		Map xuexiao=new HashMap();
		xuexiao.put("һ��һ��", list);
		xuexiao.put("һ�����", list);
		xuexiao.put("һ������", list);
	}
}
