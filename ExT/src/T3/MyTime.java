/*
������ΪMyTime���࣬����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С�
 ΪMyTime�ඨ�幹�췽�����Է��㴴������ʱ��ʼ����Ա������
�ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ������
ΪMyTime��������·�����
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
�ֱ��ʱ���֡�����мӼ����㡣 
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
