/*
 创建一个多层目录 "f:/java/java1/java2"
 */
package EXio;

import java.io.File;

public class t3 {
	public static void main(String[] args) {
		File f=new File("d:/java/java1/java2");
		f.mkdirs();
	}
}
