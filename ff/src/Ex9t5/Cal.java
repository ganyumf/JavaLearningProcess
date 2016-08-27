/*
 5.编写一个计算器类。计算机器类有颜色，价格，品牌属性，同时具有加，减，乘，除等方法。例如
	Class Cal {
		Public String color;
		Public int  add(int number1,int number2){
			Return number1+number2;
}
	}
	并编写代码来测试此类。

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
