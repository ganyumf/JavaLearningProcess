package Extends;

public class Father {
static
{
	System.out.println("Father static block");
}
public Father()
{System.out.println("������Father����");}
{
	System.out.println("father block");
}
public void s(){System.out.println("���෽��");}

public static void main(String[] args) {
	Son s=new Son();
	s.s();
}
}
