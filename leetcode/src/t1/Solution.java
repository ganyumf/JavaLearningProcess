package t1;




public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        
        for(int i=0,b=0;i<nums.length&&b==0;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==target-nums[j])
                {
                   a[0]=i;
                   a[1]=j;
                   b=1;
                    break;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
    	Solution s=new Solution();
    	int b[]={3,2,4};
    	
    	int a[]=s.twoSum(b,6);
		for(int x:a)
		{
			System.out.println(x);
		}
	}
}