package com.wangluo;

import java.io.*;
import java.net.*;

public class Test {
	public static void main(String[] args) throws IOException {
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		System.out.println(ia);//域名/IP地址
		System.out.println(ia.getHostAddress());//对应地址的IP地址
		System.out.println(ia.getHostName());//对应地址的域名
		System.out.println(ia.getLocalHost());//本地的  本机名/IP地址
		URL url=new URL("http://www.baidu.com");//URL:统一资源定位符，得到对应地址的资源,一定要加上http://协议
		InputStream is=url.openStream();//打开一个对应地址的连接，返回一个输入流
		FileOutputStream fos=new FileOutputStream("f:/baidu.html");
		byte[] b=new byte[1024];
		int length=is.read(b);
		while(length!=-1){
			fos.write(b, 0, length);
			length=is.read(b);
		}
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(is));
//		String str=br.readLine();
//		while(str!=null){
//			System.out.println(str);
//			str=br.readLine();
//		}
//		br.close();
	}
}
