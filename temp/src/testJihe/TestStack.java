package testJihe;

import java.util.*;

public class TestStack{
	//�� ���鼯���е�Ԫ��ȥ���ظ�
	//����ڵ�ǰ��list
	//�½�һ���յ� ���鼯��
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
		st.push("a");//ѹջ
		st.push("b");
		st.push("c");
		st.push("bbb");
		for (int i = 0; i<st.size()+i; i++) {
			System.out.println(st.pop());
		}
		
		
		
	}
}
