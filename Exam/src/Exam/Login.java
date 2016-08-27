package Exam;
import java.util.*;

public class Login {
	static int nArr=3;
	int user=0;
	int z=1;
    Account a[]=new Account[nArr];
    public void log(){
		a[0]=new Account("cjy","123");
		a[1]=new Account("lcz","123");
		a[2]=new Account("acx","321");
		while(z!=0)
		{
			user=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名和密码：");
		String nusername =sc.next();
		String npassword =sc.next();

		  for(int i=0;i<a.length;i++)
		  {
			
			  if(nusername.equals(a[i].username))
			  {
				 
				  if(npassword.equals(a[i].password))
				  {
					  System.out.println("欢迎！"+a[i].username+"本次考试共有5题"); 
					  z=0;
					  user=i;
					  break; 
				  }
				  else 
				  {
					  System.out.println("密码错误！"); 
					  z=2;
					  break;
				  } 
			  }		  
	      }
		  if(z==1)
		  {
			  System.out.println("无此用户！");
		  }
		  
	    }	
	}
 }

		
