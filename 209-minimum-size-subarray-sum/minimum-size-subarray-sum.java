class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum=0;
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        while(right<nums.length){
            currSum+=nums[right];
            while(currSum>=target){
                if(right-left+1<min){
                    min=right-left+1;
                }
                currSum-=nums[left];
                left++;
            }
            right++;
        }
        return min != Integer.MAX_VALUE ? min : 0; 
    }
}