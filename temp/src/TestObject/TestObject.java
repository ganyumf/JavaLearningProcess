package TestObject;

public class TestObject {
	  int age; 
	  String name;
	  
	
	  //һ����    
	@Override            //TestObject
	public boolean equals(Object obj) {
        //ֻҪ age ��� ��ô ��˵�������   
		System.out.println("ִ���Լ��� equals ����");
		if(obj instanceof TestObject){
			TestObject x=(TestObject)obj;
		if(this.age==x.age&&this.name.equals(x.name)){
        	   return true;
           }else{
        	   return false;
           }
		}
		return false;
	}
	  
	  
	public static void main(String[] args) { 
//		          f0   TestObjet   Object 
		TestObject t1=new TestObject();
		         t1.age=22;
		         t1.name="����";
//		          f1
		TestObject t2=new TestObject();
		         t2.age=22; 
		         t2.name="����";
	               //f0
	      TestObject t3=t1;
	      t1.age=44;
	      System.out.println(t1.age);
	      System.out.println(t3.age);   
	    //  ==�ж� ��ַ  
	 boolean b=  t1.equals(t3);
		System.out.println(b);
		//String
		
//		Object ���� 
//		    equals  == ��ַ
//	   ���� ��.equals(�������);
//		
//		
//		  ��ϼ   С��   С�� 
//		//hashcode() -->
		
//		���� ��ַ ������� hashCode  int  
//		hash�벻ͬ �� ���� һ����ͬ
//		hash����ͬ �� ����һ����ͬ 
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode()); 
//		�� ��ַ  hash���� --> hash��
        System.out.println(t1);
        System.out.println(t1);
        int [] arr={1,2,3,4,5};
         System.out.println(arr.toString() );
        
        
        
         
		
		
		 
		
		
		
		
		
		
		
		
	}
	

}
