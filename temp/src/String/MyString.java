package String;

public class MyString {
	public static void main(String[] args) {
	//	String str="abc";
		
	//	String str1="abc";
		
	//	System.out.println(str==str1);//��ַ
	//	System.out.println(str.equals(str1));//ֵ����
		//==�жϵ�ַ (������������)  ֵ(������������)
		//�ַ�����equals �ж�  �ַ�����ֵ
		//����    ������
	//	String str="abc";
		
	//	String str1=new String("abc");
		
	//	System.out.println(str==str1);//��ַ
	//	System.out.println(str.equals(str1));//ֵ����
		
		String s1="abbc";
	//	String s2="abcd";
		String s3=s1;
		s3=s3+"qqq";
		System.out.println(s3);
		System.out.println(s1);
	
	char c=s1.charAt(0);
	System.out.println(c);
	
	System.out.println(s1.codePointAt(0));
	System.out.println(s1.indexOf("b",2)); //2ΪѰ������λ�õĳ�ʼλ��
	
	String str="b1b2bbbcaa";
	int x=str.indexOf(49);
	System.out.println(x);
	
	String str11="bcbcabcaa";
		      //  012345678
	int y=str11.lastIndexOf("bc",3); //�Ӻ���ǰ�ҵ�һ�γ��ֵ�λ��
	System.out.println(y);
	
	String s=str11.substring(0,3);//�ַ��� ��ȡ     0Ϊ��ȡ�ĳ�ʼλ��,3Ϊ��ֹλ��ǰ���󲻰�
	System.out.println(s);
	s=str.substring(str.indexOf("c"),str.lastIndexOf("b")+1);
	String []ss="aa-bb-cc".split("-");
	for(int i=0;i<ss.length;i++)
	{
		System.out.println(ss[i]);
	}
	//	A	"name:�����裬age:25,sex:nan"
	//------------------------------------------------
	String str1="name:������,age:25,sex:��";
	String[] arr=str1.split(",");
	for(int i=0;i<arr.length;i++)
	{
		String substr=arr[i];
		String []subarr=substr.split(":");
		System.out.println(subarr[1]);		
	}
	//------------------------------------------------
	String srt=" a b c d e ";
	System.out.println(srt.trim());//ȥ���������˵Ŀո�
	String xx="yushuang";
	System.out.println(xx.toUpperCase());//ת���ɴ�д
	System.out.println(xx);
	System.out.println(xx.toLowerCase());//ת����Сд
	
	String qwe="abc";
	System.out.println(qwe.length());
	String str111="abcd";
	String str222="bc";
	System.out.println(str111.contains(str222));
	}
}
