class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String str[]=s.split(" ");
        String lastWord=str[str.length-1];
        int ans=lastWord.length();
        return ans;
    }
}