package com.wangluo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.1.112",6666);//参数是服务器的iP地址，和端口号
		OutputStream os=s.getOutputStream();
		String str="叫我官人！";
		os.write(str.getBytes());
		os.flush();
		os.close();
		//传文件  用Socket ServerSocket
	}
}
