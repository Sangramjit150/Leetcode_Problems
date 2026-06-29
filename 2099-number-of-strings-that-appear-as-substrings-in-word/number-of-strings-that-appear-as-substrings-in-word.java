class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String>subStrings=new HashSet<>();
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                String sub=word.substring(i,j+1);
                subStrings.add(sub);
            }
        }
        int cnt=0;
        for(int i=0;i<patterns.length;i++){
            if(subStrings.contains(patterns[i])){
                cnt++;
            }
        }
        return cnt;
    }
}