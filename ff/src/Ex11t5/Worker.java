/*
父类Employee   属性：name、sex , 带一个构造方法Employee(String n, char s)
子类 Worker继承自Employee  属性：char category;//类别 
boolean dressAllowance; //是否提供服装津贴 ， 有一个构造方法 负责构造所有属性，
还有一个自定义方法 isDressAll() 这个方法 负责通过判断dressAllowance的值输出 ，是否提供服装津贴。
新建一个类测试类InheDemo 
在main方法中新建一个Worker对象，输出这个对象的所有属性 
并调用isDressAll()方法得到津贴信息
 */
package Ex11t5;

public class Worker extends Employee{
	char category;
	boolean dressAllowance;
	public Worker(String name, char sex,boolean dressAllowance) {
		super(name, sex);
		this.dressAllowance=dressAllowance;
	}
	public void isDressAll(){
		if (dressAllowance==true)
		{System.out.println("发放津贴");}
		else {System.out.println("不发放津贴");}
	}
}
