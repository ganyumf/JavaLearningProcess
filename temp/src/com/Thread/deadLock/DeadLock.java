package com.Thread.deadLock;

public class DeadLock  implements Runnable{
	A a=new A();
	B b=new B();
	public void init(){
	  Thread.currentThread().setName("���߳�");
	  a.heheA(b);
	  System.out.println("�����˸��߳�");
	}
	@Override
	public void run() {
	Thread.currentThread().setName("���߳�");
	b.heheB(a);
	System.out.println("���������߳�");
	} 
	public static void main(String[] args) {
		DeadLock dl=new DeadLock();
		Thread t=new Thread(dl);
		  t.start();
		  dl.init(); 
	}
	
	
	
	
	

}
