package suijishu;

public class Test {

	public static void main(String[] args) {
		char i=(char) (Math.random()*26+97);
		System.out.println(i);
	
		
		char ii=(char) (Math.random()*26+65);
		
		if((int)(Math.random()*10)>=5)
		{
			System.out.println(ii);
		}
		else
		{	
			System.out.println((char)(ii+32));
		}
	}
}
