//1.�������ж���һ���ַ�������ʾһ����ݣ������������籭�ھ�����֧��ӡ������
//��û�оٰ����籭���������û�оٰ����籭��
//2. ����һ֧��ӵ����֣��������Ӷ�ڵ�����б�
//���磬���롰��������Ӧ�����
//1958 1962 1970 1994 2002
//���롰��������Ӧ�����
//û�л�ù����籭
package JHt129;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("1930","������");
		hm.put("1934","�����");
		hm.put("1938","�����");
		hm.put("1950","������");
		hm.put("1954","�¹�");
		hm.put("1958","����");
		hm.put("1962","����");
		hm.put("1966","Ӣ����");
		hm.put("1970","����");
		hm.put("1974","�¹�");
		hm.put("1978","����͢");
		hm.put("1982","�����");
		hm.put("1986","����͢");
		hm.put("1990","�¹�");
		hm.put("1994","����");
		hm.put("1998","����");
		hm.put("2002","����");
		hm.put("2006","�����");
		Scanner sc=new Scanner(System.in);
		String year=sc.next();
		if(hm.containsKey(year))
		{
			System.out.println(hm.get(year));
		}
		else
		{
			System.out.println("û�оٰ����籭��");
		}
		String country=sc.next();


		
		Iterator iter = hm.entrySet().iterator();
		int flag=0;
		int arr[]=new int[10];
		int ii=0;
		
		while (iter.hasNext()) 
		{
			Entry e = (Entry) iter.next();
			String key = (String) e.getKey();
			String val = (String) e.getValue();
			if(country.equals(val))
			{
				arr[ii]=Integer.parseInt(key);
				ii++;
				flag=1;
			}
		}
		
		if(flag==0)
		{
			System.out.println("û�ж�ڹ���");
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			System.out.print(arr[i]+"  ");
		}
	}
}
