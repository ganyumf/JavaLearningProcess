package testJihe;

import java.util.ArrayList;

public class noRepeat1{
	public ArrayList noRepeat11(ArrayList list)
	{
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					--j;  
				}
			}
		}
		return list;
	}
	
	public ArrayList noRepeat12(ArrayList list)
	{
		ArrayList b=new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if(b.contains(list.get(i))){}
			else
			{
				b.add(list.get(i));
			}
		}
		return b;
	}
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("ab"); 
		a.add("cd");
		a.add("cd");
		a.add("cd");
		a.add("ab");
		noRepeat1 s=new noRepeat1();
		//ArrayList b=s.noRepeat11(a);
		 ArrayList b=s.noRepeat12(a);
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
		ArrayList arr=new ArrayList();
		arr.add('b');
//		arr.add(39);
//		arr.add(23);
//		arr.add(5);
		arr.add('a');
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i+1;j<arr.size();j++)
			{
				char a1=(Character)arr.get(i);
				char b1=(Character)arr.get(j);
				if(a1>b1)
				{
					char x=(Character)arr.get(i);
					arr.set(i,arr.get(j));
					arr.set(j,x);
				}
			}
		}

		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
}
