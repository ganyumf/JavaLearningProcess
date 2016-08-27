package chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args){
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		byte[] b=str.getBytes();
		DatagramPacket dp = null;
		try {
			dp = new DatagramPacket(b,b.length,InetAddress.getByName("192.168.86.129"),6666);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ds.send(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("等待服务端说话...");
		
	
		byte[] b1=new byte[1024];
		DatagramPacket dp2=new DatagramPacket(b1,b1.length);
		try {
			ds.receive(dp2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("服务器端说："+new String(b1));
		}
	}
}
