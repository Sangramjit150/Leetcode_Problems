class Solution {
    public int minimumLength(String s) {
      int map[]=new int[26];
      int n=s.length();
      int rem=0;
      for(int i=0;i<n;i++){
        int ch=s.charAt(i)-'a';
        map[ch]++;
        if(map[ch]==3){
          map[ch]-=2;
          rem+=2;
        }

      }  
      return n-rem;
}}
