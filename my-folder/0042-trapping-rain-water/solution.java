class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int tot=0;
        int suff[]=new int[n];
        suff[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
           suff[i]= Math.max(suff[i+1],height[i]);
        }
        int pre[]=new int[n];
        pre[0]=height[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(height[i],pre[i-1]);

        }
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            left=pre[i];
            right=suff[i];
            if(height[i]<left && height[i]<right){
                tot+=Math.min(left,right)-height[i];
            }
        }
        return tot;

    }

    
}
