package Math;

import java.math.*;
import java.text.*;

public class TestMath {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3));
		
		System.out.println(Math.PI);
		
		System.out.println(Math.E);
		
		double d=Math.floor(-2.3);//�ذ�
		System.out.println("floor"+d);
		
		double dd=Math.ceil(-2.3);//�컨��
		System.out.println("ceil"+dd);
		
		double m1=Math.round(2.45);//ȡ���� ��������
		System.out.println(m1);
		
		int dd1=(int) (Math.random()*10);// [0,1)
		System.out.println(dd1);
		
//������ ����
		long m=10000000000L;
		long o=10000000000L;
		System.out.println(m*o);
		
		//BigInteger ����
		//BigDecimal С��
		
		BigInteger bii=new BigInteger("1000000000010000000000");
		BigInteger bi =new BigInteger("1000000000010000000000");
		BigInteger result=bi.add(bii);
		System.out.println(result);
		
		BigDecimal bd =new BigDecimal("1000000000010000000000.22");
		BigDecimal bd2=new BigDecimal("1000000000010000000000.22");
		
		BigDecimal bb=bd.multiply(bd2);
		bb=bb.setScale(2,BigDecimal.ROUND_HALF_DOWN);	//���ܽ��м���
		System.out.println(bb);
		
//DecimalFormat df=new DecimalFormat("$##.00");
//String xx=df.format(bb);							ת�����ַ��������ܽ��м���
//System.out.println(xx);
		
		
//		bi.add(val);			�Ӽ��˳�����
//		bi.subtract(val);
//		bi.multiply(val);
//		bi.divide(val);
		
	}
} 
