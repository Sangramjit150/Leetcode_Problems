class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
        ans[0]=first;
        ans[1]=last;
    return ans;
    }
}
