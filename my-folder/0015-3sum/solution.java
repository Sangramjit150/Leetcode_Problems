class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>unique=new HashSet<>();
        List<List<Integer>>li=new ArrayList<>();

        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
          l=i+1;
          r=nums.length-1;
          while(l<r){
            int sum=nums[i]+nums[l]+nums[r];
            if(sum==0){
              unique.add(Arrays.asList(nums[i],nums[l],nums[r]));
              ++l;
              --r;
            }
            else if(sum>0){
              --r;
            }
            else{
              ++l;
            }
          }
        }
        li.addAll(unique);
        return li;
}}
