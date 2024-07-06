class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>map=new HashMap<>();
      int n=nums.length;
      for(int i=0;i<n;i++){
        int a=nums[i];
        int need=target-a;
        if(map.containsKey(need)){
          return new int[]{i,map.get(need)};
        }
        map.put(nums[i],i);
      }
      return new int[]{};
    }
}
