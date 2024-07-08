class Solution {
  public static boolean IsPalindrome(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j){
      if(s.charAt(i)!=s.charAt(j))
      return false;
      i++;
      j--;
    }
    return true;
  }
    public String firstPalindrome(String[] words) {
        for(String word:words){
          if(IsPalindrome(word)){
            return word;
          }
        }
        return "";
    }
}
