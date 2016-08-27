package 按一个属性排序;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompareAble {
	public static void main(String[] args) {
		//向ArrayList中添加学生对象
		Student zs=new Student("张三",21);
		Student ls=new Student("李四",24);
		Student wemz=new Student("王二麻子",20);
		ArrayList arr=new ArrayList();
		arr.add(zs);
		arr.add(ls);
		arr.add(wemz);
		
		//按照学生的年龄进行排序
//		for(int i=0;i<arr.size()-1;i++)
//		{
//			for(int j=i+1;j<arr.size();j++)
//			{
//				Student a=(Student)arr.get(i);
//				Student b=(Student)arr.get(j);
//				if(a.getAge()>b.getAge())
//				{
//					Object o=arr.get(i);
//					arr.set(i, arr.get(j));
//					arr.set(j,o);
//				}
//			}
//		}
		
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
		{
			Student o=(Student)arr.get(i);
			System.out.println(o.toString());
		}
		
		
		
		
		
//		for(int i=0;i<arr.size();i++)
//		{
//			Student o=(Student)arr.get(i);
//			o.getAge();
//			System.out.println(o.toString());
//		}

	
}}

	
