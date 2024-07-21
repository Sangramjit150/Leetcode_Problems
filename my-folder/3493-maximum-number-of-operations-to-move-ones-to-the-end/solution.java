class Solution {
    public int maxOperations(String s) {
      int res=0,ones=0;
      for(int i=0;i<s.length();i++){
        ones+=s.charAt(i)-'0';
        if(i>0 && s.charAt(i)<s.charAt(i-1)){
          res+=ones;
        }
        
      } 
      return res; 
    }
}
