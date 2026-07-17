import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        if (s == null || s.length() == 0) return ans;
        
        int n = s.length();
        // dp[i][j] will be true if substring s[i...j] is a palindrome
        boolean[][] dp = new boolean[n][n];
        
        // Fill the DP table
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    // Single chars (len==1) or pairs (len==2) or inner substring is a palindrome
                    if (len <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
            }
        }
        
        // Start backtracking using the precomputed DP table
        backtrack(s, 0, dp, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(String s, int start, boolean[][] dp, List<String> currentPartition, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            // O(1) palindrome check using the DP table
            if (dp[start][end]) {
                currentPartition.add(s.substring(start, end + 1));
                backtrack(s, end + 1, dp, currentPartition, ans);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }
}
