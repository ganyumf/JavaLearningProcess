package temp;
import java.util.*;
public class ���ظ���� {
	public static void main(String []args)
	{	Random rd=new Random();
		int n=rd.nextInt(6)+1;
		int []arr=new int[6];
	    arr[0]=n;
		for(int i=1;i<arr.length;i++)
		{
			int tmp =rd.nextInt(6)+1;

			for(int j=0;j<i;j++)
			{
				if(arr[j]==tmp){i--;break;}
				else {
					arr[i]=tmp;
				}
			}
		
		
		
		
		
	}

		for(int x:arr)			//aΪ������
		      System.out.print(x+" ");

}
}
