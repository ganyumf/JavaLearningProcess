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
//				Thread.sleep(100);//�����ͷ���
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
			System.out.println(Thread.currentThread().getName()+"����һ��ƻ����ʣ�ࣺ"+appcount);
			if(appcount%10==0)
			{
				Thread.currentThread().yield();
				System.out.println(Thread.currentThread().getName()+"�ó�");
			}
			
			}
		
		try {
			Thread.sleep(100);//�����ͷ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if(appcount==0)
			{
				System.out.println("û��ƻ����");
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
			count++;//����һ��ƻ��
			
			tl.set(count);//���˼��� ���� ���� ��ǰ�߳� �ľֲ�������
			System.out.println(name+"����һ��ƻ������"+count+"����ʣ�ࣺ"+appcount);
			
			try {
			Thread.sleep(100);//�����ͷ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		if(appcount==0)
		{
			System.out.println("û��ƻ����");
			flag=false;
		}
	}
	

	public static void main(String[] args) {
		Apple2 app=new Apple2();
		Thread t1=new Thread(app);
		t1.setName("Сǿ");
		t1.start();
		Thread t2=new Thread(app);
		t2.setName("С��");
		t2.start();
	}
}








