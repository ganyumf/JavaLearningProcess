package Throw;

public class TryCatchReturn {
	public int getNum()
	{
		int i=3;
		try
		{
			int x=0;
			i=i/x;
			System.out.println("��������");
			return i;
		}
		catch(Exception e)
		{
			System.out.println("������");

			return i--;
		}
		finally
		{
			return i;
		}
	//	return i;
	}
	public static void main(String[] args) {
		TryCatchReturn tr=new TryCatchReturn();
		int xx=tr.getNum();
		System.out.println(xx);
		System.out.println();
	}
}
