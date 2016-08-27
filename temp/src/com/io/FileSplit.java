package com.io;


import java.io.*;

public class FileSplit{
	public void devide(String from,String to,int s) throws IOException
	{
		FileInputStream fis=new FileInputStream(from);
		File f=new File(from);
		int perlength=(int) (f.length()/s);
		byte[]b=new byte[perlength];
		for(int i=0;i<s;i++)
		{
			FileOutputStream fos=new FileOutputStream(to+"/"+f.getName()+".part"+i);
			fis.read(b);
			fos.write(b,0,perlength);
			fos.flush();
			fos.close();
		}
		
	}
	
	
	
	public void combine(String str) throws IOException
	{
		FileOutputStream fos=new FileOutputStream(str);
		File[]farr=new File(str).getParentFile().listFiles();
		for(int i=0;i<farr.length;i++)
		{
			File fpart=new File(str+".part"+i);
			if(fpart.exists())
			{		
				FileInputStream fis=new FileInputStream(str+".part"+i);
				byte[]b=new byte[1024];
				int length=fis.read(b);
				while(length!=-1)
				{
					fos.write(b,0,length);
					length=fis.read(b);
				}
				fis.close();
			}
			else
			{break;}
		}
		fos.flush();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
		FileSplit tj=new FileSplit();
		String from="e:/2016-5-1 ArrayList LinkedList.avi";
		//String from="d:/test/case1.jpg";
		String to="d:/test/t4";
		File f=new File(from);
		tj.devide(from, to,3);
		tj.combine(to+"/"+f.getName());
	}
}
