package SingleTone;

public class Commander {
	private static  Commander cmd=new Commander();//需要创建对象
	private Commander()
	{}
	 public static Commander getInstance()
	{
		return cmd;
	}
	public void order()
	   {
		   System.out.println("发射大导弹");
	   }
}
