package testJihe;

import java.util.*;

import d0502.Person;

public class TestMap {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	// key  value
	hm.put("a", "bbb");
	hm.put("b", "ccc");
	hm.put("c", "ddd");
	hm.put("c", "ab");	//���ǵ�ddd
	hm.put(null,"xx");
	Object o=hm.get("c");
	Object o1=hm.get("f");//û�еļ�������null
	System.out.println(o);
	Object o2=hm.get(null);
	System.out.println(o2);
	
	//						key    value
	//����һ�� hashMap����       	a		23
	//						b		24
	//						c	    25
	
	
	HashMap hm1=new HashMap();
	hm1.put("a", 23);
	hm1.put("b", 24);
	hm1.put("c", 25);
System.out.println("-------------------------");	
	Set s=hm1.keySet();//���ļ���
	Object []obj=s.toArray();
	for (int i = 0; i < obj.length; i++) {
		Object a=hm1.get(obj[i]);
		System.out.println(a);
	}

System.out.println("------------------------------");
	Object []oo=hm1.values().toArray();//ֵ�ļ���
		int sum=0;
		for (int i = 0; i <	oo.length; i++) {
			int j=(Integer)oo[i];
			sum+=j;
		}
		System.out.println(sum);
System.out.println("------------------------------");
	

System.out.println("------------------------------");
	//����Person  ������Ϊkey	�Զ���Ϊvalue
	//��������23����
		Person a= new Person(20,"����");
		Person b= new Person(23,"����");
		Person c= new Person(22,"��������");
		hm1.put(a.getAge(), a);
		hm1.put(b.getAge(), b);
		hm1.put(c.getAge(), c);
		Object ii=hm1.get(23);
		System.out.println(ii);
	}
}
