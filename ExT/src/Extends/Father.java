package Extends;

public class Father {
static
{
	System.out.println("Father static block");
}
public Father()
{System.out.println("创建了Father对象");}
{
	System.out.println("father block");
}
public void s(){System.out.println("父类方法");}

public static void main(String[] args) {
	Son s=new Son();
	s.s();
}
}
