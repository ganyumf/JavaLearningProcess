package T1;
import java.util.*;
public class cai {
public static void main(String[] args) {

	System.out.println("�¸���");
	A a=new A();
	while(true){
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	if(b>a.V){System.out.println("����");}
	else if(b<a.V){System.out.println("С��");}
	else {System.out.println("�²�ɹ�");System.out.println("��Ϊ"+a.V);break;}
	}
}
}
