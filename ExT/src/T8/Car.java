package T8;

public class Car extends Vehicle{
	int seats;
	public Car(String brand,String color,int seats)
	{
		super(brand,color);
		this.seats=seats;
	}
	public void showCar()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(seats);
	}
	public static void main(String[] args) {
		Car c=new Car("����֮��","��ɫ",8);
		c.showCar();
	}
}
