package test;

public class GrandFather {
	protected String book="盗墓笔记";
	public String getGrandFatherBook()
	{
		return this.book;
	}
	public void eat()
	{
		System.out.println("吃大餐");
	}
	public GrandFather()
	{
		System.out.println("创建了GrandFather对象");
	}
}
