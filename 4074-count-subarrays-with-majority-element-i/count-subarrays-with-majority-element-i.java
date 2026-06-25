class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int cnt=0;
        int cntSub=0;
        for(int i=0;i<nums.length;i++){
            cnt=0;

            int len=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    cnt++;
                }
                len=j-i+1;
                if(cnt>len/2)
                cntSub++;
            }
        }
        return cntSub;
    }
}