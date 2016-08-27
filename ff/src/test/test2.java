package test;
public class test2 {
	int a;
	String xx;
	public test2()
	{
		this("xx");
		System.out.println(a);
	}
	public test2(String x)
	{
		
		System.out.println(xx);
	}
	public void chi()
	{
		he();
	}
	public void he()
	{
		Test3 a=new Test3();
		a.haha();
	}
	
	public static void main(String[] args)
	{
		new test2();
	}
}
