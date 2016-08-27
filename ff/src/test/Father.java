package test;

public class Father extends GrandFather{
	String book="葵花宝典";
	public Father()
	{
		System.out.println("创建Father对象");
	}
	public Father(int a,int b)
	{
		System.out.println("创建Father对象1,2");
	}
	/*
	public void eat()
	{
		System.out.println("吃自助餐");
	}
	*/
	public void readBook()
	{	
		
		System.out.println("看"+book);
		eat();
	}
	public static void main(String[] args) {
		Son f=new Son();
		f.readBook();
		Father s=new Son();
		//只有存在重写方法的情况下走子类,取决于Father
		s.eat();
		
	}
}
