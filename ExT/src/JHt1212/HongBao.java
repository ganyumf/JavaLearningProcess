/*
 ��װһ��΢�ź���࣬��Ҫ�Ĺ�����
	����д���Ǯ�����ٸ��˷֣�ÿ���ֵ���Ǯ���������պ����ʱ�䣻
      ������ 
     Ǯ��
     ����
     ÿ���˵�Ǯ
��Ҫ�Ĺ�����
		�򿪺����������򿪺��������û�дﵽ���ޣ�����Դ򿪣��������ý�
		�鿴���������Ϣ��
		���ý�ֹ���ڣ�����������������ٴ�ʱ��ʾ���ڣ�
 */
package JHt1212;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class HongBao {
	public  int num;
	public double money;
	public long Time;
	public xHongBao arr[];
	public long startTime;
	
	static double rest;
	
	public HongBao(int num, double money, long Time) {
		this.num = num;
		this.money = money;
		this.Time = Time;
		rest=money;
		startTime=System.currentTimeMillis();
	}
	
	
	public void Open(ArrayList <xHongBao>al)
	{
		if(System.currentTimeMillis()-startTime>Time)
		{
			System.out.println("�ѹ��ڣ�");
		}
		
		else {
		if(rest>0&&al.size()<num)
		{
			xHongBao x1=new xHongBao();
			double t2;
			if(al.size()==num-1)
			{
				x1.time=(int) (System.currentTimeMillis()-startTime);
				int temp=(int)(rest*100);
				x1.perMoney=temp/100.0;
				if((rest*1000)%10<5)
				{
					al.add(x1);
				}
				else
				{
					x1.perMoney+=0.01;
					al.add(x1);
				}
				System.out.println("����"+x1.perMoney+"Ԫ~~");
				System.out.println(rest);
				rest=0;
			}
			
			else{
			while(true)
			{
				int t=(int)(Math.random()*100*money);
				t2=t/100.0;
				if(rest-t2>=0.01*(num-al.size())&&t2>=0.01)break;
			}
				x1.perMoney=t2;
				rest-=t2;
				x1.time=(int) (System.currentTimeMillis()-startTime);
				al.add(x1);
				System.out.println("����"+t2+"Ԫ");		
			}	
		}
	
		else
		{
			System.out.println("�����꣡");
		}
	}
}
	
	public void getInfo(ArrayList <xHongBao>al)
	{
		if(al.size()==0)
		{System.out.println("��δ������ȡ��");}
		else{
			for (int i = 0; i < al.size(); i++) {
				System.out.println("��"+(i+1)+"����"+al.get(i));
			}
		}
	}
	
	
}
