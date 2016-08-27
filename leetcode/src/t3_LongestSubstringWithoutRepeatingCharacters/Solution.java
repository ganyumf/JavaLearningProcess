package t3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
	     if(s.equals("")){return 0;}
		 int maxLength=1;
		 int low=0;
		 int high=1;
		 HashSet<Character> set = new HashSet<Character>();
		 while(low<s.length()){
			 //abbcdaaee
			 //abcabcbb
			 set.add(s.charAt(low));
			 while(high<s.length()&&s.charAt(low)!=s.charAt(high)&&!set.contains(s.charAt(high))){
				 set.add(s.charAt(high));
				 high++;
			 }
			 if(high==s.length()){
				 break;
			 }
			 if(high-low>maxLength){
				maxLength=high-low;
			 }
			 set.remove(s.charAt(low));
			 low++;//一次找准位置
			 high++;
			 while(low<s.length()&&set.contains(s.charAt(low))){
				 set.remove(s.charAt(low));
				 low++;
			 }


		 }
		
		 return maxLength;
    }
}
//5355289
//2239372