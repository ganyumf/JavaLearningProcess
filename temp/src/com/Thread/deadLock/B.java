package com.Thread.deadLock;

public class B {
	//���߳�
	public synchronized void heheB(A a){
		System.out.println(Thread.currentThread().getName()+ "����B���heheB����");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.last(); 
	}
	public  void last(){
		System.out.println("������B���last");
	}

}
