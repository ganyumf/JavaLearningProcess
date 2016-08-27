package testJihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class temp {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(33);
		arr.add(39);
		arr.add(23);
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
