package com.Thread;

public class TestDemod extends Thread{
	int count;
	@Override
	public void run() {
		for (int i = 0; i <count; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestDemod td=new TestDemod();
		td.setDaemon(true);//�ػ��߳�
		td.count=1000;
		td.setName("�ػ�");
		
		TestDemod td1=new TestDemod();
		td1.count=500;
		td1.setName("���ػ�");
		
		td.start();
		td1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main"+i);
		}
	}
}
