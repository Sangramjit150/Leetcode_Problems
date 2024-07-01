class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int longest=1,count=0,x=0;
        int n=nums.length;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++){
          set.add(nums[i]);
        }
        for(int it:set){
          if(!set.contains(it-1)){
            count=1;
            x=it;
            while(set.contains(x+1)){
              x++;
              count++;
            }
            longest=Math.max(longest,count);
          }
        }
        return longest;
    }
}
