package BaoGuo;

public class Test {
	public static void main(String[] args) {
		int i=3;
		String str=Integer.toString(i);
		System.out.println(str);
		String s="123";
	
		System.out.println(s+i);
		
		//������
		int x=Integer.parseInt(s);
		System.out.println(x+i);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
//---------------------------------------------------------
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		System.out.println("int���ֵ"+max);
		System.out.println("int��Сֵ"+min);
		System.out.println("------------------���Ƿָ���--------------");
		int m=16;
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toHexString(m));
		System.out.println(Integer.toOctalString(m));
		Integer n=new Integer("123"+321);
		int v=n;  //ֻ�ǰ�ֵ������v
		System.out.println(v);
		int s1=Integer.valueOf("9581");
		System.out.println(s1);
	}

}
