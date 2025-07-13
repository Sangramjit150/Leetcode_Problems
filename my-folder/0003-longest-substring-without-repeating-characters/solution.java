class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        Map<Character,Integer>map=new HashMap<>();
        int max=0;
        for(int j=0;j<s.length();j++){
            //if the map doesnot contain the character at j
            if(!map.containsKey(s.charAt(j))|| map.get(s.charAt(j))<i){
                map.put(s.charAt(j),j);
                max=Math.max(max,j-i+1);
            }
            else{
                i=map.get(s.charAt(j))+1;
                map.put(s.charAt(j),j);
            }
        }
        return max;
    }
}
