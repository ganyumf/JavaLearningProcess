package com.Thread.deadLock;

public class A {
	//副线程
	public synchronized void heheA(B b){
		System.out.println(Thread.currentThread().getName()+"进入了A类的heheA方法");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       b.last();
	}
	public synchronized void last(){
		System.out.println("进入了A类的last");
	 }


}
