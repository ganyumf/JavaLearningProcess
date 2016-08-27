package com.io;

import java.io.File;
import java.util.Scanner;

public class FileDelete {
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
	public static void main(String[] args) {
		System.out.println("请输入要删除的文件夹或者文件名路径：");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		FileDelete fd=new FileDelete();
		fd.delete(str);
	}
}
