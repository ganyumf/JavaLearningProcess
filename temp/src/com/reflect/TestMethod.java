package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.reflect.Testreflect");
			//c.getMethod(name, parameterTypes)
			Method m=c.getMethod("eat",String.class,int.class);
			{
				System.out.println("属性名："+m.getName());// 得到属性名，String类型
				System.out.println("访问修饰符："+m.getModifiers());// 得到访问修饰符
				System.out.println("类型："+m.getReturnType());// 得到返回类型
				System.out.println("参数列表："+m.getParameterAnnotations().length);
				Testreflect tf=new Testreflect();
			//	Object o=c.newInstance();
				m.invoke(tf, "螃蟹腿",100000);//调用方法
				
	//对象，方法
	//c.getSuperclass();
				
//	  Constructor ct= c.getConstructor();
//			Object x=ct.newInstance(); 以上两行化简为
			Object x=c.getConstructor().newInstance();
	
			
			System.out.println(x);
				
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
