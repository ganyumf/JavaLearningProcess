package com.wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocket {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);//建立服务端，端口是6666
		System.out.println("等待连接...");
		Socket sc=ss.accept();//接收，等待客户端连接，返回一个Socket类型。
		                      //此sc并非真实的客户端，而是在服务端建立的一个客户端副本
		System.out.println("连接成功...开始唠嗑");//在上面连接成功后才会执行此句
		BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));//接收客户端传过来的数据
		String str=br.readLine();
		System.out.println("客户端说："+str);
	}
}
