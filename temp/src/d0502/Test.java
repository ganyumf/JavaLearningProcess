package d0502;

import java.util.*;

/*
����һ��Person��
����		���䡢����
����		toString ���������Ϣ
HashSet ���  �����˵Ķ���
������� ÿ���˵ĸ�����Ϣ
*/

public class Test {
	public static void main(String[] args) {
		Person a= new Person(20,"����");
		Person b= new Person(21,"����");
		Person c= new Person(22,"��������");
		HashSet s=new HashSet();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(c);	//�ȿ�hashCode()��һ���ٿ���ַ����ַ��һ������equals����
		//���� ����ж��Ƿ���һ��
//---------------------------------------------------------------		
//		Object[]o=s.toArray();
//		for (int i = 0; i < o.length; i++) {
//			System.out.println(o[i].toString());
//		}
//---------------------------------------------------------------	
//		for(Object o1:s)//����
//		{
//			System.out.println(o1.toString());
//		}
//---------------------------------------------------------------		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
//---------------------------------------------------------------
		TreeSet t=new TreeSet();
		t.add("1a");
		t.add("bb");
		t.add("1c");
		t.add("1c");
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
}
}