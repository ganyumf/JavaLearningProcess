package Prime;

public class Thread1 implements Runnable {
	int count=0;
	 @Override
	 public void run() {
	  // TODO Auto-generated method stub
	  int j;
	  for (int i = 2; i <= 1000; i++) {
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
