package d0418;

public class Pet {
	public void gaoxing(Pet d)
	{
	    d.qingxu();
	    if(d instanceof Dog)
	    ((Dog)d).kengutou();
	}
	public void qingxu()
	{
		System.out.println("¹þ¹þ");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		Pet p=new Pet();
		p.gaoxing(p);
	}
}
