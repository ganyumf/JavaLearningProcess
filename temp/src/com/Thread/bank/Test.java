package com.Thread.bank;

public class Test {
	
	public static void main(String[] args) {
		Account account=new Account();
		account.setZhanghao("1234567");
		
		SaveMoneyThread smt=new SaveMoneyThread("存款者", account);
		DrawMoneyThread dmt=new DrawMoneyThread("取款者", account);
 		DrawMoneyThread dmt1=new DrawMoneyThread("取款者1", account);
 		 
		
		smt.start();
		dmt.start();
		dmt1.start();
		 
		
	}
	
	
	

}
