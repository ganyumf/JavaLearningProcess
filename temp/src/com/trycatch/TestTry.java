package com.trycatch;

public class TestTry {
	public static void main(String[] args) {
		String str=null;
		System.out.println(1);
		try{
		System.out.println(str.charAt(0));
		}
		catch(Exception e)
		{
			System.out.println("��������");
		}
		finally
		{
			System.out.println("һ����ִ��");
		}
		System.out.println(2);
	}
}
