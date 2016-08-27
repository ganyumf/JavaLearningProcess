
//1.2.6 编写一个扑克类(每张扑克有花色和数值，例如红心A,草花10),将52张扑克牌放到集合中(自己去选择集合类)
//  编写3个方法
//方法1.将集合中的所有扑克重新洗牌,并将扑克输出(打印出来即可)
//方法2.将集合中的所有扑克排序(按方块3~方块2,草花3~草花2, 红心3~红心2, 黑桃3~黑桃2的顺序排序)
//方法3：比较两张扑克牌的大小，如果版面的值相等，则按（黑桃->红心->草花->方块）的顺序进行排列
//  测试以上方法

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
