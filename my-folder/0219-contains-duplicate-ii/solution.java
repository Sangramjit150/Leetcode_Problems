class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>se=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(se.contains(nums[i])){
                return true;
                
            }
            se.add(nums[i]);
            if(se.size()>k)
            se.remove(nums[i-k]);
        }
        return false;
    }
}
