//1.2.6 编写一个扑克类(每张扑克有花色和数值，例如红心A,草花10),将52张扑克牌放到集合中(自己去选择集合类)
//  编写3个方法
//方法1.将集合中的所有扑克重新洗牌,并将扑克输出(打印出来即可)
//方法2.将集合中的所有扑克排序(按方块3~方块2,草花3~草花2, 红心3~红心2, 黑桃3~黑桃2的顺序排序)
//方法3：比较两张扑克牌的大小，如果版面的值相等，则按（黑桃->红心->草花->方块）的顺序进行排列
//  测试以上方法

package JHt126;

import java.util.*;

public class Test {
	
	public ArrayList <Poker> shuffle(ArrayList <Poker>ap)//方法一
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
	
	public ArrayList <Poker> testSort(ArrayList <Poker>apt)//方法二
	{
		CompareValue c=new CompareValue();
		Collections.sort(apt, c);
		for(Poker s:apt)
		{
			System.out.println(s);
		}
		return apt;
	}
	
	public void compareTwo(ArrayList <Poker>apt) //方法三
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
			Poker a=new Poker("红心",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("方块",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("草花",i+2);
			ap.add(a);
		}
		for (int i = 0; i < 13; i++) {
			Poker a=new Poker("黑桃",i+2);
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
