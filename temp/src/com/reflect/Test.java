package com.reflect;

import java.lang.reflect.Field;


public class Test{
	public static void main(String[] args) {

		Testreflect tf=new Testreflect();
//		tf.age=34;
		
		//Class cc=new Testreflect().getClass();
		try {
			Class c=Testreflect.class;
			//Class c=Class.forName("com.reflect.Testreflect");//ͬ�Ͼ�
			Object o=c.newInstance();
			System.out.println(o.toString());
			      //c.getField("age");
			Field n=c.getDeclaredField("age");  // �õ����ԣ�fleld����
			System.out.println("������"+n.getName());// �õ���������String����
			System.out.println("�������η�"+n.getModifiers());// �õ��������η���int����
			System.out.println("����"+n.getType());// �õ�����
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
