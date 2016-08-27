
/*
 定义Animal父类，含有属性name，sex，age，方法sleep，run，编写一个子类Person，继承Animal类，然后调用父类的属性和方法
 */
package Ex11t2;

public class Person extends Animal{
	public static void main(String[] args) {
		Person a=new Person();
		a.sleep();
		a.run();
	}
}
