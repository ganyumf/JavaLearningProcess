/*
 4.File��,��ѧcreateTempFile������ʹ��,��һ��Ŀ¼�У�����500����ʱ�ļ���
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

