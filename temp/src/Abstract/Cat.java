package Abstract;

public class Cat implements Ipet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}
	public static void main(String []args) {
		Cat c=new Cat();
		c.eat();
		//�̳� ���� �ṩ��Ĭ�ϵ�ʵ��
		//ʵ�ֽӿ� ���� �����Լ�ʵ��
	}
}
