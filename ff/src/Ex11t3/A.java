/*
 1、试编写三个具有继承关系的类，A、B、C（B继承A，C继承B）。
 要求A中包含方法a1()、a2()，B类中的方法b1()访问了a1()和a2()，C类中的方法c1()访问了a1()、a2()、b1()。
 */
package Ex11t3;

public class A {
	public void a1()
	{System.out.println("执行a1");}
	public void a2()
	{System.out.println("执行a2");}
	
}
