class Solution {

    private int minSum(int grid[][],int i,int j,int dp[][]){
        if(i==0 && j==0)
        return grid[0][0];
        if(i<0 || j<0)
        return 99999;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int left=grid[i][j]+minSum(grid,i,j-1,dp);
        int up=grid[i][j]+minSum(grid,i-1,j,dp);
        int ans=Math.min(up,left);
        dp[i][j]=ans;
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=minSum(grid,m-1,n-1,dp);
        return ans;
    }
}
