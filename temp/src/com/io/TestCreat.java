package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TestCreat {
	//在f盘下ababc文件夹下 创建10个 TXT文件
	//文件名可以随机生成
	//创建ababc文件夹
	//循环10个txt文件
	public static void main(String[] args) throws IOException {
		
		Random r=new Random();
		//时间戳
		Date d=new Date();
		//d.getTime();//1970 1.1毫秒数
		
		
		for (int i = 0; i <10; i++) {
		
		File f=new File("d:\\ababc\\"+r.nextInt(10)+System.nanoTime()+".jpg");
		if(!f.getParentFile().exists())
		{
		f.getParentFile().mkdirs();
		}
		f.createNewFile();
		}
//		Calendar ca=Calendar.getInstance() ;
//		ca.setTime(new Date());
//		String s=String.valueOf(ca.YEAR);
//		String s1=String.valueOf(ca.HOUR);
//		System.out.println(s1);
	}
}
