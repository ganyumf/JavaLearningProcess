package Prime;

public class TwoThreadForPrime {
	 public static void main(String[] args) {
	  Thread1  tc1= new Thread1();
	  Thread2  tc2= new Thread2();
	  Thread3  tc3= new Thread3();
	  Thread t1 = new Thread(tc1);
	  Thread t2 = new Thread(tc2);
	  Thread t3 = new Thread(tc3);
	  t1.start();
	  t2.start();
	  t3.start();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(tc1.count+tc2.count+tc3.count);
	 }
}