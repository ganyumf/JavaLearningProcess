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

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <xHongBao>al=new ArrayList<xHongBao>();
		int num; double money; long Time;
		System.out.println("��������������");
		num=sc.nextInt();
		System.out.println("����������");
		money=sc.nextDouble();
		System.out.println("����������Чʱ�䣨���룩��");
		Time=sc.nextLong();
		HongBao hb=new HongBao(num,money,Time);
		out:
		while(true)
		{
			System.out.println("��ѡ��Ҫ���еĲ�����1.����  2.�鿴��ȡ����  3.�˳�");
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
