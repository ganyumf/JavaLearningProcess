package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("d:/xx.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		char c='a';
		oos.writeChar(c);
		oos.writeChar(c);
		oos.writeInt(23);
	//	oos.close();
		
		FileInputStream fis=new FileInputStream("d:/xx.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		System.out.println(ois.readChar());
		System.out.println(ois.readChar());
		System.out.println(ois.readInt());
		
//把Cat对象  名  年龄  static int suibian=35;
//保存到硬盘中
//存完再读取过来 输出对象的所有属性
	}
}
