package d0502;
/*
 创建一个Person类
 属性		年龄、姓名
 方法		toString 输出个人信息
HashSet 存放  三个人的对象
遍历输出 每个人的个人信息
 */
public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return "姓名:"+name+"  年龄:"+age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashCode():"+name+super.hashCode());
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("执行了equals方法");
		return super.equals(obj);
	}
}
