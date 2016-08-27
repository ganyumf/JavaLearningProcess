package com.io;

import java.io.*;
import java.util.Scanner;

public class Testio {
	public static void main(String[] args) throws IOException, InterruptedException {
		//读入 d:\\abc.txt中的内容
		//将abc.txt文件的内容 读入应用程序中
		//磁盘-->应用  输入流
		FileInputStream fis=new FileInputStream("d:/abc.txt");	
//	    int data=fis.read();
//		System.out.println(data);
		byte []b=new byte[6];
		int length=fis.read(b);
		System.out.println("length:"+length);
		while(length!=-1)
		{//没读完
			for(int i=0;i<length;i++)
			{
				System.out.println(b[i]);
			}
			length=fis.read(b);
		}//取字节
		//向文件中输出内容
		String name="d:/aa/bb/aa.txt";//先创建文件夹，io流只能创建文件
		File f=new File(name);
		f.getParentFile().mkdirs();
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(name);
		byte []b1=new byte[4];
//		fos.write(57);
//		fos.write(13);
//		fos.write(55);
		b1[0]=97;
		b1[1]=98;
		b1[2]=99;
		b1[3]=100;
		fos.write(b1,1,2);
		fos.flush();//冲刷 强制输出流里的内容
		//Thread.sleep(10000);
		fos.close();//流关闭时 自动调用flush
		//从控制台 输入一个字符串
		//Scanner
		//字符串输出到f:/aa/bb/aa.txt 文件夹中
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串");
		String str=sc.next();
		FileOutputStream fos1=new FileOutputStream("d:/aa.txt");
		
		char c='中';
		int b2=c;//20013
		System.out.println(Integer.toHexString(b2));
		System.out.println(b2);
		if(c>0x4a00&&c<0x9abb)
		{
			System.out.println(c+"是中文");
		}
		
		byte []bb=str.getBytes();
		fos1.write(bb);
		fos1.flush();
		fos1.close();
	}
	//文件复制
	//d:/aa.txt   复制到        c:/aa.txt
}
