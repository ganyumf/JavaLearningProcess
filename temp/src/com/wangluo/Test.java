package com.wangluo;

import java.io.*;
import java.net.*;

public class Test {
	public static void main(String[] args) throws IOException {
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		System.out.println(ia);//����/IP��ַ
		System.out.println(ia.getHostAddress());//��Ӧ��ַ��IP��ַ
		System.out.println(ia.getHostName());//��Ӧ��ַ������
		System.out.println(ia.getLocalHost());//���ص�  ������/IP��ַ
		URL url=new URL("http://www.baidu.com");//URL:ͳһ��Դ��λ�����õ���Ӧ��ַ����Դ,һ��Ҫ����http://Э��
		InputStream is=url.openStream();//��һ����Ӧ��ַ�����ӣ�����һ��������
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
