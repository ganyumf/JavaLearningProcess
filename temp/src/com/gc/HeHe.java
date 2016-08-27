package com.gc;

public class HeHe {
	private String name;
	private int age;
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
	public HeHe() {
		// TODO Auto-generated constructor stub
	}
	public HeHe(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("执行了"+name+"的finalize方法");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
