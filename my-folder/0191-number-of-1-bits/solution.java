class Solution {
    public int hammingWeight(int num) {
         StringBuilder binary=new StringBuilder();
        int temp=num;
        while (num>0){
            int d=num%2;
            binary.append(String.valueOf(d));
            num=num/2;
        }
        String s= binary.toString();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}
