package tjString;
//Í³¼Æ×Ö·û´®
public class test {
public static void main(String[] args) {
	int c ='Z';
	System.out.println(c);
	String str1="ab1c5d7@ef123";
	char []arr=str1.toCharArray();     
	int numc=0;
	int numn=0;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]>=48&&arr[j]<=57){++numn;}
		if(arr[j]>=65&&arr[j]<=90){++numc;}
		if(arr[j]>=97&&arr[j]<=122){++numc;}
	}
	System.out.println(numc);
	System.out.println(numn);
	
	int num[]=new int [26];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='a'&&arr[i]<='z')
		{
			num[(int)(arr[i]-97)]++;
		}
	}
	for(int i=0;i<num.length;i++)
	{
		System.out.println((char)(i+97)+":"+num[i]);
	}
	 
	String a="abcd";
	String b=a.replace("a","");
	System.out.println(a.length()-b.length());
	while(str1.length()>0)
	{
		char c1=str1.charAt(0);
		String after=str1.replace(c1+"","");
		System.out.println(c1+":"+(str1.length()-after.length()));
		str1=after;
	}
}
}
