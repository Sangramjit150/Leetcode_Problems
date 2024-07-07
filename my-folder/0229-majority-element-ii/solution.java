class Solution {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer>list=new ArrayList<>();
       HashMap<Integer,Integer>map=new HashMap<>();
       int n=nums.length;
       int min=(int)(n/3)+1;
       for(int i=0;i<nums.length;i++){
        int val=map.getOrDefault(nums[i],0);
        map.put(nums[i],val+1);
        if(map.get(nums[i])==min){
          list.add(nums[i]);
        }
        
       }
       return list;
    }
}
