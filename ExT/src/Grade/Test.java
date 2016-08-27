package Grade;
public class Test {
	public static void main(String[] args) {
		Stdu s1=new Stdu(20134254,"cjy",95);
		s1.disp();
		Stdu s2=new Stdu(20134245,"acx",96);
		s2.disp();
		System.out.println(Stdu.avg());
	}
}
