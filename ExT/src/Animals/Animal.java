package Animals;

public class Animal {
	int age;
	String name;
	String color;
	String type;
	public void jiao()
	{
		System.out.println("叫");
	}
	public void sleep()
	{
		System.out.println("睡觉");
	}
	public void getInfo()
	{
		System.out.println("年龄"+age+"颜色"+color+"名称"+name);
	}
	public static void main(String[] args) {
		Dog wangcai=new Dog();
		wangcai.name="旺财";
		wangcai.color="金色";
		wangcai.age=5;
		wangcai.getInfo();
	}
}
