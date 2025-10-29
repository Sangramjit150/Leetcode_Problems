class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=searchFirst(nums,target);
        int last=searchLast(nums,target,first);
        if(first==-1)
        return new int[] {-1,-1};
        return new int [] {first,last};
    }
    public int searchFirst(int[] nums,int target){
        int l=0,r=nums.length-1;
        int first=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    first=mid;
                    
                }
                r=mid-1;
            
            }
            else{
                l=mid+1;
            }
        }
        return first;
    }
    public int searchLast(int[] nums,int target,int first){
        int l=0,r=nums.length-1;
        int last=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    last=mid;
                    
                }
                
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return last;
    }
}
