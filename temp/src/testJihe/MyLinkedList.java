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
		//LinkedList -->������
		//�����ڲ���(��� ɾ��Ԫ�� ��)		��β����Ч�ʸ�
		//ArrayList  -->���鼯��	Object[] ����
		//�ŵ� ����Ч�� ��	����Ч�� ��
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
		System.out.println("���飺"+(t2-t1));
		
		
		long t3=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lkt.add("a");
		}
		long t4=System.currentTimeMillis();
		System.out.println("����"+(t4-t3));
	}
}
