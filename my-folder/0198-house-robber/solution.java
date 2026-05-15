class Solution {
    private int solve(int nums[],int ind,int dp[]){
        if(ind>=nums.length)
        return 0;
        if(dp[ind]!=-1)
        return dp[ind];

        int notPick=solve(nums,ind+1,dp);
        int pick=0;
       
         pick=nums[ind]+solve(nums,ind+2,dp);
        
        
        return dp[ind]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int ind=nums.length;
        int dp[]=new int[ind];
        for(int i=0;i<ind;i++){
            dp[i]=-1;
        }
        int ans=solve(nums,0,dp);
        return ans;
    }
}
