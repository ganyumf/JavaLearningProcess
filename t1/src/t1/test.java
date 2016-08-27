package t1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("java.lang.Math");
		Constructor con=c.getDeclaredConstructor();
		System.out.println(con);
		
		Field [] fs=c.getDeclaredFields();
		for(Field f:fs)
		{
			System.out.println(f.getName());
		}
		
		Method [] ms=c.getDeclaredMethods();
		for(Method m:ms)
		{
			System.out.println(m.getName());
		}
		
		Class ct=Class.forName("t1.T");
		T t=(T) ct.getConstructor(int.class, String.class).newInstance(1,"acx");
		Method m=ct.getMethod("print");
		m.invoke(t);
	}
}
