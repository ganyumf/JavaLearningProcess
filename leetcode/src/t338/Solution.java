package t338;


public class Solution {
    public int[] countBits(int num) {
        int[] cb=new int[num+1];  
        for (int i = 0; i <= num; i++) {  
            int count = 0;  
            for (int c = i; c >0;) {  
                if ((c & 1) == 1) {  
                    count++;  
                }  
                c=c>>1;
                
            } 
            cb[i]=count;
        }  
        return cb;  
    }
}