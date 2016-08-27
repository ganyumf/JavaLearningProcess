/*
请编码实现动物世界的继承关系：
动物（Animal）具有行为：吃（eat）、睡觉（sleep）
动物包括：兔子（Rabbit），老虎（Tiger）
这些动物吃的行为各不相同（兔子吃草，老虎吃肉）；但睡觉的行为是一致的。
 */
package Ex11t4;

public class Tiger extends Animal{
	String name="老虎1";
	String food="肉";
	public Tiger()
	{	
		
		super.name="老虎";
		super.food="肉";
	}
	public void eat()
	{
		System.out.println(name+"吃"+food);
	}
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.sleep();
		Rabbit r=new Rabbit();
		r.eat();
		r.sleep();
	}
}
