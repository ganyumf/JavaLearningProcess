package Ex13t2;

public class Bird extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ð¡Äñ³Ô³æ");
	}
	public void fly()
	{
		System.out.println("Ð¡Äñ·É");
	}
	public static void main(String[] args) {
		Animal a=new Bird();
		a.eat();
		Bird b=(Bird)a;
		b.fly();
	}
}
