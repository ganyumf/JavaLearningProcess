/*
01.类的成员变量：
猜数字游戏：一个类A有一个成员变量v，有一个初值100。
定义一个类，对A类的成员变量v进行猜。
如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
 */
package T1;
import java.util.*;
public class A {
	Random rd=new Random();
	int V=rd.nextInt(100);

}
