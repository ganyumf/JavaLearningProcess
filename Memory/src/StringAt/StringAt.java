package StringAt;

public class StringAt {
	public int stringAt(String str,String subStr)
	{
		int s=-1;
		for(int i=0;str.length()-i>=subStr.length();i++)
		{
			if(str.charAt(i)==subStr.charAt(0))
			{
				String test=str.substring(i, i+subStr.length());
				if(subStr.equals(test))
				{
					s=i;
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		StringAt a=new StringAt();
		String str1="abcdef";
		String str2="cd";
		int i=a.stringAt(str1, str2);
		System.out.println(i);
	}
}

