package testJihe;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		a.add("abc");
		b.add("abc");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
