package Reflect;

public class Student {
	private String name;
	private int age;
	private char sex;
//	public String name;
//	public int age;
//	public char sex;
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+age+sex;
	}
	public void eat()
	{
		System.out.println("³Ô´ó²Í");
	}public void study()
	{
		System.out.println("Ñ§Ï°");
	}
}
