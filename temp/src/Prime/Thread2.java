package Prime;

public class Thread2 implements Runnable {
	int count=0;
	 @Override
	 public void run() {
	  // TODO Auto-generated method stub
	  int j;
	  for (int i = 1001; i <= 2000; i++) {
	   j = 2;
	   for (; j <= Math.sqrt(i); j++) {
	    if (i % j == 0) {
	     break;
	    }
	   }
	   if (j > Math.sqrt(i))
	   {
	    System.err.println(i);
	    count++;
	   }
	  }
	 }
}

