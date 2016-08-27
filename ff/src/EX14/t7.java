package EX14;

public class t7 {
	public static void main(String[] args) {
		String str1="12321aaabbbcc";
		while(str1.length()>0)
		{
			char c1=str1.charAt(0);
			String after=str1.replace(c1+"","");
			System.out.println(c1+":"+(str1.length()-after.length()));
			str1=after;
		}
	}
}
