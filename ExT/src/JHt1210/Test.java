//完成下列要求：
//1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
//课程安排。
//2） 增加了一位新老师Allen 教JDBC
//3） Lucy 改为教CoreJava   put方法
//4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key))
//5） *利用Map，输出所有教JSP 的老师
package JHt1210;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Tom","CoreJava");
		hm.put("Jhon", "Oracle");
		hm.put("Susan","Oracle");
		hm.put("Jerry", "JDBC");
		hm.put("Jim", "Unix");
		hm.put("Kevin", "JSP");
		hm.put("Lucy","JSP");
		
		hm.put("Allen","JDBC");
		hm.put("Lucy","CoreJava");
		
		
		Iterator it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry e=(Entry)it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-----------------------");
		Iterator itSearch=hm.entrySet().iterator();
		while(itSearch.hasNext())
		{
			Entry e=(Entry)itSearch.next();
			String s=(String) e.getValue();
			if(s.equals("JSP"))
			{System.out.println(e.getKey());}
		}
		
		
	}
}
