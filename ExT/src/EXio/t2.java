/*
 2.ʹ��File,���һ���ļ��Ƿ����,���������,�򴴽�.�������,����ʾ����ļ��Ĵ�С,·��,����޸�ʱ��.
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
