package test;

public class Son extends Father{
	
	public Son()
	{
		super(1,2);
		System.out.println("������Son����");
	}
	
	public void readBook(int x)
	{	
		System.out.println("���ӿ�"+super.book);
		//System.out.println(getGrandFatherBook());
	}

}
