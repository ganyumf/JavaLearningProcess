//�������Ҫ��
//1�� ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ����
//�γ̰��š�
//2�� ������һλ����ʦAllen ��JDBC
//3�� Lucy ��Ϊ��CoreJava   put����
//4�� ����Map��������е���ʦ����ʦ���ڵĿγ�(Set<Map.Entry<String,String>>��Set<String> get(key))
//5�� *����Map��������н�JSP ����ʦ
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
