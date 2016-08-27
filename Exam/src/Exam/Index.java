package Exam;
import java.util.*;
public class Index {
	static int n=5;
	public static void main(String[] args) {
		TempProblemBank Tbank=new TempProblemBank();
		Login Stu=new Login();
		while(Stu.z!=0){Stu.log();}
		Tbank.getNum();
		for(int i=0;i<n;i++)
		{
			int No=i+1;
			System.out.println(No+". "+Tbank.getQ(i));
			System.out.println("请输入答案(只需输入小写字母，以回车结束)：");
			Scanner sc=new Scanner(System.in);
			String Answer=sc.next();
			if(Answer.equals(Tbank.getA(i)))
			{
				System.out.println("回答正确！");
				Tbank.point+=20;
			}
			else
			{
				System.out.println("回答错误!答案为："+Tbank.getA(i));
			}
		System.out.println();
		}
		int j=Stu.user;
		System.out.println(Stu.a[j].username+",你的成绩为："+Tbank.point);
	}
}
