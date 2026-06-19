class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int diff[]=new int[n+1];
        for(int i=0;i<diff.length;i++){
            diff[i]=0;
        }
        for(int i=0;i<n;i++){
            diff[i+1]=diff[i]+gain[i];
        }
        int maxAlt=Integer.MIN_VALUE;
        for(int i=0;i<diff.length;i++){
            maxAlt=Math.max(maxAlt,diff[i]);
        }
        return maxAlt;
    }
}
