class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int count=0,pre=0;
       map.put(0,1);
       for(int i=0;i<nums.length;i++){
        pre=pre+nums[i];
        int rem=pre-k;
        count+=map.getOrDefault(rem,0);
        map.put(pre,map.getOrDefault(pre,0)+1);
       }
       return count;
    }
}
