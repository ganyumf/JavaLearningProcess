package Exam;
import java.util.*;

public class TempProblemBank {
	static int nTempProblemBank=5;
	static int nProblemBank=9;
	int point=0;
	ProblemBank ProblemBankt=new ProblemBank();
	int arr[]=new int[nTempProblemBank];
	Problem TempProblemArr[]=new Problem[nTempProblemBank];
	public void getNum(){
	Random rd=new Random();
	int m=rd.nextInt(nProblemBank);
    arr[0]=m;
	for(int i=1;i<arr.length;i++)
	{
		int tmp =rd.nextInt(nProblemBank);

		for(int j=0;j<i;j++)
		{
			if(arr[j]==tmp)
			{
				i--;
				break;
			}
			else 
			{
				arr[i]=tmp;
			}
		}
	}

	for(int k=0;k<nTempProblemBank;k++)
	{
		TempProblemArr[k]=ProblemBankt.PromblemArr[arr[k]];
	}
	
	}

	 public String getQ(int str)
    {
    	return TempProblemArr[str].question;
    }
	 public String getA(int str)
	    {
	    	return TempProblemArr[str].right;
	    }
}
