package chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);//用来接收长度为 length 的数据包。
		DatagramSocket ds=new DatagramSocket(8888);
		System.out.println("等待连接...");
		
		
		while(true){
	
		ds.receive(dp);//接收
	//	System.out.println("接收数据完成");
		System.out.println("客户端说："+new String(b));
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
		DatagramPacket dp2=new DatagramPacket(str.getBytes(),str.getBytes().length,dp.getAddress(),dp.getPort());
		DatagramSocket ds2=new DatagramSocket();
		ds2.send(dp2);
	}
		
	}
}
