package com.Thread;

public class TestJoin extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("tj"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestJoin tj=new TestJoin();
		tj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==5)
			{
				try {
					tj.join();//������ʾ���ٺ���֮���߳��ٴο�ʼ��ռ
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
