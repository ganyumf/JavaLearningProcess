/*
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С�
��д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition��������subtration�����ˣ�multiplication��������division���ȹ��г�Ա������
�ֱ��������Ա����ִ�мӡ������ˡ��������㡣
��main�����д���Number��Ķ��󣬵��ø�������������ʾ��������
 */
package T4;

public class Number {
	private int n1;
	private int n2;
	public Number(){
		
	}
	
	public Number(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public int addition()
	{
		return n1+n2;
	}
	public int subtration()
	{
		return n1-n2;
	}
	public int multiplication()
	{
		return n1*n2;
	}
	public int division()
	{
		return n1/n2;
	}
	public static void main(String[] args) {
		Number n=new Number(16,8);
		System.out.println(n.addition());
		System.out.println(n.subtration());
		System.out.println(n.multiplication());
		System.out.println(n.division());
	}
}
