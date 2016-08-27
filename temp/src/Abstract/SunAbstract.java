package Abstract;

public class SunAbstract extends SubAbstract{
	public void test()
	{
		System.out.println("xxxSunabstract xxx");
	}
	public static void main(String[] args) {
		TestAbstract ta=new SunAbstract();
		ta.test();
	}
}
