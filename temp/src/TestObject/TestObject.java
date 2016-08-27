package TestObject;

public class TestObject {
	  int age; 
	  String name;
	  
	
	  //一样的    
	@Override            //TestObject
	public boolean equals(Object obj) {
        //只要 age 相等 那么 就说对象相等   
		System.out.println("执行自己的 equals 方法");
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
		         t1.name="张三";
//		          f1
		TestObject t2=new TestObject();
		         t2.age=22; 
		         t2.name="张三";
	               //f0
	      TestObject t3=t1;
	      t1.age=44;
	      System.out.println(t1.age);
	      System.out.println(t3.age);   
	    //  ==判断 地址  
	 boolean b=  t1.equals(t3);
		System.out.println(b);
		//String
		
//		Object 父类 
//		    equals  == 地址
//	   子类 子.equals(子类对象);
//		
//		
//		  红霞   小名   小红 
//		//hashcode() -->
		
//		根据 地址 算出来的 hashCode  int  
//		hash码不同 则 对象 一定不同
//		hash码相同 但 对象不一定相同 
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode()); 
//		数 地址  hash函数 --> hash码
        System.out.println(t1);
        System.out.println(t1);
        int [] arr={1,2,3,4,5};
         System.out.println(arr.toString() );
        
        
        
         
		
		
		 
		
		
		
		
		
		
		
		
	}
	

}
