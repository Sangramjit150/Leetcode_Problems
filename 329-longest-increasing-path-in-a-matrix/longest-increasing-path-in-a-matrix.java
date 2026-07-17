class Solution {
    private int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};

    private int dfs(int mat[][],int dp[][],int n,int m,int i,int j){
        if(dp[i][j]!=-1)
        return dp[i][j];
        int max=0;
        for(int d[]:dir){
            int x=i+d[0];
            int y=j+d[1];
            if(x>=0 && x<n && y>=0 && y<m && mat[x][y]>mat[i][j]){
                max=Math.max(max,dfs(mat,dp,n,m,x,y));
            }
        }
       return  dp[i][j]=max+1;
    }
    public int longestIncreasingPath(int[][] mat) {
            if(mat==null || mat.length==0)
            return 0;
            int n=mat.length;
            int m=mat[0].length;
            int dp[][]=new int[n+1][m+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dp[i][j]=-1;
                }
            }
            int longestPath=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int path=dfs(mat,dp,n,m,i,j);
                    longestPath=Math.max(path,longestPath);
                }
            }
            return longestPath;
    }
}