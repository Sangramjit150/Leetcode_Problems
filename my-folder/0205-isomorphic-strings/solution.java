class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sindex[]=new int[256];
        int tindex[]=new int[256];
        if(s.length()!=t.length()){
        return false;}
        for(int i=0;i<s.length();i++){
            if(sindex[s.charAt(i)]!=tindex[t.charAt(i)]){
                return false;
            }
            sindex[s.charAt(i)]=i+1;
            tindex[t.charAt(i)]=i+1;
        }
        return true;
    }
}
