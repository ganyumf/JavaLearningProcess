/*
Ϊ�������ķۡ�дһ���ࣺclass WuMingFen Ҫ��
1.���������ԣ�����:String theMa �۵ķ���(��)��int quantity
�Ƿ������boolean likeSoup
2.дһ�����췽�����Ա��ڼ򻯳�ʼ�����̣��磺
WuMingFen f1 = new WuMingFen("ţ��",3,true);
3.���ع��췽����ʹ�ó�ʼ�����̿��Զ�������
WuMingFen f2 = new WuMingFen("ţ��",2);
4.���ʹ��������乹������ķ۶������������롢2���������ģ�
WuMingFen f3 = new WuMingFen();
5.дһ����ͨ������check()�����ڲ鿴���Ƿ����Ҫ�󡣼�����������������Դ�ӡ�ڿ���̨�ϡ�
 */
package T7;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	public WuMingFen(String theMa,int quantity,boolean likeSoup)
	{
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	public WuMingFen(String theMa,int quantity)
	{
		this.theMa=theMa;
		this.quantity=quantity;
	}
	public WuMingFen()
	{
		theMa="ţ��";
		quantity=2;
		likeSoup=true;
	}
	public void check(){
		System.out.println("��ۺϸ�");  
		System.out.println(theMa);
	}
	
}
