package Ex13t2;

public class Bird extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("С��Գ�");
	}
	public void fly()
	{
		System.out.println("С���");
	}
	public static void main(String[] args) {
		Animal a=new Bird();
		a.eat();
		Bird b=(Bird)a;
		b.fly();
	}
}
