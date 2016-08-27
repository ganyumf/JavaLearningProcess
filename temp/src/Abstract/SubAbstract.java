package Abstract;

public  abstract class SubAbstract extends TestAbstract{
static final int age=9;
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("重写了test抽象方法");
	}
	public SubAbstract()
	{
		//super();
		System.out.println("创建子类");
	}
	public SubAbstract(int x)
	{
		//super();
		System.out.println("创建有参子类");
	}
	public static void main(String[] args) {
		TestAbstract ta=new SubAbstract() {
			public void test()
			{
				System.out.println("sub 呵呵");
			}
		};
		TestAbstract t=new SubAbstract() {};
		ta.test();
		t.test();
	}
}
