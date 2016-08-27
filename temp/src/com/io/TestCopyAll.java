package com.io;

import java.io.*;
import java.util.*;

public class TestCopyAll {
	
	public void copyFile(String from,String to) throws IOException
	{
		FileInputStream fis=new FileInputStream(from);
		FileOutputStream fos=new FileOutputStream(to);
		byte []b=new byte[1024];
		int length=fis.read(b);
		while(length!=-1)
		{
			fos.write(b,0,length);
			length=fis.read(b);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
	
	public void copyAll(String from,String to) throws IOException
	{
		File fr=new File(from);
		File ft=new File(to+"\\"+fr.getName());
		if(fr.isFile())
		{
			copyFile(fr.getPath(),ft.getPath());
		}
		else if(fr.isDirectory())
		{
			ft.mkdir();
			File fs[]=fr.listFiles();
			for(int i=0;i<fs.length;i++)
			{
				copyAll(fs[i].getPath(), ft.getPath());
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);		
		System.out.println("�����븴�Ƶ��ļ��л��ļ���·����");
		String from=sc.next();	
		System.out.println("������ճ�����ļ��е�·����");
		String to=sc.next();
		TestCopyAll tca=new TestCopyAll();
		tca.copyAll(from, to);
	
	}
}
