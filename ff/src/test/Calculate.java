package test;
import java.util.*;
public class Calculate {
/*	public Calculate(){System.out.println("���췽��");}
	{System.out.println("�Ǿ�̬��");}
	static{System.out.println("��̬��");} */
	//��
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
		System.out.println("�������һ����");
		double a=sc.nextDouble();
		System.out.println("������ڶ�����");
		double b=sc.nextDouble();
		System.out.println("���������");
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
