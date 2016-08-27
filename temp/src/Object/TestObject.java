package Object;

public class TestObject {
	int age;
	String name;
	public boolean equals(Object obj)
	{
		//只要age年龄相等 那么 就说对象相等
		System.out.println("执行自己的equals方法");
		if(obj instanceof TestObject)
		{
			TestObject x=(TestObject)obj;
			if(this.age==x.age&&this.name.equals(x.name))
			//	System.out.println(t1.hashCode());
				{return true;}
			else {return false;}
		}
		return false;
	}
	public static void main(String[] args) {
		TestObject t1=new TestObject();
		t1.age=23;
		TestObject t2=new TestObject();
		t2.age=22;
		System.out.println(t1.age);
		System.out.println(t2.age);
		
		TestObject t3=t1;
		//  ==   判断引用数据类型的地址引用
		//       基本数据类型的值
		
		//  equals方法  如果是Object方法 判断地址
		//			    子类可以重写equals方法
		boolean b=t1.equals(t3);
		System.out.println(b);
	
//根据 地址 算出来的 hashCode  int
//hash码不同 则 对象地址一定不同
//hash码相同  但  对象地址不一定相同
//同一个对象 hash码相同
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(t3.hashCode());
		
	System.out.println(t1.toString());
	System.out.println(t1);	
		
	
	}
}
