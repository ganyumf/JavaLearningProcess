package com.reflect;

import java.lang.reflect.Field;


public class Testreflect {
	public String name;
	private  int age;
	public void eat()
	{
		System.out.println("�Դ��");
	}
	
	public void eat(String food,int num)
	{
		System.out.println("��"+food+"����"+num+"��");
	}
	
	
	
	public Testreflect(String name) {
		this.name=name;
		System.out.println("ִ���˹��췽��");
	}
	
	public Testreflect() {
		System.out.println("ִ���˹��췽��");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	//	Class c=Testreflect.class;
		try {
			Class c=Class.forName("com.reflect.Testreflect");
			Object o=c.newInstance();
			System.out.println(o.toString());
			Field n=c.getField("name"); // ����
			System.out.println("������"+n.getName());
			System.out.println("�������η�"+n.getModifiers());
			System.out.println("����"+n.getType());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------------------------");
		Testreflect tf=new Testreflect();
	//	tf.age=34;
		
		
		try {
			//Class c=Class.forName("com.reflect.Testreflect");
			Class c=Testreflect.class;//ͬ�Ͼ�
			Object o=c.newInstance();
			System.out.println(o.toString());
			      //c.getField("age");
			Field n=c.getDeclaredField("age");  // �õ����ԣ�Field����
			System.out.println("������"+n.getName());// �õ���������String����
			System.out.println("�������η�"+n.getModifiers());// �õ��������η���int����
			System.out.println("����"+n.getType());// �õ�����
			n.set(tf,18);
			System.out.println(n.get(tf));
			System.out.println(tf.age);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
