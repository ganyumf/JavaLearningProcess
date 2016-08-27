package com.Thread.bank;

public class DrawMoneyThread extends Thread {
	private Account account;
	public boolean stopflag=false;//Õ£÷π±Í÷æ 
	public DrawMoneyThread() {
	}
	public DrawMoneyThread(String tname,Account account) {
	    this.account=account;
	    setName(tname);
	}
      @Override
    public void run() {
       while(!stopflag){
    	  account.drawMoney(800);
       }
    } 
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
	

}
