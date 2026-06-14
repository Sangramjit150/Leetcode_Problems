class Solution {
    public int maxProduct(int[] nums) {

       int pre=1,suff=1;
       int maxi=-999;
       int n=nums.length;
       for(int i=0;i<n;i++){
            if(suff==0)
            suff=1;
            if(pre==0)
            pre=1;
            pre=pre*nums[i];
            suff=suff*nums[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suff));
       }
        return maxi;
    }
}
