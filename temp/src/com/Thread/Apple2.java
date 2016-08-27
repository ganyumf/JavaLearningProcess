package com.Thread;

public class Apple2 implements Runnable{
	int appcount=200;
	Object o=new Object();
	public boolean flag=true;

	ThreadLocal tl=new ThreadLocal();

	public void run() {
		while(flag)
		{	
			fenapple();
			
//			try {
//				Thread.sleep(100);//不会释放锁
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
	}	
		
	public synchronized void fenapple()
	{
		if(appcount>0){
			appcount--;
			System.out.println(Thread.currentThread().getName()+"拿了一个苹果，剩余："+appcount);
			if(appcount%10==0)
			{
				Thread.currentThread().yield();
				System.out.println(Thread.currentThread().getName()+"让出");
			}
			
			}
		
		try {
			Thread.sleep(100);//不会释放锁
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if(appcount==0)
			{
				System.out.println("没有苹果了");
				flag=false;
			}
	}
		
	
	public synchronized void fenapple1()
	{
		if(appcount>0){
			appcount--;
			String name=Thread.currentThread().getName();
			
			Integer count=(Integer)tl.get();
			if(count==null)
			{
				count=0;
			}
			count++;//拿了一个苹果
			
			tl.set(count);//拿了几个 的数 放入 当前线程 的局部变量中
			System.out.println(name+"拿了一个苹果，有"+count+"个，剩余："+appcount);
			
			try {
			Thread.sleep(100);//不会释放锁
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		if(appcount==0)
		{
			System.out.println("没有苹果了");
			flag=false;
		}
	}
	

	public static void main(String[] args) {
		Apple2 app=new Apple2();
		Thread t1=new Thread(app);
		t1.setName("小强");
		t1.start();
		Thread t2=new Thread(app);
		t2.setName("小红");
		t2.start();
	}
}








