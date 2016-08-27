package Throw;

import java.io.IOException;

public class TestThrow {
	public void zhuanzhang()
	{
		int mymoney=200;
		mymoney=mymoney-300;
		if(mymoney<0)
		{
			
		}
	}
	
	
	
	
	
	
	public void eat() throws Exception
	{
		//抛出异常信息
	throw new IOException();
	}  
	public static void main(String[] args) throws Exception {
		TestThrow tt=new TestThrow();
		tt.eat();
	}
}
