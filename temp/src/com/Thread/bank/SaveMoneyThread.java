package com.Thread.bank;

public class SaveMoneyThread extends Thread {
	private Account account;
    public boolean stopflag=false;//Í£Ö¹µÄ±ê¼Ç 
	public SaveMoneyThread(String tname,Account account){
		setName(tname);
		this.account=account;
	}
	public SaveMoneyThread() {
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public void run() {
	    while(!stopflag){
		account.saveMoney(800);
	    }
	}  
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
	
	

}
