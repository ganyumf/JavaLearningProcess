package chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);//�������ճ���Ϊ length �����ݰ���
		DatagramSocket ds=new DatagramSocket(8888);
		System.out.println("�ȴ�����...");
		
		
		while(true){
	
		ds.receive(dp);//����
	//	System.out.println("�����������");
		System.out.println("�ͻ���˵��"+new String(b));
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
		DatagramPacket dp2=new DatagramPacket(str.getBytes(),str.getBytes().length,dp.getAddress(),dp.getPort());
		DatagramSocket ds2=new DatagramSocket();
		ds2.send(dp2);
	}
		
	}
}
