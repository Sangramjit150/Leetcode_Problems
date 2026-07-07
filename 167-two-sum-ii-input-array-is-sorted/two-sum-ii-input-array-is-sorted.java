class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int first=-1;
        int second=-1;
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        while(left<=right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                first=left;
                second=right;
                break;
            }
            else if(sum<target){
                sum=sum-numbers[left];
                left++;
            }
            else{
                sum=sum-numbers[right];
                right--;
            }
        }
        ans[0]=first+1;
        ans[1]=second+1;
        return ans;
        
    }
}