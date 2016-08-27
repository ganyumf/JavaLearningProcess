package com.trycatch;

public class Try {
	public static void main(String[] args) {
		int []arr=new int [2];
		String str=null;
		try{
			try{
				System.out.println(arr[3]);
			}
			catch(NullPointerException ae)
			{}
			System.out.println(1);
			System.out.println(2);
			System.out.println(str.charAt(0));
			System.out.println(3);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("数组 下标越界");
		}
		catch(NullPointerException ae)
		{
			System.out.println("空指针");
		}
		finally
		{
			System.out.println("呵呵");
		}
		System.out.println(4);
	}
}
