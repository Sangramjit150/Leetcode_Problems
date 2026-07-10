class Solution {
    public boolean isSubsequence(String s, String t) {
         if (s == null || t == null || s.length() > t.length()) {
            return s != null && s.isEmpty(); 
        }
        int i=0,j=0;
        int cnt=0;
        while(i<s.length() &&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                cnt++;
            }
            j++;
        }
        if(cnt==s.length())
        return true;
        return false;
    }
}