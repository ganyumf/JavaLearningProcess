package t2_°á¼Ò¹«Ë¾;

public class t{
 	private static t t1=new t();
 	private t(){}
 	public t getInstance()
 	{
 		return t1;
 	}
 	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b=new int [10];
		b=a;
		System.out.println(b[2]);
		

	}
}
