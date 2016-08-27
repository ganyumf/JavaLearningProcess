package testJihe;

import java.util.*;

public class TestCompareAble {
	public static void main(String[] args) {
		//向ArrayList中添加学生对象
		Student zs=new Student("张三",21);
		Student ls=new Student("李四",24);
		Student wemz=new Student("王二麻子",20);
		Student ls3=new Student("李四",23);
		Student ls2=new Student("李四",22);
		ArrayList arr=new ArrayList();
		arr.add(zs);
		arr.add(ls);
		arr.add(wemz);
		arr.add(ls3);
		arr.add(ls2);
		Object o=arr.get(2);
		o.hashCode(); 
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
		
		//Collections.sort(arr);
		CompareAge ca=new CompareAge(); 
		Collections.sort(arr,ca);
		
		
		for(int i=0;i<arr.size();i++)
		{
			Student o1=(Student)arr.get(i);
			System.out.println(o1.toString());
		}
		
		
		
		
		
//		for(int i=0;i<arr.size();i++)
//		{
//			Student o=(Student)arr.get(i);
//			o.getAge();
//			System.out.println(o.toString());
//		}

	

	}	
}
