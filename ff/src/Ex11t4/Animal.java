/*
�����ʵ�ֶ�������ļ̳й�ϵ��
���Animal��������Ϊ���ԣ�eat����˯����sleep��
������������ӣ�Rabbit�����ϻ���Tiger��
��Щ����Ե���Ϊ������ͬ�����ӳԲݣ��ϻ����⣩����˯������Ϊ��һ�µġ�
 */
package Ex11t4;

public class Animal {
	String name="����";
	String food="����";
	Animal()
	{System.out.println("���춯��");}
	public void eat()
	{
		System.out.println(name+"��"+food);
	}
	public void sleep()
	{
		System.out.println(name+"˯��");
	}
}
