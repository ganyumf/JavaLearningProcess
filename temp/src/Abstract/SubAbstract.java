package Abstract;

public  abstract class SubAbstract extends TestAbstract{
static final int age=9;
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("��д��test���󷽷�");
	}
	public SubAbstract()
	{
		//super();
		System.out.println("��������");
	}
	public SubAbstract(int x)
	{
		//super();
		System.out.println("�����в�����");
	}
	public static void main(String[] args) {
		TestAbstract ta=new SubAbstract() {
			public void test()
			{
				System.out.println("sub �Ǻ�");
			}
		};
		TestAbstract t=new SubAbstract() {};
		ta.test();
		t.test();
	}
}
