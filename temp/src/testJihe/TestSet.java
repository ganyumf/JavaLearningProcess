package testJihe;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add("a");
		s.add("bc");
		s.add("db");
		s.add("ec");
		s.add("a");
		s.add("a");
		s.add(null);
		System.out.println(s.size());
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		Object[]ss=s.toArray();//转成 数组
		for (int i = 0; i < ss.length; i++) {

			System.out.println(ss[i]);
		}
		
		
		for(Object o:s)//增强for
		{
			System.out.println(o);
		}
		
		
		Iterator it=s.iterator();//迭代器
		System.out.println("---------------------");
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
