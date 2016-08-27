package testJihe;

import java.util.Comparator;

public class CompareAge implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			if(s1.getName().equals("ÕÅÈı"))return -1;
			return s1.getAge()-s2.getAge();
		}
}
