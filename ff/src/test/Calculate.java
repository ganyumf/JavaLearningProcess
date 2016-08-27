package test;
import java.util.*;
public class Calculate {
/*	public Calculate(){System.out.println("构造方法");}
	{System.out.println("非静态块");}
	static{System.out.println("静态块");} */
	//加
	public double jia(double a,double b)
	{
		return a+b;
	}
	public double jian(double a,double b)
	{
		return a-b;
	}
	public double cheng(double a,double b)
	{
		return a*b;
	}
	public double chu(double a,double b)
	{
		return a/b;
	}
	public double compute()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数");
		double a=sc.nextDouble();
		System.out.println("请输入第二个数");
		double b=sc.nextDouble();
		System.out.println("请输入符号");
		char s=sc.next().charAt(0);
		double result=0;
		if(s=='+') result= jia(a,b);
		//if(s.equals("-")) result= jian(a,b);
		//if(s.equals("*")) result= cheng(a,b);
		//if(s.equals("/")) result= chu(a,b);
		return result;
		
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		System.out.println(c.compute());
	}
}
