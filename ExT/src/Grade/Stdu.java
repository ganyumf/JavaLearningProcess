/*
  ���һ��ѧ����Stud,���˰���no(ѧ��)��name(����)����deg(�ɼ�)���ݳ�Ա�⡣
  ��������̬����sum��num���ֱ����ֺܷ�����������һ�����캯����һ����ͨ��Ա����disp()��һ����̬��Ա����avg()�������ڼ���ƽ���֡�
 */
package Grade;
public class Stdu {
	int no;
	String name;
	int deg;
	static int sum=0;
	static int num=0;
	public Stdu(){}
	public Stdu(int no,String name,int deg)
	{
		this.no=no;
		this.name=name;
		this.deg=deg;
		sum+=deg;
		num++;
	}
	public void disp()
	{
		System.out.println(no);
		System.out.println(name);
		System.out.println(deg);
	}
	static double avg()
	{
		double s=(double)sum/num;
		return s;
	}
	
}
