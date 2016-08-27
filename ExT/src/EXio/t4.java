/*
 4.File类,自学createTempFile方法的使用,在一个目录中，创建500个临时文件；
 */
package EXio;

import java.io.File;
import java.io.IOException;

public class t4 {
	public static void main(String[] args) throws IOException {
		File f1=new File("d:/test/t4");
		for(int i=0;i<500;i++)
		{
			File f2=File.createTempFile(System.nanoTime()+"", ".txt",f1);
		}
	}
}

