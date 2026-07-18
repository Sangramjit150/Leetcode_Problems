class Solution {
    private int find(int a,int b){
        int min=Math.min(a,b);
        int gc=0;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
            gc=i;
        }
        return gc;
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int gcd=find(min,max);
        return gcd;
    }
}