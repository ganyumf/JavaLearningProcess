package ��һ����������;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompareAble {
	public static void main(String[] args) {
		//��ArrayList�����ѧ������
		Student zs=new Student("����",21);
		Student ls=new Student("����",24);
		Student wemz=new Student("��������",20);
		ArrayList arr=new ArrayList();
		arr.add(zs);
		arr.add(ls);
		arr.add(wemz);
		
		//����ѧ���������������
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

	
