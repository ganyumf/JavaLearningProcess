package d0502;

import java.util.*;

/*
创建一个Person类
属性		年龄、姓名
方法		toString 输出个人信息
HashSet 存放  三个人的对象
遍历输出 每个人的个人信息
*/

public class Test {
	public static void main(String[] args) {
		Person a= new Person(20,"张三");
		Person b= new Person(21,"李四");
		Person c= new Person(22,"王二麻子");
		HashSet s=new HashSet();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(c);	//先看hashCode()，一样再看地址，地址不一样再用equals方法
		//对象 如何判断是否是一个
//---------------------------------------------------------------		
//		Object[]o=s.toArray();
//		for (int i = 0; i < o.length; i++) {
//			System.out.println(o[i].toString());
//		}
//---------------------------------------------------------------	
//		for(Object o1:s)//遍历
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