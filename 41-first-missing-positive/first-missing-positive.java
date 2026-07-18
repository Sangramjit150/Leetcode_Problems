class Solution {
    public int firstMissingPositive(int[] arr) {
        if(arr.length<0)
            return -1;
        int ans=0;
        boolean visit[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]<=arr.length){
                visit[arr[i]-1]=true;
            }
        }

        for(int i=1;i<=arr.length;i++){
            if(visit[i-1]==false)
                return i;
        }
        return arr.length+1;
    }
}