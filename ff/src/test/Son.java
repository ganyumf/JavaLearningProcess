package test;

public class Son extends Father{
	
	public Son()
	{
		super(1,2);
		System.out.println("创建了Son对象");
	}
	
	public void readBook(int x)
	{	
		System.out.println("儿子看"+super.book);
		//System.out.println(getGrandFatherBook());
	}

}
