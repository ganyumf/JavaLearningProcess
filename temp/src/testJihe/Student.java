package testJihe;

public class Student implements Comparable
{
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student()
	{}
	public String toString()
	{
		return "����:"+name+"   ����:"+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Object o) {
		//�ȽϵĹ���
		Student stu=(Student)o;
		return this.age-stu.age;
		//0 ���		�����ұ����	���� �ұ���С
	}
	
	
}
