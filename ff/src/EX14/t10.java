/*
 10.�ַ�������nλ,����   "hello world" ������λ ��ldhello wor
	Ҫ��дһ������ʵ�ִ˹���,�����ĸ�ʽ��
		String moveToRight(String str,position p)
		str:��Ҫ�ƶ����ַ���
		p:���Ƶ�λ��
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
