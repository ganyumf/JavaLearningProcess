package kupao;

public class Renwu {
	String name="С��";
	int level=1;
	Baby bb=null;
	int totalCoin=1000;
	Baby s=new Baby();
	public void getCoin(int coinnum)
	{
		int addc=bb.addCoin(coinnum);
		System.out.println("�ӳɺ�Ľ��:"+addc);
		totalCoin+=addc;
		System.out.println("���Ľ����:"+totalCoin);
	}
	public static void main(String[] args) {
		Renwu r=new Renwu();
		r.bb=new Baby();
		r.getCoin(500);
		System.out.println(r.s.level);
	}
}
