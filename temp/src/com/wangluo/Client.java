package com.wangluo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.1.112",6666);//�����Ƿ�������iP��ַ���Ͷ˿ں�
		OutputStream os=s.getOutputStream();
		String str="���ҹ��ˣ�";
		os.write(str.getBytes());
		os.flush();
		os.close();
		//���ļ�  ��Socket ServerSocket
	}
}
