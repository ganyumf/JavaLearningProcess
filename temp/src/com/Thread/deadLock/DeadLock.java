package com.Thread.deadLock;

public class DeadLock  implements Runnable{
	A a=new A();
	B b=new B();
	public void init(){
	  Thread.currentThread().setName("副线程");
	  a.heheA(b);
	  System.out.println("进入了副线程");
	}
	@Override
	public void run() {
	Thread.currentThread().setName("主线程");
	b.heheB(a);
	System.out.println("进入了主线程");
	} 
	public static void main(String[] args) {
		DeadLock dl=new DeadLock();
		Thread t=new Thread(dl);
		  t.start();
		  dl.init(); 
	}
	
	
	
	
	

}
