package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		Class c=Student.class;
		Field[]f=c.getDeclaredFields();
		Method []m=c.getDeclaredMethods();
		Student stu=new Student();
		for (int i = 0; i < f.length; i++) {
			System.out.println("-------------------------");
			System.out.println("属性名"+f[i].getName());
			System.out.println("访问修饰符"+f[i].getModifiers());
			System.out.println("类型"+f[i].getType());
		}
//		try {
//			f[0].set(stu,"张三");
//			f[1].set(stu,22);
//			f[2].set(stu,'男');
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(stu);
		
		for (int i = 0; i < m.length; i++) {
			System.out.println("属性名："+m[i].getName());// 得到属性名，String类型
			System.out.println("访问修饰符："+m[i].getModifiers());// 得到访问修饰符
			System.out.println("类型："+m[i].getReturnType());// 得到返回类型
			System.out.println("参数列表："+m[i].getParameterAnnotations().length);
			
			try {
				m[i].invoke(stu);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			System.out.println("----------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
