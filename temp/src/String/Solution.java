package String;

public class Solution {
	public String reverseString(String s) {
    	  StringBuilder ans = new StringBuilder();   
          for(int i = s.length()-1;i>=0;i--)  
              ans.append(s.charAt(i)); 
              return ans.toString();  
    }
    public static void main(String[] args) {
    	Solution so=new Solution();
    	System.out.println(so.reverseString("hello"));
    	System.out.println(5&4);
    	System.out.println(8|010);
	}
}