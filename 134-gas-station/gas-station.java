class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<gas.length;i++){
            sum1+=gas[i];
        }
        for(int i=0;i<gas.length;i++){
            sum2+=cost[i];
        }
        if(sum2>sum1)
        return -1;
        int currGas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            currGas+=gas[i]-cost[i];
            if(currGas<0)
            {
                currGas=0;
                start=i+1;

            }
           
        }
        return start;
    }
}