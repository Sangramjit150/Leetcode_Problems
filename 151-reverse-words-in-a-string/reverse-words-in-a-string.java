class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       String str[]=s.split(" ");
        String ans="";
        for(int i=str.length-1;i>=1;i--){
            if(str[i].isEmpty()){
                continue;
            }
            ans+=str[i]+" ";
        }
        ans+=str[0];
        return ans;
    }
}