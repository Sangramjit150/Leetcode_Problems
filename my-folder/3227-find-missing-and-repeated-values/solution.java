class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n = grid.length;
        int m = n * n;
        int[] numbers = new int[m];
        int[] ans = new int[2];
        int k = 0;

        // Flatten the 2D grid into a 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[k++] = grid[i][j];
            }
        }

        // Sort the array
        Arrays.sort(numbers);

        // Check for missing and repeating numbers
        if (numbers[0] != 1) {
            ans[1] = 1;
        }
        if (numbers[m - 1] != m) {
            ans[1] = m;
        }
        for (int i = 1; i < m; i++) {
            if (numbers[i] == numbers[i - 1]) {
                ans[0] = numbers[i];  // Repeating number
            }
            if ((numbers[i] - numbers[i - 1]) == 2) {
                ans[1] = (numbers[i] + numbers[i - 1]) / 2;  // Missing number
            }
        }

        return ans;
    }
}

    

