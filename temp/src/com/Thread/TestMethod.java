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
		tm.setName("�߳�1");
		TestMethod2 tm2=new TestMethod2();
		tm2.setName("�߳�2");
		tm.tm2=tm2;
		tm2.start();
		tm.start();
	
		
		
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
		//�߳�һ���̶߳�  ���߳�һִ�е�5���ʱ��ִ���̶߳���ִ����Ϻ���ִ���߳�һ
		//main
		

		
	}
}
