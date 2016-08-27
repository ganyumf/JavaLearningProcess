package com.Thread.bank;

public class Account {
 private String  zhanghao;//账号
 private double money;//钱
 //存取钱的标记      存完钱 :true 取完钱 : false   
 public boolean flag=false;
 
 //存钱
 public synchronized  void saveMoney(double money){
    
	 if(!flag){//为 false 说明 取完钱了
     System.out.println(Thread.currentThread().getName()+"存了"+money+"元");
      this.money+=money;
	 System.out.println("余额："+this.money);
	    flag=true; //存完钱
	    notifyAll();
    }else{ 
    	 try {
 			wait(); //线程 等待   
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
    System.out.println("cccccccc");
 }  
 //取钱 
 public synchronized void drawMoney(double money){
	 
	 if(flag){//为true 说明存完钱了
	 System.out.println(Thread.currentThread().getName()+"取出"+money+"元");
	   if(this.money<money ){
		   System.out.println("余额不足");
	   }else{
		 this.money-=money;  
	   }
	 System.out.println("余额："+this.money);
	    flag=false; 
	    notifyAll();//唤醒 线程
	}else{
		  try {
				wait(); //取完钱了 等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
	}
	 System.out.println("qqqqq");
 }
 
public String getZhanghao() {
	return zhanghao;
}
public void setZhanghao(String zhanghao) {
	this.zhanghao = zhanghao;
}
public double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
} 


}
