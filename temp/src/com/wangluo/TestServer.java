package com.wangluo;

import java.io.*;
import java.net.*;

public class TestServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);
		System.out.println("开启服务器中，等待连接...");
		Socket s=ss.accept();
		System.out.println("连接成功"+s.getLocalAddress().getLocalHost());
		InputStream is=s.getInputStream();
		FileOutputStream fos=new FileOutputStream("f:/server/receive.txt");
		byte []b=new byte[1024];
		int length=is.read(b);
		while(length!=-1){
			fos.write(b,0,length);
			length=is.read(b);
		}
		fos.flush();
		fos.close();
		is.close();
	}
}
