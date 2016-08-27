package Math;

import java.math.*;
import java.text.*;

public class TestMath {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3));
		
		System.out.println(Math.PI);
		
		System.out.println(Math.E);
		
		double d=Math.floor(-2.3);//地板
		System.out.println("floor"+d);
		
		double dd=Math.ceil(-2.3);//天花板
		System.out.println("ceil"+dd);
		
		double m1=Math.round(2.45);//取整数 四舍五入
		System.out.println(m1);
		
		int dd1=(int) (Math.random()*10);// [0,1)
		System.out.println(dd1);
		
//大数据 计算
		long m=10000000000L;
		long o=10000000000L;
		System.out.println(m*o);
		
		//BigInteger 正数
		//BigDecimal 小数
		
		BigInteger bii=new BigInteger("1000000000010000000000");
		BigInteger bi =new BigInteger("1000000000010000000000");
		BigInteger result=bi.add(bii);
		System.out.println(result);
		
		BigDecimal bd =new BigDecimal("1000000000010000000000.22");
		BigDecimal bd2=new BigDecimal("1000000000010000000000.22");
		
		BigDecimal bb=bd.multiply(bd2);
		bb=bb.setScale(2,BigDecimal.ROUND_HALF_DOWN);	//还能进行计算
		System.out.println(bb);
		
//DecimalFormat df=new DecimalFormat("$##.00");
//String xx=df.format(bb);							转换成字符串，不能进行计算
//System.out.println(xx);
		
		
//		bi.add(val);			加减乘除运算
//		bi.subtract(val);
//		bi.multiply(val);
//		bi.divide(val);
		
	}
} 
