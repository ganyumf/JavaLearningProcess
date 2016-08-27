package EXio;

import java.io.*;

public class t10 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("d:/test/output.txt");
		String str="hello world";
		byte []b=str.getBytes();
		fos.write(b);
		fos.close();
		
		FileInputStream fis=new FileInputStream("d:/test/output.txt");
		byte []bb=new byte[2];
		int length=fis.read(bb);
		while(length!=-1)
		{
			String str1=new String(bb);
			System.out.print(str1);
			length=fis.read(bb);
		}
	}
}
