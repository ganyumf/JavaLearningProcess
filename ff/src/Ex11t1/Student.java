/*
 1.����һ���˵��ࣨ���������֣����䡣дһ���������������ֵ�ķ���showInfo������������һ��ѧ���ࣨ�������Ա𣩣�ѧ���̳�����
Ҫ�󣺣�1����������Ը�ֵ�ù��췽����ʵ�֣��ֱ����в������췽�����޲������췽��ʵ�֣�
��2�����������Ҳ�ù��췽������ֵ��
��3������������д�����showInfo��������
��4������ѧ����Ķ��󣬵���ѧ������ʾ��Ϣ�ķ�����
 */
package Ex11t1;

public class Student extends Person
{
	char sex;
	public Student(String name,int age,char sex)
	{	
		super(name,age);
		this.sex=sex;
	}
	public void showInfo(){
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("�Ա�:"+sex);
	}
	public static void main(String[] args) {
		Student s=new Student("acx",18,'��');
		s.showInfo();
	}
}
