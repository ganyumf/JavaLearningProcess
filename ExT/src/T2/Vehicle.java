/*
�붨��һ����ͨ����(Vehicle)���࣬������:
���ԣ��ٶ�(speed)�����(size)�ȵ�
�������ƶ�(move(int s))�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�.
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ������ͨ����ӡ������
���⣬���ü��٣����ٵķ������ٶȽ��иı䡣���� move��������ƶ�����
 */
package T2;

public class Vehicle {
	int speed;
	int size;
	public void move(int s)
	{
		System.out.println("�ƶ�����Ϊ");
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void speedUp(){++speed;}	
	public void speedDown(){--speed;}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.setSpeed(50);
		System.out.println(v.speed);
		v.speedUp();
		v.speedDown();
		v.move(6);
	}
}
