package Shuju;

import java.text.DecimalFormat;


import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {
	public static void main(String[] args) {
		double d=10000000;
		double md=0.0001;
		System.out.println(md);
		DecimalFormat df=new DecimalFormat("$,###.00");
		// # 数字      任意
		// 0  数字      一位，不足补0
		//科学记数法   万分之一，一千万
//		df.setGroupingSize(3);
//		df.setGroupingUsed(true);		
		
		String f=df.format(d);
		System.out.println("格式化后"+f);
		System.out.println("格式化前"+d);
//----------------------------------------------
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//		sdf.format(date)
		Date now =new Date();
		System.out.println(now);
		String dd=sdf.format(now);
		System.out.println(dd);
	}
}
