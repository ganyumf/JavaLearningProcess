package com.io;

import java.io.*;
import java.util.*;

public class jiami {
	public void run() throws Exception
	{
		FileInputStream fis=new FileInputStream("d:/test/case.jpg");
		FileInputStream fisk=new FileInputStream("d:/test/t4/key.txt");
		FileOutputStream fos=new FileOutputStream("d:/test/t4/case1.jpg");
		
		
		final int perlength=1024;
		byte[]b=new byte[perlength];//4096
		int length=fis.read(b);
		byte[]key=new byte[perlength];
		fisk.read(key);
		while(length!=-1)
		{
			for(int i=0;i<length;i++)
			{
				byte temp=(byte) (b[i]^key[i]);
				fos.write(temp);
			}
			length=fis.read(b);
		}
		fis.close();
		fisk.close();
		fos.close();
	}
	
	
	public void huanyuan() throws Exception
	{
//		FileInputStream fis=new FileInputStream("d:/test/case.jpg");
//		FileInputStream fisk=new FileInputStream("d:/test/t4/key.txt");
//		FileOutputStream fos=new FileOutputStream("d:/test/t4/case1.jpg");
		
		FileInputStream fis=new FileInputStream("d:/test/t4/case1.jpg");
		FileInputStream fisk=new FileInputStream("d:/test/t4/key.txt");
		FileOutputStream fos=new FileOutputStream("d:/test/t4/case.jpg");
		
		final int perlength=1024;
		byte[]b=new byte[perlength];//4096
		int length=fis.read(b);
		byte[]key=new byte[perlength];
		fisk.read(key);
		while(length!=-1)
		{
			for(int i=0;i<length;i++)
			{
				byte temp=(byte) (b[i]^key[i]);
				fos.write(temp);
			}
			length=fis.read(b);
		}
		fis.close();
		fisk.close();
		fos.close();
	}
	
	public void creatKey() throws Exception
	{	
		FileOutputStream fos=new FileOutputStream("d:/test/t4/key.txt");
		Random ra=new Random();
		byte[]b=new byte[1024];
		for(int i=0;i<1024;i++)
		{
			b[i]=(byte) ra.nextInt(127);
		}
		fos.write(b,0, b.length);
		fos.flush();
		fos.close();
	}
	
	public static void main(String[] args) throws Exception {
		jiami j=new jiami();
		j.creatKey();
		j.run();
		j.huanyuan();
	}
	
	
}
