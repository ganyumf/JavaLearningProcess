/*
 5.��дһ���������ࡣ�������������ɫ���۸�Ʒ�����ԣ�ͬʱ���мӣ������ˣ����ȷ���������
	Class Cal {
		Public String color;
		Public int  add(int number1,int number2){
			Return number1+number2;
}
	}
	����д���������Դ��ࡣ

 */
package Ex9t5;

public class Cal {
	String color;
	int price;
	String brand;
	public int  add(int number1,int number2)
	{
		return number1+number2;
	}
	public int  sub(int number1,int number2)
	{
		return number1-number2;
	}
	public int  mul(int number1,int number2)
	{
		return number1*number2;
	}
	public int  div(int number1,int number2)
	{
		return number1/number2;
	}
	public static void main(String[] args) {
		Cal c=new Cal();
		System.out.println(c.add(1,2));
	}
}
