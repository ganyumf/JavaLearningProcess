package Ex13t3;

public class MP3 implements USB{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Á¬½ÓUSB"+USB.s);
		
	}
	public static void main(String[] args) {
		MP3 mp3=new MP3();
		mp3.connect();
		{System.out.println(USB.s);}
	}

}
