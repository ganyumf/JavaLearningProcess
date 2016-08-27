package Ex10t1;
/*
 1.定义一个类，有String类型的属性name ，在该类的构造函数中，对该属性进行赋值，并在主方法里进行输出。（使用有参数的构造方法）
 */
public class Ex10t1 {
	String name;
	public Ex10t1()
	{}
	public Ex10t1(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		Ex10t1 t=new Ex10t1("str");
		System.out.println(t.name);
	}
}
