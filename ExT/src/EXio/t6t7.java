package EXio;

import java.io.*;
import java.util.*;

public class t6t7{
	
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
		System.out.println("请输入复制的文件夹或文件的路径：");
		String from=sc.next();	
		System.out.println("请输入粘贴的文件夹的路径：");
		String to=sc.next();
		t6t7 tca=new t6t7();
		tca.copyAll(from, to);
		//tca.copyAll("d:\\aa","d:\\b");
	}
}
