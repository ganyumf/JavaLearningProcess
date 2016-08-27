package testJihe;

import java.util.*;
import java.util.Map.Entry;


public class tHashMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();	
		  hm.put("a", "abc");
		  hm.put("b", "bcd");
		  hm.put("c", "def");  
		  hm.put("bb","null"); 
		  
	      Collection c= hm.values(); 
	      Set eset=   hm.entrySet(); 
	      
//Can only iterate over an array or an instance of java.lang.Iterable
	   for (Object o:eset) {
		     Entry e=(Entry)o;
	System.out.println(e.getKey()+"---"+e.getValue());
		} 
//	   HashMap  :  put(key,value);
//	               get(key);
//	               keySet();
//	               values();
//	               entrySet();
	}
}



