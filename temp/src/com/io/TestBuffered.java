package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBuffered {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:/bb.txt");
		
//		char[]c=new char[10];
//		int length=fr.read(c);
//		while(length!=-1)
//		{
//			String st=new String(c);
//			System.out.print(st);
//			length=fr.read(c);
//		}
		
		
//		将文本中的 每行 数据输出
//		用循环
//		BufferedReader br=new BufferedReader(fr);  //读取一行数据
//		String str=br.readLine();
//		while(str!=null)
//		{
//			System.out.println(str);
//			str=br.readLine();
//		}
		
		
		
		
//		BufferedReader br=new BufferedReader(fr);  //读取一行数据
//		String str=br.readLine();
//			System.out.println(str);
//		str=br.readLine();
//			System.out.println(str);
//		str=br.readLine();
//			System.out.println(str);
//		str=br.readLine();
//			System.out.println(str);
//			
//			br.close();
//			fr.close();
		
		
		
//		FileInputStream fis=new FileInputStream("d:/bb.txt");
//		InputStreamReader isr=new InputStreamReader(fis);
//		BufferedReader br=new BufferedReader(isr); 
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		
//		Object对象流	内存
//		小强  生命值90  攻击力1
//		硬盘上	
//		Hero.sav
//		name:小强
//		life:90
//		attack:1
		
		Hero xq=new Hero("小强",100,1);//需要实现接口
		Hero xq2=new Hero("小强2",200,2);
		FileOutputStream fos=new FileOutputStream("d:/Hero.sav");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(xq);
			oos.writeObject(xq2);
			oos.flush();
			oos.close();
			fos.close();
		
		
		FileInputStream fis=new FileInputStream("d:/Hero.sav");
		ObjectInputStream ois=new ObjectInputStream(fis);
			Hero h=(Hero)ois.readObject();
			Object o=ois.readObject();
			System.out.println(o.getClass().getName());
			System.out.println(h.getName());
			System.out.println(h.getLife());
			System.out.println(h.getAttack());
			ois.close();
			fis.close();
		
		
		
		
		
		
	}
}
