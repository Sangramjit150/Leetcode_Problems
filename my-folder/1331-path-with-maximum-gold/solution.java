class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        if(grid==null || grid.length==0)
        return 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    int gold=maxGold(grid,i,j,m,n,new boolean[n][m]);
                    max=Math.max(max,gold);
                }
            }
        }
        return max;
    }

    public int maxGold(int grid[][],int i,int j,int m,int n,boolean [][]visited){
        if(i<0|| j<0|| i>=n|| j>=m|| grid[i][j]==0 || visited[i][j])
        return 0;
        visited[i][j]=true;
        int up=maxGold(grid,i-1,j,m,n,visited);
        int down=maxGold(grid,i+1,j,m,n,visited);
        int left=maxGold(grid,i,j-1,m,n,visited);
        int right=maxGold(grid,i,j+1,m,n,visited);
        visited[i][j]=false;
        int max=Math.max(up,Math.max(down,Math.max(left,right)))+grid[i][j];
        return max;
    }
}
