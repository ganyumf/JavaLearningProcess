package com.Thread;

public class TestMethod extends Thread{
	public int time;
	public TestMethod2 tm2;
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==5)
			{
				try {
					tm2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		TestMethod tm=new TestMethod();
		tm.setName("线程1");
		TestMethod2 tm2=new TestMethod2();
		tm2.setName("线程2");
		tm.tm2=tm2;
		tm2.start();
		tm.start();
	
		
		
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
		//线程一、线程二  当线程一执行到5秒的时候执行线程二，执行完毕后再执行线程一
		//main
		

		
	}
}
