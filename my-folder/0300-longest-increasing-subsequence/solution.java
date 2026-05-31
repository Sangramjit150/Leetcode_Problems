class Solution {
    public int lengthOfLIS(int[] arr) {
       int dp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=1;
        }
        int maxlen=1;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}
