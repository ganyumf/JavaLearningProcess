package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable{
	public Object call()
	{
		for (int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		return "xxx";
	}
	
	public static void main(String[] args) {
		TestCallable tc=new TestCallable();
		FutureTask ft=new FutureTask(tc);
		Thread t=new Thread(ft,"Ïß³ÌÃû");
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main"+i);
		}
	}
	
}
