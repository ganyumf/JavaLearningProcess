/*
 2.定义一个Person类，有属性 name，sex，age，声明多个对象，调用构造方法并对属性分别赋值并打印每个对象的属性值
 */
package Ex10t2;

public class Person {
	String name;
	char sex;
	int age;
	public Person(String name,char sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void Print()
	{
		System.out.println(this.name);
		System.out.println(this.sex);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Person a=new Person("cjy",'男',21);
		Person b=new Person("acx",'男',22);
		a.Print();
		b.Print();
	}
}
