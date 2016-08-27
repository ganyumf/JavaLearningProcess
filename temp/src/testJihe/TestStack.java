package testJihe;

import java.util.*;

public class TestStack{
	//将 数组集合中的元素去掉重复
	//针对于当前的list
	//新建一个空的 数组集合
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("c");
		arr.add("ba");
		arr.add("da");
		arr.add("daa");
//		Collections.sort(arr);
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		Stack st=new Stack();
		st.push("a");//压栈
		st.push("b");
		st.push("c");
		st.push("bbb");
		for (int i = 0; i<st.size()+i; i++) {
			System.out.println(st.pop());
		}
		
		
		
	}
}
