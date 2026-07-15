class Solution {
    public int myAtoi(String s) {
        // 1. Handle edge cases
        if (s == null || s.length() == 0) return 0;
        
        int i = 0;
        int n = s.length();
        int sign = 1;
        int result = 0;
        
        // 2. Discard leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check if string was only spaces
        if (i == n) return 0;
        
        // 3. Check for sign
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        // 4. Convert digits and prevent overflow
        while (i < n) {
            char ch = s.charAt(i);
            
            // Break if the character is not a digit
            if (ch < '0' || ch > '9') break;
            
            int digit = ch - '0';
            
            // Check overflow before updating result
            // Integer.MAX_VALUE / 10 is 214748364
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }
}
