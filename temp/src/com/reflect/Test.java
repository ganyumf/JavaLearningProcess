package com.reflect;

import java.lang.reflect.Field;


public class Test{
	public static void main(String[] args) {

		Testreflect tf=new Testreflect();
//		tf.age=34;
		
		//Class cc=new Testreflect().getClass();
		try {
			Class c=Testreflect.class;
			//Class c=Class.forName("com.reflect.Testreflect");//同上句
			Object o=c.newInstance();
			System.out.println(o.toString());
			      //c.getField("age");
			Field n=c.getDeclaredField("age");  // 得到属性，fleld类型
			System.out.println("属性名"+n.getName());// 得到属性名，String类型
			System.out.println("访问修饰符"+n.getModifiers());// 得到访问修饰符，int类型
			System.out.println("类型"+n.getType());// 得到类型
			n.setAccessible(true);
			n.set(tf,18);
			System.out.println(n.get(tf));
		//	System.out.println(tf.age);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
