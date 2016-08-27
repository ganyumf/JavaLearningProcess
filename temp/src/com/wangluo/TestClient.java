package com.wangluo;

import java.io.*;
import java.net.*;

public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.1.108",6666);
		OutputStream os=s.getOutputStream();
		FileInputStream fis=new FileInputStream("f:/abc.txt");
		byte []b=new byte[1024];
		int length=fis.read(b);
		while(length!=-1){
			os.write(b,0,length);
			length=fis.read(b);
		}
		os.flush();
		os.close();
		fis.close();
		
		
	}
}
