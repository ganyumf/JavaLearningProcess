//1.2.7.已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。
//注：参赛球队列表见附录
//注2：使用Math.random 来产生随机数。（也可以使用其它方法）
//2. 2008 北京奥运会男足参赛国家：
//科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，
//新西兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
package JHt127;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Random rd=new Random();
		ArrayList <String>al=new ArrayList<String>();
		al.add("科特迪瓦");
		al.add("阿根廷");
		al.add("澳大利亚");
		al.add("塞尔维亚");
		al.add("荷兰");
		al.add("日尼利亚");
		al.add("日本");
		al.add("美国");
		al.add("中国");
		al.add("新西兰");
		al.add("巴西");
		al.add("比利时");
		al.add("韩国");
		al.add("喀麦隆");
		al.add("洪都拉斯");
		al.add("意大利");
		for (int i = 0; al.size()>0; i++) {
			int j=rd.nextInt(al.size());
			System.out.println(al.get(j));
			if((i+1)%4==0)System.out.println("-----------------------------");
			al.remove(j);
		}
	}
}
