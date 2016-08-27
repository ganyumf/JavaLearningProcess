package JHt125;
import java.util.*;
public class test {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Random rd=new Random();
		for (int i = 0; i < 5; i++) {
			
		
		while(hs.size()<5)
		{
			int temp=rd.nextInt(21)+1;
			hs.add(temp);
		}
		for(Object o:hs)//±éÀú
		{
			System.out.print(o+" ");
		}
		hs.clear();
		System.out.println();
	}
	}
}
