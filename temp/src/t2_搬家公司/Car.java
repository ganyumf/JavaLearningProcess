package t2_��ҹ�˾;

public class Car {
	Furniture arr[]=new Furniture[10];
	boolean arrival=false;
	public void trans()
	{
		System.out.println("������......");
	}
	public void print(boolean arrival)
	{
		if(arrival==true)
		{
			System.out.println("�ѵ�վ�������嵥��");
			for(int i=0;i<arr.length&&arr[i]!=null;i++)
			System.out.println(arr[i].fname);
		}
	}
}
