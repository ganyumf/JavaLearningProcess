package t1;

public class Person {
private int age;
private String name;
//多态  可拓展性 可维护性
public void playWithPet(Pet p)
{
	p.play();
}
public static void main(String[] args) {
	Person s=new Person();
	Cat c=new Cat("加菲猫");
	s.playWithPet(c);
}
}