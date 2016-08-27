package JHt126;

import java.util.Comparator;

public class CompareValue implements Comparator{
//方块3~方块2,草花3~草花2, 红心3~红心2, 黑桃3~黑桃2
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
		if(s.equals("方块")){return 1;}
		if(s.equals("草花")){return 2;}
		if(s.equals("红心")){return 3;}
		if(s.equals("黑桃")){return 4;}
		return 0;
	}
}
