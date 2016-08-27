package 泛型与集合元素比较;

import java.util.ArrayList;

public class 泛型 {
	public static void main(String[] args) {
		Person a= new Person(20,"张三");
		Person b= new Person(21,"李四");
		Person c= new Person(22,"王二麻子");
		ArrayList<Person> al=new ArrayList();
		al.add(a);
		al.add(b);
		al.add(c);
	}
}
