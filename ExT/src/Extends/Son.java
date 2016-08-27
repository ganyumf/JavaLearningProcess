package Extends;

public class Son extends Father{
	static
	{
		System.out.println("Son static block");
	}
	{
		System.out.println("Son block");
	}
	public void s(){System.out.println("子类方法");}
	public Son()
	{
		System.out.println("创建了Son类对象");
	}


}
