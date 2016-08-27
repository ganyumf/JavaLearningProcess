package Ex11t1;

public class Person {
	String name;
	int age;
	public Person()
	{
		name="cjy";
		age=18;
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void showInfo(){
		System.out.println("ĞÕÃû:"+name);
		System.out.println("ÄêÁä:"+age);
	}
}
