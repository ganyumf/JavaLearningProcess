package ABC;

public class C extends B{
	public void write()
	{
		System.out.println("C�ķ���");
	}
public static void main(String[] args) {
	A a=new B();
	
	a.write();
	System.out.println(a.func);
	//a.fangxue();
	//���͵�ת��
	B bb=(B)a;
	bb.fangxue();
	//bb.write();
	//��д�ķ�������������
	
	//instanceof ������� ʵ�������
	//�жϸö����Ƿ�����ĳ������
	String x="abc";
	System.out.println(x instanceof String);
	
//	if (bb instanceof B)
	{
		System.out.println("bb��B���͵�");
	}
//	else
	{
		System.out.println("����");
	}
	
	
	
	
	
	
	
	
	
	//String x=Integer.toBinaryString(256);
}
}
