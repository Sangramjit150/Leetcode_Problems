class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Loop backwards from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0 (carrying over 1 to the next left digit)
            digits[i] = 0;
        }
        
        // If the loop finishes, it means ALL digits were 9 (e.g., 999 -> 1000)
        int[] ans = new int[n + 1];
        ans[0] = 1; // The rest of the array defaults to 0 in Java
        return ans;
    }
}
