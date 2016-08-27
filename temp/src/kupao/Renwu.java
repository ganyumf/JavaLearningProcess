package kupao;

public class Renwu {
	String name="小红";
	int level=1;
	Baby bb=null;
	int totalCoin=1000;
	Baby s=new Baby();
	public void getCoin(int coinnum)
	{
		int addc=bb.addCoin(coinnum);
		System.out.println("加成后的金币:"+addc);
		totalCoin+=addc;
		System.out.println("最后的金币数:"+totalCoin);
	}
	public static void main(String[] args) {
		Renwu r=new Renwu();
		r.bb=new Baby();
		r.getCoin(500);
		System.out.println(r.s.level);
	}
}
