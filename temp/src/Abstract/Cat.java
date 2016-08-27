package Abstract;

public class Cat implements Ipet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}
	public static void main(String []args) {
		Cat c=new Cat();
		c.eat();
		//继承 父类 提供了默认的实现
		//实现接口 子类 必须自己实现
	}
}
