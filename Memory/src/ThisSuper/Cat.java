package ThisSuper;

public class Cat extends Animal{
	public Cat()
	{
		System.out.println("Cat�޲�");
	}
	public Cat(int x)
	{
		super(3);
		System.out.println("xxx");
	}
	public static void main(String[] args) {
		Cat c=new Cat(333);
	}
}
