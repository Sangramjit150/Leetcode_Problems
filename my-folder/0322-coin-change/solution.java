import java.util.Arrays;

class Solution {
    private int coinRec(int coins[], int target, int ind, int[][] dp) {
        if (target == 0) return 0;
        
        if (ind == 0) {
            if (target % coins[0] == 0) {
                return target / coins[0];
            } else {
                return (int) 1e9;
            }
        }
        
        // Return already calculated result
        if (dp[ind][target] != -1) {
            return dp[ind][target];
        }
        
        int notPick = coinRec(coins, target, ind - 1, dp);
        
        int pick = (int) 1e9;
        if (target >= coins[ind]) {
            pick = 1 + coinRec(coins, target - coins[ind], ind, dp);
        }
        
        // Save the result in dp array before returning
        return dp[ind][target] = Math.min(notPick, pick);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        // dp array size: [number of coins][amount + 1]
        int[][] dp = new int[n][amount + 1];
        
        // Initialize dp table with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        int ans = coinRec(coins, amount, n - 1, dp);
        
        return ans >= (int) 1e9 ? -1 : ans;
    }
}

