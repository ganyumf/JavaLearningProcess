package t1;

public class Person {
private int age;
private String name;
//��̬  ����չ�� ��ά����
public void playWithPet(Pet p)
{
	p.play();
}
public static void main(String[] args) {
	Person s=new Person();
	Cat c=new Cat("�ӷ�è");
	s.playWithPet(c);
}
}