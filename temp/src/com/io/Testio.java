package com.io;

import java.io.*;
import java.util.Scanner;

public class Testio {
	public static void main(String[] args) throws IOException, InterruptedException {
		//���� d:\\abc.txt�е�����
		//��abc.txt�ļ������� ����Ӧ�ó�����
		//����-->Ӧ��  ������
		FileInputStream fis=new FileInputStream("d:/abc.txt");	
//	    int data=fis.read();
//		System.out.println(data);
		byte []b=new byte[6];
		int length=fis.read(b);
		System.out.println("length:"+length);
		while(length!=-1)
		{//û����
			for(int i=0;i<length;i++)
			{
				System.out.println(b[i]);
			}
			length=fis.read(b);
		}//ȡ�ֽ�
		//���ļ����������
		String name="d:/aa/bb/aa.txt";//�ȴ����ļ��У�io��ֻ�ܴ����ļ�
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
		fos.flush();//��ˢ ǿ��������������
		//Thread.sleep(10000);
		fos.close();//���ر�ʱ �Զ�����flush
		//�ӿ���̨ ����һ���ַ���
		//Scanner
		//�ַ��������f:/aa/bb/aa.txt �ļ�����
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ���");
		String str=sc.next();
		FileOutputStream fos1=new FileOutputStream("d:/aa.txt");
		
		char c='��';
		int b2=c;//20013
		System.out.println(Integer.toHexString(b2));
		System.out.println(b2);
		if(c>0x4a00&&c<0x9abb)
		{
			System.out.println(c+"������");
		}
		
		byte []bb=str.getBytes();
		fos1.write(bb);
		fos1.flush();
		fos1.close();
	}
	//�ļ�����
	//d:/aa.txt   ���Ƶ�        c:/aa.txt
}
