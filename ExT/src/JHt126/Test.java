//1.2.6 ��дһ���˿���(ÿ���˿��л�ɫ����ֵ���������A,�ݻ�10),��52���˿��Ʒŵ�������(�Լ�ȥѡ�񼯺���)
//  ��д3������
//����1.�������е������˿�����ϴ��,�����˿����(��ӡ��������)
//����2.�������е������˿�����(������3~����2,�ݻ�3~�ݻ�2, ����3~����2, ����3~����2��˳������)
//����3���Ƚ������˿��ƵĴ�С����������ֵ��ȣ��򰴣�����->����->�ݻ�->���飩��˳���������
//  �������Ϸ���

package JHt126;

import java.util.*;

public class Test {
	
	public ArrayList <Poker> shuffle(ArrayList <Poker>ap)//����һ
	{
		Random rd=new Random();
		ArrayList <Poker> apt=new ArrayList<Poker>();	
	    for (int i = 0;0<ap.size(); i++) {
		int x=rd.nextInt(ap.size());
		apt.add(ap.get(x));
		ap.remove(x);
	}
	    for(Poker s:apt)
	    {
	    	System.out.println(s);
	    }
	    return apt;
	}
	
	public ArrayList <Poker> testSort(ArrayList <Poker>apt)//������
	{
		CompareValue c=new CompareValue();
		Collections.sort(apt, c);
		for(Poker s:apt)
		{
			System.out.println(s);
		}
		return apt;
	}
	
	public void compareTwo(ArrayList <Poker>apt) //������
	{
		Random rd=new Random();
		Poker p1=apt.get(rd.nextInt(apt.size()));	
		Poker p2=apt.get(rd.nextInt(apt.size()));
		CompareValue cc=new CompareValue();
		int huase1=cc.swift(p1.suit);
		int huase2=cc.swift(p2.suit);
		if(p1.value<p2.value)
		{
			System.out.println(p1);
			System.out.println(p2);
		}
		else if(p1.value>p2.value)
		{
			System.out.println(p2);
			System.out.println(p1);
		}
		else
		{
			if(huase1>huase2)
			{
				System.out.println(p1);
				System.out.println(p2);
			}
			else
			{
				System.out.println(p2);
				System.out.println(p1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Random rd=new Random();
		ArrayList <Poker> ap=new ArrayList<Poker>();
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("����",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("����",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("�ݻ�",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("����",i+2);
			ap.add(a);
		}
		for(Poker s:ap)
		{
			System.out.println(s);
		}
System.out.println("--------------------------------------");
		Test t=new Test();
		ArrayList <Poker>apt=t.shuffle(ap);
System.out.println("--------------------------------------");
		ArrayList <Poker>apt1=t.testSort(apt);
System.out.println("--------------------------------------");
		t.compareTwo(apt);

	}
}
