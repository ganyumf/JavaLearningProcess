/*
 1.定义一个人的类（属性有名字，年龄。写一个能输出各个属性值的方法showInfo（）），定义一个学生类（属性有性别），学生继承人类
要求：（1）父类的属性赋值用构造方法来实现（分别用有参数构造方法和无参数构造方法实现）
（2）子类的属性也用构造方法来赋值。
（3）在子类中重写父类的showInfo（）方法
（4）声明学生类的对象，调用学生的显示信息的方法。
 */
package Ex11t1;

public class Student extends Person
{
	char sex;
	public Student(String name,int age,char sex)
	{	
		super(name,age);
		this.sex=sex;
	}
	public void showInfo(){
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+sex);
	}
	public static void main(String[] args) {
		Student s=new Student("acx",18,'男');
		s.showInfo();
	}
}
