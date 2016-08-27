/*
 2.使用File,获得一个文件是否存在,如果不存在,则创建.如果存在,则显示这个文件的大小,路径,最后修改时间.
 */
package EXio;

import java.io.File;
import java.io.IOException;

public class t2 {
	public static void main(String[] args) throws IOException {
		File f=new File("d:/test/123.txt");
		if(!f.exists())
		{
			if(!f.getParentFile().exists())
			{
				f.getParentFile().mkdirs();
			}
			f.createNewFile();
		}
		else
		{
			System.out.println(f.length());
			System.out.println(f.getPath());
			System.out.println(f.lastModified());
		}
		
	}
}
