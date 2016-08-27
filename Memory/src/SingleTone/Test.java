package SingleTone;

public class Test {
	public static void main(String[] args) {
		Commander c=Commander.getInstance();
	//	Commander c1=Commander.getInstance();
	//	Commander c2=Commander.getInstance();
		c.order();
	}
}
