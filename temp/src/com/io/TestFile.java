package com.io;

import java.io.*;

public class TestFile {
	public void getInfo(String url)
	{
		File f=new File(url);
			if(f.isFile())
			{
				System.out.println("文件名："+f.getName());
			}
			else if(f.isDirectory())
			{
				System.out.println("--------------");
				System.out.println("文件夹名："+f.getName());
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
		//path:路径  name
		
		File f=new File("d:/qwe/abc.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println("execute"+f.canExecute());
		f.lastModified();//最后修改时间
	//	Runtime.getRuntime().exec("D:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
		
		System.out.println(f.exists());//存在
		System.out.println(f.length());//大小
		System.out.println(f.getTotalSpace());//文件所在磁盘的总空间
		System.out.println(f.getFreeSpace());//该磁盘剩余空间
		System.out.println(f.getParent());//父级路径信息
		System.out.println("是否是文件夹"+f.isDirectory());//是否是文件夹
		System.out.println("是否是文件"+f.isFile());//是否是文件
		System.out.println(f.isHidden());//是否隐藏
		f.delete();//只能删末端的
//		String[]fs=f.list();//只是名
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
		//写个方法  传入  一个路径，展示 文件 以及 文件夹下的所有文件
		TestFile tf=new TestFile();
	//	tf.getInfo("d:\\code");
		tf.delete("d:\\aaa");
		
		
		
		
		
		
		//创建文件或者文件夹
		
		for (int i = 0; i < 10; i++) {
			File s=new File("d:/aaa/bbb/ccc/abc.txt");
			if(!s.getParentFile().exists())
			{
				s.getParentFile().mkdirs();
				s.createNewFile();
			}
			//s.createNewFile();创建文件
			//s.mkdir();//创建单层文件夹
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
