package com.Thread;

public class Apple extends Thread{
	static Integer appcount=5;
	Object o=new Object();
	@Override
	public void run() {
		synchronized (o) {  //锁块 让cpu无法进行切换
			appcount--;
			System.out.println(Thread.currentThread().getName()+"拿了一个苹果，剩余："+appcount);
		}
	}
	public static void main(String[] args) {
		Apple xq=new Apple();
		xq.setName("小强");
		Apple xh=new Apple();
		xh.setName("小红");
		xq.start();
		xh.start();
	}
}
