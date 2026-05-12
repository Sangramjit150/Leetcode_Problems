import java.util.*;
class Solution {
     private boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int m=p.length();
        int n=p.length();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<=s.length()-n;i++){
            String sub=s.substring(i,i+m);
            
            boolean flag=isAnagram(sub,p);
            if(flag==true){
                ans.add(i);
            }
        }
        return ans;
    }
}
