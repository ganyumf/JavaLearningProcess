package testJihe;

import java.util.ArrayList;

public class Test {
	int age;
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("abc");
		arr.add("abc1");
		arr.add("abc2");
		arr.add("abc2");
		arr.add("abc2");
		arr.add(0,"ddd");
		ArrayList a=new ArrayList();
		a.add("1");
		a.add(2);
		a.addAll(arr);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("-----------------");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		
		
	//	System.out.println("删除第一个元素前的长度："+arr.size());
	//	arr.set(0,"bcd");
	//	Object o=arr.remove(0);//传入索引
	//	System.out.println("被删除的元素是"+o);
	//	System.out.println("删除第一个元素后的长度："+arr.size());
	//	boolean b=arr.remove("abc2");
		
		
		//int index=0;
		//for(int i=index;i<arr.size();i++)
		//{
		//	arr.remove("abc2");
		//	index=i;
		//}
		
		while(arr.remove("abc2")==true);
		
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		int i=0;

		
	}
}
