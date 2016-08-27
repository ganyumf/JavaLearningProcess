package com.reflect;

import java.lang.reflect.Field;


public class Testreflect {
	public String name;
	private  int age;
	public void eat()
	{
		System.out.println("吃大餐");
	}
	
	public void eat(String food,int num)
	{
		System.out.println("吃"+food+"吃了"+num+"顿");
	}
	
	
	
	public Testreflect(String name) {
		this.name=name;
		System.out.println("执行了构造方法");
	}
	
	public Testreflect() {
		System.out.println("执行了构造方法");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	//	Class c=Testreflect.class;
		try {
			Class c=Class.forName("com.reflect.Testreflect");
			Object o=c.newInstance();
			System.out.println(o.toString());
			Field n=c.getField("name"); // 属性
			System.out.println("属性名"+n.getName());
			System.out.println("访问修饰符"+n.getModifiers());
			System.out.println("类型"+n.getType());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------------------------");
		Testreflect tf=new Testreflect();
	//	tf.age=34;
		
		
		try {
			//Class c=Class.forName("com.reflect.Testreflect");
			Class c=Testreflect.class;//同上句
			Object o=c.newInstance();
			System.out.println(o.toString());
			      //c.getField("age");
			Field n=c.getDeclaredField("age");  // 得到属性，Field类型
			System.out.println("属性名"+n.getName());// 得到属性名，String类型
			System.out.println("访问修饰符"+n.getModifiers());// 得到访问修饰符，int类型
			System.out.println("类型"+n.getType());// 得到类型
			n.set(tf,18);
			System.out.println(n.get(tf));
			System.out.println(tf.age);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
