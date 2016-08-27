package com.Thread.deadLock;

public class B {
	//主线程
	public synchronized void heheB(A a){
		System.out.println(Thread.currentThread().getName()+ "进入B类的heheB方法");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.last(); 
	}
	public  void last(){
		System.out.println("进入了B类的last");
	}

}
