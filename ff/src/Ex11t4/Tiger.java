/*
�����ʵ�ֶ�������ļ̳й�ϵ��
���Animal��������Ϊ���ԣ�eat����˯����sleep��
������������ӣ�Rabbit�����ϻ���Tiger��
��Щ����Ե���Ϊ������ͬ�����ӳԲݣ��ϻ����⣩����˯������Ϊ��һ�µġ�
 */
package Ex11t4;

public class Tiger extends Animal{
	String name="�ϻ�1";
	String food="��";
	public Tiger()
	{	
		
		super.name="�ϻ�";
		super.food="��";
	}
	public void eat()
	{
		System.out.println(name+"��"+food);
	}
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.sleep();
		Rabbit r=new Rabbit();
		r.eat();
		r.sleep();
	}
}
