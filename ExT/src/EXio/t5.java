package EXio;

import java.io.File;
import java.util.Scanner;

public class t5 {
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
		t5 t=new t5();
		System.out.println("请输入要删除的文件夹或文件的路径：");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		t.delete(str);
		
	}

}
