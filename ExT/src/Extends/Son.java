package Extends;

public class Son extends Father{
	static
	{
		System.out.println("Son static block");
	}
	{
		System.out.println("Son block");
	}
	public void s(){System.out.println("���෽��");}
	public Son()
	{
		System.out.println("������Son�����");
	}


}
