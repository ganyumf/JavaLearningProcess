/*
 1.定义一个Car类，包括的属性有：品牌，颜色，重量，高度
包括行为有：驾驶和装载，
创建该类的对象，打印出该车的所有属性信息，调用该类的行为。 
 */
package Ex9t1;

public class Car {
	String brand;
	String color;
	int weight;
	double height;
	public Car(String brand,String color,int weight,double height)
	{
		this.brand=brand;
		this.color=color;
		this.height=height;
		this.weight=weight;
	}
	public void drive()
	{
		System.out.println("驾驶");
	}
	public void load(int i)
	{
		weight+=i;
		System.out.println("装载"+i+"千克");
	}
	public static void main(String[] args) {
		Car c=new Car("二手松花江","灰色",2000,1.5);
		System.out.println(c.brand);
		System.out.println(c.color);
		System.out.println(c.height+"米");
		System.out.println("车重"+c.weight+"千克");
		c.drive();
		c.load(5);
		System.out.println("车重"+c.weight);
	}
}
