/*
 2.����һ��Person�࣬������ name��sex��age������������󣬵��ù��췽���������Էֱ�ֵ����ӡÿ�����������ֵ
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
		Person a=new Person("cjy",'��',21);
		Person b=new Person("acx",'��',22);
		a.Print();
		b.Print();
	}
}
