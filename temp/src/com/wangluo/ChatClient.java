package com.wangluo;

import java.net.*;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		byte[] b=str.getBytes();
		DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),8888);
		DatagramSocket ds=new DatagramSocket();
		ds.send(dp);
		System.out.println("等待服务端说话...");
		b=new byte[1024];
		DatagramPacket dp2=new DatagramPacket(b,b.length);
//		DatagramSocket ds2=new DatagramSocket(6666);
		ds.receive(dp2);
		System.out.println("服务器端说了："+new String(b));
	}
}
