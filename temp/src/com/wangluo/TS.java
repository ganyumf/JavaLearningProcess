package com.wangluo;

import java.io.IOException;
import java.net.*;

public class TS {
	public static void main(String[] args) throws IOException {
		byte[] b=new byte[100];
		//udp�д���Э��  ���ݳ��� ���Ĵ���
		DatagramPacket dp=new DatagramPacket(b,b.length);
		DatagramSocket ds=new DatagramSocket(8888);
		System.out.println("�������񣬵ȴ�����...");
		ds.receive(dp);
		String x=new String(b);
		System.out.println("s:"+x);
		dp=new DatagramPacket(x.getBytes(),x.length(),dp.getAddress(),dp.getPort());
		ds=new DatagramSocket();
		ds.send(dp);
		
	}
}
