/*
   public void longest(String[] arr){
       
      }
 */
package EX14;

public class t11 {
	 public void longest(String[] arr){
	       int max=0;
	       for(int i=1;i<arr.length;i++)
	       {
	    	   if(arr[max].length()<arr[i].length())
	    	   {
	    		   max=i;
	    	   }
	       }
	       System.out.println(arr[max]);
     }
	 public static void main(String[] args) {
		String []arr={"dwdwd","dd3","d3d3ddqwqe"};
		t11 t=new t11();
		t.longest(arr);
	}
}
