class Solution {
    private int editDistance(String word1,String word2,int i,int j,int dp[][]){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j))
        dp[i][j]=editDistance(word1,word2,i-1,j-1,dp);
        else{
            dp[i][j]=1+Math.min(editDistance(word1,word2,i-1,j,dp),
            Math.min(editDistance(word1,word2,i-1,j-1,dp),editDistance(word1,word2,i,j-1,dp)));
        }
    return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        int i=n-1,j=m-1;
        int ans=editDistance(word1,word2,i,j,dp);
        return ans;

    }
}
