package JHt126;

import java.util.Comparator;

public class CompareValue implements Comparator{
//����3~����2,�ݻ�3~�ݻ�2, ����3~����2, ����3~����2
	@Override
	public int compare(Object o1, Object o2) {
		Poker a= (Poker)o1;
		Poker b= (Poker)o2;
		int huase1=swift(a.suit);
		int huase2=swift(b.suit);
		if(huase1==huase2)
		{
			return a.value-b.value;
		}
		else
		{
			return huase1-huase2;
		}
	}
	
	public int swift(String s)
	{
		if(s.equals("����")){return 1;}
		if(s.equals("�ݻ�")){return 2;}
		if(s.equals("����")){return 3;}
		if(s.equals("����")){return 4;}
		return 0;
	}
}
