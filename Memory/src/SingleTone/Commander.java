package SingleTone;

public class Commander {
	private static  Commander cmd=new Commander();//��Ҫ��������
	private Commander()
	{}
	 public static Commander getInstance()
	{
		return cmd;
	}
	public void order()
	   {
		   System.out.println("����󵼵�");
	   }
}
