
//1.2.6 ��дһ���˿���(ÿ���˿��л�ɫ����ֵ���������A,�ݻ�10),��52���˿��Ʒŵ�������(�Լ�ȥѡ�񼯺���)
//  ��д3������
//����1.�������е������˿�����ϴ��,�����˿����(��ӡ��������)
//����2.�������е������˿�����(������3~����2,�ݻ�3~�ݻ�2, ����3~����2, ����3~����2��˳������)
//����3���Ƚ������˿��ƵĴ�С����������ֵ��ȣ��򰴣�����->����->�ݻ�->���飩��˳���������
//  �������Ϸ���

package JHt126;

public class Poker {
	String suit;
	int value;
	String v[]={null,null,"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
	public String toString()
	{
		return suit+v[value];
	}
	public Poker() {
		// TODO Auto-generated constructor stub
	}
	public Poker(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
}
