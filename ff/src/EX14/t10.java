/*
 10.字符串右移n位,例如   "hello world" 右移两位 后ldhello wor
	要求写一个方法实现此功能,方法的格式是
		String moveToRight(String str,position p)
		str:需要移动的字符串
		p:右移的位数
 */
package EX14;

public class t10 {
	String moveToRight(String str,int p)
	{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		String str1=str.substring(0, str.length()-p);
		String str2=str.substring(str.length()-p,str.length());
		return str2+str1;
	}
	public static void main(String[] args) {
		t10 t=new t10();
		String s=t.moveToRight("abcde fg",3);
		System.out.println(s);
	}
}
