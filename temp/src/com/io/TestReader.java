package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class TestReader {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:/aa.txt");
		FileWriter fw=new FileWriter("d:/bb.txt");
		char []b=new char[50];//Ò»´Î¶Á10¸ö×Ö·û;
		int length=fr.read(b);
		System.out.println(length);
		while(length!=-1)
		{

			for (int i = 0; i < length; i++) {
			System.out.print(b[i]);
			fw.write(b[i]);
			}
			length=fr.read(b);
		}
		fw.flush();
		fw.close();
		fr.close();
	}
}
