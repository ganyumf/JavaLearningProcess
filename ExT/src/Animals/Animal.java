package Animals;

public class Animal {
	int age;
	String name;
	String color;
	String type;
	public void jiao()
	{
		System.out.println("��");
	}
	public void sleep()
	{
		System.out.println("˯��");
	}
	public void getInfo()
	{
		System.out.println("����"+age+"��ɫ"+color+"����"+name);
	}
	public static void main(String[] args) {
		Dog wangcai=new Dog();
		wangcai.name="����";
		wangcai.color="��ɫ";
		wangcai.age=5;
		wangcai.getInfo();
	}
}
