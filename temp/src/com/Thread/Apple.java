package com.Thread;

public class Apple extends Thread{
	static Integer appcount=5;
	Object o=new Object();
	@Override
	public void run() {
		synchronized (o) {  //���� ��cpu�޷������л�
			appcount--;
			System.out.println(Thread.currentThread().getName()+"����һ��ƻ����ʣ�ࣺ"+appcount);
		}
	}
	public static void main(String[] args) {
		Apple xq=new Apple();
		xq.setName("Сǿ");
		Apple xh=new Apple();
		xh.setName("С��");
		xq.start();
		xh.start();
	}
}
