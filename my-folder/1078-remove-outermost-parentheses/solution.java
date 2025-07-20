class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        int start=0;
        int end=0;
        StringBuilder res=new StringBuilder();
        while(end<s.length()){
            if(s.charAt(end)=='(')
            count++;
            else
            count--;
            if(count==0){
                res.append(s.substring(start+1,end));
                start=end+1;
            }
            end++;
        }
        return res.toString();
    }
}
