package EX14;

public class t13 {
	boolean huiwen(String str)
	{
		int flag=1;
		char[] c=str.toCharArray();
		for(int i=0;i<c.length/2;i++)
		{
			if(c[i]!=c[c.length-i-1])
			flag=0;
		}
		if(flag==1)return true;
		else return false;
	}
	public static void main(String[] args) {
		t13 t=new t13();
		boolean s=t.huiwen("12322");
		System.out.println(s);
	}
}
