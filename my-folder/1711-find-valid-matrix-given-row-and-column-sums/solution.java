class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int num=rowSum.length;
        int num1=colSum.length;
        int i=0;
        int j=0;
        int res[][]=new int[num][num1];
        while(i<num && j<num1){
          int val=Math.min(rowSum[i],colSum[j]);
          res[i][j]=val;
          rowSum[i]-=val;
          colSum[j]-=val;
          if(rowSum[i]==0)
          i++;
          if(colSum[j]==0)
          j++;
        }
        return res;
    }
}
