/*
  设计一个学生类Stud,除了包括no(学号)、name(姓名)、和deg(成绩)数据成员外。
  有两个静态变量sum和num，分别存放总分和人数，另有一个构造函数、一个普通成员函数disp()和一个静态成员函数avg()，它用于计算平均分。
 */
package Grade;
public class Stdu {
	int no;
	String name;
	int deg;
	static int sum=0;
	static int num=0;
	public Stdu(){}
	public Stdu(int no,String name,int deg)
	{
		this.no=no;
		this.name=name;
		this.deg=deg;
		sum+=deg;
		num++;
	}
	public void disp()
	{
		System.out.println(no);
		System.out.println(name);
		System.out.println(deg);
	}
	static double avg()
	{
		double s=(double)sum/num;
		return s;
	}
	
}
