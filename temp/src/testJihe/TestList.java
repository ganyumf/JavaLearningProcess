package testJihe;
import java.util.*;
public class TestList {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("a");
		arr.add("b");
		System.out.println(arr.size());
		arr.add("c");
		System.out.println(arr.size());
		arr.add("d");
		System.out.println(arr.size());
		arr.add("e");
		arr.add("e");
		arr.add("b");
		System.out.println(arr.size());
		arr.set(0,"ddd");
		//长度是3的数组
			//创建一个 长度是 原数组 长度 +1的新数组
		
		arr.toArray();
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
		int []z=new int[3];
		short s=3;
		z[0]=s;
		Object []oo=new Object[3];
		oo[0]=123;
		//创建一个ArrayList 集合对象 然后放入 a b c三个字符串和5再重新输出
		
	}
}
