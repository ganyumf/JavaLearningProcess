/*
 1.����һ��Car�࣬�����������У�Ʒ�ƣ���ɫ���������߶�
������Ϊ�У���ʻ��װ�أ�
��������Ķ��󣬴�ӡ���ó�������������Ϣ�����ø������Ϊ�� 
 */
package Ex9t1;

public class Car {
	String brand;
	String color;
	int weight;
	double height;
	public Car(String brand,String color,int weight,double height)
	{
		this.brand=brand;
		this.color=color;
		this.height=height;
		this.weight=weight;
	}
	public void drive()
	{
		System.out.println("��ʻ");
	}
	public void load(int i)
	{
		weight+=i;
		System.out.println("װ��"+i+"ǧ��");
	}
	public static void main(String[] args) {
		Car c=new Car("�����ɻ���","��ɫ",2000,1.5);
		System.out.println(c.brand);
		System.out.println(c.color);
		System.out.println(c.height+"��");
		System.out.println("����"+c.weight+"ǧ��");
		c.drive();
		c.load(5);
		System.out.println("����"+c.weight);
	}
}
