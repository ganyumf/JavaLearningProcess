package Throw;
public class Throw {
	public void eat()
	{
		System.out.println("���з��");
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
		System.out.println("�Ǻ�");
		
	//	throw new NullPointerException();
		
	}
	
	public static void main(String[] args) throws Exception{
	//	Throw t=new Throw();
	//	t.eat();
		System.out.println("ccc");
		Throw tsb=new Throw();
		tsb.eat();
		System.out.println("xxx");
		
		
			//throws �쳣���� �ڷ�������
			//throw �ֶ��׳��쳣����
			//throw new ArithmeticException();
			//�ֶ��׳�ĳ���쳣
		
	}
}
