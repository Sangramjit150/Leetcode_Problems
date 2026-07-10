class Solution {
    
    public int hammingDistance(int x, int y) {
        int count=0;
        if(x==y)
        return count;
        while(x>0 || y>0){
            int xbit=0;
            int ybit=0;

            if(x>0){
                xbit=x%2;
                x=Math.floorDiv(x,2);
            }

            if(y>0){
                ybit=y%2;
                y=Math.floorDiv(y,2);
            }

            if(xbit!=ybit){
                count++;
            }
        }
        return count;
    }
}