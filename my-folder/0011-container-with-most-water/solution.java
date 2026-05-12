class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0,area=0;
        int min=9999;
        int width=0;
        while(i<=j){
            min=Math.min(height[i],height[j]);
            width=j-i;
            area=min*width;
            maxArea=Math.max(area,maxArea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
