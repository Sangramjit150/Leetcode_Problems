class Solution {
    public int findDuplicate(int[] nums) {
        int n=Integer.MAX_VALUE;
       int hash[]=new int[999999];
       for(int i=0;i<nums.length;i++){
        hash[nums[i]]++;
       }
       int ans=0;
       for(int i=0;i<999999;i++){
        if(hash[i]>1){
            ans=i;
        }
       }
       return ans;
       
    }
}
