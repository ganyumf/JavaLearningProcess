package d0502;
/*
 ����һ��Person��
 ����		���䡢����
 ����		toString ���������Ϣ
HashSet ���  �����˵Ķ���
������� ÿ���˵ĸ�����Ϣ
 */
public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return "����:"+name+"  ����:"+age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashCode():"+name+super.hashCode());
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("ִ����equals����");
		return super.equals(obj);
	}
}
