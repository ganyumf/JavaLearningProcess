package Factory;

public class Test {
	public static void main(String[] args) {
		Benz q7=new Benz();
		q7.drive();
		BMW bm=new BMW();
		bm.drive();
		
		Factory f=new Factory();
		Car c=f.getCar("±¼³Û");
		c.drive();
	}
}
