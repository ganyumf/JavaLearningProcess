/*
 "白 毕 卞 蔡 曹 岑 常 车 陈 成 程 池 邓 丁 范 方 樊 费 冯 符 傅 甘 高 葛 龚  古 关 郭 韩"
 把这个字符串以空格为分隔，分到字符串数组中，
再输出。然后再以”_”为分隔符，连接成一个字符中 

 */
package EX14;

public class t6 {
	public static void main(String[] args) {
		String str="白 毕 卞 蔡 曹 岑 常 车 陈 成 程 池 邓 丁 范 方 樊 费 冯 符 傅 甘 高 葛 龚 古 关 郭 韩";
		String []arr=str.split(" ");
		String sc="";
		for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				if(i!=0)
				sc=sc+"-"+arr[i];
				else
				sc=arr[0];
			}
		System.out.println(sc);
	}
	
}
