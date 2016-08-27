package Factory;

public class Factory {
	public Car getCar(String name)
	{
		Car c=null;
		if(name.equals("±¼³Û"))
		{
			c= new Benz();
		}
		else if(name.equals("±¦Âí"))
		{
			c=new BMW();
		}
		return c;
		
	}
}
