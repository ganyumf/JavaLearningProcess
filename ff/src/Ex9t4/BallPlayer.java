/*
 4 .��д��Ա�࣬BallPlayer,����Ա�����ԣ���������ͣ��ձ����أ���ߣ����������ߡ�
����Ĳ��������У�
����������������͵��������ԡ������������͵��������ԣ����⻹������Ͷ���������������ڿ��������У�������ߵ���3.20�ף��������Ա������ɿ�������ʾ��
 */
package Ex9t4;

public class BallPlayer {
	String name;
	int age;
	char sex;
	double weight;
	double height;
	String nationality;
	double reachJump;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setName(int age)
	{
		this.age=age;
	}
	public void setReachJump(double reachJump)
	{
		this.reachJump=reachJump;
	}
	public String getName()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	public void slamDunk()
	{
		if(this.reachJump<3.20)
		{
			System.out.println(this.name+"������ɿ���");
		}
	}
	public static void main(String[] args) {
		BallPlayer a=new BallPlayer();
		a.setName("cjy");
		a.setReachJump(3.10);
		a.slamDunk();
	}
}
