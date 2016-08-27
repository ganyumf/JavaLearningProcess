package T1;
import java.util.*;
public class cai {
public static void main(String[] args) {

	System.out.println("猜个数");
	A a=new A();
	while(true){
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	if(b>a.V){System.out.println("大了");}
	else if(b<a.V){System.out.println("小了");}
	else {System.out.println("猜测成功");System.out.println("数为"+a.V);break;}
	}
}
}
