package com.Thread;

public class TestThread extends Thread{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	public static void main(String[] args) {
		TestThread tt=new TestThread();
		tt.run();
		TestThread tt1=new TestThread();
		tt1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("mainµÄ"+i);
		}
	}
}
