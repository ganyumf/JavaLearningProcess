package t2_搬家公司;

public class Car {
	Furniture arr[]=new Furniture[10];
	boolean arrival=false;
	public void trans()
	{
		System.out.println("运输中......");
	}
	public void print(boolean arrival)
	{
		if(arrival==true)
		{
			System.out.println("已到站，货物清单：");
			for(int i=0;i<arr.length&&arr[i]!=null;i++)
			System.out.println(arr[i].fname);
		}
	}
}
