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
				System.out.println("��������"+m.getName());// �õ���������String����
				System.out.println("�������η���"+m.getModifiers());// �õ��������η�
				System.out.println("���ͣ�"+m.getReturnType());// �õ���������
				System.out.println("�����б�"+m.getParameterAnnotations().length);
				Testreflect tf=new Testreflect();
			//	Object o=c.newInstance();
				m.invoke(tf, "�з��",100000);//���÷���
				
	//���󣬷���
	//c.getSuperclass();
				
//	  Constructor ct= c.getConstructor();
//			Object x=ct.newInstance(); �������л���Ϊ
			Object x=c.getConstructor().newInstance();
	
			
			System.out.println(x);
				
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
