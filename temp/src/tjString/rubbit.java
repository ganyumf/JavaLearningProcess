package tjString;
import java.util.*;
public class rubbit {
	public int f(int m)
	{
		if(m==1||m==2)
			return 1;
		else
			return f(m-1)+f(m-2);
	}
	public static void main(String[] args) {
		rubbit b=new rubbit();
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(b.f(s));
	}
}
