/*
 5.多态练习，定义一个Animal类，方法有sing方法，定义这个类的三个子类（Dog,Cat,Bird），
 分别重写这个方法。利用多态，定义一个Animal类型的对象，Animal a;
 分别引用三个子类的对象，调用sing方法。为每个子类，增加额外的方法。
 通过此例，练习upCast,downCast,及instanceof操作符。
 */
package Ex12t5;

public class Animal {
	public void sing()
	{
		System.out.println("动物唱歌");
	}
	public static void main(String[] args) {
		Dog a=new Dog();
		a.sing();
		Animal b=new Dog();
		b.sing();
		Dog bb=(Dog)b;
		bb.dogsing();
	}
}
