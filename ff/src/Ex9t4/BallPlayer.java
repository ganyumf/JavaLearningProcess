/*
 4 .编写球员类，BallPlayer,该球员有属性：姓名，年纪，姓别，体重，身高，国籍，摸高。
定义的操作方法有：
设置姓名，设置年纪等所有属性。获得姓名，年纪等所有属性，此外还有运球，投篮，扣篮方法，在扣篮方法中，如果摸高低于3.20米，输出该球员不能完成扣篮的提示。
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
			System.out.println(this.name+"不能完成扣篮");
		}
	}
	public static void main(String[] args) {
		BallPlayer a=new BallPlayer();
		a.setName("cjy");
		a.setReachJump(3.10);
		a.slamDunk();
	}
}
