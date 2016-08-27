/*
 9.（1）定义一个游戏中Hero 英雄的类，在该类中定义英雄的名字， 生命值和等级3 个属性，定义一个构造函数完成对生命值和等级的初始化，分别赋初值为100，1。
 同时实现名字的输入和英雄信息的输出。
（2）在上一题的基础上，为英雄再定义拥有一个参数的构造方法，传入一个英雄类型的值，如果为1，则为普通英雄，生命值为100，如果该值为2，则为高级英雄，生命值初始化为200。
（3）在上两英雄类型的基础上，为英雄添加一个基本战斗的方法， 该方法拥有一个英雄类型的参数，当传入另一个英雄时，能降低对方100 点血。
 再增加一个绝招的重载方法，加入一个战斗类型参数，通过输入不同绝招参数，降低对方不同的血量。
 */
package Thero;
import java.util.*;
public class Hero {
String name;
int hp;
int level;
	public Hero()
	{
		hp=100;
		level=1;
	}
	public Hero(int heroz)
	{
		if(heroz==1){name="普通英雄";hp=100;}
		if(heroz==2){name="高级英雄";hp=200;}
	}
	public void setName()
	{	
		System.out.println("请输入英雄名：");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	}
	public void display()
	{
		System.out.println("名字："+name);
		System.out.println("生命值："+hp);
		System.out.println("等级："+level);
	}
	public void Attack()
	{
		
	}
}
