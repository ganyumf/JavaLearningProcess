package Abstract;

public abstract class TestAbstract {
	public abstract void test();
	public void ttt()
	{
		System.out.println("xxx");
	}
	public TestAbstract()
	{
		System.out.println("创建了父类");
	}
	public static void main(String[] args) {
		TestAbstract t=new TestAbstract() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("TestAbstract");
			}
		};
		t.test();
	}
}
