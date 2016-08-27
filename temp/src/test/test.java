package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.Hero;

public class test {
	public static void main(String[] args) throws Exception {
//		FileOutputStream fos=new FileOutputStream("d:/test/cat.sav");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		Cat c=new Cat("¼Ó·Æ", 5);
//		c.sb=35;
//		oos.writeObject(c);
//		oos.close();
//		fos.close();
//		
		
		FileInputStream fis=new FileInputStream("d:/test/cat.sav");
		ObjectInputStream ois=new ObjectInputStream(fis);
			Cat ca=(Cat)ois.readObject();
			
			System.out.println(ca.getName());
			System.out.println(ca.getAge());
			System.out.println(ca.sb);
			ois.close();
			fis.close();
	}
}
