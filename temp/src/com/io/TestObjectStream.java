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
		
//��Cat����  ��  ����  static int suibian=35;
//���浽Ӳ����
//�����ٶ�ȡ���� ����������������
	}
}
