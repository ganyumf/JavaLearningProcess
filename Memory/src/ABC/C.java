package ABC;

public class C extends B{
	public void write()
	{
		System.out.println("C的方法");
	}
public static void main(String[] args) {
	A a=new B();
	
	a.write();
	System.out.println(a.func);
	//a.fangxue();
	//类型的转换
	B bb=(B)a;
	bb.fangxue();
	//bb.write();
	//重写的方法从下往上走
	
	//instanceof 运算符号 实例运算符
	//判断该对象是否属于某种类型
	String x="abc";
	System.out.println(x instanceof String);
	
//	if (bb instanceof B)
	{
		System.out.println("bb是B类型的");
	}
//	else
	{
		System.out.println("不是");
	}
	
	
	
	
	
	
	
	
	
	//String x=Integer.toBinaryString(256);
}
}
