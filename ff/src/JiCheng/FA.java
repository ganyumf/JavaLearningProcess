package JiCheng;

public class FA {
	static{
		System.out.println("FA static");
	}
	static int xxx;
	{
		System.out.println("FA");
	}
	public FA(){
		System.out.println("FA duixiang");
	}
public static void main(String[] args) {
	System.out.println("asdad");
	//SO xm=null;
	//SO.i=2;
	new SO();
	//SO ls=new SO();
}
}
