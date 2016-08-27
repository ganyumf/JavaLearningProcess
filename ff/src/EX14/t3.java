/*
 把输入的小写字母改成大写字母输出
 */
package EX14;
import java.util.*;
public class t3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		String cs=c+"";
		System.out.println(cs.toUpperCase());
	}
}
