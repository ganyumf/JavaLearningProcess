package com.wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocket {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);//��������ˣ��˿���6666
		System.out.println("�ȴ�����...");
		Socket sc=ss.accept();//���գ��ȴ��ͻ������ӣ�����һ��Socket���͡�
		                      //��sc������ʵ�Ŀͻ��ˣ������ڷ���˽�����һ���ͻ��˸���
		System.out.println("���ӳɹ�...��ʼ���");//���������ӳɹ���Ż�ִ�д˾�
		BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));//���տͻ��˴�����������
		String str=br.readLine();
		System.out.println("�ͻ���˵��"+str);
	}
}
