package 泛型与集合元素比较;

import java.util.HashMap;
import java.util.Map;

public class Testdate <T>{
	public String get(String e)
//	public T get(T e)
	{
		return e;
	}
	public static void main(String[] args) {
		Testdate tt=new Testdate();
		System.out.println(tt.get((String) new Object()));
		Map<String,Testdate>map=new HashMap();
	//	map.put(key, value);
	}
}
