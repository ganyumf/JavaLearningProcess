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

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <xHongBao>al=new ArrayList<xHongBao>();
		int num; double money; long Time;
		System.out.println("请输入红包个数：");
		num=sc.nextInt();
		System.out.println("请输入红包金额：");
		money=sc.nextDouble();
		System.out.println("请输入红包有效时间（毫秒）：");
		Time=sc.nextLong();
		HongBao hb=new HongBao(num,money,Time);
		out:
		while(true)
		{
			System.out.println("请选择要进行的操作：1.拆红包  2.查看领取详情  3.退出");
			int ii=sc.nextInt();
			switch (ii) {
			case 1:
				hb.Open(al);
				break;
			case 2:
				hb.getInfo(al);
				break;
			case 3:
				break out;
			default:
				break;
			}
		}
	}
	
}
