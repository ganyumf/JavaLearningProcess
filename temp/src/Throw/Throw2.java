package Throw;
public class Throw2 {
	public void eat()
	{
		System.out.println("���з��");
		String str=null;
		System.out.println(str.charAt(0));
		System.out.println("mmm");	
	//	throw new NullPointerException();	
	}
	
	public static void main(String[] args) throws Exception{
	//	Throw t=new Throw();
	//	t.eat();
		System.out.println("ccc");
		Throw2 tsb=new Throw2();
		try
		{
			tsb.eat();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("xxx");
			//throws �쳣���� �ڷ�������
			//throw �ֶ��׳��쳣����
			//throw new ArithmeticException();
			//�ֶ��׳�ĳ���쳣
		
	}
}