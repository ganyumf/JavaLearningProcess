package Object;

public class TestObject {
	int age;
	String name;
	public boolean equals(Object obj)
	{
		//ֻҪage������� ��ô ��˵�������
		System.out.println("ִ���Լ���equals����");
		if(obj instanceof TestObject)
		{
			TestObject x=(TestObject)obj;
			if(this.age==x.age&&this.name.equals(x.name))
			//	System.out.println(t1.hashCode());
				{return true;}
			else {return false;}
		}
		return false;
	}
	public static void main(String[] args) {
		TestObject t1=new TestObject();
		t1.age=23;
		TestObject t2=new TestObject();
		t2.age=22;
		System.out.println(t1.age);
		System.out.println(t2.age);
		
		TestObject t3=t1;
		//  ==   �ж������������͵ĵ�ַ����
		//       �����������͵�ֵ
		
		//  equals����  �����Object���� �жϵ�ַ
		//			    ���������дequals����
		boolean b=t1.equals(t3);
		System.out.println(b);
	
//���� ��ַ ������� hashCode  int
//hash�벻ͬ �� �����ַһ����ͬ
//hash����ͬ  ��  �����ַ��һ����ͬ
//ͬһ������ hash����ͬ
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(t3.hashCode());
		
	System.out.println(t1.toString());
	System.out.println(t1);	
		
	
	}
}
