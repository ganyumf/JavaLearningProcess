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
			System.out.println("������"+f[i].getName());
			System.out.println("�������η�"+f[i].getModifiers());
			System.out.println("����"+f[i].getType());
		}
//		try {
//			f[0].set(stu,"����");
//			f[1].set(stu,22);
//			f[2].set(stu,'��');
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(stu);
		
		for (int i = 0; i < m.length; i++) {
			System.out.println("��������"+m[i].getName());// �õ���������String����
			System.out.println("�������η���"+m[i].getModifiers());// �õ��������η�
			System.out.println("���ͣ�"+m[i].getReturnType());// �õ���������
			System.out.println("�����б�"+m[i].getParameterAnnotations().length);
			
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
