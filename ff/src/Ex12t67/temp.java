/*
6.使用static 修饰 属性String name ，在主函数中声明多个对象，修改其中一个对象的name值 ，打印其他对象的name值
7.static 修饰方法，可以直接使用 类名.方法 调用
使用static 修饰 自定义方法，打印方法内容。
 */
package Ex12t67;

public class temp {
	static String name;
	static void print()
	{
		System.out.println("静态方法");
	}
	public static void main(String[] args) {
		temp a=new temp();
		a.name="cjy";
		temp b=new temp();
		a.name="acx";
		temp c=new temp();
		a.name="zdl";
		System.out.println(temp.name);
		temp.print();
	}
}
