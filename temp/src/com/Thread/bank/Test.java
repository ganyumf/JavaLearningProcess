package com.Thread.bank;

public class Test {
	
	public static void main(String[] args) {
		Account account=new Account();
		account.setZhanghao("1234567");
		
		SaveMoneyThread smt=new SaveMoneyThread("�����", account);
		DrawMoneyThread dmt=new DrawMoneyThread("ȡ����", account);
 		DrawMoneyThread dmt1=new DrawMoneyThread("ȡ����1", account);
 		 
		
		smt.start();
		dmt.start();
		dmt1.start();
		 
		
	}
	
	
	

}
