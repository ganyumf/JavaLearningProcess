/*
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，这三个成员变量应声明为私有。
 为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
再定义diaplay方法，用于将时间信息打印出来。
为MyTime类添加以下方法：
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
分别对时、分、秒进行加减运算。 
 */
package T3;

public class MyTime {
private int hour;
private int minute;
private int second;
	public MyTime(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void display()
	{
		System.out.println(second);
		System.out.println(minute);
		System.out.println(hour);
	}
	void addSecond(int sec){second+=sec;}
	void addMinute(int min){minute+=min;}
	void addHour(int hou){hour+=hou;}
	void subSecond(int sec){second-=sec;}
	void subMinute(int min){minute-=min;}
	void subHour(int hou){hour-=hou;}
	public static void main(String[] args) {
		MyTime a=new MyTime(9,21,30);
		a.addHour(1);
		a.display();
	}
}
