package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {
	//d:/aa.txt   ���Ƶ�        c:/aa.txt
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:/aa.txt");
		FileOutputStream fos=new FileOutputStream("c:/aa.txt");
		byte []b=new byte[2];
		int length=fis.read(b);
		while(length!=-1)
		{
			fos.write(b,0,length);
			length=fis.read(b);
		}
		fos.flush();
		fos.close();
		fis.close();
		//�ļ����Լ������ļ��ĸ���
	}
}
