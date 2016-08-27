/*
请编码实现动物世界的继承关系：
动物（Animal）具有行为：吃（eat）、睡觉（sleep）
动物包括：兔子（Rabbit），老虎（Tiger）
这些动物吃的行为各不相同（兔子吃草，老虎吃肉）；但睡觉的行为是一致的。
 */
package Ex11t4;

public class Animal {
	String name="动物";
	String food="东西";
	Animal()
	{System.out.println("构造动物");}
	public void eat()
	{
		System.out.println(name+"吃"+food);
	}
	public void sleep()
	{
		System.out.println(name+"睡觉");
	}
}
