package com.Thread;

public class TestYield extends Thread{
	public boolean flag=true;
	@Override
	public void run() {
		while(flag)
		{
			System.out.println("xxxxx");
		}
	}
	
	
	
	
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
////			if(i%10==0)//10�ı�������Ȩ
////			{
////				yield();
//			try {
//				Thread.sleep(1000);
//				System.out.println(Thread.currentThread().getName()+"�ó�");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//				
//			
//		}
//	}
	public static void main(String[] args) throws InterruptedException {
//		TestYield t1=new TestYield();
//		t1.setPriority(1);
//		t1.setName("t1");
		
		TestYield t2=new TestYield();
		t2.setPriority(10);
		t2.setName("t2");
		
//		t1.start();
		t2.start();
		Thread.sleep(2000);
		t2.interrupt();//�ж�
		t2.flag=false;
	}
}
