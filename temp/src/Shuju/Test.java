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
		// # ����      ����
		// 0  ����      һλ�����㲹0
		//��ѧ������   ���֮һ��һǧ��
//		df.setGroupingSize(3);
//		df.setGroupingUsed(true);		
		
		String f=df.format(d);
		System.out.println("��ʽ����"+f);
		System.out.println("��ʽ��ǰ"+d);
//----------------------------------------------
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//		sdf.format(date)
		Date now =new Date();
		System.out.println(now);
		String dd=sdf.format(now);
		System.out.println(dd);
	}
}
