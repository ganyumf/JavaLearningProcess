package EXio;

import java.io.File;

public class t8 {
	
	public void getInfo(String url)
	{
		File f=new File(url);
		File fm=new File(url);
			if(f.isFile())
			{
				while(!f.getParent().equals(fm.getName()))
				System.out.println("文件名："+f.getName());
			}
			else if(f.isDirectory())
			{
				System.out.println("--文件夹名："+f.getName());
				
				File fs[]=f.listFiles();
				for(File x:fs)
				{
					System.out.print("	");
					getInfo(x.getPath());
					
				}
			}
		
	}
	public static void main(String[] args) {
		t8 t=new t8();
		t.getInfo("d:/aa");
	}
}
