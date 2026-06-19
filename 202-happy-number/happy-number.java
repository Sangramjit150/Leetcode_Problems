class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
        return true;
        else if (n<10)
        return false;
        else{
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int s=d*d;
            sum+=s;
            n=n/10;
        }
        return isHappy(sum);
    }
    }
}