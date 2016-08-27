/*
 1.开发教员类Teacher，要求：
具有属性：姓名、年龄、学历、职位
具有行为：自我介绍
编写一个测试类，要求：
实例化一个教员对象，并对其初始化
在控制台输出该教员的自我介绍
 */
package Ex12t1;

public class Teacher {
	String name;
	int age;
	String eduBG;
	String Position;
	public void intro()
	{
		System.out.println("我叫"+name);
		System.out.println(age);
		System.out.println(eduBG);
		System.out.println(Position);
	}
	public Teacher(String name,int age,String eduBG,String Position)
	{
		this.age=age;
		this.name=name;
		this.eduBG=eduBG;
		this.Position=Position;
	}
public static void main(String[] args) {
	Teacher t=new Teacher("acx",22,"本科","讲师");
	t.intro();
}
}
