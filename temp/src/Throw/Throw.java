package Throw;
public class Throw {
	public void eat()
	{
		System.out.println("吃螃蟹腿");
		String str=null;
		try
		{
			System.out.println(str.charAt(0));
			System.out.println("mmm");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("呵呵");
		
	//	throw new NullPointerException();
		
	}
	
	public static void main(String[] args) throws Exception{
	//	Throw t=new Throw();
	//	t.eat();
		System.out.println("ccc");
		Throw tsb=new Throw();
		tsb.eat();
		System.out.println("xxx");
		
		
			//throws 异常声明 在方法后面
			//throw 手动抛出异常对象
			//throw new ArithmeticException();
			//手动抛出某种异常
		
	}
}
