package test;

public class Father extends GrandFather{
	String book="��������";
	public Father()
	{
		System.out.println("����Father����");
	}
	public Father(int a,int b)
	{
		System.out.println("����Father����1,2");
	}
	/*
	public void eat()
	{
		System.out.println("��������");
	}
	*/
	public void readBook()
	{	
		
		System.out.println("��"+book);
		eat();
	}
	public static void main(String[] args) {
		Son f=new Son();
		f.readBook();
		Father s=new Son();
		//ֻ�д�����д�����������������,ȡ����Father
		s.eat();
		
	}
}
