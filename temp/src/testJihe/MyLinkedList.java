package testJihe;

import java.util.*;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList lk=new LinkedList();
		lk.add("a");
		lk.add("a");
		lk.addLast("d");
		lk.removeLast();
		lk.add("a");
		lk.add("a");
		lk.addFirst("b");  //add(0,"b")
		lk.removeFirst();
//		lk.set(index, element)
//		lk.get(index);
		for (int i = 0; i <lk.size(); i++) {
			System.out.println(lk.get(i));
		}
		//LinkedList -->链表集合
		//倾向于操作(添加 删除元素 快)		首尾操作效率高
		//ArrayList  -->数组集合	Object[] 数组
		//优点 访问效率 高	操作效率 低
		long time =System.currentTimeMillis();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		long now=System.currentTimeMillis();
		System.out.println(now-time);
		
		
		
		ArrayList arrt=new ArrayList();
		LinkedList lkt=new LinkedList();
		
		long t1=System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			arrt.add("a");
		}
		long t2=System.currentTimeMillis();
		System.out.println("数组："+(t2-t1));
		
		
		long t3=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lkt.add("a");
		}
		long t4=System.currentTimeMillis();
		System.out.println("链表："+(t4-t3));
	}
}
