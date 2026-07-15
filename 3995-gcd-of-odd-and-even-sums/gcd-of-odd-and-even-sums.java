class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        int i=1;
        int cnt=0;
        while(cnt<n){
            sumOdd=sumOdd+i;
            i=i+2;
            cnt++;
        }
        cnt=0;
        i=2;
        while(cnt<n){
            sumEven=sumEven+i;
            i=i+2;
            cnt++;
        }
        int min=Math.min(sumEven,sumOdd);
        int gcd=0;
        for(int j=1;j<=min;j++){
            if(sumOdd%j==0 && sumEven%j==0){
                gcd=j;
            }
        }
        return gcd;
    }
}