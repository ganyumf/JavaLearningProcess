package Ex10t1;
/*
 1.����һ���࣬��String���͵�����name ���ڸ���Ĺ��캯���У��Ը����Խ��и�ֵ������������������������ʹ���в����Ĺ��췽����
 */
public class Ex10t1 {
	String name;
	public Ex10t1()
	{}
	public Ex10t1(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		Ex10t1 t=new Ex10t1("str");
		System.out.println(t.name);
	}
}
