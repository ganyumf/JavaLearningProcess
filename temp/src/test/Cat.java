package test;

import java.io.Serializable;

public class Cat implements Serializable{
	private String name;
	private int age;
	public static int sb;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		// TODO Auto-generated constructor stub
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
	public static int getSb() {
		return sb;
	}
	public static void setSb(int sb) {
		Cat.sb = sb;
	}
	
	
}
