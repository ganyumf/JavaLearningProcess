package com.Thread;

public class TestDemod1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <1000; i++) {
			System.out.println("xx"+i);try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestDemod1 td=new TestDemod1();
		td.setDaemon(true);//ÊØ»¤Ïß³Ì
		td.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main"+i);
		}
	}
}
