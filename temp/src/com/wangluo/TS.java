package com.wangluo;

import java.io.IOException;
import java.net.*;

public class TS {
	public static void main(String[] args) throws IOException {
		byte[] b=new byte[100];
		//udp有传输协议  数据长度 包的次序
		DatagramPacket dp=new DatagramPacket(b,b.length);
		DatagramSocket ds=new DatagramSocket(8888);
		System.out.println("开启服务，等待连接...");
		ds.receive(dp);
		String x=new String(b);
		System.out.println("s:"+x);
		dp=new DatagramPacket(x.getBytes(),x.length(),dp.getAddress(),dp.getPort());
		ds=new DatagramSocket();
		ds.send(dp);
		
	}
}
