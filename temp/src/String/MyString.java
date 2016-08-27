package String;

public class MyString {
	public static void main(String[] args) {
	//	String str="abc";
		
	//	String str1="abc";
		
	//	System.out.println(str==str1);//地址
	//	System.out.println(str.equals(str1));//值内容
		//==判断地址 (引用数据类型)  值(基本数据类型)
		//字符串的equals 判断  字符串的值
		//常量    常量区
	//	String str="abc";
		
	//	String str1=new String("abc");
		
	//	System.out.println(str==str1);//地址
	//	System.out.println(str.equals(str1));//值内容
		
		String s1="abbc";
	//	String s2="abcd";
		String s3=s1;
		s3=s3+"qqq";
		System.out.println(s3);
		System.out.println(s1);
	
	char c=s1.charAt(0);
	System.out.println(c);
	
	System.out.println(s1.codePointAt(0));
	System.out.println(s1.indexOf("b",2)); //2为寻找索引位置的初始位置
	
	String str="b1b2bbbcaa";
	int x=str.indexOf(49);
	System.out.println(x);
	
	String str11="bcbcabcaa";
		      //  012345678
	int y=str11.lastIndexOf("bc",3); //从后往前找第一次出现的位置
	System.out.println(y);
	
	String s=str11.substring(0,3);//字符串 截取     0为截取的初始位置,3为终止位置前包后不包
	System.out.println(s);
	s=str.substring(str.indexOf("c"),str.lastIndexOf("b")+1);
	String []ss="aa-bb-cc".split("-");
	for(int i=0;i<ss.length;i++)
	{
		System.out.println(ss[i]);
	}
	//	A	"name:张三疯，age:25,sex:nan"
	//------------------------------------------------
	String str1="name:张三疯,age:25,sex:男";
	String[] arr=str1.split(",");
	for(int i=0;i<arr.length;i++)
	{
		String substr=arr[i];
		String []subarr=substr.split(":");
		System.out.println(subarr[1]);		
	}
	//------------------------------------------------
	String srt=" a b c d e ";
	System.out.println(srt.trim());//去除左右两端的空格
	String xx="yushuang";
	System.out.println(xx.toUpperCase());//转换成大写
	System.out.println(xx);
	System.out.println(xx.toLowerCase());//转换成小写
	
	String qwe="abc";
	System.out.println(qwe.length());
	String str111="abcd";
	String str222="bc";
	System.out.println(str111.contains(str222));
	}
}
