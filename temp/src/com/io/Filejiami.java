package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filejiami {
	public void jiami(String source,String after) throws Exception
	{
		FileInputStream fis=new FileInputStream(source);
		FileOutputStream fos=new FileOutputStream(after);
		byte[]b=new byte[1024];
		int length=fis.read(b);
		while(length!=-1)
		{
			for (int i = 0; i < b.length; i++) {
				b[i]=(byte)(b[i]^5);
			}
			fos.write(b, 0, length);
			length=fis.read(b);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
	public static void main(String[] args) throws Exception {
		Filejiami fj=new Filejiami();
		fj.jiami("d:/test/case.jpg", "d:/test/t4/case1.jpg");
		fj.jiami("d:/test/t4/case1.jpg", "d:/test/t4/case.jpg");
	}
}
