package com.io;

import java.io.*;

public class TestFile {
	public void getInfo(String url)
	{
		File f=new File(url);
			if(f.isFile())
			{
				System.out.println("�ļ�����"+f.getName());
			}
			else if(f.isDirectory())
			{
				System.out.println("--------------");
				System.out.println("�ļ�������"+f.getName());
				File fs[]=f.listFiles();
				for(File x:fs)
				{
				getInfo(x.getPath());
				}
			}
		
	}
	
	public void delete(String url)
	{
		File f=new File(url);
			if(f.isFile())
			{
				f.delete();
			}
			else if(f.isDirectory())
			{
				File fs[]=f.listFiles();
				for(File x:fs)
				{
				delete(x.getPath());
				}
				f.delete();
			}
		
	}
	
	
	
	public static void main(String[] args) throws IOException{
		//path:·��  name
		
		File f=new File("d:/qwe/abc.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println("execute"+f.canExecute());
		f.lastModified();//����޸�ʱ��
	//	Runtime.getRuntime().exec("D:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
		
		System.out.println(f.exists());//����
		System.out.println(f.length());//��С
		System.out.println(f.getTotalSpace());//�ļ����ڴ��̵��ܿռ�
		System.out.println(f.getFreeSpace());//�ô���ʣ��ռ�
		System.out.println(f.getParent());//����·����Ϣ
		System.out.println("�Ƿ����ļ���"+f.isDirectory());//�Ƿ����ļ���
		System.out.println("�Ƿ����ļ�"+f.isFile());//�Ƿ����ļ�
		System.out.println(f.isHidden());//�Ƿ�����
		f.delete();//ֻ��ɾĩ�˵�
//		String[]fs=f.list();//ֻ����
//		for(String s:fs)
//		{
//			System.out.println(s);
//		}
		
		
//		File[]fs=f.listFiles();
//		for(File x:fs)
//		{
//			if(x.isFile())
//			{
//				x.delete();
//			}
//			else if(x.isDirectory())
//			{
//				//File[]fxx=x.listFiles();
//			}
//			System.out.println(x.getName());
//		}
		//д������  ����  һ��·����չʾ �ļ� �Լ� �ļ����µ������ļ�
		TestFile tf=new TestFile();
	//	tf.getInfo("d:\\code");
		tf.delete("d:\\aaa");
		
		
		
		
		
		
		//�����ļ������ļ���
		
		for (int i = 0; i < 10; i++) {
			File s=new File("d:/aaa/bbb/ccc/abc.txt");
			if(!s.getParentFile().exists())
			{
				s.getParentFile().mkdirs();
				s.createNewFile();
			}
			//s.createNewFile();�����ļ�
			//s.mkdir();//���������ļ���
			//s.mkdirs();
			//make Directory
		}
		
		
		//tf.delete("d:\\aaa");
		
		
		String s="dsdsd";
		byte []b=s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
