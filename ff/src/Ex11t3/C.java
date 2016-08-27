package Ex11t3;

public class C extends B{
	public void c1()
	{
		System.out.println("Ö´ÐÐc1");
		a1();
		a2();
		b1();
	}
	public static void main(String[] args) {
		C c=new C();
		c.c1();
	}
}
