package com.wangluo;

import java.io.*;
import java.net.*;

public class TC {
	public static void main(String[] args) throws IOException {
		byte []b="��÷�����".getBytes();
		InetAddress add=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b,b.length,add,8888);
		DatagramSocket ds=new DatagramSocket();
		ds.send(dp);
		b=new byte[100];
		dp=new DatagramPacket(b,b.length);
		ds.receive(dp);
		System.out.println("client���յ��ģ�"+new String(b));
		
	}
}
