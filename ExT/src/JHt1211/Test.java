package JHt1211;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30,80 , "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		double aver;
		double sum=0;
		for (int i = 0; i < list.size(); i++) {
			sum+=((Student)list.get(i)).age;
		}
		aver=sum/list.size();
		System.out.println("平均年龄："+aver);
		
		
		while(list.size()>0)
		{
			double classSum=0;
			double classAver;
			int count=1;
			Student s=(Student)list.get(0);
			classSum+=s.score;
			list.remove(0);
			for (int i = 0; i < list.size(); i++) {
				Student s1=(Student)list.get(i);
				if(s.classNum.equals(s1.classNum))
				{
					classSum+=s1.score;
					list.remove(i);
					i--;
					count++;
				}
			}
			classAver=classSum/count;
			System.out.println(s.classNum+"的平均分："+classAver);
		}
		
	}
}
