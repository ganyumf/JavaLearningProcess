package Factory;

public class Factory {
	public Car getCar(String name)
	{
		Car c=null;
		if(name.equals("����"))
		{
			c= new Benz();
		}
		else if(name.equals("����"))
		{
			c=new BMW();
		}
		return c;
		
	}
}
