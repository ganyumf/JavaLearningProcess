/*
请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move(int s))，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，并且通过打印出来。
另外，调用加速，减速的方法对速度进行改变。调用 move方法输出移动距离
 */
package T2;

public class Vehicle {
	int speed;
	int size;
	public void move(int s)
	{
		System.out.println("移动距离为");
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
