/*
 封装一个微信红包类，主要的功能有
	红包中存有钱，多少个人分；每个分到的钱数，及获收红包的时间；
      大红包类 
     钱数
     份数
     每个人的钱
主要的功能有
		打开红包；（如果打开红包的人数没有达到上限，则可以打开，并随机获得金额）
		查看红包分配信息；
		设置截止日期；（如果超过最大金额，则再打时提示过期）
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
			System.out.println("已过期！");
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
				System.out.println("抢到"+x1.perMoney+"元~~");
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
				System.out.println("抢到"+t2+"元");		
			}	
		}
	
		else
		{
			System.out.println("已领完！");
		}
	}
}
	
	public void getInfo(ArrayList <xHongBao>al)
	{
		if(al.size()==0)
		{System.out.println("还未有人领取！");}
		else{
			for (int i = 0; i < al.size(); i++) {
				System.out.println("第"+(i+1)+"个人"+al.get(i));
			}
		}
	}
	
	
}
