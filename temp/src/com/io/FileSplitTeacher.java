package com.io;

import java.io.*;

public class FileSplitTeacher {
	public void chaifen() throws IOException
	{
		File f=new File("d:/test/case.jpg");
		long length=f.length();
		long fenlength=length/2;
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("d:/test/t4/case1.jpg");
		FileOutputStream fos1=new FileOutputStream("d:/test/t4/case2.jpg");
		byte[]b=new byte[1024];//4096
		int flength=fis.read(b);//读了多长
		long total=flength;
		while(flength!=-1)
		{
			if(total<=fenlength)
			{
				fos.write(b,0,flength);
			}
			else
			{
				fos1.write(b,0,flength);
			}
			flength=fis.read(b);
			total=total+flength;
		}
		fos.flush();
		fos1.flush();
		fos.close();
		fos1.close();
		fis.close();
	}
	
	
	public void join() throws Exception
	{

		FileInputStream fis=new FileInputStream("d:/test/t4/case1.jpg");
		FileInputStream fis1=new FileInputStream("d:/test/t4/case2.jpg");
		FileOutputStream fos=new FileOutputStream("d:/test/t4/合并.jpg");
		byte[]b=new byte[1024];
		int length=fis.read(b);
		while(length!=-1)
		{
			fos.write(b,0, length);
			length=fis.read(b);
		}
		length=fis1.read(b);
		while(length!=-1)
		{
			fos.write(b,0, length);
			length=fis1.read(b);
		}
		fos.flush();
		fos.close();
		fis1.close();
		fis.close();	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		FileSplitTeacher t=new FileSplitTeacher();
		t.chaifen();
		t.join();
	}
}
