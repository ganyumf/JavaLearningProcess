package com.Thread.bank;

public class Account {
 private String  zhanghao;//�˺�
 private double money;//Ǯ
 //��ȡǮ�ı��      ����Ǯ :true ȡ��Ǯ : false   
 public boolean flag=false;
 
 //��Ǯ
 public synchronized  void saveMoney(double money){
    
	 if(!flag){//Ϊ false ˵�� ȡ��Ǯ��
     System.out.println(Thread.currentThread().getName()+"����"+money+"Ԫ");
      this.money+=money;
	 System.out.println("��"+this.money);
	    flag=true; //����Ǯ
	    notifyAll();
    }else{ 
    	 try {
 			wait(); //�߳� �ȴ�   
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
    System.out.println("cccccccc");
 }  
 //ȡǮ 
 public synchronized void drawMoney(double money){
	 
	 if(flag){//Ϊtrue ˵������Ǯ��
	 System.out.println(Thread.currentThread().getName()+"ȡ��"+money+"Ԫ");
	   if(this.money<money ){
		   System.out.println("����");
	   }else{
		 this.money-=money;  
	   }
	 System.out.println("��"+this.money);
	    flag=false; 
	    notifyAll();//���� �߳�
	}else{
		  try {
				wait(); //ȡ��Ǯ�� �ȴ�
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
