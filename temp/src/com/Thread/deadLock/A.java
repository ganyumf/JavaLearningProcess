package com.Thread.deadLock;

public class A {
	//���߳�
	public synchronized void heheA(B b){
		System.out.println(Thread.currentThread().getName()+"������A���heheA����");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       b.last();
	}
	public synchronized void last(){
		System.out.println("������A���last");
	 }


}
