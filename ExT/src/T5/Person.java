/*
��дJava����������ʾ�˵����������䡣
����һ�����ࣨPerson����������Ӧ��������˽�����ԣ�������name�������䣨age�������幹�췽����������ʼ�����ݳ�Ա���ٶ�����ʾ��display���������������������ӡ������
��main�����д��������ʵ����Ȼ����Ϣ��ʾ��
 */
package T5;

public class Person {
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Person p=new Person("cjy",18);
		p.display();
	}
}
