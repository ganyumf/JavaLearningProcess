/*
 2.编写一个类Book3，代表教材：
具有属性：名称（title）、页数（pageNum）、种类（type）
具有方法：detail，用来在控制台输出每本教材的名称、页数、种类

具有两个带参构造方法：
第一个构造方法中，设置教材种类为“计算机”（固定），其余属性的值由参数给定；
第二个构造方法中，所有属性的值都由参数给定

编写测试类Book3Test进行测试：
分别以两种方式完成对两个Book3对象的初始化工作，并分别调用它们的detail方法，看看输出是否正确
 */
package Ex12t2;

public class Book3 {
String title;
int pageNum;
String type;
public void detail()
	{
		
	}
public Book3(String title, int pageNum, String type) {
	super();
	this.title = title;
	this.pageNum = pageNum;
	this.type = type;
}
public Book3(String title, int pageNum) {
	super();
	type="计算机";
	this.title = title;
	this.pageNum = pageNum;
}
public static void main(String[] args) {
	Book3 a=new Book3("编程珠玑",256);
	Book3 b=new Book3("火影忍者",128,"漫画");
	System.out.println(a.type);
	System.out.println(b.type);
	
}
}
