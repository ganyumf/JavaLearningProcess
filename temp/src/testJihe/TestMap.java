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
	hm.put("c", "ab");	//覆盖掉ddd
	hm.put(null,"xx");
	Object o=hm.get("c");
	Object o1=hm.get("f");//没有的键，返回null
	System.out.println(o);
	Object o2=hm.get(null);
	System.out.println(o2);
	
	//						key    value
	//声明一个 hashMap集合       	a		23
	//						b		24
	//						c	    25
	
	
	HashMap hm1=new HashMap();
	hm1.put("a", 23);
	hm1.put("b", 24);
	hm1.put("c", 25);
System.out.println("-------------------------");	
	Set s=hm1.keySet();//键的集合
	Object []obj=s.toArray();
	for (int i = 0; i < obj.length; i++) {
		Object a=hm1.get(obj[i]);
		System.out.println(a);
	}

System.out.println("------------------------------");
	Object []oo=hm1.values().toArray();//值的集合
		int sum=0;
		for (int i = 0; i <	oo.length; i++) {
			int j=(Integer)oo[i];
			sum+=j;
		}
		System.out.println(sum);
System.out.println("------------------------------");
	

System.out.println("------------------------------");
	//三个Person  以年龄为key	以对象为value
	//找年龄是23的人
		Person a= new Person(20,"张三");
		Person b= new Person(23,"李四");
		Person c= new Person(22,"王二麻子");
		hm1.put(a.getAge(), a);
		hm1.put(b.getAge(), b);
		hm1.put(c.getAge(), c);
		Object ii=hm1.get(23);
		System.out.println(ii);
	}
}
