class Solution {
    private int  reverse(int num){
        int rev=0;
       while(num>0){
        int d=num%10;
        rev=rev*10+d;
        num=num/10;
       }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int first=reverse(num);
        int second=reverse(first);
        if(second==num)
        return true;

        return false;
    }
}
