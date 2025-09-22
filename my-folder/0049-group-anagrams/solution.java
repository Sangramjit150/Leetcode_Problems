class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String fin=String.valueOf(ch);
            if(!map.containsKey(fin)){
                map.put(fin,new ArrayList<>());
            }
            map.get(fin).add(str);
        }
        list.addAll(map.values());
        return list;
    }
}
