class Solution {
    public boolean canJump(int[] nums) {
        int currInd=-1;
        int maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxInd)
            return false;
            maxInd=Math.max(maxInd,i+nums[i]);
        }
        return true;
    }
}
