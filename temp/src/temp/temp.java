package temp;

import java.util.Random;


public class temp {
	static int n=5;
	//ProblemBank ProblemBankt=new ProblemBank();
	int arr[]=new int[n];
	//Problem TempProblemArr[]=new Problem[n];
	public void getNum(){
	Random rd=new Random();
	int n=rd.nextInt(9);
    arr[0]=n;
	for(int i=1;i<arr.length;i++)
	{
		int tmp =rd.nextInt(9);

		for(int j=0;j<i;j++)
		{
			if(arr[j]==tmp){i--;break;}
			else {
				arr[i]=tmp;
			}
		}
	}
	System.out.println(arr[0]);
	}
	public static void main(String[] args) {
		temp a=new temp();
		for(int i=0;i<n;i++)
		{a.getNum();}
	}
}