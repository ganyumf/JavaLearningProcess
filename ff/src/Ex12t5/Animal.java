/*
 5.��̬��ϰ������һ��Animal�࣬������sing�����������������������ࣨDog,Cat,Bird����
 �ֱ���д������������ö�̬������һ��Animal���͵Ķ���Animal a;
 �ֱ�������������Ķ��󣬵���sing������Ϊÿ�����࣬���Ӷ���ķ�����
 ͨ����������ϰupCast,downCast,��instanceof��������
 */
package Ex12t5;

public class Animal {
	public void sing()
	{
		System.out.println("���ﳪ��");
	}
	public static void main(String[] args) {
		Dog a=new Dog();
		a.sing();
		Animal b=new Dog();
		b.sing();
		Dog bb=(Dog)b;
		bb.dogsing();
	}
}
