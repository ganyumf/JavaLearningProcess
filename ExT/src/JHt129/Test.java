//1.从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该
//年没有举办世界杯，则输出：没有举办世界杯。
//2. 读入一支球队的名字，输出该球队夺冠的年份列表。
//例如，读入“巴西”，应当输出
//1958 1962 1970 1994 2002
//读入“荷兰”，应当输出
//没有获得过世界杯
package JHt129;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("1930","乌拉圭");
		hm.put("1934","意大利");
		hm.put("1938","意大利");
		hm.put("1950","乌拉圭");
		hm.put("1954","德国");
		hm.put("1958","巴西");
		hm.put("1962","巴西");
		hm.put("1966","英格兰");
		hm.put("1970","巴西");
		hm.put("1974","德国");
		hm.put("1978","阿根廷");
		hm.put("1982","意大利");
		hm.put("1986","阿根廷");
		hm.put("1990","德国");
		hm.put("1994","巴西");
		hm.put("1998","法国");
		hm.put("2002","巴西");
		hm.put("2006","意大利");
		Scanner sc=new Scanner(System.in);
		String year=sc.next();
		if(hm.containsKey(year))
		{
			System.out.println(hm.get(year));
		}
		else
		{
			System.out.println("没有举办世界杯！");
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
			System.out.println("没有夺冠过！");
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			System.out.print(arr[i]+"  ");
		}
	}
}
